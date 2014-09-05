
package com.anova.anovacloud.server.rest;

import javax.inject.Singleton;

import com.google.inject.AbstractModule;

public class RestModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(MatterResource.class);
        bind(MatterActionResource.class);
        bind(CustomerResource.class);
        bind(SessionResource.class);
        bind(UserResource.class);
        bind(UserRoleResource.class);
        bind(CustomerStatusResource.class);
        bind(AttorneyStatusResource.class);
        bind(AttorneyRoleResource.class);
        bind(CaseStatusResource.class);
        bind(MatterActionStatusResource.class);
        bind(AttorneyResource.class);
        bind(JacksonProvider.class).in(Singleton.class);
    }
}
