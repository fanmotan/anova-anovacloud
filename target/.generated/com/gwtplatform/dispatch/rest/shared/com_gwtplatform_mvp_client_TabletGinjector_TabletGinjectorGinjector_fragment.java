package com.gwtplatform.dispatch.rest.shared;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_TabletGinjector_TabletGinjectorGinjector;

public class com_gwtplatform_mvp_client_TabletGinjector_TabletGinjectorGinjector_fragment {
  private com.gwtplatform.dispatch.rest.shared.RestDispatch singleton_Key$type$com$gwtplatform$dispatch$rest$shared$RestDispatch$_annotation$$none$$ = null;
  
  public com.gwtplatform.dispatch.rest.shared.RestDispatch get_Key$type$com$gwtplatform$dispatch$rest$shared$RestDispatch$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$dispatch$rest$shared$RestDispatch$_annotation$$none$$ == null) {
    com.gwtplatform.dispatch.rest.shared.RestDispatch result = injector.getFragment_com_gwtplatform_dispatch_rest_client().get_Key$type$com$gwtplatform$dispatch$rest$client$RestDispatchAsync$_annotation$$none$$();
        singleton_Key$type$com$gwtplatform$dispatch$rest$shared$RestDispatch$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$dispatch$rest$shared$RestDispatch$_annotation$$none$$;
    
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwtplatform_mvp_client_TabletGinjector_TabletGinjectorGinjector injector;
  public com_gwtplatform_mvp_client_TabletGinjector_TabletGinjectorGinjector_fragment(com_gwtplatform_mvp_client_TabletGinjector_TabletGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
