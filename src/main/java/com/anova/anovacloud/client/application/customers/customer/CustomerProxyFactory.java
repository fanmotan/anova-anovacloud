

package com.anova.anovacloud.client.application.customers.customer;

import javax.inject.Inject;
import javax.inject.Provider;

import com.google.web.bindery.event.shared.EventBus;
import com.anova.anovacloud.shared.dto.CustomerDto;
import com.gwtplatform.mvp.client.proxy.PlaceManager;

public class CustomerProxyFactory {
    private final Provider<CustomerPresenterProvider> customerPresenterProvider;
    private final PlaceManager placeManager;
    private final EventBus eventBus;
    private final CustomerProxyImplFactory customerProxyImplFactory;

    @Inject
    CustomerProxyFactory(Provider<CustomerPresenterProvider> customerPresenterProvider,
                    PlaceManager placeManager,
                    EventBus eventBus,
                    CustomerProxyImplFactory customerProxyImplFactory) {
        this.customerPresenterProvider = customerPresenterProvider;
        this.placeManager = placeManager;
        this.eventBus = eventBus;
        this.customerProxyImplFactory = customerProxyImplFactory;
    }

    public CustomerPresenter.MyProxy create(CustomerDto customerDto, String nameToken) {
        CustomerPresenterProvider customerPresenter = customerPresenterProvider.get();
        customerPresenter.setCustomer(customerDto);

        CustomerProxyImpl customerProxy = customerProxyImplFactory.create(customerPresenter, nameToken);
        customerProxy.bind(placeManager, eventBus);

        return customerProxy;
    }
}
