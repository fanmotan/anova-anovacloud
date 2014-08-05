package com.anova.anovacloud.client.application.widget.message.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class MessageWidget_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.anova.anovacloud.client.application.widget.message.ui.MessageWidget>, com.anova.anovacloud.client.application.widget.message.ui.MessageWidget.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("X")
    SafeHtml html1();
     
    @Template("<span id='{0}'></span> <span id='{1}'></span>")
    SafeHtml html2(String arg0, String arg1);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.anova.anovacloud.client.application.widget.message.ui.MessageWidget owner) {


    return new Widgets(owner).get_messageBox();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.anova.anovacloud.client.application.widget.message.ui.MessageWidget owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onCloseAnchorClicked((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final com.anova.anovacloud.client.application.widget.message.ui.MessageWidget owner) {
      this.owner = owner;
      build_appResources();  // more than one getter call detected. Type: IMPORTED, precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1();
    }
    SafeHtml template_html2() {
      return template.html2(get_domId0(), get_domId1());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.anova.anovacloud.client.application.widget.message.ui.MessageWidget_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.anova.anovacloud.client.application.widget.message.ui.MessageWidget_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.anova.anovacloud.client.application.widget.message.ui.MessageWidget_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.anova.anovacloud.client.application.widget.message.ui.MessageWidget_BinderImpl_GenBundle) GWT.create(com.anova.anovacloud.client.application.widget.message.ui.MessageWidget_BinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for appResources called 2 times. Type: IMPORTED. Build precedence: 1.
     */
    private com.anova.anovacloud.client.resources.AppResources appResources;
    private com.anova.anovacloud.client.resources.AppResources get_appResources() {
      return appResources;
    }
    private com.anova.anovacloud.client.resources.AppResources build_appResources() {
      // Creation section.
      appResources = owner.appResources;
      assert appResources != null : "UiField appResources with 'provided = true' was null";
      // Setup section.


      return appResources;
    }

    /**
     * Getter for messageBox called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_messageBox() {
      return build_messageBox();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_messageBox() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel messageBox = new com.google.gwt.user.client.ui.HTMLPanel(template_html2().asString());
      // Setup section.
      messageBox.setStyleName("" + get_appResources().styles().message() + "");
      messageBox.setVisible(false);

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord22 = UiBinderUtil.attachToDom(messageBox.getElement());
      get_domId0Element().get();
      get_domId1Element().get();

      // Detach section.
      attachRecord22.detach();
      messageBox.addAndReplaceElement(get_messageLabel(), get_domId0Element().get());
      messageBox.addAndReplaceElement(get_close(), get_domId1Element().get());

      this.owner.messageBox = messageBox;

      return messageBox;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId0;
    private java.lang.String get_domId0() {
      return domId0;
    }
    private java.lang.String build_domId0() {
      // Creation section.
      domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId0;
    }

    /**
     * Getter for messageLabel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_messageLabel() {
      return build_messageLabel();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_messageLabel() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel messageLabel = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.


      this.owner.messageLabel = messageLabel;

      return messageLabel;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId0Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId0Element() {
      return domId0Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId0Element() {
      // Creation section.
      domId0Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId0());
      // Setup section.


      return domId0Element;
    }

    /**
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId1;
    private java.lang.String get_domId1() {
      return domId1;
    }
    private java.lang.String build_domId1() {
      // Creation section.
      domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId1;
    }

    /**
     * Getter for close called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.InlineHTML get_close() {
      return build_close();
    }
    private com.google.gwt.user.client.ui.InlineHTML build_close() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineHTML close = (com.google.gwt.user.client.ui.InlineHTML) GWT.create(com.google.gwt.user.client.ui.InlineHTML.class);
      // Setup section.
      close.setHTML(template_html1().asString());
      close.setStyleName("" + get_appResources().styles().close() + "");
      close.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);


      this.owner.close = close;

      return close;
    }

    /**
     * Getter for domId1Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId1Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId1Element() {
      return domId1Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId1Element() {
      // Creation section.
      domId1Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId1());
      // Setup section.


      return domId1Element;
    }
  }
}
