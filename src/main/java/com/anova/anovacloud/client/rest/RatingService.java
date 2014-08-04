
package com.anova.anovacloud.client.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.anova.anovacloud.shared.dto.RatingDto;
import com.gwtplatform.dispatch.rest.shared.RestAction;

import static com.anova.anovacloud.shared.rest.PathParameter.PATH_ID;
import static com.anova.anovacloud.shared.rest.ResourcesPath.RATING;
import static com.anova.anovacloud.shared.rest.RestParameter.ID;

@Path(RATING)
public interface RatingService {
    @GET
    RestAction<List<RatingDto>> getRatings();

    @GET
    @Path(PATH_ID)
    RestAction<RatingDto> get(@PathParam(ID) Long id);

    @POST
    RestAction<RatingDto> saveOrCreate(RatingDto RatingDto);

    @DELETE
    @Path(PATH_ID)
    RestAction<Void> delete(@PathParam(ID) Long id);
}
