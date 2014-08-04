package com.anova.anovacloud.client.rest;

import com.gwtplatform.dispatch.rest.client.AbstractRestAction;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;

public class UserService_2_saveOrCreateImpl extends AbstractRestAction<com.anova.anovacloud.shared.dto.UserDto> {
    public UserService_2_saveOrCreateImpl(
            String defaultDateFormat,
            com.anova.anovacloud.shared.dto.UserDto userDto) {
        super(HttpMethod.POST, "/users", defaultDateFormat);
        setBodyParam(userDto);
    }

    @Override
    public boolean isSecured() {
        return true;
    }
}
