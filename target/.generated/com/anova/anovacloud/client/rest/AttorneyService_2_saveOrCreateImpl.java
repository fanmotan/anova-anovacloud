package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class AttorneyService_2_saveOrCreateImpl extends AbstractRestAction<com.anova.anovacloud.shared.dto.AttorneyDto> {
    public AttorneyService_2_saveOrCreateImpl(
            String defaultDateFormat,
            com.anova.anovacloud.shared.dto.AttorneyDto attorneyDto) {
        super(HttpMethod.POST, "/attorneys", defaultDateFormat);
        setBodyParam(attorneyDto);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
