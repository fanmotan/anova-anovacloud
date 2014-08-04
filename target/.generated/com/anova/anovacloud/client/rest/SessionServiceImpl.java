package com.anova.anovacloud.client.rest;

import javax.inject.Inject;

import com.gwtplatform.dispatch.rest.client.DefaultDateFormat;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;
import com.gwtplatform.dispatch.rest.shared.RestAction;
import com.anova.anovacloud.client.rest.SessionService;
import com.anova.anovacloud.client.rest.SessionService_1_getCurrentUserImpl;
import com.anova.anovacloud.client.rest.SessionService_2_loginImpl;
import com.anova.anovacloud.client.rest.SessionService_0_logoutImpl;

public class SessionServiceImpl implements SessionService {
    private final String defaultDateFormat;

    @Inject
    public SessionServiceImpl(
            @DefaultDateFormat String defaultDateFormat) {
        this.defaultDateFormat = defaultDateFormat;
    }

    @Override
    public RestAction<com.anova.anovacloud.shared.dto.CurrentUserDto> getCurrentUser() {
        return new SessionService_1_getCurrentUserImpl(
                defaultDateFormat);
    }

    @Override
    public RestAction<com.anova.anovacloud.shared.dispatch.LogInResult> login(
            com.anova.anovacloud.shared.dispatch.LogInRequest logInRequest) {
        return new SessionService_2_loginImpl(
                defaultDateFormat,
                logInRequest);
    }

    @Override
    public RestAction<java.lang.Void> logout() {
        return new SessionService_0_logoutImpl(
                defaultDateFormat);
    }

}


