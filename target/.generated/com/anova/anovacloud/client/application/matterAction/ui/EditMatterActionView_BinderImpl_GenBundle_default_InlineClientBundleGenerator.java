package com.anova.anovacloud.client.application.matterAction.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class EditMatterActionView_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.anova.anovacloud.client.application.matterAction.ui.EditMatterActionView_BinderImpl_GenBundle {
  private static EditMatterActionView_BinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new EditMatterActionView_BinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.anova.anovacloud.client.application.matterAction.ui.EditMatterActionView_BinderImpl_GenCss_style() {
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
        return (".GFOXD4NDML-com-anova-anovacloud-client-application-matterAction-ui-EditMatterActionView_BinderImpl_GenCss_style-formRow {\n  margin-bottom : " + ("5px")  + ";\n  margin-top : " + ("5px")  + ";\n}\n.GFOXD4NDNL-com-anova-anovacloud-client-application-matterAction-ui-EditMatterActionView_BinderImpl_GenCss_style-textArea {\n  height : " + ("100%")  + ";\n}\n");
      }
      public java.lang.String formRow() {
        return "GFOXD4NDML-com-anova-anovacloud-client-application-matterAction-ui-EditMatterActionView_BinderImpl_GenCss_style-formRow";
      }
      public java.lang.String textArea() {
        return "GFOXD4NDNL-com-anova-anovacloud-client-application-matterAction-ui-EditMatterActionView_BinderImpl_GenCss_style-textArea";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.anova.anovacloud.client.application.matterAction.ui.EditMatterActionView_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.anova.anovacloud.client.application.matterAction.ui.EditMatterActionView_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.anova.anovacloud.client.application.matterAction.ui.EditMatterActionView_BinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.anova.anovacloud.client.application.matterAction.ui.EditMatterActionView_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
