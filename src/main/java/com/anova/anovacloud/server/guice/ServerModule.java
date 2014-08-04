

package com.anova.anovacloud.server.guice;

import javax.inject.Singleton;

import com.google.inject.AbstractModule;
import com.anova.anovacloud.server.DevBootStrapper;
import com.anova.anovacloud.server.authentication.BCryptPasswordSecurity;
import com.anova.anovacloud.server.authentication.PasswordSecurity;
import com.anova.anovacloud.server.rest.RestModule;

public class ServerModule extends AbstractModule {
    @Override
    protected void configure() {
        install(new RestModule());

        bind(PasswordSecurity.class).to(BCryptPasswordSecurity.class).in(Singleton.class);
        bind(DevBootStrapper.class).asEagerSingleton();
    }
}
