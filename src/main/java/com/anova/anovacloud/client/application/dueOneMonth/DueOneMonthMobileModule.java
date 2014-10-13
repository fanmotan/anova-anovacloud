package com.anova.anovacloud.client.application.dueOneMonth;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class DueOneMonthMobileModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(DueOneMonthPresenter.class, DueOneMonthPresenter.MyView.class, DueOneMonthMobileView.class,
        		DueOneMonthPresenter.MyProxy.class);
    }
}
