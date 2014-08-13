

package com.anova.anovacloud.client.application.customers;

import com.google.gwt.inject.client.assistedinject.GinFactoryModuleBuilder;
import com.anova.anovacloud.client.application.customers.customer.CustomerPresenterFactory;
import com.anova.anovacloud.client.application.customers.customer.CustomerProxyImplFactory;
import com.anova.anovacloud.client.application.customers.customer.RootCustomerPresenter;
import com.anova.anovacloud.client.application.customers.customer.RootCustomerView;
import com.anova.anovacloud.client.application.customers.customer.navigation.NavigationTabPresenter;
import com.anova.anovacloud.client.application.customers.customer.navigation.NavigationTabView;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class CustomersModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new GinFactoryModuleBuilder().build(CustomerPresenterFactory.class));
        install(new GinFactoryModuleBuilder().build(CustomerProxyImplFactory.class));

        bindPresenter(RootCustomerPresenter.class, RootCustomerPresenter.MyView.class, RootCustomerView.class,
                RootCustomerPresenter.MyProxy.class);

        bindSingletonPresenterWidget(NavigationTabPresenter.class, NavigationTabPresenter.MyView.class,
                NavigationTabView.class);
    }
}
