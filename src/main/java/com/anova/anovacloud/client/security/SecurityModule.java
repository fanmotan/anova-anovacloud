

package com.anova.anovacloud.client.security;

import com.google.gwt.inject.client.AbstractGinModule;

public class SecurityModule extends AbstractGinModule {
    @Override
    protected void configure() {
        bind(CurrentUser.class).asEagerSingleton();
    }
}
