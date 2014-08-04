package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class MatterActionService_4_getDueThreeDaysActionsImpl extends AbstractRestAction<java.util.List<com.anova.anovacloud.shared.dto.ActionDueDto>> {
    public MatterActionService_4_getDueThreeDaysActionsImpl(
            String defaultDateFormat) {
        super(HttpMethod.GET, "/matteractions", defaultDateFormat);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
