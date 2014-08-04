package com.anova.anovacloud.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class WidgetResources_default_InlineClientBundleGenerator implements com.anova.anovacloud.client.resources.WidgetResources {
  private static WidgetResources_default_InlineClientBundleGenerator _instance0 = new WidgetResources_default_InlineClientBundleGenerator();
  private void headerInitializer() {
    header = new com.anova.anovacloud.client.resources.WidgetResources.Header() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "header";
      }
      public String getText() {
        return (".GFOXD4NDNB-com-anova-anovacloud-client-resources-WidgetResources-Header-menuActive {\n  font-size : " + ("30px")  + ";\n}\n");
      }
      public java.lang.String menuActive() {
        return "GFOXD4NDNB-com-anova-anovacloud-client-resources-WidgetResources-Header-menuActive";
      }
    }
    ;
  }
  private static class headerInitializer {
    static {
      _instance0.headerInitializer();
    }
    static com.anova.anovacloud.client.resources.WidgetResources.Header get() {
      return header;
    }
  }
  public com.anova.anovacloud.client.resources.WidgetResources.Header header() {
    return headerInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.anova.anovacloud.client.resources.WidgetResources.Header header;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      header(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("header", header());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'header': return this.@com.anova.anovacloud.client.resources.WidgetResources::header()();
    }
    return null;
  }-*/;
}
