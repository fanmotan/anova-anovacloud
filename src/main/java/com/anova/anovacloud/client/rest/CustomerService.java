package com.anova.anovacloud.client.rest;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;

import com.anova.anovacloud.shared.dto.CustomerDto;
import com.gwtplatform.dispatch.rest.shared.RestAction;

public interface CustomerService {
    @GET
    RestAction<CustomerDto> get();

    @DELETE
    RestAction<Void> delete();
}
