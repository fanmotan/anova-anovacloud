package com.anova.anovacloud.client.application.dueToday;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ReportModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(ReportPresenter.class, ReportPresenter.MyView.class, ReportView.class,
                ReportPresenter.MyProxy.class);
    }
}
