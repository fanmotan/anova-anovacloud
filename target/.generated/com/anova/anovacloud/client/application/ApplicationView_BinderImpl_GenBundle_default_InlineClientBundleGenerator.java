package com.anova.anovacloud.client.application;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ApplicationView_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.anova.anovacloud.client.application.ApplicationView_BinderImpl_GenBundle {
  private static ApplicationView_BinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new ApplicationView_BinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.anova.anovacloud.client.application.ApplicationView_BinderImpl_GenCss_style() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GFOXD4NDDK-com-anova-anovacloud-client-application-ApplicationView_BinderImpl_GenCss_style-globalWrapper {\n  position : " + ("relative")  + ";\n}\n.GFOXD4NDEK-com-anova-anovacloud-client-application-ApplicationView_BinderImpl_GenCss_style-messagesWrapper {\n  width : " + ("300px")  + ";\n  position : " + ("absolute")  + ";\n  top : " + ("30px")  + ";\n  right : " + ("50%")  + ";\n  margin-right : " + ("-150px")  + ";\n}\n.GFOXD4NDCK-com-anova-anovacloud-client-application-ApplicationView_BinderImpl_GenCss_style-container {\n  width : " + ("1000px")  + ";\n  margin : " + ("20px"+ " " +"auto")  + ";\n}\n")) : ((".GFOXD4NDDK-com-anova-anovacloud-client-application-ApplicationView_BinderImpl_GenCss_style-globalWrapper {\n  position : " + ("relative")  + ";\n}\n.GFOXD4NDEK-com-anova-anovacloud-client-application-ApplicationView_BinderImpl_GenCss_style-messagesWrapper {\n  width : " + ("300px")  + ";\n  position : " + ("absolute")  + ";\n  top : " + ("30px")  + ";\n  left : " + ("50%")  + ";\n  margin-left : " + ("-150px")  + ";\n}\n.GFOXD4NDCK-com-anova-anovacloud-client-application-ApplicationView_BinderImpl_GenCss_style-container {\n  width : " + ("1000px")  + ";\n  margin : " + ("20px"+ " " +"auto")  + ";\n}\n"));
      }
      public java.lang.String container() {
        return "GFOXD4NDCK-com-anova-anovacloud-client-application-ApplicationView_BinderImpl_GenCss_style-container";
      }
      public java.lang.String globalWrapper() {
        return "GFOXD4NDDK-com-anova-anovacloud-client-application-ApplicationView_BinderImpl_GenCss_style-globalWrapper";
      }
      public java.lang.String messagesWrapper() {
        return "GFOXD4NDEK-com-anova-anovacloud-client-application-ApplicationView_BinderImpl_GenCss_style-messagesWrapper";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.anova.anovacloud.client.application.ApplicationView_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.anova.anovacloud.client.application.ApplicationView_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.anova.anovacloud.client.application.ApplicationView_BinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.anova.anovacloud.client.application.ApplicationView_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
