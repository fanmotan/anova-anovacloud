
package com.anova.anovacloud.client.application.user;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import com.google.common.base.Strings;
import com.google.gwt.user.client.Window;
import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.client.application.ApplicationPresenter;
import com.anova.anovacloud.client.application.event.ActionBarEvent;
import com.anova.anovacloud.client.application.event.ChangeActionBarEvent;
import com.anova.anovacloud.client.application.event.ChangeActionBarEvent.ActionType;
import com.anova.anovacloud.client.application.event.DisplayMessageEvent;
import com.anova.anovacloud.client.application.event.GoBackEvent;
import com.anova.anovacloud.client.application.user.UserDetailPresenter.MyProxy;
import com.anova.anovacloud.client.application.user.UserDetailPresenter.MyView;
import com.anova.anovacloud.client.application.widget.message.Message;
import com.anova.anovacloud.client.application.widget.message.MessageStyle;
import com.anova.anovacloud.client.place.NameTokens;
import com.anova.anovacloud.client.resources.EditUserMessages;
import com.anova.anovacloud.client.rest.UserRoleService;
import com.anova.anovacloud.client.rest.UserService;
import com.anova.anovacloud.client.util.AbstractAsyncCallback;
import com.anova.anovacloud.client.util.ErrorHandlerAsyncCallback;
import com.anova.anovacloud.shared.dto.UserDto;
import com.anova.anovacloud.shared.dto.UserRoleDto;
import com.gwtplatform.dispatch.rest.shared.RestDispatch;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest.Builder;

public class UserDetailPresenter extends Presenter<MyView, MyProxy>
        implements GoBackEvent.GoBackHandler, ActionBarEvent.ActionBarHandler, UserDetailUiHandlers {

    interface MyView extends View, HasUiHandlers<UserDetailUiHandlers> {
        void edit(UserDto userDto);
        void setAllowedUserRoles(List<UserRoleDto> userRoleDtos);
        void getUser();
    }

    @ProxyCodeSplit
    @NameToken(NameTokens.DETAIL_USER)
    interface MyProxy extends ProxyPlace<UserDetailPresenter> {
    }

    private final RestDispatch dispatcher;
    private final UserService userService;
    private final UserRoleService userRoleService;
    private final PlaceManager placeManager;
    private final EditUserMessages messages;

    private UserDto currentUser;
    private Boolean createNew;

    @Inject
    UserDetailPresenter(EventBus eventBus,
                                MyView view,
                                MyProxy proxy,
                                RestDispatch dispatcher,
                                UserService userService,
                                UserRoleService userRoleService,
                                EditUserMessages messages,
                                PlaceManager placeManager ) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN_CONTENT);

        this.dispatcher = dispatcher;
        this.userService = userService;
        this.userRoleService = userRoleService;
        this.placeManager = placeManager;
        this.messages = messages;

        getView().setUiHandlers(this);
    }

    @Override
    public void prepareFromRequest(PlaceRequest request) {
        String param = request.getParameter("id", null);
        createNew = Strings.isNullOrEmpty(param);

        if (!createNew) {
            Long id = Long.parseLong(param);
            dispatcher.execute(userService.get(id), new AbstractAsyncCallback<UserDto>() {
                @Override
                public void onSuccess(UserDto user) {
                    currentUser = user;
                    getView().edit(currentUser);
                }
            });
        } else {
            currentUser = new UserDto();
            getView().edit(currentUser);
        }
    }

    @Override
    public void onGoBack(GoBackEvent event) {
        placeManager.revealPlace(new Builder().nameToken(NameTokens.getUser()).build());
    }

    @Override
    public void onActionEvent(ActionBarEvent event) {
        if (event.isTheSameToken(NameTokens.getDetailUser())) {
            switch (event.getActionType()) {
                case UPDATE:
                    getView().getUser();
                    break;
                case DONE:
                    getView().getUser();
                    break;
                case DELETE:
                    deleteUser();
                    break;
            }
        }
    }

    @Override
    public void onSave(UserDto userDto) {
        dispatcher.execute(userService.saveOrCreate(userDto),
                new ErrorHandlerAsyncCallback<UserDto>(this) {
                    @Override
                    public void onSuccess(UserDto savedUserDto) {
                        DisplayMessageEvent.fire(UserDetailPresenter.this,
                                new Message(messages.userSaved(), MessageStyle.SUCCESS));
                        placeManager.revealPlace(new Builder().nameToken(NameTokens.getUser()).build());
                    }
                });
    }

    @Override
    protected void onBind() {
        addRegisteredHandler(GoBackEvent.getType(), this);
        addRegisteredHandler(ActionBarEvent.getType(), this);
    }

    @Override
    protected void onReveal() {
        List<ActionType> actions;
        if (createNew) {
            actions = Arrays.asList(ActionType.DONE);
            ChangeActionBarEvent.fire(this, actions, false);
        } else {
            actions = Arrays.asList(ActionType.DELETE, ActionType.UPDATE);
            ChangeActionBarEvent.fire(this, actions, false);
        }
       
        //getView().edit(new UserDto());
        dispatcher.execute(userRoleService.getUserRoles(), new AbstractAsyncCallback<List<UserRoleDto>>() {
            @Override
            public void onSuccess(List<UserRoleDto> roles) {
                onGetUserRolesSuccess(roles);
            }
        });
       
    }
   

    private void deleteUser() {
        Boolean confirm = Window.confirm("Are you sure you want to delete " + currentUser.getDisplayName() + "?");
        if (confirm) {
            dispatcher.execute(userService.delete(currentUser.getId()),
                    new ErrorHandlerAsyncCallback<Void>(this) {
                        @Override
                        public void onSuccess(Void nothing) {
                            placeManager.revealPlace(new Builder().nameToken(NameTokens.getUser()).build());
                        }
                    });
        }
    }
    
    private void onGetUserRolesSuccess(List<UserRoleDto> userRoleDtos) {
        getView().setAllowedUserRoles(userRoleDtos);
        getView().edit(new UserDto());
    }
}
