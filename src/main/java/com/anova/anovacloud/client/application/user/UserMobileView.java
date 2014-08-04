

package com.anova.anovacloud.client.application.user;

import java.util.List;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;
import com.anova.anovacloud.client.application.user.UserPresenter.MyView;
import com.anova.anovacloud.client.application.user.renderer.UserCell;
import com.anova.anovacloud.client.resources.MobileDataListStyle;
import com.anova.anovacloud.shared.dto.UserDto;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class UserMobileView extends ViewWithUiHandlers<UserUiHandlers> implements MyView {
    interface Binder extends UiBinder<Widget, UserMobileView> {
    }

    @UiField(provided = true)
    CellList<UserDto> userList;

    private final ListDataProvider<UserDto> userDataProvider;
    private final SingleSelectionModel<UserDto> selectionModel;

    @Inject
    UserMobileView(Binder uiBinder,
                           UserCell userCell,
                           MobileDataListStyle mobileDataListStyle) {
        userList = new CellList<>(userCell, mobileDataListStyle);

        initWidget(uiBinder.createAndBindUi(this));

        userDataProvider = new ListDataProvider<>();
        userDataProvider.addDataDisplay(userList);
        selectionModel = new SingleSelectionModel<>();
        userList.setSelectionModel(selectionModel);

        selectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
            @Override
            public void onSelectionChange(SelectionChangeEvent event) {
                getUiHandlers().onDetail(selectionModel.getSelectedObject());
            }
        });
    }

    @Override
    public void displayUsers(List<UserDto> userDtos) {
        userDataProvider.getList().clear();
        userDataProvider.getList().addAll(userDtos);
    }

    @Override
    public void addUser(UserDto userDto) {
        userDataProvider.getList().add(userDto);
    }

    @Override
    public void removeUser(UserDto userDto) {
        userDataProvider.getList().remove(userDto);
    }

    @Override
    public void replaceUser(UserDto oldUser, UserDto newUser) {
        List<UserDto> userDtos = userDataProvider.getList();
        int index = userDtos.indexOf(oldUser);

        userDtos.add(index, newUser);
        userDtos.remove(index + 1);
    }
}
