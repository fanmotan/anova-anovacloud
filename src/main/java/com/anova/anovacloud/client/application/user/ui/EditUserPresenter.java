

package com.anova.anovacloud.client.application.user.ui;

import java.util.List;

import javax.inject.Inject;

import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.client.application.event.DisplayMessageEvent;
import com.anova.anovacloud.client.application.user.event.UserAddedEvent;
import com.anova.anovacloud.client.application.user.ui.EditUserPresenter.MyView;
import com.anova.anovacloud.client.application.widget.message.Message;
import com.anova.anovacloud.client.application.widget.message.MessageStyle;
import com.anova.anovacloud.client.resources.EditUserMessages;
import com.anova.anovacloud.client.rest.UserRoleService;
import com.anova.anovacloud.client.rest.UserService;
import com.anova.anovacloud.client.util.AbstractAsyncCallback;
import com.anova.anovacloud.client.util.ErrorHandlerAsyncCallback;
import com.anova.anovacloud.shared.dto.UserDto;
import com.anova.anovacloud.shared.dto.UserRoleDto;
import com.gwtplatform.dispatch.rest.shared.RestDispatch;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.PopupView;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.proxy.RevealRootPopupContentEvent;

public class EditUserPresenter extends PresenterWidget<MyView> implements EditUserUiHandlers {
    public interface MyView extends PopupView, HasUiHandlers<EditUserUiHandlers> {
        void edit(UserDto userDto);
        void setAllowedUserRoles(List<UserRoleDto> userRoleDtos);
    }

    private final RestDispatch dispatcher;
    private final UserService userService;
    private final UserRoleService userRoleService;
    private final EditUserMessages messages;

    private UserDto userDto;

    @Inject
    public EditUserPresenter(EventBus eventBus,
                                     MyView view,
                                     RestDispatch dispatcher,
                                     UserService userService,
                                     UserRoleService userRoleService,
                                     EditUserMessages messages) {
        super(eventBus, view);

        this.dispatcher = dispatcher;
        this.userService = userService;
        this.userRoleService = userRoleService;
        this.messages = messages;

        getView().setUiHandlers(this);
    }

    @Override
    public void createNew() {
        userDto = new UserDto();

        reveal();
    }

    @Override
    public void onCancel() {
        getView().hide();
    }

    @Override
    public void edit(UserDto userDto) {
        this.userDto = userDto;

        reveal();
    }

    @Override
    public void onSave(UserDto userDto) {
        dispatcher.execute(userService.saveOrCreate(userDto),
                new ErrorHandlerAsyncCallback<UserDto>(this) {
                    @Override
                    public void onSuccess(UserDto savedUser) {
                        DisplayMessageEvent.fire(EditUserPresenter.this,
                                new Message(messages.userSaved(), MessageStyle.SUCCESS));
                        UserAddedEvent.fire(EditUserPresenter.this, savedUser);

                        getView().hide();
                    }
                });
    }

    private void reveal() {
    	
    	dispatcher.execute(userRoleService.getUserRoles(), new AbstractAsyncCallback<List<UserRoleDto>>() {
            @Override
            public void onSuccess(List<UserRoleDto> roles) {
            	//Fan
            	
            	String role = roles.get(0).getRoleName();
            	DisplayMessageEvent.fire(EditUserPresenter.this,
                        new Message("get userroles " + role, MessageStyle.SUCCESS));
            	
            	//
                onGetUserRolesSuccess(roles);
            }
        });
    }
    private void onGetUserRolesSuccess(List<UserRoleDto> userRoleDtos) {
        getView().setAllowedUserRoles(userRoleDtos);
        getView().edit(userDto);
        RevealRootPopupContentEvent.fire(this, this);
    }
    
}
