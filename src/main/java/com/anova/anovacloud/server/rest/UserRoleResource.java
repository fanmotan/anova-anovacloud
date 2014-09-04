

package com.anova.anovacloud.server.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.anova.anovacloud.server.dao.UserRoleDao;
import com.anova.anovacloud.server.dao.domain.UserRole;
import com.anova.anovacloud.shared.dto.UserRoleDto;
import com.anova.anovacloud.shared.rest.ResourcesPath;

@Path(ResourcesPath.USERROLE)
@Produces(MediaType.APPLICATION_JSON)
public class UserRoleResource {
    private final UserRoleDao userRoleDao;


    @Inject
    UserRoleResource(UserRoleDao userRoleDao) {
        this.userRoleDao = userRoleDao;
    }

    @GET
    public Response getUserRoles() {
        List<UserRoleDto> userRoleDtos = UserRole.createDto(userRoleDao.getAll());
        return Response.ok(userRoleDtos).build();
    }

   

}
