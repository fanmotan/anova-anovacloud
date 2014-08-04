package com.gwtplatform.dispatch.client.actionhandler;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gwtplatform$dispatch$client$actionhandler$DefaultClientActionHandlerRegistry$_annotation$$none$$(com.gwtplatform.dispatch.client.actionhandler.DefaultClientActionHandlerRegistry injectee) {
    
  }
  
  private com.gwtplatform.dispatch.client.actionhandler.ClientActionHandlerRegistry singleton_Key$type$com$gwtplatform$dispatch$client$actionhandler$ClientActionHandlerRegistry$_annotation$$com$gwtplatform$dispatch$rest$client$RestBinding$ = null;
  
  public com.gwtplatform.dispatch.client.actionhandler.ClientActionHandlerRegistry get_Key$type$com$gwtplatform$dispatch$client$actionhandler$ClientActionHandlerRegistry$_annotation$$com$gwtplatform$dispatch$rest$client$RestBinding$() {
    
    if (singleton_Key$type$com$gwtplatform$dispatch$client$actionhandler$ClientActionHandlerRegistry$_annotation$$com$gwtplatform$dispatch$rest$client$RestBinding$ == null) {
    com.gwtplatform.dispatch.client.actionhandler.ClientActionHandlerRegistry result = get_Key$type$com$gwtplatform$dispatch$client$actionhandler$DefaultClientActionHandlerRegistry$_annotation$$none$$();
        singleton_Key$type$com$gwtplatform$dispatch$client$actionhandler$ClientActionHandlerRegistry$_annotation$$com$gwtplatform$dispatch$rest$client$RestBinding$ = result;
    }
    return singleton_Key$type$com$gwtplatform$dispatch$client$actionhandler$ClientActionHandlerRegistry$_annotation$$com$gwtplatform$dispatch$rest$client$RestBinding$;
    
  }
  
  
  /**
   * Binding for com.gwtplatform.dispatch.client.actionhandler.DefaultClientActionHandlerRegistry declared at:
   *   Implicit GWT.create binding for com.gwtplatform.dispatch.client.actionhandler.DefaultClientActionHandlerRegistry
   */
  public com.gwtplatform.dispatch.client.actionhandler.DefaultClientActionHandlerRegistry get_Key$type$com$gwtplatform$dispatch$client$actionhandler$DefaultClientActionHandlerRegistry$_annotation$$none$$() {
    Object created = GWT.create(com.gwtplatform.dispatch.client.actionhandler.DefaultClientActionHandlerRegistry.class);
    assert created instanceof com.gwtplatform.dispatch.client.actionhandler.DefaultClientActionHandlerRegistry;
    com.gwtplatform.dispatch.client.actionhandler.DefaultClientActionHandlerRegistry result = (com.gwtplatform.dispatch.client.actionhandler.DefaultClientActionHandlerRegistry) created;
    
    memberInject_Key$type$com$gwtplatform$dispatch$client$actionhandler$DefaultClientActionHandlerRegistry$_annotation$$none$$(result);
    
    return result;
    
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
    //   com.gwtplatform.dispatch.client.gin.AbstractDispatchAsyncModule.bindAnnotated(AbstractDispatchAsyncModule.java:161)
    get_Key$type$com$gwtplatform$dispatch$client$actionhandler$ClientActionHandlerRegistry$_annotation$$com$gwtplatform$dispatch$rest$client$RestBinding$();
    
  }
  
}
