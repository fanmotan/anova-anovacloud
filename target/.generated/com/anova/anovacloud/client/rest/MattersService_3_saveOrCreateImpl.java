package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class MattersService_3_saveOrCreateImpl extends AbstractRestAction<com.anova.anovacloud.shared.dto.MatterDto> {
    public MattersService_3_saveOrCreateImpl(
            String defaultDateFormat,
            com.anova.anovacloud.shared.dto.MatterDto matterDto) {
        super(HttpMethod.POST, "/matters", defaultDateFormat);
        setBodyParam(matterDto);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
