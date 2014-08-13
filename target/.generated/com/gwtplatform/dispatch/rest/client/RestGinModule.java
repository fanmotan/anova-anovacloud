package com.gwtplatform.dispatch.rest.client;

import javax.inject.Singleton;

import com.google.gwt.inject.client.AbstractGinModule;
import com.gwtplatform.dispatch.rest.client.ActionMetadataProvider;
import com.gwtplatform.dispatch.rest.client.ActionMetadataProviderImpl;
import com.gwtplatform.dispatch.rest.client.serialization.JacksonMapperProvider;
import com.gwtplatform.dispatch.rest.client.serialization.JacksonMapperProviderImpl;

import com.anova.anovacloud.client.rest.CustomersService;
import com.anova.anovacloud.client.rest.CustomersServiceImpl;
import com.anova.anovacloud.client.rest.MatterActionService;
import com.anova.anovacloud.client.rest.MatterActionServiceImpl;
import com.anova.anovacloud.client.rest.MattersService;
import com.anova.anovacloud.client.rest.MattersServiceImpl;
import com.anova.anovacloud.client.rest.SessionService;
import com.anova.anovacloud.client.rest.SessionServiceImpl;
import com.anova.anovacloud.client.rest.UserService;
import com.anova.anovacloud.client.rest.UserServiceImpl;

public class RestGinModule extends AbstractGinModule {
    @Override
    protected void configure() {
        bind(ActionMetadataProvider.class).to(ActionMetadataProviderImpl.class);
        bind(JacksonMapperProvider.class).to(JacksonMapperProviderImpl.class).in(Singleton.class);

        bind(CustomersService.class).to(CustomersServiceImpl.class).in(Singleton.class);
        bind(MatterActionService.class).to(MatterActionServiceImpl.class).in(Singleton.class);
        bind(MattersService.class).to(MattersServiceImpl.class).in(Singleton.class);
        bind(SessionService.class).to(SessionServiceImpl.class).in(Singleton.class);
        bind(UserService.class).to(UserServiceImpl.class).in(Singleton.class);
    }
}
