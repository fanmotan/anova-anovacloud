package com.gwtplatform.dispatch.rest.client;

import javax.inject.Singleton;

import com.google.gwt.inject.client.AbstractGinModule;
import com.gwtplatform.dispatch.rest.client.ActionMetadataProvider;
import com.gwtplatform.dispatch.rest.client.ActionMetadataProviderImpl;
import com.gwtplatform.dispatch.rest.client.serialization.JacksonMapperProvider;
import com.gwtplatform.dispatch.rest.client.serialization.JacksonMapperProviderImpl;

import com.anova.anovacloud.client.rest.AttorneyService;
import com.anova.anovacloud.client.rest.AttorneyServiceImpl;
import com.anova.anovacloud.client.rest.AttorneyStatusService;
import com.anova.anovacloud.client.rest.AttorneyStatusServiceImpl;
import com.anova.anovacloud.client.rest.CaseStatusService;
import com.anova.anovacloud.client.rest.CaseStatusServiceImpl;
import com.anova.anovacloud.client.rest.CustomerService;
import com.anova.anovacloud.client.rest.CustomerServiceImpl;
import com.anova.anovacloud.client.rest.CustomerStatusService;
import com.anova.anovacloud.client.rest.CustomerStatusServiceImpl;
import com.anova.anovacloud.client.rest.MatterActionService;
import com.anova.anovacloud.client.rest.MatterActionServiceImpl;
import com.anova.anovacloud.client.rest.MattersService;
import com.anova.anovacloud.client.rest.MattersServiceImpl;
import com.anova.anovacloud.client.rest.SessionService;
import com.anova.anovacloud.client.rest.SessionServiceImpl;
import com.anova.anovacloud.client.rest.UserRoleService;
import com.anova.anovacloud.client.rest.UserRoleServiceImpl;
import com.anova.anovacloud.client.rest.UserService;
import com.anova.anovacloud.client.rest.UserServiceImpl;

public class RestGinModule extends AbstractGinModule {
    @Override
    protected void configure() {
        bind(ActionMetadataProvider.class).to(ActionMetadataProviderImpl.class);
        bind(JacksonMapperProvider.class).to(JacksonMapperProviderImpl.class).in(Singleton.class);

        bind(AttorneyService.class).to(AttorneyServiceImpl.class).in(Singleton.class);
        bind(AttorneyStatusService.class).to(AttorneyStatusServiceImpl.class).in(Singleton.class);
        bind(CaseStatusService.class).to(CaseStatusServiceImpl.class).in(Singleton.class);
        bind(CustomerService.class).to(CustomerServiceImpl.class).in(Singleton.class);
        bind(CustomerStatusService.class).to(CustomerStatusServiceImpl.class).in(Singleton.class);
        bind(MatterActionService.class).to(MatterActionServiceImpl.class).in(Singleton.class);
        bind(MattersService.class).to(MattersServiceImpl.class).in(Singleton.class);
        bind(SessionService.class).to(SessionServiceImpl.class).in(Singleton.class);
        bind(UserRoleService.class).to(UserRoleServiceImpl.class).in(Singleton.class);
        bind(UserService.class).to(UserServiceImpl.class).in(Singleton.class);
    }
}
