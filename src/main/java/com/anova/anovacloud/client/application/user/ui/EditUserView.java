

package com.anova.anovacloud.client.application.user.ui;

import javax.inject.Inject;

import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.client.application.user.ui.EditUserPresenter.MyView;
import com.anova.anovacloud.shared.dto.UserDto;
import com.gwtplatform.mvp.client.PopupViewWithUiHandlers;

public class EditUserView extends PopupViewWithUiHandlers<EditUserUiHandlers> implements MyView,
        Editor<UserDto> {
    interface Binder extends UiBinder<Widget, EditUserView> {
    }

    interface Driver extends SimpleBeanEditorDriver<UserDto, EditUserView> {
    }

    @UiField
    TextBox displayName;
    @UiField
    TextBox firstName;
    @UiField
    TextBox lastName;
    @UiField
    TextBox username;
    @UiField
    TextBox hashPassword;
    @UiField
    ListBox role;
    @UiField
    TextBox email;
    @UiField
    TextArea mailAddress;
    @UiField
    TextBox phone;
    @UiField
    TextBox fax;

    private final Driver driver;

    @Inject
    EditUserView(Binder uiBinder,
                         Driver driver,
                         EventBus eventBus) {
        super(eventBus);

        this.driver = driver;

        initWidget(uiBinder.createAndBindUi(this));

        driver.initialize(this);
    }

    @Override
    public void edit(UserDto userDto) {
        driver.edit(userDto);
    }

    @UiHandler("save")
    void onSaveClicked(ClickEvent ignored) {
        getUiHandlers().onSave(driver.flush());
    }

    @UiHandler("close")
    void onCloseClicked(ClickEvent ignored) {
        getUiHandlers().onCancel();
    }
}
