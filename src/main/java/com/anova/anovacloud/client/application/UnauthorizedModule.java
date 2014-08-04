

package com.anova.anovacloud.client.application;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class UnauthorizedModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(UnauthorizedPresenter.class, UnauthorizedPresenter.MyView.class, UnauthorizedView.class,
                UnauthorizedPresenter.MyProxy.class);
    }
}
