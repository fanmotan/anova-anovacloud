package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class MatterActionStatusService_0_getMatterActionStatussImpl extends AbstractRestAction<java.util.List<com.anova.anovacloud.shared.dto.MatterActionStatusDto>> {
    public MatterActionStatusService_0_getMatterActionStatussImpl(
            String defaultDateFormat) {
        super(HttpMethod.GET, "/matterActionStatus", defaultDateFormat);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
