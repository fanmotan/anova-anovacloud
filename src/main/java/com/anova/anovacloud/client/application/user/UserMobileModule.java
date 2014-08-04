

package com.anova.anovacloud.client.application.user;

import com.anova.anovacloud.client.application.user.ui.EditUserPresenter;
import com.anova.anovacloud.client.application.user.ui.EditUserUiHandlers;
import com.anova.anovacloud.client.application.user.ui.EditUserView;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class UserMobileModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(UserPresenter.class, UserPresenter.MyView.class, UserMobileView.class,
                UserPresenter.MyProxy.class);

        bindPresenter(UserDetailPresenter.class, UserDetailPresenter.MyView.class,
                UserDetailView.class, UserDetailPresenter.MyProxy.class);
        
        bindSingletonPresenterWidget(EditUserPresenter.class, EditUserPresenter.MyView.class,
                EditUserView.class);
       
        bind(UserUiHandlers.class).to(UserPresenter.class);
        bind(UserDetailUiHandlers.class).to(UserDetailPresenter.class);
        bind(EditUserUiHandlers.class).to(EditUserPresenter.class);
    }
}
