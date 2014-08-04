

package com.anova.anovacloud.client.gin;

import com.anova.anovacloud.client.application.ApplicationDesktopModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class DesktopModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new ApplicationDesktopModule());
    }
}
