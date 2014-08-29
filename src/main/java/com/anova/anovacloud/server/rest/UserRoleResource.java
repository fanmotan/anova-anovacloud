

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

import com.anova.anovacloud.server.dao.UserDao;
import com.anova.anovacloud.server.dao.UserRoleDao;
import com.anova.anovacloud.server.dao.domain.User;
import com.anova.anovacloud.server.dao.domain.UserRole;
import com.anova.anovacloud.shared.dto.UserDto;
import com.anova.anovacloud.shared.dto.UserRoleDto;
import com.anova.anovacloud.shared.rest.PathParameter;
import com.anova.anovacloud.shared.rest.ResourcesPath;
import com.anova.anovacloud.shared.rest.RestParameter;

@Path(ResourcesPath.USER)
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
