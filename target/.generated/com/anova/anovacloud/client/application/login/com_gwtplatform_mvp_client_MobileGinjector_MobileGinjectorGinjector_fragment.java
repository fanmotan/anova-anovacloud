package com.anova.anovacloud.client.application.login;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector;

public class com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$anova$anovacloud$client$application$login$LoginPresenter$MyProxy$_annotation$$none$$(com.anova.anovacloud.client.application.login.LoginPresenter.MyProxy injectee) {
    
  }
  
  public void memberInject_Key$type$com$anova$anovacloud$client$application$login$LoginPresenter$_annotation$$none$$(com.anova.anovacloud.client.application.login.LoginPresenter injectee) {
    injector.getFragment_com_gwtplatform_mvp_client().com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection_______________(injectee, injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  public void memberInject_Key$type$com$anova$anovacloud$client$application$login$LoginView$Binder$_annotation$$none$$(com.anova.anovacloud.client.application.login.LoginView.Binder injectee) {
    
  }
  
  public void memberInject_Key$type$com$anova$anovacloud$client$application$login$LoginView$_annotation$$none$$(com.anova.anovacloud.client.application.login.LoginView injectee) {
    
  }
  
  
  /**
   * Binding for com.anova.anovacloud.client.application.login.LoginPresenter$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:122)
   */
  public com.anova.anovacloud.client.application.login.LoginPresenter.MyView get_Key$type$com$anova$anovacloud$client$application$login$LoginPresenter$MyView$_annotation$$none$$() {
    com.anova.anovacloud.client.application.login.LoginPresenter.MyView result = get_Key$type$com$anova$anovacloud$client$application$login$LoginView$_annotation$$none$$();
    return result;
    
  }
  
  private com.anova.anovacloud.client.application.login.LoginPresenter.MyProxy singleton_Key$type$com$anova$anovacloud$client$application$login$LoginPresenter$MyProxy$_annotation$$none$$ = null;
  
  public com.anova.anovacloud.client.application.login.LoginPresenter.MyProxy get_Key$type$com$anova$anovacloud$client$application$login$LoginPresenter$MyProxy$_annotation$$none$$() {
    
    if (singleton_Key$type$com$anova$anovacloud$client$application$login$LoginPresenter$MyProxy$_annotation$$none$$ == null) {
    Object created = GWT.create(com.anova.anovacloud.client.application.login.LoginPresenter.MyProxy.class);
    assert created instanceof com.anova.anovacloud.client.application.login.LoginPresenter.MyProxy;
    com.anova.anovacloud.client.application.login.LoginPresenter.MyProxy result = (com.anova.anovacloud.client.application.login.LoginPresenter.MyProxy) created;
    
    memberInject_Key$type$com$anova$anovacloud$client$application$login$LoginPresenter$MyProxy$_annotation$$none$$(result);
    
        singleton_Key$type$com$anova$anovacloud$client$application$login$LoginPresenter$MyProxy$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$anova$anovacloud$client$application$login$LoginPresenter$MyProxy$_annotation$$none$$;
    
  }
  
  private com.anova.anovacloud.client.application.login.LoginPresenter singleton_Key$type$com$anova$anovacloud$client$application$login$LoginPresenter$_annotation$$none$$ = null;
  
  public com.anova.anovacloud.client.application.login.LoginPresenter get_Key$type$com$anova$anovacloud$client$application$login$LoginPresenter$_annotation$$none$$() {
    
    if (singleton_Key$type$com$anova$anovacloud$client$application$login$LoginPresenter$_annotation$$none$$ == null) {
    com.anova.anovacloud.client.application.login.LoginPresenter result = com$anova$anovacloud$client$application$login$LoginPresenter_com$anova$anovacloud$client$application$login$LoginPresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$anova$anovacloud$client$application$login$LoginPresenter$MyView$_annotation$$none$$(), get_Key$type$com$anova$anovacloud$client$application$login$LoginPresenter$MyProxy$_annotation$$none$$(), injector.getFragment_com_gwtplatform_mvp_client_proxy().get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$(), injector.getFragment_com_gwtplatform_dispatch_rest_shared().get_Key$type$com$gwtplatform$dispatch$rest$shared$RestDispatch$_annotation$$none$$(), injector.getFragment_com_anova_anovacloud_client_rest().get_Key$type$com$anova$anovacloud$client$rest$SessionService$_annotation$$none$$(), injector.getFragment_com_anova_anovacloud_client_security().get_Key$type$com$anova$anovacloud$client$security$CurrentUser$_annotation$$none$$(), injector.getFragment_com_anova_anovacloud_client_resources().get_Key$type$com$anova$anovacloud$client$resources$LoginMessages$_annotation$$none$$());
    memberInject_Key$type$com$anova$anovacloud$client$application$login$LoginPresenter$_annotation$$none$$(result);
    
        singleton_Key$type$com$anova$anovacloud$client$application$login$LoginPresenter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$anova$anovacloud$client$application$login$LoginPresenter$_annotation$$none$$;
    
  }
  
  public com.anova.anovacloud.client.application.login.LoginPresenter com$anova$anovacloud$client$application$login$LoginPresenter_com$anova$anovacloud$client$application$login$LoginPresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.anova.anovacloud.client.application.login.LoginPresenter.MyView _1, com.anova.anovacloud.client.application.login.LoginPresenter.MyProxy _2, com.gwtplatform.mvp.client.proxy.PlaceManager _3, com.gwtplatform.dispatch.rest.shared.RestDispatch _4, com.anova.anovacloud.client.rest.SessionService _5, com.anova.anovacloud.client.security.CurrentUser _6, com.anova.anovacloud.client.resources.LoginMessages _7) {
    return new com.anova.anovacloud.client.application.login.LoginPresenter(_0, _1, _2, _3, _4, _5, _6, _7);
  }
  
  
  /**
   * Binding for com.google.inject.Provider<com.anova.anovacloud.client.application.login.LoginPresenter> declared at:
   *   Implicit provider for com.google.inject.Provider<com.anova.anovacloud.client.application.login.LoginPresenter>
   */
  public com.google.inject.Provider<com.anova.anovacloud.client.application.login.LoginPresenter> get_Key$type$com$google$inject$Provider$com$anova$anovacloud$client$application$login$LoginPresenter$$_annotation$$none$$() {
    com.google.inject.Provider<com.anova.anovacloud.client.application.login.LoginPresenter> result = new com.google.inject.Provider<com.anova.anovacloud.client.application.login.LoginPresenter>() { 
      public com.anova.anovacloud.client.application.login.LoginPresenter get() { 
        return get_Key$type$com$anova$anovacloud$client$application$login$LoginPresenter$_annotation$$none$$();
      }
    };
    return result;
    
  }
  
  
  /**
   * Binding for com.anova.anovacloud.client.application.login.LoginView$Binder declared at:
   *   Implicit GWT.create binding for com.anova.anovacloud.client.application.login.LoginView$Binder
   */
  public com.anova.anovacloud.client.application.login.LoginView.Binder get_Key$type$com$anova$anovacloud$client$application$login$LoginView$Binder$_annotation$$none$$() {
    Object created = GWT.create(com.anova.anovacloud.client.application.login.LoginView.Binder.class);
    assert created instanceof com.anova.anovacloud.client.application.login.LoginView.Binder;
    com.anova.anovacloud.client.application.login.LoginView.Binder result = (com.anova.anovacloud.client.application.login.LoginView.Binder) created;
    
    memberInject_Key$type$com$anova$anovacloud$client$application$login$LoginView$Binder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private com.anova.anovacloud.client.application.login.LoginView singleton_Key$type$com$anova$anovacloud$client$application$login$LoginView$_annotation$$none$$ = null;
  
  public com.anova.anovacloud.client.application.login.LoginView get_Key$type$com$anova$anovacloud$client$application$login$LoginView$_annotation$$none$$() {
    
    if (singleton_Key$type$com$anova$anovacloud$client$application$login$LoginView$_annotation$$none$$ == null) {
    com.anova.anovacloud.client.application.login.LoginView result = com$anova$anovacloud$client$application$login$LoginView_com$anova$anovacloud$client$application$login$LoginView_methodInjection(get_Key$type$com$anova$anovacloud$client$application$login$LoginView$Binder$_annotation$$none$$());
    memberInject_Key$type$com$anova$anovacloud$client$application$login$LoginView$_annotation$$none$$(result);
    
        singleton_Key$type$com$anova$anovacloud$client$application$login$LoginView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$anova$anovacloud$client$application$login$LoginView$_annotation$$none$$;
    
  }
  
  public com.anova.anovacloud.client.application.login.LoginView com$anova$anovacloud$client$application$login$LoginView_com$anova$anovacloud$client$application$login$LoginView_methodInjection(com.anova.anovacloud.client.application.login.LoginView.Binder _0) {
    return new com.anova.anovacloud.client.application.login.LoginView(_0);
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
    //   Implicit GWT.create binding for com.anova.anovacloud.client.application.login.LoginPresenter$MyProxy
    get_Key$type$com$anova$anovacloud$client$application$login$LoginPresenter$MyProxy$_annotation$$none$$();
    
  }
  
}
