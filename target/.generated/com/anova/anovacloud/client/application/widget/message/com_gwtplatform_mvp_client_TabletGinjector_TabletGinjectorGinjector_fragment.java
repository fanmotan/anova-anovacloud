package com.anova.anovacloud.client.application.widget.message;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_TabletGinjector_TabletGinjectorGinjector;

public class com_gwtplatform_mvp_client_TabletGinjector_TabletGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$anova$anovacloud$client$application$widget$message$MessagesPresenter$_annotation$$none$$(com.anova.anovacloud.client.application.widget.message.MessagesPresenter injectee) {
    injector.getFragment_com_gwtplatform_mvp_client().com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection__(injectee, injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  public void memberInject_Key$type$com$anova$anovacloud$client$application$widget$message$MessagesView$Binder$_annotation$$none$$(com.anova.anovacloud.client.application.widget.message.MessagesView.Binder injectee) {
    
  }
  
  public void memberInject_Key$type$com$anova$anovacloud$client$application$widget$message$MessagesView$_annotation$$none$$(com.anova.anovacloud.client.application.widget.message.MessagesView injectee) {
    
  }
  
  private com.anova.anovacloud.client.application.widget.message.MessagesPresenter.MyView singleton_Key$type$com$anova$anovacloud$client$application$widget$message$MessagesPresenter$MyView$_annotation$$none$$ = null;
  
  public com.anova.anovacloud.client.application.widget.message.MessagesPresenter.MyView get_Key$type$com$anova$anovacloud$client$application$widget$message$MessagesPresenter$MyView$_annotation$$none$$() {
    
    if (singleton_Key$type$com$anova$anovacloud$client$application$widget$message$MessagesPresenter$MyView$_annotation$$none$$ == null) {
    com.anova.anovacloud.client.application.widget.message.MessagesPresenter.MyView result = get_Key$type$com$anova$anovacloud$client$application$widget$message$MessagesView$_annotation$$none$$();
        singleton_Key$type$com$anova$anovacloud$client$application$widget$message$MessagesPresenter$MyView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$anova$anovacloud$client$application$widget$message$MessagesPresenter$MyView$_annotation$$none$$;
    
  }
  
  private com.anova.anovacloud.client.application.widget.message.MessagesPresenter singleton_Key$type$com$anova$anovacloud$client$application$widget$message$MessagesPresenter$_annotation$$none$$ = null;
  
  public com.anova.anovacloud.client.application.widget.message.MessagesPresenter get_Key$type$com$anova$anovacloud$client$application$widget$message$MessagesPresenter$_annotation$$none$$() {
    
    if (singleton_Key$type$com$anova$anovacloud$client$application$widget$message$MessagesPresenter$_annotation$$none$$ == null) {
    com.anova.anovacloud.client.application.widget.message.MessagesPresenter result = com$anova$anovacloud$client$application$widget$message$MessagesPresenter_com$anova$anovacloud$client$application$widget$message$MessagesPresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$anova$anovacloud$client$application$widget$message$MessagesPresenter$MyView$_annotation$$none$$());
    memberInject_Key$type$com$anova$anovacloud$client$application$widget$message$MessagesPresenter$_annotation$$none$$(result);
    
        singleton_Key$type$com$anova$anovacloud$client$application$widget$message$MessagesPresenter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$anova$anovacloud$client$application$widget$message$MessagesPresenter$_annotation$$none$$;
    
  }
  
  public com.anova.anovacloud.client.application.widget.message.MessagesPresenter com$anova$anovacloud$client$application$widget$message$MessagesPresenter_com$anova$anovacloud$client$application$widget$message$MessagesPresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.anova.anovacloud.client.application.widget.message.MessagesPresenter.MyView _1) {
    return new com.anova.anovacloud.client.application.widget.message.MessagesPresenter(_0, _1);
  }
  
  
  /**
   * Binding for com.anova.anovacloud.client.application.widget.message.MessagesView$Binder declared at:
   *   Implicit GWT.create binding for com.anova.anovacloud.client.application.widget.message.MessagesView$Binder
   */
  public com.anova.anovacloud.client.application.widget.message.MessagesView.Binder get_Key$type$com$anova$anovacloud$client$application$widget$message$MessagesView$Binder$_annotation$$none$$() {
    Object created = GWT.create(com.anova.anovacloud.client.application.widget.message.MessagesView.Binder.class);
    assert created instanceof com.anova.anovacloud.client.application.widget.message.MessagesView.Binder;
    com.anova.anovacloud.client.application.widget.message.MessagesView.Binder result = (com.anova.anovacloud.client.application.widget.message.MessagesView.Binder) created;
    
    memberInject_Key$type$com$anova$anovacloud$client$application$widget$message$MessagesView$Binder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  
  /**
   * Binding for com.anova.anovacloud.client.application.widget.message.MessagesView declared at:
   *   Implicit binding for com.anova.anovacloud.client.application.widget.message.MessagesView
   */
  public com.anova.anovacloud.client.application.widget.message.MessagesView get_Key$type$com$anova$anovacloud$client$application$widget$message$MessagesView$_annotation$$none$$() {
    com.anova.anovacloud.client.application.widget.message.MessagesView result = com$anova$anovacloud$client$application$widget$message$MessagesView_com$anova$anovacloud$client$application$widget$message$MessagesView_methodInjection(get_Key$type$com$anova$anovacloud$client$application$widget$message$MessagesView$Binder$_annotation$$none$$(), injector.getFragment_com_anova_anovacloud_client_application_widget_message_ui().get_Key$type$com$anova$anovacloud$client$application$widget$message$ui$MessageWidgetFactory$_annotation$$none$$());
    memberInject_Key$type$com$anova$anovacloud$client$application$widget$message$MessagesView$_annotation$$none$$(result);
    
    return result;
    
  }
  
  public com.anova.anovacloud.client.application.widget.message.MessagesView com$anova$anovacloud$client$application$widget$message$MessagesView_com$anova$anovacloud$client$application$widget$message$MessagesView_methodInjection(com.anova.anovacloud.client.application.widget.message.MessagesView.Binder _0, com.anova.anovacloud.client.application.widget.message.ui.MessageWidgetFactory _1) {
    return new com.anova.anovacloud.client.application.widget.message.MessagesView(_0, _1);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwtplatform_mvp_client_TabletGinjector_TabletGinjectorGinjector injector;
  public com_gwtplatform_mvp_client_TabletGinjector_TabletGinjectorGinjector_fragment(com_gwtplatform_mvp_client_TabletGinjector_TabletGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
