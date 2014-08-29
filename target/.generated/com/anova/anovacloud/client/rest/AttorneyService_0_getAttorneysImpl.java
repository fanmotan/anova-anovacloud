package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class AttorneyService_0_getAttorneysImpl extends AbstractRestAction<java.util.List<com.anova.anovacloud.shared.dto.AttorneyDto>> {
    public AttorneyService_0_getAttorneysImpl(
            String defaultDateFormat) {
        super(HttpMethod.GET, "/attorneys", defaultDateFormat);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
