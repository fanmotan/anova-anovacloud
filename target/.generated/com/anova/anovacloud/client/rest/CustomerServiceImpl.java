package com.anova.anovacloud.client.rest;

import javax.inject.Inject;

import com.gwtplatform.dispatch.rest.client.DefaultDateFormat;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;
import com.gwtplatform.dispatch.rest.shared.RestAction;
import com.anova.anovacloud.client.rest.CustomerService;
import com.anova.anovacloud.client.rest.CustomerService_3_deleteImpl;
import com.anova.anovacloud.client.rest.CustomerService_1_getImpl;
import com.anova.anovacloud.client.rest.CustomerService_0_getCustomersImpl;
import com.anova.anovacloud.client.rest.CustomerService_2_saveOrCreateImpl;

public class CustomerServiceImpl implements CustomerService {
    private final String defaultDateFormat;

    @Inject
    public CustomerServiceImpl(
            @DefaultDateFormat String defaultDateFormat) {
        this.defaultDateFormat = defaultDateFormat;
    }

    @Override
    public RestAction<java.lang.Void> delete(
            java.lang.Long id) {
        return new CustomerService_3_deleteImpl(
                defaultDateFormat,
                id);
    }

    @Override
    public RestAction<com.anova.anovacloud.shared.dto.CustomerDto> get(
            java.lang.Long id) {
        return new CustomerService_1_getImpl(
                defaultDateFormat,
                id);
    }

    @Override
    public RestAction<java.util.List<com.anova.anovacloud.shared.dto.CustomerDto>> getCustomers() {
        return new CustomerService_0_getCustomersImpl(
                defaultDateFormat);
    }

    @Override
    public RestAction<com.anova.anovacloud.shared.dto.CustomerDto> saveOrCreate(
            com.anova.anovacloud.shared.dto.CustomerDto customerDto) {
        return new CustomerService_2_saveOrCreateImpl(
                defaultDateFormat,
                customerDto);
    }

}


