package com.anova.anovacloud.client.application.dueOneMonth;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class DueOneMonthModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(DueOneMonthPresenter.class, DueOneMonthPresenter.MyView.class, DueOneMonthView.class,
        		DueOneMonthPresenter.MyProxy.class);
    }
}
