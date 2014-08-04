
package com.anova.anovacloud.client.gin;

import com.gwtplatform.dispatch.rest.client.RestApplicationPath;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class PhoneGapLocalModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindConstant().annotatedWith(RestApplicationPath.class).to("http://127.0.0.1:8888/rest");
    }
}
