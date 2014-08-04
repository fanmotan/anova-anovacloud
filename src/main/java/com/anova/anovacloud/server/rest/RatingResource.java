

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

import com.anova.anovacloud.server.dao.RatingDao;
import com.anova.anovacloud.server.dao.domain.Rating;
import com.anova.anovacloud.shared.dto.RatingDto;
import com.anova.anovacloud.shared.rest.PathParameter;
import com.anova.anovacloud.shared.rest.ResourcesPath;
import com.anova.anovacloud.shared.rest.RestParameter;

@Path(ResourcesPath.RATING)
@Produces(MediaType.APPLICATION_JSON)
public class RatingResource {
    private final RatingDao ratingDao;

    @Inject
    RatingResource(RatingDao ratingDao) {
        this.ratingDao = ratingDao;
    }

    @GET
    public Response getRatings() {
        List<RatingDto> ratingDtos = Rating.createDto(ratingDao.getAll());

        return Response.ok(ratingDtos).build();
    }

    @Path(PathParameter.PATH_ID)
    @GET
    public Response get(@PathParam(RestParameter.ID) Long id) {
        RatingDto ratingDto = Rating.createDto(ratingDao.get(id));

        return Response.ok(ratingDto).build();
    }

    @POST
    public Response saveOrCreate(RatingDto ratingDto) {
        Rating rating = ratingDao.put(Rating.create(ratingDto));

        return Response.ok(Rating.createDto(rating)).build();
    }

    @Path(PathParameter.PATH_ID)
    @DELETE
    public Response delete(@PathParam(RestParameter.ID) Long id) {
        ratingDao.delete(id);

        return Response.ok().build();
    }
}
