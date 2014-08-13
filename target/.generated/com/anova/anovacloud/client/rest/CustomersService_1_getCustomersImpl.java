package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class CustomersService_1_getCustomersImpl extends AbstractRestAction<java.util.List<com.anova.anovacloud.shared.dto.CustomerDto>> {
    public CustomersService_1_getCustomersImpl(
            String defaultDateFormat,
            int offset,
            int limit) {
        super(HttpMethod.GET, "/customers", defaultDateFormat);
        addQueryParam("offset", offset);
        addQueryParam("limit", limit);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
