package com.anova.anovacloud.client.application.customers;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector;

public class com_gwtplatform_mvp_client_DesktopGinjector_DesktopGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$anova$anovacloud$client$application$customers$CustomersPresenter$MyProxy$_annotation$$none$$(com.anova.anovacloud.client.application.customers.CustomersPresenter.MyProxy injectee) {
    
  }
  
  public void memberInject_Key$type$com$anova$anovacloud$client$application$customers$CustomersPresenter$_annotation$$none$$(com.anova.anovacloud.client.application.customers.CustomersPresenter injectee) {
    injector.getFragment_com_gwtplatform_mvp_client().com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection______(injectee, injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  public void memberInject_Key$type$com$anova$anovacloud$client$application$customers$CustomersView$Binder$_annotation$$none$$(com.anova.anovacloud.client.application.customers.CustomersView.Binder injectee) {
    
  }
  
  public void memberInject_Key$type$com$anova$anovacloud$client$application$customers$CustomersView$_annotation$$none$$(com.anova.anovacloud.client.application.customers.CustomersView injectee) {
    
  }
  
  
  /**
   * Binding for com.anova.anovacloud.client.application.customers.CustomersPresenter$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:122)
   */
  public com.anova.anovacloud.client.application.customers.CustomersPresenter.MyView get_Key$type$com$anova$anovacloud$client$application$customers$CustomersPresenter$MyView$_annotation$$none$$() {
    com.anova.anovacloud.client.application.customers.CustomersPresenter.MyView result = get_Key$type$com$anova$anovacloud$client$application$customers$CustomersView$_annotation$$none$$();
    return result;
    
  }
  
  private com.anova.anovacloud.client.application.customers.CustomersPresenter.MyProxy singleton_Key$type$com$anova$anovacloud$client$application$customers$CustomersPresenter$MyProxy$_annotation$$none$$ = null;
  
  public com.anova.anovacloud.client.application.customers.CustomersPresenter.MyProxy get_Key$type$com$anova$anovacloud$client$application$customers$CustomersPresenter$MyProxy$_annotation$$none$$() {
    
    if (singleton_Key$type$com$anova$anovacloud$client$application$customers$CustomersPresenter$MyProxy$_annotation$$none$$ == null) {
    Object created = GWT.create(com.anova.anovacloud.client.application.customers.CustomersPresenter.MyProxy.class);
    assert created instanceof com.anova.anovacloud.client.application.customers.CustomersPresenter.MyProxy;
    com.anova.anovacloud.client.application.customers.CustomersPresenter.MyProxy result = (com.anova.anovacloud.client.application.customers.CustomersPresenter.MyProxy) created;
    
    memberInject_Key$type$com$anova$anovacloud$client$application$customers$CustomersPresenter$MyProxy$_annotation$$none$$(result);
    
        singleton_Key$type$com$anova$anovacloud$client$application$customers$CustomersPresenter$MyProxy$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$anova$anovacloud$client$application$customers$CustomersPresenter$MyProxy$_annotation$$none$$;
    
  }
  
  private com.anova.anovacloud.client.application.customers.CustomersPresenter singleton_Key$type$com$anova$anovacloud$client$application$customers$CustomersPresenter$_annotation$$none$$ = null;
  
  public com.anova.anovacloud.client.application.customers.CustomersPresenter get_Key$type$com$anova$anovacloud$client$application$customers$CustomersPresenter$_annotation$$none$$() {
    
    if (singleton_Key$type$com$anova$anovacloud$client$application$customers$CustomersPresenter$_annotation$$none$$ == null) {
    com.anova.anovacloud.client.application.customers.CustomersPresenter result = com$anova$anovacloud$client$application$customers$CustomersPresenter_com$anova$anovacloud$client$application$customers$CustomersPresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$anova$anovacloud$client$application$customers$CustomersPresenter$MyView$_annotation$$none$$(), get_Key$type$com$anova$anovacloud$client$application$customers$CustomersPresenter$MyProxy$_annotation$$none$$(), injector.getFragment_com_gwtplatform_dispatch_rest_shared().get_Key$type$com$gwtplatform$dispatch$rest$shared$RestDispatch$_annotation$$none$$(), injector.getFragment_com_anova_anovacloud_client_rest().get_Key$type$com$anova$anovacloud$client$rest$CustomersService$_annotation$$none$$(), injector.getFragment_com_gwtplatform_mvp_client_proxy().get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$(), injector.getFragment_com_anova_anovacloud_client_application_customers_customer().get_Key$type$com$anova$anovacloud$client$application$customers$customer$CustomerProxyFactory$_annotation$$none$$());
    memberInject_Key$type$com$anova$anovacloud$client$application$customers$CustomersPresenter$_annotation$$none$$(result);
    
        singleton_Key$type$com$anova$anovacloud$client$application$customers$CustomersPresenter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$anova$anovacloud$client$application$customers$CustomersPresenter$_annotation$$none$$;
    
  }
  
  public com.anova.anovacloud.client.application.customers.CustomersPresenter com$anova$anovacloud$client$application$customers$CustomersPresenter_com$anova$anovacloud$client$application$customers$CustomersPresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.anova.anovacloud.client.application.customers.CustomersPresenter.MyView _1, com.anova.anovacloud.client.application.customers.CustomersPresenter.MyProxy _2, com.gwtplatform.dispatch.rest.shared.RestDispatch _3, com.anova.anovacloud.client.rest.CustomersService _4, com.gwtplatform.mvp.client.proxy.PlaceManager _5, com.anova.anovacloud.client.application.customers.customer.CustomerProxyFactory _6) {
    return new com.anova.anovacloud.client.application.customers.CustomersPresenter(_0, _1, _2, _3, _4, _5, _6);
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.anova.anovacloud.client.application.customers.CustomersPresenter> declared at:
   *   Implicit injection of com.google.gwt.inject.client.AsyncProvider<com.anova.anovacloud.client.application.customers.CustomersPresenter>
   */
  public com.google.gwt.inject.client.AsyncProvider<com.anova.anovacloud.client.application.customers.CustomersPresenter> get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$anova$anovacloud$client$application$customers$CustomersPresenter$$_annotation$$none$$() {
    com.google.gwt.inject.client.AsyncProvider<com.anova.anovacloud.client.application.customers.CustomersPresenter> result = new com.google.gwt.inject.client.AsyncProvider<com.anova.anovacloud.client.application.customers.CustomersPresenter>() { 
        public void get(final com.google.gwt.user.client.rpc.AsyncCallback<? super com.anova.anovacloud.client.application.customers.CustomersPresenter> callback) { 
          com.google.gwt.core.client.GWT.runAsync(com.anova.anovacloud.client.application.customers.CustomersPresenter.class,new com.google.gwt.core.client.RunAsyncCallback() { 
            public void onSuccess() { 
              callback.onSuccess(get_Key$type$com$anova$anovacloud$client$application$customers$CustomersPresenter$_annotation$$none$$());
            }
            public void onFailure(Throwable ex) { 
               callback.onFailure(ex); 
            } 
        }); 
        }
     };
    
    return result;
    
  }
  
  
  /**
   * Binding for com.anova.anovacloud.client.application.customers.CustomersView$Binder declared at:
   *   Implicit GWT.create binding for com.anova.anovacloud.client.application.customers.CustomersView$Binder
   */
  public com.anova.anovacloud.client.application.customers.CustomersView.Binder get_Key$type$com$anova$anovacloud$client$application$customers$CustomersView$Binder$_annotation$$none$$() {
    Object created = GWT.create(com.anova.anovacloud.client.application.customers.CustomersView.Binder.class);
    assert created instanceof com.anova.anovacloud.client.application.customers.CustomersView.Binder;
    com.anova.anovacloud.client.application.customers.CustomersView.Binder result = (com.anova.anovacloud.client.application.customers.CustomersView.Binder) created;
    
    memberInject_Key$type$com$anova$anovacloud$client$application$customers$CustomersView$Binder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private com.anova.anovacloud.client.application.customers.CustomersView singleton_Key$type$com$anova$anovacloud$client$application$customers$CustomersView$_annotation$$none$$ = null;
  
  public com.anova.anovacloud.client.application.customers.CustomersView get_Key$type$com$anova$anovacloud$client$application$customers$CustomersView$_annotation$$none$$() {
    
    if (singleton_Key$type$com$anova$anovacloud$client$application$customers$CustomersView$_annotation$$none$$ == null) {
    com.anova.anovacloud.client.application.customers.CustomersView result = com$anova$anovacloud$client$application$customers$CustomersView_com$anova$anovacloud$client$application$customers$CustomersView_methodInjection(get_Key$type$com$anova$anovacloud$client$application$customers$CustomersView$Binder$_annotation$$none$$());
    memberInject_Key$type$com$anova$anovacloud$client$application$customers$CustomersView$_annotation$$none$$(result);
    
        singleton_Key$type$com$anova$anovacloud$client$application$customers$CustomersView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$anova$anovacloud$client$application$customers$CustomersView$_annotation$$none$$;
    
  }
  
  public com.anova.anovacloud.client.application.customers.CustomersView com$anova$anovacloud$client$application$customers$CustomersView_com$anova$anovacloud$client$application$customers$CustomersView_methodInjection(com.anova.anovacloud.client.application.customers.CustomersView.Binder _0) {
    return new com.anova.anovacloud.client.application.customers.CustomersView(_0);
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
    //   Implicit GWT.create binding for com.anova.anovacloud.client.application.customers.CustomersPresenter$MyProxy
    get_Key$type$com$anova$anovacloud$client$application$customers$CustomersPresenter$MyProxy$_annotation$$none$$();
    
  }
  
}
