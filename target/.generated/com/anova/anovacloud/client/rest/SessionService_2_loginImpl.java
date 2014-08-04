package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class SessionService_2_loginImpl extends AbstractRestAction<com.anova.anovacloud.shared.dispatch.LogInResult> {
    public SessionService_2_loginImpl(
            String defaultDateFormat,
            com.anova.anovacloud.shared.dispatch.LogInRequest logInRequest) {
        super(HttpMethod.POST, "/session", defaultDateFormat);
        setBodyParam(logInRequest);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
