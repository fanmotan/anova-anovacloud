package com.anova.anovacloud.client.rest;

import javax.inject.Inject;

import com.gwtplatform.dispatch.rest.client.DefaultDateFormat;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;
import com.gwtplatform.dispatch.rest.shared.RestAction;
import com.anova.anovacloud.client.rest.CustomerStatusService;
import com.anova.anovacloud.client.rest.CustomerStatusService_0_getCustomerStatussImpl;

public class CustomerStatusServiceImpl implements CustomerStatusService {
    private final String defaultDateFormat;

    @Inject
    public CustomerStatusServiceImpl(
            @DefaultDateFormat String defaultDateFormat) {
        this.defaultDateFormat = defaultDateFormat;
    }

    @Override
    public RestAction<java.util.List<com.anova.anovacloud.shared.dto.CustomerStatusDto>> getCustomerStatuss() {
        return new CustomerStatusService_0_getCustomerStatussImpl(
                defaultDateFormat);
    }

}


