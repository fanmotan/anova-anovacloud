package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class UserService_0_getUsersImpl extends AbstractRestAction<java.util.List<com.anova.anovacloud.shared.dto.UserDto>> {
    public UserService_0_getUsersImpl(
            String defaultDateFormat) {
        super(HttpMethod.GET, "/users", defaultDateFormat);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
