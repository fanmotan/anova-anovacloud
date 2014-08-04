package com.gwtplatform.dispatch.client;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_TabletGinjector_TabletGinjectorGinjector;

public class com_gwtplatform_mvp_client_TabletGinjector_TabletGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gwtplatform$dispatch$client$DefaultExceptionHandler$_annotation$$none$$(com.gwtplatform.dispatch.client.DefaultExceptionHandler injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$dispatch$client$DefaultSecurityCookieAccessor$_annotation$$none$$(com.gwtplatform.dispatch.client.DefaultSecurityCookieAccessor injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwtplatform$dispatch$client$DefaultDispatchHooks$_annotation$$none$$(com.gwtplatform.dispatch.client.DefaultDispatchHooks injectee) {
    
  }
  
  
  /**
   * Binding for com.gwtplatform.dispatch.client.ExceptionHandler declared at:
   *   com.gwtplatform.dispatch.client.gin.AbstractDispatchAsyncModule.bindAnnotated(AbstractDispatchAsyncModule.java:161)
   */
  public com.gwtplatform.dispatch.client.ExceptionHandler get_Key$type$com$gwtplatform$dispatch$client$ExceptionHandler$_annotation$$com$gwtplatform$dispatch$rest$client$RestBinding$() {
    com.gwtplatform.dispatch.client.ExceptionHandler result = get_Key$type$com$gwtplatform$dispatch$client$DefaultExceptionHandler$_annotation$$none$$();
    return result;
    
  }
  
  private com.gwtplatform.dispatch.client.DispatchHooks singleton_Key$type$com$gwtplatform$dispatch$client$DispatchHooks$_annotation$$com$gwtplatform$dispatch$rest$client$RestBinding$ = null;
  
  public com.gwtplatform.dispatch.client.DispatchHooks get_Key$type$com$gwtplatform$dispatch$client$DispatchHooks$_annotation$$com$gwtplatform$dispatch$rest$client$RestBinding$() {
    
    if (singleton_Key$type$com$gwtplatform$dispatch$client$DispatchHooks$_annotation$$com$gwtplatform$dispatch$rest$client$RestBinding$ == null) {
    com.gwtplatform.dispatch.client.DispatchHooks result = get_Key$type$com$gwtplatform$dispatch$client$DefaultDispatchHooks$_annotation$$none$$();
        singleton_Key$type$com$gwtplatform$dispatch$client$DispatchHooks$_annotation$$com$gwtplatform$dispatch$rest$client$RestBinding$ = result;
    }
    return singleton_Key$type$com$gwtplatform$dispatch$client$DispatchHooks$_annotation$$com$gwtplatform$dispatch$rest$client$RestBinding$;
    
  }
  
  
  /**
   * Binding for com.gwtplatform.dispatch.client.DefaultExceptionHandler declared at:
   *   Implicit GWT.create binding for com.gwtplatform.dispatch.client.DefaultExceptionHandler
   */
  public com.gwtplatform.dispatch.client.DefaultExceptionHandler get_Key$type$com$gwtplatform$dispatch$client$DefaultExceptionHandler$_annotation$$none$$() {
    Object created = GWT.create(com.gwtplatform.dispatch.client.DefaultExceptionHandler.class);
    assert created instanceof com.gwtplatform.dispatch.client.DefaultExceptionHandler;
    com.gwtplatform.dispatch.client.DefaultExceptionHandler result = (com.gwtplatform.dispatch.client.DefaultExceptionHandler) created;
    
    memberInject_Key$type$com$gwtplatform$dispatch$client$DefaultExceptionHandler$_annotation$$none$$(result);
    
    return result;
    
  }
  
  
  /**
   * Binding for com.gwtplatform.dispatch.client.DefaultSecurityCookieAccessor declared at:
   *   Implicit GWT.create binding for com.gwtplatform.dispatch.client.DefaultSecurityCookieAccessor
   */
  public com.gwtplatform.dispatch.client.DefaultSecurityCookieAccessor get_Key$type$com$gwtplatform$dispatch$client$DefaultSecurityCookieAccessor$_annotation$$none$$() {
    Object created = GWT.create(com.gwtplatform.dispatch.client.DefaultSecurityCookieAccessor.class);
    assert created instanceof com.gwtplatform.dispatch.client.DefaultSecurityCookieAccessor;
    com.gwtplatform.dispatch.client.DefaultSecurityCookieAccessor result = (com.gwtplatform.dispatch.client.DefaultSecurityCookieAccessor) created;
    
    memberInject_Key$type$com$gwtplatform$dispatch$client$DefaultSecurityCookieAccessor$_annotation$$none$$(result);
    
    return result;
    
  }
  
  
  /**
   * Binding for com.gwtplatform.dispatch.client.DefaultDispatchHooks declared at:
   *   Implicit GWT.create binding for com.gwtplatform.dispatch.client.DefaultDispatchHooks
   */
  public com.gwtplatform.dispatch.client.DefaultDispatchHooks get_Key$type$com$gwtplatform$dispatch$client$DefaultDispatchHooks$_annotation$$none$$() {
    Object created = GWT.create(com.gwtplatform.dispatch.client.DefaultDispatchHooks.class);
    assert created instanceof com.gwtplatform.dispatch.client.DefaultDispatchHooks;
    com.gwtplatform.dispatch.client.DefaultDispatchHooks result = (com.gwtplatform.dispatch.client.DefaultDispatchHooks) created;
    
    memberInject_Key$type$com$gwtplatform$dispatch$client$DefaultDispatchHooks$_annotation$$none$$(result);
    
    return result;
    
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwtplatform_mvp_client_TabletGinjector_TabletGinjectorGinjector injector;
  public com_gwtplatform_mvp_client_TabletGinjector_TabletGinjectorGinjector_fragment(com_gwtplatform_mvp_client_TabletGinjector_TabletGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
