package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class CustomerService_4_getAverageRatingsImpl extends AbstractRestAction<java.util.List<com.anova.anovacloud.shared.dto.CustomerRatingDto>> {
    public CustomerService_4_getAverageRatingsImpl(
            String defaultDateFormat) {
        super(HttpMethod.GET, "/customers/ratings", defaultDateFormat);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
