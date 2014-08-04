
package com.anova.anovacloud.client.rest;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.anova.anovacloud.shared.dispatch.LogInRequest;
import com.anova.anovacloud.shared.dispatch.LogInResult;
import com.anova.anovacloud.shared.dto.CurrentUserDto;
import com.gwtplatform.dispatch.rest.shared.RestAction;

import static com.anova.anovacloud.shared.rest.ResourcesPath.SESSION;

@Path(SESSION)
public interface SessionService {
    @DELETE
    RestAction<Void> logout();

    @GET
    RestAction<CurrentUserDto> getCurrentUser();

    @POST
    RestAction<LogInResult> login(LogInRequest logInRequest);
}
