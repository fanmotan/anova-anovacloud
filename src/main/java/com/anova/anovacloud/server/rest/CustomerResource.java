

package com.anova.anovacloud.server.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.anova.anovacloud.server.dao.CustomerDao;
import com.anova.anovacloud.server.dao.domain.Customer;
import com.anova.anovacloud.shared.dto.CustomerDto;
import com.anova.anovacloud.shared.rest.PathParameter;
import com.anova.anovacloud.shared.rest.ResourcesPath;
import com.anova.anovacloud.shared.rest.RestParameter;

@Path(ResourcesPath.CUSTOMERS)
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource {
	
	private static final String DEFAULT_LIMIT = "1000";
    private static final String DEFAULT_OFFSET = "0";
    private static final Integer INT_DEFAULT_LIMIT = Integer.valueOf(DEFAULT_LIMIT);
    private static final Integer INT_DEFAULT_OFFSET = Integer.valueOf(DEFAULT_OFFSET);

    private final CustomerDao customerDao;
  

    @Inject
    CustomerResource(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @GET
    public Response getCustomers(@DefaultValue(DEFAULT_OFFSET) @QueryParam(RestParameter.OFFSET) int offset,
            @DefaultValue(DEFAULT_LIMIT) @QueryParam(RestParameter.LIMIT) int limit) {
    	
    	List<CustomerDto> customers;

        if (offset == INT_DEFAULT_OFFSET && limit == INT_DEFAULT_LIMIT) {
            customers = Customer.createDto(customerDao.getAll());
        } else {
            customers = Customer.createDto(customerDao.getSome(offset, limit));
        }

        return Response.ok(customers).build();
    }

    @GET
    @Path(ResourcesPath.COUNT)
    public Response getCustomersCount() {
        Integer customersCount = customerDao.countAll();

        return Response.ok(customersCount).build();
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
