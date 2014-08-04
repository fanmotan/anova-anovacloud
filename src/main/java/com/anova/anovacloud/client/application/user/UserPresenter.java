

package com.anova.anovacloud.client.application.user;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.client.application.ApplicationPresenter;
import com.anova.anovacloud.client.application.event.ActionBarEvent;
import com.anova.anovacloud.client.application.event.ActionBarVisibilityEvent;
import com.anova.anovacloud.client.application.event.ChangeActionBarEvent;
import com.anova.anovacloud.client.application.event.ChangeActionBarEvent.ActionType;
import com.anova.anovacloud.client.application.user.UserPresenter.MyProxy;
import com.anova.anovacloud.client.application.user.UserPresenter.MyView;
import com.anova.anovacloud.client.application.user.event.UserAddedEvent;
import com.anova.anovacloud.client.application.user.ui.EditUserPresenter;
import com.anova.anovacloud.client.place.NameTokens;
import com.anova.anovacloud.client.rest.UserService;
import com.anova.anovacloud.client.util.AbstractAsyncCallback;
import com.anova.anovacloud.client.util.ErrorHandlerAsyncCallback;
import com.anova.anovacloud.shared.dto.UserDto;
import com.gwtplatform.dispatch.rest.shared.RestDispatch;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.ProxyEvent;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest;
import com.gwtplatform.mvp.shared.proxy.PlaceRequest.Builder;

public class UserPresenter extends Presenter<MyView, MyProxy>
        implements UserUiHandlers, ActionBarEvent.ActionBarHandler {

    interface MyView extends View, HasUiHandlers<UserUiHandlers> {
        void addUser(UserDto userDto);

        void displayUsers(List<UserDto> userDtos);

        void removeUser(UserDto userDto);

        void replaceUser(UserDto oldUser, UserDto newUser);
    }

    @ProxyCodeSplit
    @NameToken(NameTokens.USER)
    interface MyProxy extends ProxyPlace<UserPresenter> {
    }

    private final RestDispatch dispatcher;
    private final PlaceManager placeManager;
    private final UserService userService;
    private final EditUserPresenter editUserPresenter;

    private UserDto editingUser;

    @Inject
    UserPresenter(EventBus eventBus,
                          MyView view,
                          MyProxy proxy,
                          RestDispatch dispatcher,
                          UserService userService,
                          PlaceManager placeManager,
                          EditUserPresenter editUserPresenter) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAIN_CONTENT);

        this.dispatcher = dispatcher;
        this.placeManager = placeManager;
        this.userService = userService;
        this.editUserPresenter = editUserPresenter;

        getView().setUiHandlers(this);
    }

    @Override
    public void onActionEvent(ActionBarEvent event) {
        if (event.getActionType() == ActionType.ADD && event.isTheSameToken(NameTokens.getUser())) {
            placeManager.revealPlace(new Builder().nameToken(NameTokens.getDetailUser()).build());
        }
    }

    @Override
    public void onDetail(UserDto userDto) {
        PlaceRequest placeRequest = new Builder().nameToken(NameTokens.getDetailUser())
                                                 .with("id", String.valueOf(userDto.getId()))
                                                 .build();

        placeManager.revealPlace(placeRequest);
    }

    @Override
    public void onEdit(UserDto userDto) {
        editingUser = userDto;
        editUserPresenter.edit(userDto);
    }

    @Override
    public void onCreate() {
        editingUser = null;
        editUserPresenter.createNew();
    }

    @Override
    public void onDelete(final UserDto userDto) {
        dispatcher.execute(userService.delete(userDto.getId()),
                new ErrorHandlerAsyncCallback<Void>(this) {
                    @Override
                    public void onSuccess(Void nothing) {
                        getView().removeUser(userDto);
                    }
                });
    }

    @Override
    protected void onReveal() {
        ActionBarVisibilityEvent.fire(this, true);
        ChangeActionBarEvent.fire(this, Arrays.asList(ActionType.ADD), true);

        dispatcher.execute(userService.getUsers(), new AbstractAsyncCallback<List<UserDto>>() {
            @Override
            public void onSuccess(List<UserDto> users) {
                getView().displayUsers(users);
            }
        });
    }

    @Override
    protected void onBind() {
        addRegisteredHandler(ActionBarEvent.getType(), this);
    }

    @ProxyEvent
    void onUserAdded(UserAddedEvent event) {
        if (editingUser != null) {
            getView().replaceUser(editingUser, event.getUser());
        } else {
            getView().addUser(event.getUser());
        }

        editingUser = event.getUser();
    }
}
