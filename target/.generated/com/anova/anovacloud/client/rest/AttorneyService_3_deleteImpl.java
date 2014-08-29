package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class AttorneyService_3_deleteImpl extends AbstractRestAction<java.lang.Void> {
    public AttorneyService_3_deleteImpl(
            String defaultDateFormat,
            java.lang.Long id) {
        super(HttpMethod.DELETE, "/attorneys/{id}", defaultDateFormat);
        addPathParam("id", id);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
