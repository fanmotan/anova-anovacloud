
package com.anova.anovacloud.client.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.anova.anovacloud.shared.dto.UserDto;
import com.gwtplatform.dispatch.rest.shared.RestAction;

import static com.anova.anovacloud.shared.rest.PathParameter.PATH_ID;
import static com.anova.anovacloud.shared.rest.ResourcesPath.USER;
import static com.anova.anovacloud.shared.rest.RestParameter.ID;

@Path(USER)
public interface UserService {
    @GET
    RestAction<List<UserDto>> getUsers();

    @GET
    @Path(PATH_ID)
    RestAction<UserDto> get(@PathParam(ID) Long id);

    @POST
    RestAction<UserDto> saveOrCreate(UserDto userDto);

    @DELETE
    @Path(PATH_ID)
    RestAction<Void> delete(@PathParam(ID) Long id);

}
