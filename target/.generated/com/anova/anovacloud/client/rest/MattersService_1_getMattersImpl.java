package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class MattersService_1_getMattersImpl extends AbstractRestAction<java.util.List<com.anova.anovacloud.shared.dto.MatterDto>> {
    public MattersService_1_getMattersImpl(
            String defaultDateFormat,
            int offset,
            int limit) {
        super(HttpMethod.GET, "/matters", defaultDateFormat);
        addQueryParam("offset", offset);
        addQueryParam("limit", limit);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
