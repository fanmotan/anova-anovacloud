
package com.anova.anovacloud.client.application.matters.matter;

public interface MatterProxyImplFactory {
    MatterProxyImpl create(MatterPresenterProvider matterPresenterProvider, String nameToken);
}
