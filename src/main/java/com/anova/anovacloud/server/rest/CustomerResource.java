package com.anova.anovacloud.server.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.anova.anovacloud.server.dao.CustomerDao;
import com.anova.anovacloud.server.dao.domain.Customer;
import com.anova.anovacloud.shared.dto.CustomerDto;
import com.anova.anovacloud.shared.rest.PathParameter;
import com.anova.anovacloud.shared.rest.ResourcesPath;
import com.anova.anovacloud.shared.rest.RestParameter;

@Path(ResourcesPath.CUSTOMER)
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource {
    private final CustomerDao customerDao;

    @Inject
    CustomerResource(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @GET
    public Response getCustomers() {
        List<CustomerDto> customerDtos = Customer.createDto(customerDao.getAll());

        return Response.ok(customerDtos).build();
    }
   

    @Path(PathParameter.PATH_ID)
    @GET
    public Response get(@PathParam(RestParameter.ID) Long id) {
        CustomerDto customerDto = Customer.createDto(customerDao.get(id));

        return Response.ok(customerDto).build();
    }

    @POST
    public Response saveOrCreate(CustomerDto customerDto) {
        Customer customer = customerDao.put(Customer.create(customerDto));

        return Response.ok(Customer.createDto(customer)).build();
    }

    @Path(PathParameter.PATH_ID)
    @DELETE
    public Response delete(@PathParam(RestParameter.ID) Long id) {
        customerDao.delete(id);

        return Response.ok().build();
    }
}
