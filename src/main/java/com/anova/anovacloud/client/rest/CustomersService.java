
package com.anova.anovacloud.client.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import com.anova.anovacloud.shared.dto.CustomerDto;
import com.gwtplatform.dispatch.rest.shared.RestAction;

import static com.anova.anovacloud.shared.rest.PathParameter.PATH_ID;
import static com.anova.anovacloud.shared.rest.ResourcesPath.CUSTOMERS;
import static com.anova.anovacloud.shared.rest.ResourcesPath.COUNT;
import static com.anova.anovacloud.shared.rest.RestParameter.ID;
import static com.anova.anovacloud.shared.rest.RestParameter.LIMIT;
import static com.anova.anovacloud.shared.rest.RestParameter.OFFSET;

@Path(CUSTOMERS)
public interface CustomersService {
    @GET
    RestAction<List<CustomerDto>> getCustomers();

    @GET
    RestAction<List<CustomerDto>> getCustomers(@QueryParam(OFFSET) int offset, @QueryParam(LIMIT) int limit);

    @GET
    @Path(COUNT)
    RestAction<Integer> getCustomersCount();

    @POST
    RestAction<CustomerDto> saveOrCreate(CustomerDto customerDto);

    @Path(PATH_ID)
    CustomerService customer(@PathParam(ID) Long customerId);
    
    
}
