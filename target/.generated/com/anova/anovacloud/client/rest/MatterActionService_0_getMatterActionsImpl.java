package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class MatterActionService_0_getMatterActionsImpl extends AbstractRestAction<java.util.List<com.anova.anovacloud.shared.dto.MatterActionDto>> {
    public MatterActionService_0_getMatterActionsImpl(
            String defaultDateFormat) {
        super(HttpMethod.GET, "/matteractions", defaultDateFormat);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
