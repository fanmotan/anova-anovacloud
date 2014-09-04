package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class CustomerStatusService_0_getCustomerStatussImpl extends AbstractRestAction<java.util.List<com.anova.anovacloud.shared.dto.CustomerStatusDto>> {
    public CustomerStatusService_0_getCustomerStatussImpl(
            String defaultDateFormat) {
        super(HttpMethod.GET, "/customerStatuss", defaultDateFormat);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
