package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class CustomerService_3_saveOrCreateImpl extends AbstractRestAction<com.anova.anovacloud.shared.dto.CustomerDto> {
    public CustomerService_3_saveOrCreateImpl(
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
