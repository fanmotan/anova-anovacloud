

package com.anova.anovacloud.server.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.anova.anovacloud.server.dao.AttorneyStatusDao;
import com.anova.anovacloud.server.dao.domain.AttorneyStatus;
import com.anova.anovacloud.shared.dto.AttorneyStatusDto;
import com.anova.anovacloud.shared.rest.ResourcesPath;

@Path(ResourcesPath.ATTORNEYSTATUS)
@Produces(MediaType.APPLICATION_JSON)
public class AttorneyStatusResource {
    private final AttorneyStatusDao attorneyStatusDao;


    @Inject
    AttorneyStatusResource(AttorneyStatusDao attorneyStatusDao) {
        this.attorneyStatusDao = attorneyStatusDao;
    }

    @GET
    public Response getAttorneyStatuss() {
        List<AttorneyStatusDto> attorneyStatusDtos = AttorneyStatus.createDto(attorneyStatusDao.getAll());
        return Response.ok(attorneyStatusDtos).build();
    }

   

}
