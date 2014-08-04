package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class RatingService_2_saveOrCreateImpl extends AbstractRestAction<com.anova.anovacloud.shared.dto.RatingDto> {
    public RatingService_2_saveOrCreateImpl(
            String defaultDateFormat,
            com.anova.anovacloud.shared.dto.RatingDto RatingDto) {
        super(HttpMethod.POST, "/ratings", defaultDateFormat);
        setBodyParam(RatingDto);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
