

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

import com.anova.anovacloud.server.dao.MatterActionDao;
import com.anova.anovacloud.server.dao.domain.MatterAction;
import com.anova.anovacloud.shared.dto.MatterActionDto;
import com.anova.anovacloud.shared.rest.PathParameter;
import com.anova.anovacloud.shared.rest.ResourcesPath;
import com.anova.anovacloud.shared.rest.RestParameter;

@Path(ResourcesPath.MATTERACTION)
@Produces(MediaType.APPLICATION_JSON)
public class MatterActionResource {
    private final MatterActionDao matterActionDao;


    @Inject
    MatterActionResource(MatterActionDao matterActionDao) {
        this.matterActionDao = matterActionDao;
    }

    @GET
    public Response getMatterActions() {
        List<MatterActionDto> matterActionDtos = MatterAction.createDto(matterActionDao.getAll());

        return Response.ok(matterActionDtos).build();
    }

    @Path(PathParameter.PATH_ID)
    @GET
    public Response get(@PathParam(RestParameter.ID) Long id) {
        MatterActionDto matterActionDto = MatterAction.createDto(matterActionDao.get(id));

        return Response.ok(matterActionDto).build();
    }

    @POST
    public Response saveOrCreate(MatterActionDto matterActionDto) {
        MatterAction matterAction = matterActionDao.put(MatterAction.create(matterActionDto));

        return Response.ok(MatterAction.createDto(matterAction)).build();
    }

    @Path(PathParameter.PATH_ID)
    @DELETE
    public Response delete(@PathParam(RestParameter.ID) Long id) {
        matterActionDao.delete(id);

        return Response.ok().build();
    }
   
}
