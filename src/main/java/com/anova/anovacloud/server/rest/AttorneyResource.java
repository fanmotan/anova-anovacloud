

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

import com.anova.anovacloud.server.dao.AttorneyDao;
import com.anova.anovacloud.server.dao.domain.Attorney;
import com.anova.anovacloud.shared.dto.AttorneyDto;
import com.anova.anovacloud.shared.rest.PathParameter;
import com.anova.anovacloud.shared.rest.ResourcesPath;
import com.anova.anovacloud.shared.rest.RestParameter;

@Path(ResourcesPath.ATTORNEY)
@Produces(MediaType.APPLICATION_JSON)
public class AttorneyResource {
    private final AttorneyDao attorneyDao;


    @Inject
    AttorneyResource(AttorneyDao attorneyDao) {
        this.attorneyDao = attorneyDao;
    }

    @GET
    public Response getAttorneys() {
        List<AttorneyDto> attorneyDtos = Attorney.createDto(attorneyDao.getAll());

        return Response.ok(attorneyDtos).build();
    }

    @Path(PathParameter.PATH_ID)
    @GET
    public Response get(@PathParam(RestParameter.ID) Long id) {
        AttorneyDto attorneyDto = Attorney.createDto(attorneyDao.get(id));

        return Response.ok(attorneyDto).build();
    }

    @POST
    public Response saveOrCreate(AttorneyDto attorneyDto) {
        Attorney attorney = attorneyDao.put(Attorney.create(attorneyDto));

        return Response.ok(Attorney.createDto(attorney)).build();
    }

    @Path(PathParameter.PATH_ID)
    @DELETE
    public Response delete(@PathParam(RestParameter.ID) Long id) {
        attorneyDao.delete(id);

        return Response.ok().build();
    }

}
