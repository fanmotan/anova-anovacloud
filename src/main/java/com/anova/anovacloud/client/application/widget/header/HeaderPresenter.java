

package com.anova.anovacloud.client.application.widget.header;

import java.util.logging.Logger;

import com.google.gwt.user.client.Cookies;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.client.application.event.DisplayMessageEvent;
import com.anova.anovacloud.client.application.event.UserLoginEvent;
import com.anova.anovacloud.client.application.login.LoginPresenter;
import com.anova.anovacloud.client.application.widget.message.Message;
import com.anova.anovacloud.client.application.widget.message.MessageStyle;
import com.anova.anovacloud.client.resources.HeaderMessages;
import com.anova.anovacloud.client.rest.SessionService;
import com.anova.anovacloud.client.security.CurrentUser;
import com.gwtplatform.dispatch.rest.shared.RestDispatch;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.proxy.NavigationEvent;
import com.gwtplatform.mvp.client.proxy.NavigationHandler;
import com.gwtplatform.mvp.client.proxy.PlaceManager;

public class HeaderPresenter extends PresenterWidget<HeaderPresenter.MyView>
        implements HeaderUiHandlers, UserLoginEvent.UserLoginHandler, NavigationHandler {

    public interface MyView extends View, HasUiHandlers<HeaderUiHandlers> {
        void enableUserOptions(CurrentUser currentUser);

        void disableUserOptions();

        void setMenuItemActive(String nameToken);
    }

    private static final Logger logger = Logger.getLogger(HeaderPresenter.class.getName());

    private final RestDispatch dispatchAsync;
    private final SessionService sessionService;
    private final PlaceManager placeManager;
    private final CurrentUser currentUser;
    private final HeaderMessages messages;

    @Inject
    HeaderPresenter(EventBus eventBus,
                    MyView view,
                    RestDispatch dispatchAsync,
                    SessionService sessionService,
                    PlaceManager placeManager,
                    CurrentUser currentUser,
                    HeaderMessages messages) {
        super(eventBus, view);

        this.dispatchAsync = dispatchAsync;
        this.sessionService = sessionService;
        this.placeManager = placeManager;
        this.currentUser = currentUser;
        this.messages = messages;

        getView().setUiHandlers(this);
    }

    @Override
    public void logout() {
        dispatchAsync.execute(sessionService.logout(), new AsyncCallback<Void>() {
            @Override
            public void onFailure(Throwable caught) {
                DisplayMessageEvent.fire(HeaderPresenter.this, new Message(messages.errorLoggingOut(),
                        MessageStyle.ERROR));
            }

            @Override
            public void onSuccess(Void nothing) {
                onLogoutSuccess();
            }
        });
    }

    @Override
    public void onLogin(UserLoginEvent event) {
        getView().enableUserOptions(currentUser);
    }

    @Override
    public void onNavigation(NavigationEvent navigationEvent) {
        getView().setMenuItemActive(navigationEvent.getRequest().getNameToken());
    }

    @Override
    protected void onBind() {
        addRegisteredHandler(UserLoginEvent.getType(), this);
        addRegisteredHandler(NavigationEvent.getType(), this);

        getView().enableUserOptions(currentUser);
        getView().setMenuItemActive(placeManager.getCurrentPlaceRequest().getNameToken());
    }

    private void onLogoutSuccess() {
        resetLoggedInCookie();

        currentUser.reset();
        getView().disableUserOptions();

        placeManager.revealDefaultPlace();
    }

    private void resetLoggedInCookie() {
        Cookies.removeCookie(LoginPresenter.LOGIN_COOKIE_NAME);

        logger.info("HeaderPresenter.resetLoggedInCookie(): The cookie was removed from client.");
    }
}
