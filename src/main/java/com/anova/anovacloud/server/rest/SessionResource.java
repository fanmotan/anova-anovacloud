

package com.anova.anovacloud.server.rest;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.anova.anovacloud.server.authentication.AuthenticationException;
import com.anova.anovacloud.server.authentication.Authenticator;
import com.anova.anovacloud.server.authentication.CurrentUserDtoProvider;
import com.anova.anovacloud.server.dao.UserSessionDao;
import com.anova.anovacloud.shared.dispatch.LogInRequest;
import com.anova.anovacloud.shared.dispatch.LogInResult;
import com.anova.anovacloud.shared.dto.ActionType;
import com.anova.anovacloud.shared.dto.CurrentUserDto;
import com.anova.anovacloud.shared.dto.UserDto;
import com.anova.anovacloud.shared.rest.ResourcesPath;

@Path(ResourcesPath.SESSION)
@Produces(MediaType.APPLICATION_JSON)
public class SessionResource {
    private final Authenticator authenticator;
    private final CurrentUserDtoProvider currentUserDtoProvider;
    private final UserSessionDao userSessionDao;

    private boolean isLoggedIn;
    private Logger logger;

    @Inject
    SessionResource(Logger logger,
                    Authenticator authenticator,
                    CurrentUserDtoProvider currentUserDtoProvider,
                    UserSessionDao userSessionDao) {
        this.logger = logger;
        this.authenticator = authenticator;
        this.currentUserDtoProvider = currentUserDtoProvider;
        this.userSessionDao = userSessionDao;
    }

    @GET
    public Response getCurrentUser() {
        CurrentUserDto currentUserDto = currentUserDtoProvider.get();

        return Response.ok(currentUserDto).build();
    }

    @DELETE
    public Response logout() {
        authenticator.logout();

        return Response.ok().build();
    }

    @POST
    public Response login(LogInRequest action) {
        UserDto userDto;
        isLoggedIn = true;

        if (action.getActionType() == ActionType.VIA_COOKIE) {
            userDto = getUserFromCookie(action.getLoggedInCookie());
        } else {
            userDto = getUserFromCredentials(action.getUsername(), action.getPassword());
        }

        CurrentUserDto currentUserDto = new CurrentUserDto(isLoggedIn, userDto);

        String loggedInCookie = "";
        if (isLoggedIn) {
            loggedInCookie = userSessionDao.createSessionCookie(userDto);
        }

        logger.info("Login: actiontype=" + action.getActionType());
        logger.info("Login: currentUserDto=" + currentUserDto);
        logger.info("Login: loggedInCookie=" + loggedInCookie);

        LogInResult logInResult = new LogInResult(action.getActionType(), currentUserDto, loggedInCookie);
        return Response.ok(logInResult).build();
    }

    private UserDto getUserFromCookie(String loggedInCookie) {
        UserDto userDto = null;
        try {
            userDto = authenticator.authenticatCookie(loggedInCookie);
        } catch (AuthenticationException e) {
            isLoggedIn = false;
        }

        return userDto;
    }

    private UserDto getUserFromCredentials(String username, String password) {
        UserDto userDto = null;
        try {
            userDto = authenticator.authenticateCredentials(username, password);
        } catch (AuthenticationException e) {
            isLoggedIn = false;
        }

        return userDto;
    }
}
