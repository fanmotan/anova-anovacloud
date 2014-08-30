package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class UserRoleService_0_getUserRolesImpl extends AbstractRestAction<java.util.List<com.anova.anovacloud.shared.dto.UserRoleDto>> {
    public UserRoleService_0_getUserRolesImpl(
            String defaultDateFormat) {
        super(HttpMethod.GET, "/userRoles", defaultDateFormat);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
