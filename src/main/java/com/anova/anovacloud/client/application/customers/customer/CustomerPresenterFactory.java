

package com.anova.anovacloud.client.application.customers.customer;

import com.anova.anovacloud.shared.dto.CustomerDto;

public interface CustomerPresenterFactory {
    CustomerPresenter create(CustomerPresenter.MyProxy proxy, CustomerDto customerDto);
}
