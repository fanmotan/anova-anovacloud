package com.anova.anovacloud.client.application.customer;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class CustomerDetailView_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.anova.anovacloud.client.application.customer.CustomerDetailView_BinderImpl_GenBundle {
  private static CustomerDetailView_BinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new CustomerDetailView_BinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.anova.anovacloud.client.application.customer.CustomerDetailView_BinderImpl_GenCss_style() {
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
        return "style";
      }
      public String getText() {
        return (".GFOXD4NDLK-com-anova-anovacloud-client-application-customer-CustomerDetailView_BinderImpl_GenCss_style-panelWrapper {\n  padding : " + ("10px")  + ";\n  padding-top : " + ("20px")  + ";\n  font-size : " + ("0.75em")  + ";\n}\n");
      }
      public java.lang.String panelWrapper() {
        return "GFOXD4NDLK-com-anova-anovacloud-client-application-customer-CustomerDetailView_BinderImpl_GenCss_style-panelWrapper";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.anova.anovacloud.client.application.customer.CustomerDetailView_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.anova.anovacloud.client.application.customer.CustomerDetailView_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.anova.anovacloud.client.application.customer.CustomerDetailView_BinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@com.anova.anovacloud.client.application.customer.CustomerDetailView_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
