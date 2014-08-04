
package com.anova.anovacloud.client.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.anova.anovacloud.shared.dto.CustomerDto;
import com.anova.anovacloud.shared.dto.CustomerRatingDto;
import com.anova.anovacloud.shared.rest.ResourcesPath;
import com.gwtplatform.dispatch.rest.shared.RestAction;

import static com.anova.anovacloud.shared.rest.PathParameter.PATH_ID;
import static com.anova.anovacloud.shared.rest.ResourcesPath.CUSTOMER;
import static com.anova.anovacloud.shared.rest.RestParameter.ID;

@Path(CUSTOMER)
public interface CustomerService {
    @GET
    RestAction<List<CustomerDto>> getCustomers();

    @GET
    @Path(PATH_ID)
    RestAction<CustomerDto> get(@PathParam(ID) Long id);

    @POST
    RestAction<CustomerDto> saveOrCreate(CustomerDto customerDto);

    @DELETE
    @Path(PATH_ID)
    RestAction<Void> delete(@PathParam(ID) Long id);

    @GET
    @Path(ResourcesPath.RATING)
    RestAction<List<CustomerRatingDto>> getAverageRatings();
}
