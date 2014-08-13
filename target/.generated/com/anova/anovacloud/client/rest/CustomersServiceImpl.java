package com.anova.anovacloud.client.rest;

import javax.inject.Inject;

import com.gwtplatform.dispatch.rest.client.DefaultDateFormat;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;
import com.gwtplatform.dispatch.rest.shared.RestAction;
import com.anova.anovacloud.client.rest.CustomersService;
import com.anova.anovacloud.client.rest.CustomersService_4_CustomerServiceImpl;
import com.anova.anovacloud.client.rest.CustomersService_0_getCustomersImpl;
import com.anova.anovacloud.client.rest.CustomersService_1_getCustomersImpl;
import com.anova.anovacloud.client.rest.CustomersService_2_getCustomersCountImpl;
import com.anova.anovacloud.client.rest.CustomersService_3_saveOrCreateImpl;

public class CustomersServiceImpl implements CustomersService {
    private final String defaultDateFormat;

    @Inject
    public CustomersServiceImpl(
            @DefaultDateFormat String defaultDateFormat) {
        this.defaultDateFormat = defaultDateFormat;
    }

    @Override
    public RestAction<java.util.List<com.anova.anovacloud.shared.dto.CustomerDto>> getCustomers() {
        return new CustomersService_0_getCustomersImpl(
                defaultDateFormat);
    }

    @Override
    public RestAction<java.util.List<com.anova.anovacloud.shared.dto.CustomerDto>> getCustomers(
            int offset, 
            int limit) {
        return new CustomersService_1_getCustomersImpl(
                defaultDateFormat,
                offset,
                limit);
    }

    @Override
    public RestAction<java.lang.Integer> getCustomersCount() {
        return new CustomersService_2_getCustomersCountImpl(
                defaultDateFormat);
    }

    @Override
    public RestAction<com.anova.anovacloud.shared.dto.CustomerDto> saveOrCreate(
            com.anova.anovacloud.shared.dto.CustomerDto customerDto) {
        return new CustomersService_3_saveOrCreateImpl(
                defaultDateFormat,
                customerDto);
    }

    @Override
    public CustomerService customer(
            java.lang.Long customerId) {
        return new CustomersService_4_CustomerServiceImpl(
                defaultDateFormat,
                customerId);
    }

}


