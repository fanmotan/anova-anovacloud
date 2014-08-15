

package com.anova.anovacloud.client.application.user;

import javax.inject.Inject;

import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.anova.anovacloud.shared.dto.UserDto;
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
    TextBox hashPassword;
    @UiField
    ListBox role;
    @UiField
    TextArea mailAddress;
    @UiField
    TextBox email;
    @UiField
    TextBox phone;
    @UiField
    TextBox fax;

    private final Driver driver;

    @Inject
    UserDetailView(Binder uiBinder,
                           Driver driver) {
        this.driver = driver;

        initWidget(uiBinder.createAndBindUi(this));

        driver.initialize(this);

        displayName.getElement().setAttribute("placeholder", "Display Name");
        firstName.getElement().setAttribute("placeholder", "First Name");
        lastName.getElement().setAttribute("placeholder", "Last Name");
        username.getElement().setAttribute("placeholder", "Username");
        hashPassword.getElement().setAttribute("placeholder", "Password");
        role.getElement().setAttribute("placeholder", "User Role");
        email.getElement().setAttribute("placeholder", "User Email");
        mailAddress.getElement().setAttribute("placeholder", "Mailing Address");
        
        phone.getElement().setAttribute("placeholder", "User Phone");
        fax.getElement().setAttribute("placeholder", "User Fax");
    }

    @Override
    public void edit(UserDto userDto) {
        displayName.setFocus(true);
        driver.edit(userDto);
    }

    @Override
    public void getUser() {
        getUiHandlers().onSave(driver.flush());
    }
}

