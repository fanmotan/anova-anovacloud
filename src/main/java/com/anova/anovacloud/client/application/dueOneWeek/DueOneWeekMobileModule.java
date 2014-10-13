package com.anova.anovacloud.client.application.dueOneWeek;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class DueOneWeekMobileModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(DueOneWeekPresenter.class, DueOneWeekPresenter.MyView.class, DueOneWeekMobileView.class,
        		DueOneWeekPresenter.MyProxy.class);
    }
}
