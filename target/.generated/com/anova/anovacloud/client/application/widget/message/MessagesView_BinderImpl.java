package com.anova.anovacloud.client.application.widget.message;

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

public class MessagesView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.anova.anovacloud.client.application.widget.message.MessagesView>, com.anova.anovacloud.client.application.widget.message.MessagesView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("")
    SafeHtml html1();
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.anova.anovacloud.client.application.widget.message.MessagesView owner) {


    return new Widgets(owner).get_messages();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.anova.anovacloud.client.application.widget.message.MessagesView owner;


    public Widgets(final com.anova.anovacloud.client.application.widget.message.MessagesView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
    }

    SafeHtml template_html1() {
      return template.html1();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.anova.anovacloud.client.application.widget.message.MessagesView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.anova.anovacloud.client.application.widget.message.MessagesView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.anova.anovacloud.client.application.widget.message.MessagesView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.anova.anovacloud.client.application.widget.message.MessagesView_BinderImpl_GenBundle) GWT.create(com.anova.anovacloud.client.application.widget.message.MessagesView_BinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 1 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.anova.anovacloud.client.application.widget.message.MessagesView_BinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.anova.anovacloud.client.application.widget.message.MessagesView_BinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.anova.anovacloud.client.application.widget.message.MessagesView_BinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for messages called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_messages() {
      return build_messages();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_messages() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel messages = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.
      messages.setStyleName("" + get_style().wrapper() + "");


      this.owner.messages = messages;

      return messages;
    }
  }
}
