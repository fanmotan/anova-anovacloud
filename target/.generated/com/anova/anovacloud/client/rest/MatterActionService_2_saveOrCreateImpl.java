package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class MatterActionService_2_saveOrCreateImpl extends AbstractRestAction<com.anova.anovacloud.shared.dto.MatterActionDto> {
    public MatterActionService_2_saveOrCreateImpl(
            String defaultDateFormat,
            com.anova.anovacloud.shared.dto.MatterActionDto MatterActionDto) {
        super(HttpMethod.POST, "/matteractions", defaultDateFormat);
        setBodyParam(MatterActionDto);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
