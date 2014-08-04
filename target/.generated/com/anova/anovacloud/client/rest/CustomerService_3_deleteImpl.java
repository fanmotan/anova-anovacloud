package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class CustomerService_3_deleteImpl extends AbstractRestAction<java.lang.Void> {
    public CustomerService_3_deleteImpl(
            String defaultDateFormat,
            java.lang.Long id) {
        super(HttpMethod.DELETE, "/customers/{id}", defaultDateFormat);
        addPathParam("id", id);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
