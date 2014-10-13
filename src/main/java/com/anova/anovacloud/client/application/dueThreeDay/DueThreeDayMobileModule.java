package com.anova.anovacloud.client.application.dueThreeDay;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class DueThreeDayMobileModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(DueThreeDayPresenter.class, DueThreeDayPresenter.MyView.class, DueThreeDayMobileView.class,
        		DueThreeDayPresenter.MyProxy.class);
    }
}
