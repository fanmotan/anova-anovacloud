package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class MattersService_4_MatterService_1_deleteImpl extends AbstractRestAction<java.lang.Void> {
    public MattersService_4_MatterService_1_deleteImpl(
            String defaultDateFormat,
            java.lang.Long matterId) {
        super(HttpMethod.DELETE, "/matters/{id}", defaultDateFormat);
        addPathParam("id", matterId);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
