

package com.anova.anovacloud.server.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.anova.anovacloud.server.dao.CustomerStatusDao;
import com.anova.anovacloud.server.dao.domain.CustomerStatus;
import com.anova.anovacloud.shared.dto.CustomerStatusDto;
import com.anova.anovacloud.shared.rest.ResourcesPath;

@Path(ResourcesPath.CUSTOMERSTATUS)
@Produces(MediaType.APPLICATION_JSON)
public class CustomerStatusResource {
    private final CustomerStatusDao customerStatusDao;


    @Inject
    CustomerStatusResource(CustomerStatusDao customerStatusDao) {
        this.customerStatusDao = customerStatusDao;
    }

    @GET
    public Response getCustomerStatuss() {
        List<CustomerStatusDto> customerStatusDtos = CustomerStatus.createDto(customerStatusDao.getAll());
        return Response.ok(customerStatusDtos).build();
    }

   

}
