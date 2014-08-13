package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class CustomersService_4_CustomerService_0_getImpl extends AbstractRestAction<com.anova.anovacloud.shared.dto.CustomerDto> {
    public CustomersService_4_CustomerService_0_getImpl(
            String defaultDateFormat,
            java.lang.Long customerId) {
        super(HttpMethod.GET, "/customers/{id}", defaultDateFormat);
        addPathParam("id", customerId);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
