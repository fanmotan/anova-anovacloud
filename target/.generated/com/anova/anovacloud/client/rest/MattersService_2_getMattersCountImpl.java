package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class MattersService_2_getMattersCountImpl extends AbstractRestAction<java.lang.Integer> {
    public MattersService_2_getMattersCountImpl(
            String defaultDateFormat) {
        super(HttpMethod.GET, "/matters/count", defaultDateFormat);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
