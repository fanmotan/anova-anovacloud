

package com.anova.anovacloud.client.gin;

import com.anova.anovacloud.client.place.NameTokens;
import com.anova.anovacloud.client.security.SecurityModule;
import com.gwtplatform.dispatch.rest.client.gin.RestDispatchAsyncModule;
import com.gwtplatform.mvp.client.annotations.DefaultPlace;
import com.gwtplatform.mvp.client.annotations.ErrorPlace;
import com.gwtplatform.mvp.client.annotations.UnauthorizedPlace;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;

public class SharedModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new DefaultModule());
        install(new SecurityModule());
        install(new RestDispatchAsyncModule());

        // DefaultPlaceManager Places
        bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.LOGIN);
        bindConstant().annotatedWith(ErrorPlace.class).to(NameTokens.LOGIN);
        bindConstant().annotatedWith(UnauthorizedPlace.class).to(NameTokens.UNAUTHORIZED);

        // Load and inject CSS resources
        bind(ResourceLoader.class).asEagerSingleton();
    }
}
