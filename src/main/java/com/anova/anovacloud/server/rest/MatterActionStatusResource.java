

package com.anova.anovacloud.server.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.anova.anovacloud.server.dao.MatterActionStatusDao;
import com.anova.anovacloud.server.dao.domain.MatterActionStatus;
import com.anova.anovacloud.shared.dto.MatterActionStatusDto;
import com.anova.anovacloud.shared.rest.ResourcesPath;

@Path(ResourcesPath.MATTERACTIONSTATUS)
@Produces(MediaType.APPLICATION_JSON)
public class MatterActionStatusResource {
    private final MatterActionStatusDao matterActionStatusDao;


    @Inject
    MatterActionStatusResource(MatterActionStatusDao matterActionStatusDao) {
        this.matterActionStatusDao = matterActionStatusDao;
    }

    @GET
    public Response getMatterActionStatus() {
        List<MatterActionStatusDto> matterActionStatusDtos = MatterActionStatus.createDto(matterActionStatusDao.getAll());
        return Response.ok(matterActionStatusDtos).build();
    }

   

}
