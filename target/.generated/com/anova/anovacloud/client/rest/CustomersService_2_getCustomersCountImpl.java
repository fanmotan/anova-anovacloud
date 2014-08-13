package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class CustomersService_2_getCustomersCountImpl extends AbstractRestAction<java.lang.Integer> {
    public CustomersService_2_getCustomersCountImpl(
            String defaultDateFormat) {
        super(HttpMethod.GET, "/customers/count", defaultDateFormat);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
