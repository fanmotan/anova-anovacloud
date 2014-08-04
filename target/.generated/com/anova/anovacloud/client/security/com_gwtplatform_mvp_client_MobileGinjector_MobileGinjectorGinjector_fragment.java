package com.anova.anovacloud.client.security;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector;

public class com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$anova$anovacloud$client$security$CurrentUser$_annotation$$none$$(com.anova.anovacloud.client.security.CurrentUser injectee) {
    
  }
  
  public void memberInject_Key$type$com$anova$anovacloud$client$security$LoggedInGatekeeper$_annotation$$none$$(com.anova.anovacloud.client.security.LoggedInGatekeeper injectee) {
    
  }
  
  private com.anova.anovacloud.client.security.CurrentUser singleton_Key$type$com$anova$anovacloud$client$security$CurrentUser$_annotation$$none$$ = null;
  
  public com.anova.anovacloud.client.security.CurrentUser get_Key$type$com$anova$anovacloud$client$security$CurrentUser$_annotation$$none$$() {
    
    if (singleton_Key$type$com$anova$anovacloud$client$security$CurrentUser$_annotation$$none$$ == null) {
    Object created = GWT.create(com.anova.anovacloud.client.security.CurrentUser.class);
    assert created instanceof com.anova.anovacloud.client.security.CurrentUser;
    com.anova.anovacloud.client.security.CurrentUser result = (com.anova.anovacloud.client.security.CurrentUser) created;
    
    memberInject_Key$type$com$anova$anovacloud$client$security$CurrentUser$_annotation$$none$$(result);
    
        singleton_Key$type$com$anova$anovacloud$client$security$CurrentUser$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$anova$anovacloud$client$security$CurrentUser$_annotation$$none$$;
    
  }
  
  
  /**
   * Binding for com.anova.anovacloud.client.security.LoggedInGatekeeper declared at:
   *   Implicit binding for com.anova.anovacloud.client.security.LoggedInGatekeeper
   */
  public com.anova.anovacloud.client.security.LoggedInGatekeeper get_Key$type$com$anova$anovacloud$client$security$LoggedInGatekeeper$_annotation$$none$$() {
    com.anova.anovacloud.client.security.LoggedInGatekeeper result = com$anova$anovacloud$client$security$LoggedInGatekeeper_com$anova$anovacloud$client$security$LoggedInGatekeeper_methodInjection(get_Key$type$com$anova$anovacloud$client$security$CurrentUser$_annotation$$none$$());
    memberInject_Key$type$com$anova$anovacloud$client$security$LoggedInGatekeeper$_annotation$$none$$(result);
    
    return result;
    
  }
  
  public com.anova.anovacloud.client.security.LoggedInGatekeeper com$anova$anovacloud$client$security$LoggedInGatekeeper_com$anova$anovacloud$client$security$LoggedInGatekeeper_methodInjection(com.anova.anovacloud.client.security.CurrentUser _0) {
    return new com.anova.anovacloud.client.security.LoggedInGatekeeper(_0);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector injector;
  public com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector_fragment(com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector injector) {
    this.injector = injector;
  }
  
  public void initializeEagerSingletons() {
    // Eager singleton bound at:
    //   Implicit GWT.create binding for com.anova.anovacloud.client.security.CurrentUser
    get_Key$type$com$anova$anovacloud$client$security$CurrentUser$_annotation$$none$$();
    
  }
  
}
