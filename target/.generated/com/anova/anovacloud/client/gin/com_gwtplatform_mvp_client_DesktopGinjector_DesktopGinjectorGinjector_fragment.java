package com.anova.anovacloud.client.gin;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$anova$anovacloud$client$gin$ResourceLoader$_annotation$$none$$(com.anova.anovacloud.client.gin.ResourceLoader injectee) {
    
  }
  
  private com.anova.anovacloud.client.gin.ResourceLoader singleton_Key$type$com$anova$anovacloud$client$gin$ResourceLoader$_annotation$$none$$ = null;
  
  public com.anova.anovacloud.client.gin.ResourceLoader get_Key$type$com$anova$anovacloud$client$gin$ResourceLoader$_annotation$$none$$() {
    
    if (singleton_Key$type$com$anova$anovacloud$client$gin$ResourceLoader$_annotation$$none$$ == null) {
    com.anova.anovacloud.client.gin.ResourceLoader result = com$anova$anovacloud$client$gin$ResourceLoader_com$anova$anovacloud$client$gin$ResourceLoader_methodInjection(injector.getFragment_com_anova_anovacloud_client_resources().get_Key$type$com$anova$anovacloud$client$resources$AppResources$_annotation$$none$$(), injector.getFragment_com_anova_anovacloud_client_resources().get_Key$type$com$anova$anovacloud$client$resources$WidgetResources$_annotation$$none$$());
    memberInject_Key$type$com$anova$anovacloud$client$gin$ResourceLoader$_annotation$$none$$(result);
    
        singleton_Key$type$com$anova$anovacloud$client$gin$ResourceLoader$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$anova$anovacloud$client$gin$ResourceLoader$_annotation$$none$$;
    
  }
  
  public com.anova.anovacloud.client.gin.ResourceLoader com$anova$anovacloud$client$gin$ResourceLoader_com$anova$anovacloud$client$gin$ResourceLoader_methodInjection(com.anova.anovacloud.client.resources.AppResources _0, com.anova.anovacloud.client.resources.WidgetResources _1) {
    return new com.anova.anovacloud.client.gin.ResourceLoader(_0, _1);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector;
  public com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment(com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector injector) {
    this.injector = injector;
  }
  
  public void initializeEagerSingletons() {
    // Eager singleton bound at:
    //   Implicit binding for com.anova.anovacloud.client.gin.ResourceLoader
    get_Key$type$com$anova$anovacloud$client$gin$ResourceLoader$_annotation$$none$$();
    
  }
  
}
