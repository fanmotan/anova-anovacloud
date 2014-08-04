package com.anova.anovacloud.client.rest;

import javax.inject.Inject;

import com.gwtplatform.dispatch.rest.client.DefaultDateFormat;
import com.gwtplatform.dispatch.rest.shared.HttpMethod;
import com.gwtplatform.dispatch.rest.shared.RestAction;
import com.anova.anovacloud.client.rest.UserService;
import com.anova.anovacloud.client.rest.UserService_3_deleteImpl;
import com.anova.anovacloud.client.rest.UserService_1_getImpl;
import com.anova.anovacloud.client.rest.UserService_0_getUsersImpl;
import com.anova.anovacloud.client.rest.UserService_2_saveOrCreateImpl;

public class UserServiceImpl implements UserService {
    private final String defaultDateFormat;

    @Inject
    public UserServiceImpl(
            @DefaultDateFormat String defaultDateFormat) {
        this.defaultDateFormat = defaultDateFormat;
    }

    @Override
    public RestAction<java.lang.Void> delete(
            java.lang.Long id) {
        return new UserService_3_deleteImpl(
                defaultDateFormat,
                id);
    }

    @Override
    public RestAction<com.anova.anovacloud.shared.dto.UserDto> get(
            java.lang.Long id) {
        return new UserService_1_getImpl(
                defaultDateFormat,
                id);
    }

    @Override
    public RestAction<java.util.List<com.anova.anovacloud.shared.dto.UserDto>> getUsers() {
        return new UserService_0_getUsersImpl(
                defaultDateFormat);
    }

    @Override
    public RestAction<com.anova.anovacloud.shared.dto.UserDto> saveOrCreate(
            com.anova.anovacloud.shared.dto.UserDto userDto) {
        return new UserService_2_saveOrCreateImpl(
                defaultDateFormat,
                userDto);
    }

}


