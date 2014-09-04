package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class CustomerService_2_getImpl extends AbstractRestAction<com.anova.anovacloud.shared.dto.CustomerDto> {
    public CustomerService_2_getImpl(
            String defaultDateFormat,
            java.lang.Long id) {
        super(HttpMethod.GET, "/customers/{id}", defaultDateFormat);
        addPathParam("id", id);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
