
package com.anova.anovacloud.client.application.customers.customer;

import com.anova.anovacloud.client.application.customers.customer.CustomerPresenterProvider;

public interface CustomerProxyImplFactory {
    CustomerProxyImpl create(CustomerPresenterProvider customerPresenterProvider, String nameToken);
}
