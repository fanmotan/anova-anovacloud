package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class MattersService_0_getMattersImpl extends AbstractRestAction<java.util.List<com.anova.anovacloud.shared.dto.MatterDto>> {
    public MattersService_0_getMattersImpl(
            String defaultDateFormat) {
        super(HttpMethod.GET, "/matters", defaultDateFormat);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
