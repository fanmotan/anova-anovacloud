

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
import com.anova.anovacloud.shared.dto.UserDto;
import com.anova.anovacloud.shared.rest.PathParameter;
import com.anova.anovacloud.shared.rest.ResourcesPath;
import com.anova.anovacloud.shared.rest.RestParameter;

@Path(ResourcesPath.USER)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {
    private final UserDao userDao;
    private final UserRoleDao userRoleDao;


    @Inject
    UserResource(UserDao userDao, UserRoleDao userRoleDao) {
        this.userDao = userDao;
        this.userRoleDao = userRoleDao;
    }

    @GET
    public Response getUsers() {
        List<UserDto> userDtos = User.createDto(userDao.getAll());

        return Response.ok(userDtos).build();
    }

    @Path(PathParameter.PATH_ID)
    @GET
    public Response get(@PathParam(RestParameter.ID) Long id) {
        UserDto userDto = User.createDto(userDao.get(id));

        return Response.ok(userDto).build();
    }

    @POST
    public Response saveOrCreate(UserDto userDto) {
        User user = userDao.put(User.create(userDto));

        return Response.ok(User.createDto(user)).build();
    }

    @Path(PathParameter.PATH_ID)
    @DELETE
    public Response delete(@PathParam(RestParameter.ID) Long id) {
        userDao.delete(id);

        return Response.ok().build();
    }

}
