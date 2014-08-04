package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class MattersService_4_MatterService_0_getImpl extends AbstractRestAction<com.anova.anovacloud.shared.dto.MatterDto> {
    public MattersService_4_MatterService_0_getImpl(
            String defaultDateFormat,
            java.lang.Long matterId) {
        super(HttpMethod.GET, "/matters/{id}", defaultDateFormat);
        addPathParam("id", matterId);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
