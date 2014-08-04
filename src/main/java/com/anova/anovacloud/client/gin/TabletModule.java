
package com.anova.anovacloud.client.gin;

import com.anova.anovacloud.client.application.ApplicationTabletModule;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class TabletModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new ApplicationTabletModule());
    }
}
