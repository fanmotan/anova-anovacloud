package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class RatingService_0_getRatingsImpl extends AbstractRestAction<java.util.List<com.anova.anovacloud.shared.dto.RatingDto>> {
    public RatingService_0_getRatingsImpl(
            String defaultDateFormat) {
        super(HttpMethod.GET, "/ratings", defaultDateFormat);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
