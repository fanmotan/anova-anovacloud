

package com.anova.anovacloud.client.application.user.ui;


import java.util.List;

import javax.inject.Inject;

import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.client.application.user.ui.EditUserPresenter.MyView;
import com.anova.anovacloud.client.application.userRole.ui.UserRoleRenderer;
import com.anova.anovacloud.shared.dto.UserDto;
import com.anova.anovacloud.shared.dto.UserRoleDto;
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
    PasswordTextBox hashPassword;
    @UiField
    TextBox email;
    
    @UiField(provided = true)
    ValueListBox<UserRoleDto> userRole;
   
    private final Driver driver;

    @Inject
    EditUserView(Binder uiBinder,
                         Driver driver,
                         EventBus eventBus) {
        super(eventBus);
        userRole = new ValueListBox<>(new UserRoleRenderer());
        this.driver = driver;
        initWidget(uiBinder.createAndBindUi(this));
        driver.initialize(this);
    }

    @Override
    public void edit(UserDto userDto) {   	        
    	if (userDto.getUserRole() == null) {
            userDto.setUserRole(userRole.getValue());
        }
    
        driver.edit(userDto);
    }
    
    @Override
    public void setAllowedUserRoles(List<UserRoleDto> userRoleDtos) {
        userRole.setValue(userRoleDtos.isEmpty() ? null : userRoleDtos.get(0));
        userRole.setAcceptableValues(userRoleDtos);
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
