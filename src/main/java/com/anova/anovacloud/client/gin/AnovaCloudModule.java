

package com.anova.anovacloud.client.gin;

import com.gwtplatform.dispatch.rest.client.RestApplicationPath;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class AnovaCloudModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        install(new SharedModule());

        bindConstant().annotatedWith(RestApplicationPath.class).to("/rest");
    }
}
