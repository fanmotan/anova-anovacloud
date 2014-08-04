
package com.anova.anovacloud.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

public interface WidgetResources extends ClientBundle {
    public interface Header extends CssResource {
        String menuActive();
    }

    @Source("header.css")
    public Header header();
}
