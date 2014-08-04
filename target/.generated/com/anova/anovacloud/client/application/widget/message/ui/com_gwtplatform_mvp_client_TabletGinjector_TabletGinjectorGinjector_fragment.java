package com.anova.anovacloud.client.application.widget.message.ui;

import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.com_gwtplatform_mvp_client_TabletGinjector_TabletGinjectorGinjector;

public class com_gwtplatform_mvp_client_TabletGinjector_TabletGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$anova$anovacloud$client$application$widget$message$ui$MessageWidget$_annotation$$none$$(com.anova.anovacloud.client.application.widget.message.ui.MessageWidget injectee) {
    
  }
  
  public void memberInject_Key$type$com$anova$anovacloud$client$application$widget$message$ui$MessageWidget$Binder$_annotation$$none$$(com.anova.anovacloud.client.application.widget.message.ui.MessageWidget.Binder injectee) {
    
  }
  
  
  /**
   * Binding for com.anova.anovacloud.client.application.widget.message.ui.MessageWidgetFactory declared at:
   *   com.anova.anovacloud.client.application.widget.message.MessagesModule.configure(MessagesModule.java:12)
   */
  public com.anova.anovacloud.client.application.widget.message.ui.MessageWidgetFactory get_Key$type$com$anova$anovacloud$client$application$widget$message$ui$MessageWidgetFactory$_annotation$$none$$() {
    com.anova.anovacloud.client.application.widget.message.ui.MessageWidgetFactory result = new com.anova.anovacloud.client.application.widget.message.ui.MessageWidgetFactory() {
    
        public com.anova.anovacloud.client.application.widget.message.ui.MessageWidget createMessage(com.anova.anovacloud.client.application.widget.message.Message _0) {
          return assistedInject_createMessageKey$type$com$anova$anovacloud$client$application$widget$message$ui$MessageWidgetFactory$_annotation$$none$$(_0);
        }
    };
    return result;
    
  }
  
  public com.anova.anovacloud.client.application.widget.message.ui.MessageWidget com$anova$anovacloud$client$application$widget$message$ui$MessageWidget_com$anova$anovacloud$client$application$widget$message$ui$MessageWidget_methodInjection(com.anova.anovacloud.client.application.widget.message.ui.MessageWidget.Binder _0, com.anova.anovacloud.client.resources.AppResources _1, com.anova.anovacloud.client.application.widget.message.Message _2) {
    return new com.anova.anovacloud.client.application.widget.message.ui.MessageWidget(_0, _1, _2);
  }
  
  public com.anova.anovacloud.client.application.widget.message.ui.MessageWidget com$anova$anovacloud$client$application$widget$message$ui$MessageWidget_com$anova$anovacloud$client$application$widget$message$ui$MessageWidget_methodInjection_(com.anova.anovacloud.client.application.widget.message.ui.MessageWidget.Binder _0, com.anova.anovacloud.client.resources.AppResources _1, com.anova.anovacloud.client.application.widget.message.Message _2) {
    return new com.anova.anovacloud.client.application.widget.message.ui.MessageWidget(_0, _1, _2);
  }
  
  public com.anova.anovacloud.client.application.widget.message.ui.MessageWidget assistedInject_createMessageKey$type$com$anova$anovacloud$client$application$widget$message$ui$MessageWidgetFactory$_annotation$$none$$(com.anova.anovacloud.client.application.widget.message.Message _0) {
    com.anova.anovacloud.client.application.widget.message.ui.MessageWidget result = com$anova$anovacloud$client$application$widget$message$ui$MessageWidget_com$anova$anovacloud$client$application$widget$message$ui$MessageWidget_methodInjection_(get_Key$type$com$anova$anovacloud$client$application$widget$message$ui$MessageWidget$Binder$_annotation$$none$$(), injector.getFragment_com_anova_anovacloud_client_resources().get_Key$type$com$anova$anovacloud$client$resources$AppResources$_annotation$$none$$(), _0);
    memberInject_Key$type$com$anova$anovacloud$client$application$widget$message$ui$MessageWidget$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for com.anova.anovacloud.client.application.widget.message.ui.MessageWidget$Binder declared at:
   *   Implicit GWT.create binding for com.anova.anovacloud.client.application.widget.message.ui.MessageWidget$Binder
   */
  public com.anova.anovacloud.client.application.widget.message.ui.MessageWidget.Binder get_Key$type$com$anova$anovacloud$client$application$widget$message$ui$MessageWidget$Binder$_annotation$$none$$() {
    Object created = GWT.create(com.anova.anovacloud.client.application.widget.message.ui.MessageWidget.Binder.class);
    assert created instanceof com.anova.anovacloud.client.application.widget.message.ui.MessageWidget.Binder;
    com.anova.anovacloud.client.application.widget.message.ui.MessageWidget.Binder result = (com.anova.anovacloud.client.application.widget.message.ui.MessageWidget.Binder) created;
    
    memberInject_Key$type$com$anova$anovacloud$client$application$widget$message$ui$MessageWidget$Binder$_annotation$$none$$(result);
    
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
