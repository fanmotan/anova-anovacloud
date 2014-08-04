

package com.anova.anovacloud.client.application.user;

import com.anova.anovacloud.client.application.user.ui.EditUserPresenter;
import com.anova.anovacloud.client.application.user.ui.EditUserUiHandlers;
import com.anova.anovacloud.client.application.user.ui.EditUserView;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class UserModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(UserPresenter.class, UserPresenter.MyView.class, UserView.class,
                UserPresenter.MyProxy.class);
        
        bindPresenter(UserDetailPresenter.class, UserDetailPresenter.MyView.class,
                UserDetailView.class, UserDetailPresenter.MyProxy.class);

        bindSingletonPresenterWidget(EditUserPresenter.class, EditUserPresenter.MyView.class,
                EditUserView.class);
        
        bind(UserDetailUiHandlers.class).to(UserDetailPresenter.class);
        bind(UserUiHandlers.class).to(UserPresenter.class);
        bind(EditUserUiHandlers.class).to(EditUserPresenter.class);
    }
}
