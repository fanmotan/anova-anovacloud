package com.anova.anovacloud.client.application.matterAction;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MatterActionView_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.anova.anovacloud.client.application.matterAction.MatterActionView_BinderImpl_GenBundle {
  private static MatterActionView_BinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new MatterActionView_BinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.anova.anovacloud.client.application.matterAction.MatterActionView_BinderImpl_GenCss_style() {
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
        return (".GFOXD4NDKL-com-anova-anovacloud-client-application-matterAction-MatterActionView_BinderImpl_GenCss_style-tablehead {\n  margin-top : " + ("20px")  + ";\n  font-size : " + ("0.5em")  + ";\n}\n.GFOXD4NDLL-com-anova-anovacloud-client-application-matterAction-MatterActionView_BinderImpl_GenCss_style-wordWrap {\n  margin-top : " + ("20px")  + ";\n  font-size : " + ("9pt")  + ";\n  width : " + ("100%")  + ";\n  word-wrap : " + ("break-word")  + ";\n}\n");
      }
      public java.lang.String tablehead() {
        return "GFOXD4NDKL-com-anova-anovacloud-client-application-matterAction-MatterActionView_BinderImpl_GenCss_style-tablehead";
      }
      public java.lang.String wordWrap() {
        return "GFOXD4NDLL-com-anova-anovacloud-client-application-matterAction-MatterActionView_BinderImpl_GenCss_style-wordWrap";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.anova.anovacloud.client.application.matterAction.MatterActionView_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.anova.anovacloud.client.application.matterAction.MatterActionView_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.anova.anovacloud.client.application.matterAction.MatterActionView_BinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.anova.anovacloud.client.application.matterAction.MatterActionView_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
