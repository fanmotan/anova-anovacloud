package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class AttorneyRoleService_0_getAttorneyRolesImpl extends AbstractRestAction<java.util.List<com.anova.anovacloud.shared.dto.AttorneyRoleDto>> {
    public AttorneyRoleService_0_getAttorneyRolesImpl(
            String defaultDateFormat) {
        super(HttpMethod.GET, "/attorneyRoles", defaultDateFormat);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
