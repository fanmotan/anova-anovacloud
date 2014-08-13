

package com.anova.anovacloud.client.application.customers;

import com.anova.anovacloud.client.application.customers.customer.CustomerPresenter;
import com.anova.anovacloud.client.application.customers.customer.CustomerMobileView;
import com.anova.anovacloud.client.application.customers.CustomersMobileView;
import com.anova.anovacloud.client.application.customers.CustomersModule;
import com.anova.anovacloud.client.application.customers.CustomersPresenter;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class CustomersMobileModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
    	 install(new CustomersModule());

         bindPresenter(CustomersPresenter.class, CustomersPresenter.MyView.class, CustomersMobileView.class,
                 CustomersPresenter.MyProxy.class);

         bind(CustomerPresenter.MyView.class).to(CustomerMobileView.class);
    }
}
