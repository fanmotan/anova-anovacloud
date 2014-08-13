package com.gwtplatform.mvp.client.proxy;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector;

public class com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector_fragment {
  public void com$gwtplatform$mvp$client$proxy$ProxyPlaceAbstract_bind_methodInjection(com.gwtplatform.mvp.client.proxy.ProxyPlaceAbstract invokee, com.gwtplatform.mvp.client.proxy.PlaceManager _0, com.google.web.bindery.event.shared.EventBus _1) {
    invokee.bind(_0, _1);
  }
  
  public void com$gwtplatform$mvp$client$proxy$ProxyPlaceAbstract_bind_methodInjection_(com.gwtplatform.mvp.client.proxy.ProxyPlaceAbstract invokee, com.gwtplatform.mvp.client.proxy.PlaceManager _0, com.google.web.bindery.event.shared.EventBus _1) {
    invokee.bind(_0, _1);
  }
  
  public void memberInject_Key$type$com$gwtplatform$mvp$client$proxy$DefaultPlaceManager$_annotation$$none$$(com.gwtplatform.mvp.client.proxy.DefaultPlaceManager injectee) {
    
  }
  
  private com.gwtplatform.mvp.client.proxy.PlaceManager singleton_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$ = null;
  
  public com.gwtplatform.mvp.client.proxy.PlaceManager get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$ == null) {
    com.gwtplatform.mvp.client.proxy.PlaceManager result = get_Key$type$com$gwtplatform$mvp$client$proxy$DefaultPlaceManager$_annotation$$none$$();
        singleton_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$;
    
  }
  
  
  /**
   * Binding for com.gwtplatform.mvp.client.proxy.DefaultPlaceManager declared at:
   *   Implicit binding for com.gwtplatform.mvp.client.proxy.DefaultPlaceManager
   */
  public com.gwtplatform.mvp.client.proxy.DefaultPlaceManager get_Key$type$com$gwtplatform$mvp$client$proxy$DefaultPlaceManager$_annotation$$none$$() {
    com.gwtplatform.mvp.client.proxy.DefaultPlaceManager result = com$gwtplatform$mvp$client$proxy$DefaultPlaceManager_com$gwtplatform$mvp$client$proxy$DefaultPlaceManager_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), injector.getFragment_com_gwtplatform_mvp_shared_proxy().get_Key$type$com$gwtplatform$mvp$shared$proxy$TokenFormatter$_annotation$$none$$(), injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$java$lang$String$_annotation$$com$gwtplatform$mvp$client$annotations$DefaultPlace$(), injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$java$lang$String$_annotation$$com$gwtplatform$mvp$client$annotations$ErrorPlace$(), injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$java$lang$String$_annotation$$com$gwtplatform$mvp$client$annotations$UnauthorizedPlace$());
    memberInject_Key$type$com$gwtplatform$mvp$client$proxy$DefaultPlaceManager$_annotation$$none$$(result);
    
    return result;
    
  }
  
  public com.gwtplatform.mvp.client.proxy.DefaultPlaceManager com$gwtplatform$mvp$client$proxy$DefaultPlaceManager_com$gwtplatform$mvp$client$proxy$DefaultPlaceManager_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.gwtplatform.mvp.shared.proxy.TokenFormatter _1, java.lang.String _2, java.lang.String _3, java.lang.String _4) {
    return new com.gwtplatform.mvp.client.proxy.DefaultPlaceManager(_0, _1, _2, _3, _4);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector injector;
  public com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector_fragment(com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
