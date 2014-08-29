package com.anova.anovacloud.client.application.matters;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector;

public class com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$anova$anovacloud$client$application$matters$MattersPresenter$MyProxy$_annotation$$none$$(com.anova.anovacloud.client.application.matters.MattersPresenter.MyProxy injectee) {
    
  }
  
  public void memberInject_Key$type$com$anova$anovacloud$client$application$matters$MattersPresenter$_annotation$$none$$(com.anova.anovacloud.client.application.matters.MattersPresenter injectee) {
    injector.getFragment_com_gwtplatform_mvp_client().com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection_______________(injectee, injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  public void memberInject_Key$type$com$anova$anovacloud$client$application$matters$MattersView$Binder$_annotation$$none$$(com.anova.anovacloud.client.application.matters.MattersView.Binder injectee) {
    
  }
  
  public void memberInject_Key$type$com$anova$anovacloud$client$application$matters$MattersView$_annotation$$none$$(com.anova.anovacloud.client.application.matters.MattersView injectee) {
    
  }
  
  
  /**
   * Binding for com.anova.anovacloud.client.application.matters.MattersPresenter$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:122)
   */
  public com.anova.anovacloud.client.application.matters.MattersPresenter.MyView get_Key$type$com$anova$anovacloud$client$application$matters$MattersPresenter$MyView$_annotation$$none$$() {
    com.anova.anovacloud.client.application.matters.MattersPresenter.MyView result = get_Key$type$com$anova$anovacloud$client$application$matters$MattersView$_annotation$$none$$();
    return result;
    
  }
  
  private com.anova.anovacloud.client.application.matters.MattersPresenter.MyProxy singleton_Key$type$com$anova$anovacloud$client$application$matters$MattersPresenter$MyProxy$_annotation$$none$$ = null;
  
  public com.anova.anovacloud.client.application.matters.MattersPresenter.MyProxy get_Key$type$com$anova$anovacloud$client$application$matters$MattersPresenter$MyProxy$_annotation$$none$$() {
    
    if (singleton_Key$type$com$anova$anovacloud$client$application$matters$MattersPresenter$MyProxy$_annotation$$none$$ == null) {
    Object created = GWT.create(com.anova.anovacloud.client.application.matters.MattersPresenter.MyProxy.class);
    assert created instanceof com.anova.anovacloud.client.application.matters.MattersPresenter.MyProxy;
    com.anova.anovacloud.client.application.matters.MattersPresenter.MyProxy result = (com.anova.anovacloud.client.application.matters.MattersPresenter.MyProxy) created;
    
    memberInject_Key$type$com$anova$anovacloud$client$application$matters$MattersPresenter$MyProxy$_annotation$$none$$(result);
    
        singleton_Key$type$com$anova$anovacloud$client$application$matters$MattersPresenter$MyProxy$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$anova$anovacloud$client$application$matters$MattersPresenter$MyProxy$_annotation$$none$$;
    
  }
  
  private com.anova.anovacloud.client.application.matters.MattersPresenter singleton_Key$type$com$anova$anovacloud$client$application$matters$MattersPresenter$_annotation$$none$$ = null;
  
  public com.anova.anovacloud.client.application.matters.MattersPresenter get_Key$type$com$anova$anovacloud$client$application$matters$MattersPresenter$_annotation$$none$$() {
    
    if (singleton_Key$type$com$anova$anovacloud$client$application$matters$MattersPresenter$_annotation$$none$$ == null) {
    com.anova.anovacloud.client.application.matters.MattersPresenter result = com$anova$anovacloud$client$application$matters$MattersPresenter_com$anova$anovacloud$client$application$matters$MattersPresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$anova$anovacloud$client$application$matters$MattersPresenter$MyView$_annotation$$none$$(), get_Key$type$com$anova$anovacloud$client$application$matters$MattersPresenter$MyProxy$_annotation$$none$$(), injector.getFragment_com_gwtplatform_dispatch_rest_shared().get_Key$type$com$gwtplatform$dispatch$rest$shared$RestDispatch$_annotation$$none$$(), injector.getFragment_com_anova_anovacloud_client_rest().get_Key$type$com$anova$anovacloud$client$rest$MattersService$_annotation$$none$$(), injector.getFragment_com_gwtplatform_mvp_client_proxy().get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$(), injector.getFragment_com_anova_anovacloud_client_application_matters_matter().get_Key$type$com$anova$anovacloud$client$application$matters$matter$MatterProxyFactory$_annotation$$none$$());
    memberInject_Key$type$com$anova$anovacloud$client$application$matters$MattersPresenter$_annotation$$none$$(result);
    
        singleton_Key$type$com$anova$anovacloud$client$application$matters$MattersPresenter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$anova$anovacloud$client$application$matters$MattersPresenter$_annotation$$none$$;
    
  }
  
  public com.anova.anovacloud.client.application.matters.MattersPresenter com$anova$anovacloud$client$application$matters$MattersPresenter_com$anova$anovacloud$client$application$matters$MattersPresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.anova.anovacloud.client.application.matters.MattersPresenter.MyView _1, com.anova.anovacloud.client.application.matters.MattersPresenter.MyProxy _2, com.gwtplatform.dispatch.rest.shared.RestDispatch _3, com.anova.anovacloud.client.rest.MattersService _4, com.gwtplatform.mvp.client.proxy.PlaceManager _5, com.anova.anovacloud.client.application.matters.matter.MatterProxyFactory _6) {
    return new com.anova.anovacloud.client.application.matters.MattersPresenter(_0, _1, _2, _3, _4, _5, _6);
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.anova.anovacloud.client.application.matters.MattersPresenter> declared at:
   *   Implicit injection of com.google.gwt.inject.client.AsyncProvider<com.anova.anovacloud.client.application.matters.MattersPresenter>
   */
  public com.google.gwt.inject.client.AsyncProvider<com.anova.anovacloud.client.application.matters.MattersPresenter> get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$anova$anovacloud$client$application$matters$MattersPresenter$$_annotation$$none$$() {
    com.google.gwt.inject.client.AsyncProvider<com.anova.anovacloud.client.application.matters.MattersPresenter> result = new com.google.gwt.inject.client.AsyncProvider<com.anova.anovacloud.client.application.matters.MattersPresenter>() { 
        public void get(final com.google.gwt.user.client.rpc.AsyncCallback<? super com.anova.anovacloud.client.application.matters.MattersPresenter> callback) { 
          com.google.gwt.core.client.GWT.runAsync(com.anova.anovacloud.client.application.matters.MattersPresenter.class,new com.google.gwt.core.client.RunAsyncCallback() { 
            public void onSuccess() { 
              callback.onSuccess(get_Key$type$com$anova$anovacloud$client$application$matters$MattersPresenter$_annotation$$none$$());
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
   * Binding for com.anova.anovacloud.client.application.matters.MattersView$Binder declared at:
   *   Implicit GWT.create binding for com.anova.anovacloud.client.application.matters.MattersView$Binder
   */
  public com.anova.anovacloud.client.application.matters.MattersView.Binder get_Key$type$com$anova$anovacloud$client$application$matters$MattersView$Binder$_annotation$$none$$() {
    Object created = GWT.create(com.anova.anovacloud.client.application.matters.MattersView.Binder.class);
    assert created instanceof com.anova.anovacloud.client.application.matters.MattersView.Binder;
    com.anova.anovacloud.client.application.matters.MattersView.Binder result = (com.anova.anovacloud.client.application.matters.MattersView.Binder) created;
    
    memberInject_Key$type$com$anova$anovacloud$client$application$matters$MattersView$Binder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private com.anova.anovacloud.client.application.matters.MattersView singleton_Key$type$com$anova$anovacloud$client$application$matters$MattersView$_annotation$$none$$ = null;
  
  public com.anova.anovacloud.client.application.matters.MattersView get_Key$type$com$anova$anovacloud$client$application$matters$MattersView$_annotation$$none$$() {
    
    if (singleton_Key$type$com$anova$anovacloud$client$application$matters$MattersView$_annotation$$none$$ == null) {
    com.anova.anovacloud.client.application.matters.MattersView result = com$anova$anovacloud$client$application$matters$MattersView_com$anova$anovacloud$client$application$matters$MattersView_methodInjection(get_Key$type$com$anova$anovacloud$client$application$matters$MattersView$Binder$_annotation$$none$$());
    memberInject_Key$type$com$anova$anovacloud$client$application$matters$MattersView$_annotation$$none$$(result);
    
        singleton_Key$type$com$anova$anovacloud$client$application$matters$MattersView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$anova$anovacloud$client$application$matters$MattersView$_annotation$$none$$;
    
  }
  
  public com.anova.anovacloud.client.application.matters.MattersView com$anova$anovacloud$client$application$matters$MattersView_com$anova$anovacloud$client$application$matters$MattersView_methodInjection(com.anova.anovacloud.client.application.matters.MattersView.Binder _0) {
    return new com.anova.anovacloud.client.application.matters.MattersView(_0);
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
    //   Implicit GWT.create binding for com.anova.anovacloud.client.application.matters.MattersPresenter$MyProxy
    get_Key$type$com$anova$anovacloud$client$application$matters$MattersPresenter$MyProxy$_annotation$$none$$();
    
  }
  
}
