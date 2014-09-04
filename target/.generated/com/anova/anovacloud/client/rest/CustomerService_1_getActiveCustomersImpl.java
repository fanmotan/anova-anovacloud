package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class CustomerService_1_getActiveCustomersImpl extends AbstractRestAction<java.util.List<com.anova.anovacloud.shared.dto.CustomerDto>> {
    public CustomerService_1_getActiveCustomersImpl(
            String defaultDateFormat) {
        super(HttpMethod.GET, "/customers", defaultDateFormat);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
