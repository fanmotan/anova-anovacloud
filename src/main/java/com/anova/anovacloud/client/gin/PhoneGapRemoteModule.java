
package com.anova.anovacloud.client.gin;

import com.gwtplatform.dispatch.rest.client.RestApplicationPath;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class PhoneGapRemoteModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bindConstant().annotatedWith(RestApplicationPath.class).to("http://anova-anovacloud.appspot.com/rest");
    }
}
