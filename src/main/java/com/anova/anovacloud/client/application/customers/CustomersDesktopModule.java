

package com.anova.anovacloud.client.application.customers;

import com.anova.anovacloud.client.application.customers.customer.CustomerPresenter;
import com.anova.anovacloud.client.application.customers.customer.CustomerView;
import com.anova.anovacloud.client.application.customers.CustomersModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class CustomersDesktopModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new CustomersModule());

        bindPresenter(CustomersPresenter.class, CustomersPresenter.MyView.class, CustomersView.class,
                CustomersPresenter.MyProxy.class);

        bind(CustomerPresenter.MyView.class).to(CustomerView.class);
    }
}
