

package com.anova.anovacloud.client.application.matters;

import com.google.gwt.inject.client.assistedinject.GinFactoryModuleBuilder;
import com.anova.anovacloud.client.application.matters.matter.MatterPresenterFactory;
import com.anova.anovacloud.client.application.matters.matter.MatterProxyImplFactory;
import com.anova.anovacloud.client.application.matters.matter.RootMatterPresenter;
import com.anova.anovacloud.client.application.matters.matter.RootMatterView;
import com.anova.anovacloud.client.application.matters.matter.navigation.NavigationTabPresenter;
import com.anova.anovacloud.client.application.matters.matter.navigation.NavigationTabView;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class MattersModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new GinFactoryModuleBuilder().build(MatterPresenterFactory.class));
        install(new GinFactoryModuleBuilder().build(MatterProxyImplFactory.class));

        bindPresenter(RootMatterPresenter.class, RootMatterPresenter.MyView.class, RootMatterView.class,
                RootMatterPresenter.MyProxy.class);

        bindSingletonPresenterWidget(NavigationTabPresenter.class, NavigationTabPresenter.MyView.class,
                NavigationTabView.class);
    }
}
