package com.anova.anovacloud.client.rest;

import javax.inject.Inject;

import com.gwtplatform.dispatch.rest.client.DefaultDateFormat;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;
import com.gwtplatform.dispatch.rest.shared.RestAction;
import com.anova.anovacloud.client.rest.UserRoleService;
import com.anova.anovacloud.client.rest.UserRoleService_0_getUserRolesImpl;

public class UserRoleServiceImpl implements UserRoleService {
    private final String defaultDateFormat;

    @Inject
    public UserRoleServiceImpl(
            @DefaultDateFormat String defaultDateFormat) {
        this.defaultDateFormat = defaultDateFormat;
    }

    @Override
    public RestAction<java.util.List<com.anova.anovacloud.shared.dto.UserRoleDto>> getUserRoles() {
        return new UserRoleService_0_getUserRolesImpl(
                defaultDateFormat);
    }

}


