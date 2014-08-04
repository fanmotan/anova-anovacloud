
package com.anova.anovacloud.client.gin;

import com.google.inject.Inject;
import com.anova.anovacloud.client.resources.AppResources;
import com.anova.anovacloud.client.resources.WidgetResources;

public class ResourceLoader {
    @Inject
    ResourceLoader(AppResources resources,
                          WidgetResources widgetResources) {
        resources.styles().ensureInjected();
        widgetResources.header().ensureInjected();
    }
}
