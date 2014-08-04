package com.gwtplatform.common.shared;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector;

public class com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector_fragment {
  private com.gwtplatform.common.shared.UrlUtils singleton_Key$type$com$gwtplatform$common$shared$UrlUtils$_annotation$$none$$ = null;
  
  public com.gwtplatform.common.shared.UrlUtils get_Key$type$com$gwtplatform$common$shared$UrlUtils$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$common$shared$UrlUtils$_annotation$$none$$ == null) {
    com.gwtplatform.common.shared.UrlUtils result = injector.getFragment_com_gwtplatform_common_client().get_Key$type$com$gwtplatform$common$client$ClientUrlUtils$_annotation$$none$$();
        singleton_Key$type$com$gwtplatform$common$shared$UrlUtils$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$common$shared$UrlUtils$_annotation$$none$$;
    
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector injector;
  public com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector_fragment(com_gwtplatform_mvp_client_MobileGinjector_MobileGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
