
package com.anova.anovacloud.client.gin;

import com.anova.anovacloud.client.application.ApplicationMobileModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class MobileModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new ApplicationMobileModule());
    }
}
