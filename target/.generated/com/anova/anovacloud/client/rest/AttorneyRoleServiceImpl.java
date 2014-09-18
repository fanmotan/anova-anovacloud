package com.anova.anovacloud.client.rest;

import javax.inject.Inject;

import com.gwtplatform.dispatch.rest.client.DefaultDateFormat;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;
import com.gwtplatform.dispatch.rest.shared.RestAction;
import com.anova.anovacloud.client.rest.AttorneyRoleService;
import com.anova.anovacloud.client.rest.AttorneyRoleService_0_getAttorneyRolesImpl;

public class AttorneyRoleServiceImpl implements AttorneyRoleService {
    private final String defaultDateFormat;

    @Inject
    public AttorneyRoleServiceImpl(
            @DefaultDateFormat String defaultDateFormat) {
        this.defaultDateFormat = defaultDateFormat;
    }

    @Override
    public RestAction<java.util.List<com.anova.anovacloud.shared.dto.AttorneyRoleDto>> getAttorneyRoles() {
        return new AttorneyRoleService_0_getAttorneyRolesImpl(
                defaultDateFormat);
    }

}


