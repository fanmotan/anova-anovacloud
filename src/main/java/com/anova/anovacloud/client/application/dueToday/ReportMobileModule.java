package com.anova.anovacloud.client.application.dueToday;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ReportMobileModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(ReportPresenter.class, ReportPresenter.MyView.class, ReportMobileView.class,
                ReportPresenter.MyProxy.class);
    }
}
