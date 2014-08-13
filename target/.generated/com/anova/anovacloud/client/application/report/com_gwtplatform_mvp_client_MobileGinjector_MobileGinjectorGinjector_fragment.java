package com.anova.anovacloud.client.application.report;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector;

public class com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$anova$anovacloud$client$application$report$ReportPresenter$MyProxy$_annotation$$none$$(com.anova.anovacloud.client.application.report.ReportPresenter.MyProxy injectee) {
    
  }
  
  public void memberInject_Key$type$com$anova$anovacloud$client$application$report$ReportPresenter$_annotation$$none$$(com.anova.anovacloud.client.application.report.ReportPresenter injectee) {
    injector.getFragment_com_gwtplatform_mvp_client().com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection________________(injectee, injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  public void memberInject_Key$type$com$anova$anovacloud$client$application$report$ReportView$Binder$_annotation$$none$$(com.anova.anovacloud.client.application.report.ReportView.Binder injectee) {
    
  }
  
  public void memberInject_Key$type$com$anova$anovacloud$client$application$report$ReportView$_annotation$$none$$(com.anova.anovacloud.client.application.report.ReportView injectee) {
    
  }
  
  
  /**
   * Binding for com.anova.anovacloud.client.application.report.ReportPresenter$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:122)
   */
  public com.anova.anovacloud.client.application.report.ReportPresenter.MyView get_Key$type$com$anova$anovacloud$client$application$report$ReportPresenter$MyView$_annotation$$none$$() {
    com.anova.anovacloud.client.application.report.ReportPresenter.MyView result = get_Key$type$com$anova$anovacloud$client$application$report$ReportView$_annotation$$none$$();
    return result;
    
  }
  
  private com.anova.anovacloud.client.application.report.ReportPresenter.MyProxy singleton_Key$type$com$anova$anovacloud$client$application$report$ReportPresenter$MyProxy$_annotation$$none$$ = null;
  
  public com.anova.anovacloud.client.application.report.ReportPresenter.MyProxy get_Key$type$com$anova$anovacloud$client$application$report$ReportPresenter$MyProxy$_annotation$$none$$() {
    
    if (singleton_Key$type$com$anova$anovacloud$client$application$report$ReportPresenter$MyProxy$_annotation$$none$$ == null) {
    Object created = GWT.create(com.anova.anovacloud.client.application.report.ReportPresenter.MyProxy.class);
    assert created instanceof com.anova.anovacloud.client.application.report.ReportPresenter.MyProxy;
    com.anova.anovacloud.client.application.report.ReportPresenter.MyProxy result = (com.anova.anovacloud.client.application.report.ReportPresenter.MyProxy) created;
    
    memberInject_Key$type$com$anova$anovacloud$client$application$report$ReportPresenter$MyProxy$_annotation$$none$$(result);
    
        singleton_Key$type$com$anova$anovacloud$client$application$report$ReportPresenter$MyProxy$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$anova$anovacloud$client$application$report$ReportPresenter$MyProxy$_annotation$$none$$;
    
  }
  
  private com.anova.anovacloud.client.application.report.ReportPresenter singleton_Key$type$com$anova$anovacloud$client$application$report$ReportPresenter$_annotation$$none$$ = null;
  
  public com.anova.anovacloud.client.application.report.ReportPresenter get_Key$type$com$anova$anovacloud$client$application$report$ReportPresenter$_annotation$$none$$() {
    
    if (singleton_Key$type$com$anova$anovacloud$client$application$report$ReportPresenter$_annotation$$none$$ == null) {
    com.anova.anovacloud.client.application.report.ReportPresenter result = com$anova$anovacloud$client$application$report$ReportPresenter_com$anova$anovacloud$client$application$report$ReportPresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$anova$anovacloud$client$application$report$ReportPresenter$MyView$_annotation$$none$$(), get_Key$type$com$anova$anovacloud$client$application$report$ReportPresenter$MyProxy$_annotation$$none$$(), injector.getFragment_com_anova_anovacloud_client_rest().get_Key$type$com$anova$anovacloud$client$rest$MatterActionService$_annotation$$none$$(), injector.getFragment_com_gwtplatform_dispatch_rest_shared().get_Key$type$com$gwtplatform$dispatch$rest$shared$RestDispatch$_annotation$$none$$());
    memberInject_Key$type$com$anova$anovacloud$client$application$report$ReportPresenter$_annotation$$none$$(result);
    
        singleton_Key$type$com$anova$anovacloud$client$application$report$ReportPresenter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$anova$anovacloud$client$application$report$ReportPresenter$_annotation$$none$$;
    
  }
  
  public com.anova.anovacloud.client.application.report.ReportPresenter com$anova$anovacloud$client$application$report$ReportPresenter_com$anova$anovacloud$client$application$report$ReportPresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.anova.anovacloud.client.application.report.ReportPresenter.MyView _1, com.anova.anovacloud.client.application.report.ReportPresenter.MyProxy _2, com.anova.anovacloud.client.rest.MatterActionService _3, com.gwtplatform.dispatch.rest.shared.RestDispatch _4) {
    return new com.anova.anovacloud.client.application.report.ReportPresenter(_0, _1, _2, _3, _4);
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.anova.anovacloud.client.application.report.ReportPresenter> declared at:
   *   Implicit injection of com.google.gwt.inject.client.AsyncProvider<com.anova.anovacloud.client.application.report.ReportPresenter>
   */
  public com.google.gwt.inject.client.AsyncProvider<com.anova.anovacloud.client.application.report.ReportPresenter> get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$anova$anovacloud$client$application$report$ReportPresenter$$_annotation$$none$$() {
    com.google.gwt.inject.client.AsyncProvider<com.anova.anovacloud.client.application.report.ReportPresenter> result = new com.google.gwt.inject.client.AsyncProvider<com.anova.anovacloud.client.application.report.ReportPresenter>() { 
        public void get(final com.google.gwt.user.client.rpc.AsyncCallback<? super com.anova.anovacloud.client.application.report.ReportPresenter> callback) { 
          com.google.gwt.core.client.GWT.runAsync(com.anova.anovacloud.client.application.report.ReportPresenter.class,new com.google.gwt.core.client.RunAsyncCallback() { 
            public void onSuccess() { 
              callback.onSuccess(get_Key$type$com$anova$anovacloud$client$application$report$ReportPresenter$_annotation$$none$$());
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
   * Binding for com.anova.anovacloud.client.application.report.ReportView$Binder declared at:
   *   Implicit GWT.create binding for com.anova.anovacloud.client.application.report.ReportView$Binder
   */
  public com.anova.anovacloud.client.application.report.ReportView.Binder get_Key$type$com$anova$anovacloud$client$application$report$ReportView$Binder$_annotation$$none$$() {
    Object created = GWT.create(com.anova.anovacloud.client.application.report.ReportView.Binder.class);
    assert created instanceof com.anova.anovacloud.client.application.report.ReportView.Binder;
    com.anova.anovacloud.client.application.report.ReportView.Binder result = (com.anova.anovacloud.client.application.report.ReportView.Binder) created;
    
    memberInject_Key$type$com$anova$anovacloud$client$application$report$ReportView$Binder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private com.anova.anovacloud.client.application.report.ReportView singleton_Key$type$com$anova$anovacloud$client$application$report$ReportView$_annotation$$none$$ = null;
  
  public com.anova.anovacloud.client.application.report.ReportView get_Key$type$com$anova$anovacloud$client$application$report$ReportView$_annotation$$none$$() {
    
    if (singleton_Key$type$com$anova$anovacloud$client$application$report$ReportView$_annotation$$none$$ == null) {
    com.anova.anovacloud.client.application.report.ReportView result = com$anova$anovacloud$client$application$report$ReportView_com$anova$anovacloud$client$application$report$ReportView_methodInjection(get_Key$type$com$anova$anovacloud$client$application$report$ReportView$Binder$_annotation$$none$$());
    memberInject_Key$type$com$anova$anovacloud$client$application$report$ReportView$_annotation$$none$$(result);
    
        singleton_Key$type$com$anova$anovacloud$client$application$report$ReportView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$anova$anovacloud$client$application$report$ReportView$_annotation$$none$$;
    
  }
  
  public com.anova.anovacloud.client.application.report.ReportView com$anova$anovacloud$client$application$report$ReportView_com$anova$anovacloud$client$application$report$ReportView_methodInjection(com.anova.anovacloud.client.application.report.ReportView.Binder _0) {
    return new com.anova.anovacloud.client.application.report.ReportView(_0);
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
    //   Implicit GWT.create binding for com.anova.anovacloud.client.application.report.ReportPresenter$MyProxy
    get_Key$type$com$anova$anovacloud$client$application$report$ReportPresenter$MyProxy$_annotation$$none$$();
    
  }
  
}
