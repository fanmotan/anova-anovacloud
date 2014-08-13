package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class CustomersService_3_saveOrCreateImpl extends AbstractRestAction<com.anova.anovacloud.shared.dto.CustomerDto> {
    public CustomersService_3_saveOrCreateImpl(
            String defaultDateFormat,
            com.anova.anovacloud.shared.dto.CustomerDto customerDto) {
        super(HttpMethod.POST, "/customers", defaultDateFormat);
        setBodyParam(customerDto);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
