

package com.anova.anovacloud.client.application.user;

import java.util.List;

import javax.inject.Inject;

import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ValueListBox;
import com.google.gwt.user.client.ui.Widget;
import com.anova.anovacloud.client.application.userRole.ui.UserRoleRenderer;
import com.anova.anovacloud.shared.dto.UserDto;
import com.anova.anovacloud.shared.dto.UserRoleDto;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;

public class UserDetailView extends ViewWithUiHandlers<UserDetailUiHandlers>
        implements UserDetailPresenter.MyView, Editor<UserDto> {
    interface Binder extends UiBinder<Widget, UserDetailView> {
    }

    interface Driver extends SimpleBeanEditorDriver<UserDto, UserDetailView> {
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
    UserDetailView(Binder uiBinder,
                           Driver driver) {
        this.driver = driver;       
        initWidget(uiBinder.createAndBindUi(this));
        userRole = new ValueListBox<>(new UserRoleRenderer());
        driver.initialize(this);

        displayName.getElement().setAttribute("placeholder", "Display Name");
        firstName.getElement().setAttribute("placeholder", "First Name");
        lastName.getElement().setAttribute("placeholder", "Last Name");
        username.getElement().setAttribute("placeholder", "Username");
        hashPassword.getElement().setAttribute("placeholder", "Password");
        email.getElement().setAttribute("placeholder", "User Email");
    }


    @Override
    public void edit(UserDto userDto) {
    	
    	if (userDto.getUserRole() == null) {
            userDto.setUserRole(userRole.getValue());
        }
        displayName.setFocus(true);
        driver.edit(userDto);
    }
    
    @Override
    public void setAllowedUserRoles(List<UserRoleDto> userRoleDtos) {
        userRole.setValue(userRoleDtos.isEmpty() ? null : userRoleDtos.get(0));
        userRole.setAcceptableValues(userRoleDtos);
    }
    
    @Override
    public void getUser() {
        getUiHandlers().onSave(driver.flush());
    }
}

