

package com.anova.anovacloud.server.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.anova.anovacloud.server.dao.AttorneyRoleDao;
import com.anova.anovacloud.server.dao.domain.AttorneyRole;
import com.anova.anovacloud.shared.dto.AttorneyRoleDto;
import com.anova.anovacloud.shared.rest.ResourcesPath;

@Path(ResourcesPath.ATTORNEYROLE)
@Produces(MediaType.APPLICATION_JSON)
public class AttorneyRoleResource {
    private final AttorneyRoleDao attorneyRoleDao;


    @Inject
    AttorneyRoleResource(AttorneyRoleDao attorneyRoleDao) {
        this.attorneyRoleDao = attorneyRoleDao;
    }

    @GET
    public Response getAttorneyRoles() {
        List<AttorneyRoleDto> attorneyRoleDtos = AttorneyRole.createDto(attorneyRoleDao.getAll());
        return Response.ok(attorneyRoleDtos).build();
    }

   

}
