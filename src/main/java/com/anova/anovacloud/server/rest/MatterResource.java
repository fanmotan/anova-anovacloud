
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

import com.anova.anovacloud.server.dao.MatterDao;
import com.anova.anovacloud.server.dao.MatterPropertiesDao;
import com.anova.anovacloud.server.dao.domain.Matter;
import com.anova.anovacloud.shared.dto.MatterDto;
import com.anova.anovacloud.shared.dto.MatterPropertiesDto;
import com.anova.anovacloud.shared.rest.PathParameter;
import com.anova.anovacloud.shared.rest.ResourcesPath;
import com.anova.anovacloud.shared.rest.RestParameter;

@Path(ResourcesPath.MATTERS)
@Produces(MediaType.APPLICATION_JSON)
public class MatterResource {
    private static final String DEFAULT_LIMIT = "1000";
    private static final String DEFAULT_OFFSET = "0";
    private static final Integer INT_DEFAULT_LIMIT = Integer.valueOf(DEFAULT_LIMIT);
    private static final Integer INT_DEFAULT_OFFSET = Integer.valueOf(DEFAULT_OFFSET);

    private final MatterDao matterDao;
    private final MatterPropertiesDao matterPropertiesDao;

    @Inject
    MatterResource(MatterDao matterDao,
                MatterPropertiesDao matterPropertiesDao) {
        this.matterDao = matterDao;
        this.matterPropertiesDao = matterPropertiesDao;
    }

    @GET
    public Response getMatters(@DefaultValue(DEFAULT_OFFSET) @QueryParam(RestParameter.OFFSET) int offset,
                            @DefaultValue(DEFAULT_LIMIT) @QueryParam(RestParameter.LIMIT) int limit) {
        List<MatterDto> matters;

        if (offset == INT_DEFAULT_OFFSET && limit == INT_DEFAULT_LIMIT) {
            matters = Matter.createDto(matterDao.getAll());
        } else {
            matters = Matter.createDto(matterDao.getSome(offset, limit));
        }

        return Response.ok(matters).build();
    }

    @GET
    @Path(ResourcesPath.COUNT)
    public Response getMattersCount() {
        Integer mattersCount = matterDao.countAll();

        return Response.ok(mattersCount).build();
    }

    @POST
    public Response saveOrCreate(MatterDto matterDto) {
        MatterPropertiesDto matterProperties = matterDto.getMatterProperties();
        if (matterProperties != null && !matterProperties.isSaved()) {
            matterProperties = matterPropertiesDao.put(matterProperties);
            matterDto.setMatterProperties(matterProperties);
        }

        Matter matter = matterDao.put(Matter.create(matterDto));

        return Response.ok(Matter.createDto(matter)).build();
    }
/*
    @Path(PathParameter.PATH_ID)
    @DELETE
    public Response delete(@PathParam(RestParameter.ID) Long id) {
        matterDao.delete(id);

        return Response.ok().build();
    }
    */
}
