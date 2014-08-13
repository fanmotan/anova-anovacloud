package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class CustomersService_4_CustomerService_1_deleteImpl extends AbstractRestAction<java.lang.Void> {
    public CustomersService_4_CustomerService_1_deleteImpl(
            String defaultDateFormat,
            java.lang.Long customerId) {
        super(HttpMethod.DELETE, "/customers/{id}", defaultDateFormat);
        addPathParam("id", customerId);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
