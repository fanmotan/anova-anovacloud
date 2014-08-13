package com.anova.anovacloud.client.application.login;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class LoginView_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.anova.anovacloud.client.application.login.LoginView_BinderImpl_GenBundle {
  private static LoginView_BinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new LoginView_BinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.anova.anovacloud.client.application.login.LoginView_BinderImpl_GenCss_style() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GFOXD4NDLK-com-anova-anovacloud-client-application-login-LoginView_BinderImpl_GenCss_style-loginWrapper {\n  width : " + ("60%")  + ";\n  margin-left : " + ("auto")  + ";\n  margin-right : " + ("auto")  + ";\n  margin-top : " + ("100px")  + ";\n  font-family : " + ("\"Droid Sans\""+ ","+ " " +"sans-serif")  + ";\n}\n.GFOXD4NDLK-com-anova-anovacloud-client-application-login-LoginView_BinderImpl_GenCss_style-loginWrapper h1 {\n  font-size : " + ("1.9em")  + ";\n  text-align : " + ("center")  + ";\n  margin-bottom : " + ("20px")  + ";\n}\n.GFOXD4NDKK-com-anova-anovacloud-client-application-login-LoginView_BinderImpl_GenCss_style-loginPanel {\n  width : " + ("60%")  + ";\n  margin-left : " + ("auto")  + ";\n  margin-right : ") + (("auto")  + ";\n  border : " + ("1px"+ " " +"solid"+ " " +"#45a0ec")  + ";\n  padding : " + ("20px")  + ";\n}\n.GFOXD4NDJK-com-anova-anovacloud-client-application-login-LoginView_BinderImpl_GenCss_style-loginButton {\n  margin-top : " + ("20px")  + ";\n  padding : " + ("8px"+ " " +"18px")  + ";\n  background-color : " + ("#08b3d8")  + ";\n  -moz-border-radius : " + ("6px")  + ";\n  -webkit-border-radius : " + ("6px")  + ";\n  border-radius : " + ("6px")  + ";\n  color : " + ("#fff")  + ";\n  font-weight : " + ("bold") ) + (";\n  border : " + ("none")  + ";\n}\n.GFOXD4NDHK-com-anova-anovacloud-client-application-login-LoginView_BinderImpl_GenCss_style-formRow {\n  margin-bottom : " + ("10px")  + ";\n}\n.GFOXD4NDIK-com-anova-anovacloud-client-application-login-LoginView_BinderImpl_GenCss_style-formRowCenter {\n  margin-left : " + ("auto")  + ";\n  margin-right : " + ("auto")  + ";\n  margin-bottom : " + ("10px")  + ";\n}\n")) : ((".GFOXD4NDLK-com-anova-anovacloud-client-application-login-LoginView_BinderImpl_GenCss_style-loginWrapper {\n  width : " + ("60%")  + ";\n  margin-right : " + ("auto")  + ";\n  margin-left : " + ("auto")  + ";\n  margin-top : " + ("100px")  + ";\n  font-family : " + ("\"Droid Sans\""+ ","+ " " +"sans-serif")  + ";\n}\n.GFOXD4NDLK-com-anova-anovacloud-client-application-login-LoginView_BinderImpl_GenCss_style-loginWrapper h1 {\n  font-size : " + ("1.9em")  + ";\n  text-align : " + ("center")  + ";\n  margin-bottom : " + ("20px")  + ";\n}\n.GFOXD4NDKK-com-anova-anovacloud-client-application-login-LoginView_BinderImpl_GenCss_style-loginPanel {\n  width : " + ("60%")  + ";\n  margin-right : " + ("auto")  + ";\n  margin-left : ") + (("auto")  + ";\n  border : " + ("1px"+ " " +"solid"+ " " +"#45a0ec")  + ";\n  padding : " + ("20px")  + ";\n}\n.GFOXD4NDJK-com-anova-anovacloud-client-application-login-LoginView_BinderImpl_GenCss_style-loginButton {\n  margin-top : " + ("20px")  + ";\n  padding : " + ("8px"+ " " +"18px")  + ";\n  background-color : " + ("#08b3d8")  + ";\n  -moz-border-radius : " + ("6px")  + ";\n  -webkit-border-radius : " + ("6px")  + ";\n  border-radius : " + ("6px")  + ";\n  color : " + ("#fff")  + ";\n  font-weight : " + ("bold") ) + (";\n  border : " + ("none")  + ";\n}\n.GFOXD4NDHK-com-anova-anovacloud-client-application-login-LoginView_BinderImpl_GenCss_style-formRow {\n  margin-bottom : " + ("10px")  + ";\n}\n.GFOXD4NDIK-com-anova-anovacloud-client-application-login-LoginView_BinderImpl_GenCss_style-formRowCenter {\n  margin-right : " + ("auto")  + ";\n  margin-left : " + ("auto")  + ";\n  margin-bottom : " + ("10px")  + ";\n}\n"));
      }
      public java.lang.String formRow() {
        return "GFOXD4NDHK-com-anova-anovacloud-client-application-login-LoginView_BinderImpl_GenCss_style-formRow";
      }
      public java.lang.String formRowCenter() {
        return "GFOXD4NDIK-com-anova-anovacloud-client-application-login-LoginView_BinderImpl_GenCss_style-formRowCenter";
      }
      public java.lang.String loginButton() {
        return "GFOXD4NDJK-com-anova-anovacloud-client-application-login-LoginView_BinderImpl_GenCss_style-loginButton";
      }
      public java.lang.String loginPanel() {
        return "GFOXD4NDKK-com-anova-anovacloud-client-application-login-LoginView_BinderImpl_GenCss_style-loginPanel";
      }
      public java.lang.String loginWrapper() {
        return "GFOXD4NDLK-com-anova-anovacloud-client-application-login-LoginView_BinderImpl_GenCss_style-loginWrapper";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.anova.anovacloud.client.application.login.LoginView_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.anova.anovacloud.client.application.login.LoginView_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.anova.anovacloud.client.application.login.LoginView_BinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.anova.anovacloud.client.application.login.LoginView_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
