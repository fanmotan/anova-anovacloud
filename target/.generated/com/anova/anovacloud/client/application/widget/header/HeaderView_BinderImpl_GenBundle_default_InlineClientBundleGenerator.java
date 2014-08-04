package com.anova.anovacloud.client.application.widget.header;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class HeaderView_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.anova.anovacloud.client.application.widget.header.HeaderView_BinderImpl_GenBundle {
  private static HeaderView_BinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new HeaderView_BinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.anova.anovacloud.client.application.widget.header.HeaderView_BinderImpl_GenCss_style() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GFOXD4NDKL-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-header {\n  border-bottom : " + ("1px"+ " " +"solid"+ " " +"#45a0ec")  + ";\n}\n.GFOXD4NDLL-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-headerContent {\n  width : " + ("1000px")  + ";\n  margin : " + ("0"+ " " +"auto")  + ";\n  padding : " + ("5px"+ " " +"0")  + ";\n}\n.GFOXD4NDGL-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-applicationTitle {\n  padding-top : " + ("10px")  + ";\n  font-size : " + ("16px")  + ";\n  font-weight : " + ("bold")  + ";\n  padding-right : " + ("10px")  + ";\n  padding-top : " + ("15px")  + ";\n}\n.GFOXD4NDPL-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-userInfo {\n  float : " + ("right")  + ";\n  padding-top : ") + (("6px")  + ";\n  padding-left : " + ("20px")  + ";\n  margin-left : " + ("11px")  + ";\n  border-left : " + ("1px"+ " " +"solid"+ " " +"#aeaeae")  + ";\n}\n.GFOXD4NDAM-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-userName {\n  font-weight : " + ("bold")  + ";\n}\n.GFOXD4NDML-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-logoutButton {\n  background : " + ("none")  + ";\n  border : " + ("none")  + ";\n  color : " + ("#45a0ec")  + ";\n  font-size : " + ("14px")  + ";\n}\n.GFOXD4NDML-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-logoutButton:hover {\n  text-decoration : " + ("underline")  + ";\n  color : " + ("#1d6098") ) + (";\n}\n.GFOXD4NDNL-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-menuBarWrapper {\n  margin-right : " + ("30px")  + ";\n  padding-top : " + ("10px")  + ";\n}\n.GFOXD4NDIL-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-floatLeft {\n  float : " + ("right")  + ";\n}\n.GFOXD4NDJL-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-floatRight {\n  float : " + ("left")  + ";\n}\n.GFOXD4NDOL-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-paddingTop {\n  margin-top : " + ("10px")  + ";\n}\n.GFOXD4NDHL-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-clear {\n  clear : " + ("both")  + ";\n}\n")) : ((".GFOXD4NDKL-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-header {\n  border-bottom : " + ("1px"+ " " +"solid"+ " " +"#45a0ec")  + ";\n}\n.GFOXD4NDLL-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-headerContent {\n  width : " + ("1000px")  + ";\n  margin : " + ("0"+ " " +"auto")  + ";\n  padding : " + ("5px"+ " " +"0")  + ";\n}\n.GFOXD4NDGL-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-applicationTitle {\n  padding-top : " + ("10px")  + ";\n  font-size : " + ("16px")  + ";\n  font-weight : " + ("bold")  + ";\n  padding-left : " + ("10px")  + ";\n  padding-top : " + ("15px")  + ";\n}\n.GFOXD4NDPL-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-userInfo {\n  float : " + ("left")  + ";\n  padding-top : ") + (("6px")  + ";\n  padding-right : " + ("20px")  + ";\n  margin-right : " + ("11px")  + ";\n  border-right : " + ("1px"+ " " +"solid"+ " " +"#aeaeae")  + ";\n}\n.GFOXD4NDAM-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-userName {\n  font-weight : " + ("bold")  + ";\n}\n.GFOXD4NDML-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-logoutButton {\n  background : " + ("none")  + ";\n  border : " + ("none")  + ";\n  color : " + ("#45a0ec")  + ";\n  font-size : " + ("14px")  + ";\n}\n.GFOXD4NDML-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-logoutButton:hover {\n  text-decoration : " + ("underline")  + ";\n  color : " + ("#1d6098") ) + (";\n}\n.GFOXD4NDNL-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-menuBarWrapper {\n  margin-left : " + ("30px")  + ";\n  padding-top : " + ("10px")  + ";\n}\n.GFOXD4NDIL-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-floatLeft {\n  float : " + ("left")  + ";\n}\n.GFOXD4NDJL-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-floatRight {\n  float : " + ("right")  + ";\n}\n.GFOXD4NDOL-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-paddingTop {\n  margin-top : " + ("10px")  + ";\n}\n.GFOXD4NDHL-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-clear {\n  clear : " + ("both")  + ";\n}\n"));
      }
      public java.lang.String applicationTitle() {
        return "GFOXD4NDGL-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-applicationTitle";
      }
      public java.lang.String clear() {
        return "GFOXD4NDHL-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-clear";
      }
      public java.lang.String floatLeft() {
        return "GFOXD4NDIL-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-floatLeft";
      }
      public java.lang.String floatRight() {
        return "GFOXD4NDJL-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-floatRight";
      }
      public java.lang.String header() {
        return "GFOXD4NDKL-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-header";
      }
      public java.lang.String headerContent() {
        return "GFOXD4NDLL-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-headerContent";
      }
      public java.lang.String logoutButton() {
        return "GFOXD4NDML-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-logoutButton";
      }
      public java.lang.String menuBarWrapper() {
        return "GFOXD4NDNL-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-menuBarWrapper";
      }
      public java.lang.String paddingTop() {
        return "GFOXD4NDOL-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-paddingTop";
      }
      public java.lang.String userInfo() {
        return "GFOXD4NDPL-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-userInfo";
      }
      public java.lang.String userName() {
        return "GFOXD4NDAM-com-anova-anovacloud-client-application-widget-header-HeaderView_BinderImpl_GenCss_style-userName";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.anova.anovacloud.client.application.widget.header.HeaderView_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.anova.anovacloud.client.application.widget.header.HeaderView_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.anova.anovacloud.client.application.widget.header.HeaderView_BinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.anova.anovacloud.client.application.widget.header.HeaderView_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
