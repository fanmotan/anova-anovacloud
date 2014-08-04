package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class SessionService_0_logoutImpl extends AbstractRestAction<java.lang.Void> {
    public SessionService_0_logoutImpl(
            String defaultDateFormat) {
        super(HttpMethod.DELETE, "/session", defaultDateFormat);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
