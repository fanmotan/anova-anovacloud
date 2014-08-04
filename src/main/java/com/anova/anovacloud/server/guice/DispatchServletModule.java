

package com.anova.anovacloud.server.guice;

import com.arcbees.guicyresteasy.GuiceRestEasyFilterDispatcher;
import com.google.inject.servlet.ServletModule;

public class DispatchServletModule extends ServletModule {
    @Override
    public void configureServlets() {
        filter("/rest/*").through(GuiceRestEasyFilterDispatcher.class);
    }
}
