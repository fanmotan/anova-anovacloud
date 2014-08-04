
package com.anova.anovacloud.client.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class PhoneGapModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new MobileModule());
        install(new SharedModule());
    }
}
