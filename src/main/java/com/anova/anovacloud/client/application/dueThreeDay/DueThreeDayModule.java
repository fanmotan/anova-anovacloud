package com.anova.anovacloud.client.application.dueThreeDay;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class DueThreeDayModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(DueThreeDayPresenter.class, DueThreeDayPresenter.MyView.class, DueThreeDayView.class,
        		DueThreeDayPresenter.MyProxy.class);
    }
}
