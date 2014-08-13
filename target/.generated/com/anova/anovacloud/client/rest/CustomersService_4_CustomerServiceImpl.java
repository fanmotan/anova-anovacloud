package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.DefaultDateFormat;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;
import com.gwtplatform.dispatch.rest.shared.RestAction;
import com.anova.anovacloud.client.rest.CustomerService;
import com.anova.anovacloud.client.rest.CustomersService_4_CustomerService_1_deleteImpl;
import com.anova.anovacloud.client.rest.CustomersService_4_CustomerService_0_getImpl;

public class CustomersService_4_CustomerServiceImpl implements CustomerService {
    private final java.lang.Long customerId;
    private final String defaultDateFormat;

    public CustomersService_4_CustomerServiceImpl(
            @DefaultDateFormat String defaultDateFormat,
            java.lang.Long customerId) {
        this.defaultDateFormat = defaultDateFormat;
        this.customerId = customerId;
    }

    @Override
    public RestAction<java.lang.Void> delete() {
        return new CustomersService_4_CustomerService_1_deleteImpl(
                defaultDateFormat,
                customerId);
    }

    @Override
    public RestAction<com.anova.anovacloud.shared.dto.CustomerDto> get() {
        return new CustomersService_4_CustomerService_0_getImpl(
                defaultDateFormat,
                customerId);
    }

}


