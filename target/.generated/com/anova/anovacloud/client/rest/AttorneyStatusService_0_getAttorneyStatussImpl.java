package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class AttorneyStatusService_0_getAttorneyStatussImpl extends AbstractRestAction<java.util.List<com.anova.anovacloud.shared.dto.AttorneyStatusDto>> {
    public AttorneyStatusService_0_getAttorneyStatussImpl(
            String defaultDateFormat) {
        super(HttpMethod.GET, "/attorneyStatuss", defaultDateFormat);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
