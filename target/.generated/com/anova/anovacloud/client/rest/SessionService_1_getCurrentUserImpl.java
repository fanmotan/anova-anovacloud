package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class SessionService_1_getCurrentUserImpl extends AbstractRestAction<com.anova.anovacloud.shared.dto.CurrentUserDto> {
    public SessionService_1_getCurrentUserImpl(
            String defaultDateFormat) {
        super(HttpMethod.GET, "/session", defaultDateFormat);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
