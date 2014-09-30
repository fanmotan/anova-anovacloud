package com.anova.anovacloud.client.application.customer;

import com.anova.anovacloud.client.application.customer.ui.EditCustomerPresenter;
import com.anova.anovacloud.client.application.customer.ui.EditCustomerUiHandlers;
import com.anova.anovacloud.client.application.customer.ui.EditCustomerView;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class CustomerMobileModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindPresenter(CustomerPresenter.class, CustomerPresenter.MyView.class, CustomerMobileView.class,
                CustomerPresenter.MyProxy.class);

        bindPresenter(CustomerDetailPresenter.class, CustomerDetailPresenter.MyView.class,
                CustomerDetailView.class, CustomerDetailPresenter.MyProxy.class);
        
        bindSingletonPresenterWidget(EditCustomerPresenter.class, EditCustomerPresenter.MyView.class,
                EditCustomerView.class);
       
        bind(CustomerUiHandlers.class).to(CustomerPresenter.class);
        bind(CustomerDetailUiHandlers.class).to(CustomerDetailPresenter.class);
        bind(EditCustomerUiHandlers.class).to(EditCustomerPresenter.class);
    }
}
