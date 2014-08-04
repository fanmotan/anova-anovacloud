package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class UserService_1_getImpl extends AbstractRestAction<com.anova.anovacloud.shared.dto.UserDto> {
    public UserService_1_getImpl(
            String defaultDateFormat,
            java.lang.Long id) {
        super(HttpMethod.GET, "/users/{id}", defaultDateFormat);
        addPathParam("id", id);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
