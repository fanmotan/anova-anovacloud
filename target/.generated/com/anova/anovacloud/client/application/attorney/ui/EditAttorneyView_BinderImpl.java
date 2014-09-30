package com.anova.anovacloud.client.application.attorney.ui;

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

public class EditAttorneyView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView>, com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("Save")
    SafeHtml html1();
     
    @Template("Close")
    SafeHtml html2();
     
    @Template("<div> <span id='{0}'></span> </div> <br> <table width='100%'> <tr> <td width='25%'> <div class='{1}'> <span id='{2}'></span> </div> </td> <td width='75%'> <div class='{3}'> <span id='{4}'></span> </div> </td> </tr> <tr> <td width='25%'> <div class='{5}'> <span id='{6}'></span> </div> </td> <td width='75%'> <div class='{7}'> <span id='{8}'></span> </div> </td> </tr> <tr> <td width='25%'> <div class='{9}'> <span id='{10}'></span> </div> </td> <td width='75%'> <div class='{11}'> <span id='{12}'></span> </div> </td> </tr> <tr> <td width='25%'> <div class='{13}'> <span id='{14}'></span> </div> </td> <td width='75%'> <div class='{15}'> <span id='{16}'></span> </div> </td> </tr> <tr> <td width='25%'> <div class='{17}'> <span id='{18}'></span> </div> </td> <td width='75%'> <div class='{19}'> <span id='{20}'></span> </div> </td> </tr> <tr> <td width='25%'> <div class='{21}'> <span id='{22}'></span> </div> </td> <td width='75%'> <div class='{23}'> <span id='{24}'></span> </div> </td> </tr> <tr> <td width='25%'> <div class='{25}'> <span id='{26}'></span> </div> </td> <td width='75%'> <div class='{27}'> <span id='{28}'></span>  </div> </td> </tr> </table> <div class='{29}'> <span id='{30}'></span> <span id='{31}'></span> </div>")
    SafeHtml html3(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12, String arg13, String arg14, String arg15, String arg16, String arg17, String arg18, String arg19, String arg20, String arg21, String arg22, String arg23, String arg24, String arg25, String arg26, String arg27, String arg28, String arg29, String arg30, String arg31);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView owner) {


    return new Widgets(owner).get_f_PopupPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onSaveClicked((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onCloseClicked((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId4();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId5();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId6();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId7();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId8();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId9();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId10();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId11();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId12();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId13();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId14();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId15();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId16();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId4Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId5Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId6Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId7Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId8Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId9Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId10Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId11Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId12Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId13Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId14Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId15Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId16Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
    }

    SafeHtml template_html1() {
      return template.html1();
    }
    SafeHtml template_html2() {
      return template.html2();
    }
    SafeHtml template_html3() {
      return template.html3(get_domId0(), "" + get_style().formRow() + "", get_domId1(), "" + get_style().formRow() + "", get_domId2(), "" + get_style().formRow() + "", get_domId3(), "" + get_style().formRow() + "", get_domId4(), "" + get_style().formRow() + "", get_domId5(), "" + get_style().formRow() + "", get_domId6(), "" + get_style().formRow() + "", get_domId7(), "" + get_style().formRow() + "", get_domId8(), "" + get_style().formRow() + "", get_domId9(), "" + get_style().formRow() + "", get_domId10(), "" + get_style().formRow() + "", get_domId11(), "" + get_style().formRow() + "", get_domId12(), "" + get_style().formRow() + "", get_domId13(), "" + get_style().formRow() + "", get_domId14(), "" + get_style().formRow() + "", get_domId15(), get_domId16());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView_BinderImpl_GenBundle) GWT.create(com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView_BinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 15 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView_BinderImpl_GenCss_style style;
    private com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView_BinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for f_PopupPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.PopupPanel get_f_PopupPanel1() {
      return build_f_PopupPanel1();
    }
    private com.google.gwt.user.client.ui.PopupPanel build_f_PopupPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.PopupPanel f_PopupPanel1 = (com.google.gwt.user.client.ui.PopupPanel) GWT.create(com.google.gwt.user.client.ui.PopupPanel.class);
      // Setup section.
      f_PopupPanel1.add(get_f_HTMLPanel2());
      f_PopupPanel1.setGlassEnabled(true);
      f_PopupPanel1.setAnimationEnabled(true);
      f_PopupPanel1.setAutoHideEnabled(true);


      return f_PopupPanel1;
    }

    /**
     * Getter for f_HTMLPanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel2() {
      return build_f_HTMLPanel2();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel(template_html3().asString());
      // Setup section.
      f_HTMLPanel2.ensureDebugId("attorney-editor");

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord20 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
      get_domId0Element().get();
      get_domId1Element().get();
      get_domId2Element().get();
      get_domId3Element().get();
      get_domId4Element().get();
      get_domId5Element().get();
      get_domId6Element().get();
      get_domId7Element().get();
      get_domId8Element().get();
      get_domId9Element().get();
      get_domId10Element().get();
      get_domId11Element().get();
      get_domId12Element().get();
      get_domId13Element().get();
      get_domId14Element().get();
      get_domId15Element().get();
      get_domId16Element().get();

      // Detach section.
      attachRecord20.detach();
      f_HTMLPanel2.addAndReplaceElement(get_f_InlineLabel3(), get_domId0Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_f_InlineLabel4(), get_domId1Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_firstName(), get_domId2Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_f_InlineLabel5(), get_domId3Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_lastName(), get_domId4Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_f_InlineLabel6(), get_domId5Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_email(), get_domId6Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_f_InlineLabel7(), get_domId7Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_mailAddress(), get_domId8Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_f_InlineLabel8(), get_domId9Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_phone(), get_domId10Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_f_InlineLabel9(), get_domId11Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_fax(), get_domId12Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_f_InlineLabel10(), get_domId13Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_attorneyStatus(), get_domId14Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_save(), get_domId15Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_close(), get_domId16Element().get());

      return f_HTMLPanel2;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
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
     * Getter for f_InlineLabel3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel3() {
      return build_f_InlineLabel3();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel3() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel3 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel3.setText("Please fill in or modify the following attorney information:");


      return f_InlineLabel3;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 3.
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
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
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
     * Getter for f_InlineLabel4 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel4() {
      return build_f_InlineLabel4();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel4() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel4 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel4.setText("First Name:");


      return f_InlineLabel4;
    }

    /**
     * Getter for domId1Element called 2 times. Type: DEFAULT. Build precedence: 3.
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

    /**
     * Getter for domId2 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId2;
    private java.lang.String get_domId2() {
      return domId2;
    }
    private java.lang.String build_domId2() {
      // Creation section.
      domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId2;
    }

    /**
     * Getter for firstName called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextBox get_firstName() {
      return build_firstName();
    }
    private com.google.gwt.user.client.ui.TextBox build_firstName() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox firstName = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      firstName.ensureDebugId("attorney-input");


      this.owner.firstName = firstName;

      return firstName;
    }

    /**
     * Getter for domId2Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId2Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId2Element() {
      return domId2Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId2Element() {
      // Creation section.
      domId2Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId2());
      // Setup section.


      return domId2Element;
    }

    /**
     * Getter for domId3 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId3;
    private java.lang.String get_domId3() {
      return domId3;
    }
    private java.lang.String build_domId3() {
      // Creation section.
      domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId3;
    }

    /**
     * Getter for f_InlineLabel5 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel5() {
      return build_f_InlineLabel5();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel5() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel5 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel5.setText("Last Name:");


      return f_InlineLabel5;
    }

    /**
     * Getter for domId3Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId3Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId3Element() {
      return domId3Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId3Element() {
      // Creation section.
      domId3Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId3());
      // Setup section.


      return domId3Element;
    }

    /**
     * Getter for domId4 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId4;
    private java.lang.String get_domId4() {
      return domId4;
    }
    private java.lang.String build_domId4() {
      // Creation section.
      domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId4;
    }

    /**
     * Getter for lastName called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextBox get_lastName() {
      return build_lastName();
    }
    private com.google.gwt.user.client.ui.TextBox build_lastName() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox lastName = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      lastName.ensureDebugId("attorney-input");


      this.owner.lastName = lastName;

      return lastName;
    }

    /**
     * Getter for domId4Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId4Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId4Element() {
      return domId4Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId4Element() {
      // Creation section.
      domId4Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId4());
      // Setup section.


      return domId4Element;
    }

    /**
     * Getter for domId5 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId5;
    private java.lang.String get_domId5() {
      return domId5;
    }
    private java.lang.String build_domId5() {
      // Creation section.
      domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId5;
    }

    /**
     * Getter for f_InlineLabel6 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel6() {
      return build_f_InlineLabel6();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel6() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel6 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel6.setText("Email:");


      return f_InlineLabel6;
    }

    /**
     * Getter for domId5Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId5Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId5Element() {
      return domId5Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId5Element() {
      // Creation section.
      domId5Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId5());
      // Setup section.


      return domId5Element;
    }

    /**
     * Getter for domId6 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId6;
    private java.lang.String get_domId6() {
      return domId6;
    }
    private java.lang.String build_domId6() {
      // Creation section.
      domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId6;
    }

    /**
     * Getter for email called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextBox get_email() {
      return build_email();
    }
    private com.google.gwt.user.client.ui.TextBox build_email() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox email = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      email.ensureDebugId("attorney-input");


      this.owner.email = email;

      return email;
    }

    /**
     * Getter for domId6Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId6Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId6Element() {
      return domId6Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId6Element() {
      // Creation section.
      domId6Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId6());
      // Setup section.


      return domId6Element;
    }

    /**
     * Getter for domId7 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId7;
    private java.lang.String get_domId7() {
      return domId7;
    }
    private java.lang.String build_domId7() {
      // Creation section.
      domId7 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId7;
    }

    /**
     * Getter for f_InlineLabel7 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel7() {
      return build_f_InlineLabel7();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel7() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel7 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel7.setText("Mailing Address:");


      return f_InlineLabel7;
    }

    /**
     * Getter for domId7Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId7Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId7Element() {
      return domId7Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId7Element() {
      // Creation section.
      domId7Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId7());
      // Setup section.


      return domId7Element;
    }

    /**
     * Getter for domId8 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId8;
    private java.lang.String get_domId8() {
      return domId8;
    }
    private java.lang.String build_domId8() {
      // Creation section.
      domId8 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId8;
    }

    /**
     * Getter for mailAddress called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextArea get_mailAddress() {
      return build_mailAddress();
    }
    private com.google.gwt.user.client.ui.TextArea build_mailAddress() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextArea mailAddress = (com.google.gwt.user.client.ui.TextArea) GWT.create(com.google.gwt.user.client.ui.TextArea.class);
      // Setup section.
      mailAddress.ensureDebugId("attorney-input");


      this.owner.mailAddress = mailAddress;

      return mailAddress;
    }

    /**
     * Getter for domId8Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId8Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId8Element() {
      return domId8Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId8Element() {
      // Creation section.
      domId8Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId8());
      // Setup section.


      return domId8Element;
    }

    /**
     * Getter for domId9 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId9;
    private java.lang.String get_domId9() {
      return domId9;
    }
    private java.lang.String build_domId9() {
      // Creation section.
      domId9 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId9;
    }

    /**
     * Getter for f_InlineLabel8 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel8() {
      return build_f_InlineLabel8();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel8() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel8 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel8.setText("Phone:");


      return f_InlineLabel8;
    }

    /**
     * Getter for domId9Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId9Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId9Element() {
      return domId9Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId9Element() {
      // Creation section.
      domId9Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId9());
      // Setup section.


      return domId9Element;
    }

    /**
     * Getter for domId10 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId10;
    private java.lang.String get_domId10() {
      return domId10;
    }
    private java.lang.String build_domId10() {
      // Creation section.
      domId10 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId10;
    }

    /**
     * Getter for phone called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextBox get_phone() {
      return build_phone();
    }
    private com.google.gwt.user.client.ui.TextBox build_phone() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox phone = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      phone.ensureDebugId("attorney-input");


      this.owner.phone = phone;

      return phone;
    }

    /**
     * Getter for domId10Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId10Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId10Element() {
      return domId10Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId10Element() {
      // Creation section.
      domId10Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId10());
      // Setup section.


      return domId10Element;
    }

    /**
     * Getter for domId11 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId11;
    private java.lang.String get_domId11() {
      return domId11;
    }
    private java.lang.String build_domId11() {
      // Creation section.
      domId11 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId11;
    }

    /**
     * Getter for f_InlineLabel9 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel9() {
      return build_f_InlineLabel9();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel9() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel9 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel9.setText("Fax:");


      return f_InlineLabel9;
    }

    /**
     * Getter for domId11Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId11Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId11Element() {
      return domId11Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId11Element() {
      // Creation section.
      domId11Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId11());
      // Setup section.


      return domId11Element;
    }

    /**
     * Getter for domId12 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId12;
    private java.lang.String get_domId12() {
      return domId12;
    }
    private java.lang.String build_domId12() {
      // Creation section.
      domId12 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId12;
    }

    /**
     * Getter for fax called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextBox get_fax() {
      return build_fax();
    }
    private com.google.gwt.user.client.ui.TextBox build_fax() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox fax = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      fax.ensureDebugId("attorney-input");


      this.owner.fax = fax;

      return fax;
    }

    /**
     * Getter for domId12Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId12Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId12Element() {
      return domId12Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId12Element() {
      // Creation section.
      domId12Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId12());
      // Setup section.


      return domId12Element;
    }

    /**
     * Getter for domId13 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId13;
    private java.lang.String get_domId13() {
      return domId13;
    }
    private java.lang.String build_domId13() {
      // Creation section.
      domId13 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId13;
    }

    /**
     * Getter for f_InlineLabel10 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel10() {
      return build_f_InlineLabel10();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel10() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel10 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel10.setText("Status:");


      return f_InlineLabel10;
    }

    /**
     * Getter for domId13Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId13Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId13Element() {
      return domId13Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId13Element() {
      // Creation section.
      domId13Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId13());
      // Setup section.


      return domId13Element;
    }

    /**
     * Getter for domId14 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId14;
    private java.lang.String get_domId14() {
      return domId14;
    }
    private java.lang.String build_domId14() {
      // Creation section.
      domId14 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId14;
    }

    /**
     * Getter for attorneyStatus called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.ValueListBox get_attorneyStatus() {
      return build_attorneyStatus();
    }
    private com.google.gwt.user.client.ui.ValueListBox build_attorneyStatus() {
      // Creation section.
      final com.google.gwt.user.client.ui.ValueListBox attorneyStatus = owner.attorneyStatus;
      assert attorneyStatus != null : "UiField attorneyStatus with 'provided = true' was null";
      // Setup section.
      attorneyStatus.ensureDebugId("attorney-input");


      return attorneyStatus;
    }

    /**
     * Getter for domId14Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId14Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId14Element() {
      return domId14Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId14Element() {
      // Creation section.
      domId14Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId14());
      // Setup section.


      return domId14Element;
    }

    /**
     * Getter for domId15 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId15;
    private java.lang.String get_domId15() {
      return domId15;
    }
    private java.lang.String build_domId15() {
      // Creation section.
      domId15 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId15;
    }

    /**
     * Getter for save called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Button get_save() {
      return build_save();
    }
    private com.google.gwt.user.client.ui.Button build_save() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button save = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      save.setHTML(template_html1().asString());
      save.ensureDebugId("attorney-save");
      save.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);


      return save;
    }

    /**
     * Getter for domId15Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId15Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId15Element() {
      return domId15Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId15Element() {
      // Creation section.
      domId15Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId15());
      // Setup section.


      return domId15Element;
    }

    /**
     * Getter for domId16 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId16;
    private java.lang.String get_domId16() {
      return domId16;
    }
    private java.lang.String build_domId16() {
      // Creation section.
      domId16 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId16;
    }

    /**
     * Getter for close called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Button get_close() {
      return build_close();
    }
    private com.google.gwt.user.client.ui.Button build_close() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button close = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      close.setHTML(template_html2().asString());
      close.ensureDebugId("attorney-close");
      close.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);


      return close;
    }

    /**
     * Getter for domId16Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId16Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId16Element() {
      return domId16Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId16Element() {
      // Creation section.
      domId16Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId16());
      // Setup section.


      return domId16Element;
    }
  }
}
