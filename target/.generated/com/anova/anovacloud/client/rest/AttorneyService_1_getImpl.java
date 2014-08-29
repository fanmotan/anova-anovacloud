package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class AttorneyService_1_getImpl extends AbstractRestAction<com.anova.anovacloud.shared.dto.AttorneyDto> {
    public AttorneyService_1_getImpl(
            String defaultDateFormat,
            java.lang.Long id) {
        super(HttpMethod.GET, "/attorneys/{id}", defaultDateFormat);
        addPathParam("id", id);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
