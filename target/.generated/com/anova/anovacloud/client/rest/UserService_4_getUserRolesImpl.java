package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class UserService_4_getUserRolesImpl extends AbstractRestAction<java.util.List<com.anova.anovacloud.shared.dto.UserRoleDto>> {
    public UserService_4_getUserRolesImpl(
            String defaultDateFormat) {
        super(HttpMethod.GET, "/users", defaultDateFormat);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
