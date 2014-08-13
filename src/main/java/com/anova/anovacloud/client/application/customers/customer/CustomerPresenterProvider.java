
package com.anova.anovacloud.client.application.customers.customer;

import javax.inject.Inject;

import com.google.inject.Provider;
import com.anova.anovacloud.shared.dto.CustomerDto;

public class CustomerPresenterProvider implements Provider<CustomerPresenter> {
    private final CustomerPresenterFactory customerPresenterFactory;

    private CustomerPresenter.MyProxy proxy;
    private CustomerPresenter customerPresenter;
    private CustomerDto customerDto;

    @Inject
    CustomerPresenterProvider(CustomerPresenterFactory customerPresenterFactory) {
        this.customerPresenterFactory = customerPresenterFactory;
    }

    @Override
    public CustomerPresenter get() {
        assert proxy != null : "You must call setProxy first";

        if (customerPresenter == null) {
            customerPresenter = customerPresenterFactory.create(proxy, customerDto);
        }

        return customerPresenter;
    }

    public void setProxy(CustomerPresenter.MyProxy proxy) {
        this.proxy = proxy;
    }

    public void setCustomer(CustomerDto customerDto) {
        this.customerDto = customerDto;
    }
}
