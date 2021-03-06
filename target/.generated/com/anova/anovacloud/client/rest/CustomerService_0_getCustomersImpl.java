package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class CustomerService_0_getCustomersImpl extends AbstractRestAction<java.util.List<com.anova.anovacloud.shared.dto.CustomerDto>> {
    public CustomerService_0_getCustomersImpl(
            String defaultDateFormat) {
        super(HttpMethod.GET, "/customers", defaultDateFormat);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
