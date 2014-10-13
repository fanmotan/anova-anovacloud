package com.anova.anovacloud.client.application.dueOneWeek;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class DueOneWeekModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(DueOneWeekPresenter.class, DueOneWeekPresenter.MyView.class, DueOneWeekView.class,
        		DueOneWeekPresenter.MyProxy.class);
    }
}
