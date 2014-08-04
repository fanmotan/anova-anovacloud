package com.anova.anovacloud.client.application.user.ui;

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

public class EditUserView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.anova.anovacloud.client.application.user.ui.EditUserView>, com.anova.anovacloud.client.application.user.ui.EditUserView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("Save")
    SafeHtml html1();
     
    @Template("Close")
    SafeHtml html2();
     
    @Template("<div> <span id='{0}'></span> <span id='{1}'></span> </div> <div> <span id='{2}'></span> <span id='{3}'></span> </div> <div> <span id='{4}'></span> <span id='{5}'></span> </div> <div> <span id='{6}'></span> <span id='{7}'></span> </div> <div> <span id='{8}'></span> <span id='{9}'></span> </div> <div> <span id='{10}'></span> <span id='{11}'></span> </div> <div> <span id='{12}'></span> <span id='{13}'></span> </div> <div> <span id='{14}'></span> <span id='{15}'></span> </div> <div> <span id='{16}'></span> <span id='{17}'></span> </div> <div> <span id='{18}'></span> <span id='{19}'></span> </div> <div> <span id='{20}'></span> <span id='{21}'></span> </div>")
    SafeHtml html3(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12, String arg13, String arg14, String arg15, String arg16, String arg17, String arg18, String arg19, String arg20, String arg21);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.anova.anovacloud.client.application.user.ui.EditUserView owner) {


    return new Widgets(owner).get_f_PopupPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.anova.anovacloud.client.application.user.ui.EditUserView owner;


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

    public Widgets(final com.anova.anovacloud.client.application.user.ui.EditUserView owner) {
      this.owner = owner;
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
      build_domId17();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId18();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId19();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId20();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId21();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
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
      build_domId17Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId18Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId19Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId20Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId21Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
    }

    SafeHtml template_html1() {
      return template.html1();
    }
    SafeHtml template_html2() {
      return template.html2();
    }
    SafeHtml template_html3() {
      return template.html3(get_domId0(), get_domId1(), get_domId2(), get_domId3(), get_domId4(), get_domId5(), get_domId6(), get_domId7(), get_domId8(), get_domId9(), get_domId10(), get_domId11(), get_domId12(), get_domId13(), get_domId14(), get_domId15(), get_domId16(), get_domId17(), get_domId18(), get_domId19(), get_domId20(), get_domId21());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.anova.anovacloud.client.application.user.ui.EditUserView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.anova.anovacloud.client.application.user.ui.EditUserView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.anova.anovacloud.client.application.user.ui.EditUserView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.anova.anovacloud.client.application.user.ui.EditUserView_BinderImpl_GenBundle) GWT.create(com.anova.anovacloud.client.application.user.ui.EditUserView_BinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
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
      f_HTMLPanel2.ensureDebugId("user-editor");

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord23 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
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
      get_domId17Element().get();
      get_domId18Element().get();
      get_domId19Element().get();
      get_domId20Element().get();
      get_domId21Element().get();

      // Detach section.
      attachRecord23.detach();
      f_HTMLPanel2.addAndReplaceElement(get_f_InlineLabel3(), get_domId0Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_displayName(), get_domId1Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_f_InlineLabel4(), get_domId2Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_firstName(), get_domId3Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_f_InlineLabel5(), get_domId4Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_lastName(), get_domId5Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_f_InlineLabel6(), get_domId6Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_username(), get_domId7Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_f_InlineLabel7(), get_domId8Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_hashPassword(), get_domId9Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_f_InlineLabel8(), get_domId10Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_role(), get_domId11Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_f_InlineLabel9(), get_domId12Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_email(), get_domId13Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_f_InlineLabel10(), get_domId14Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_mailAddress(), get_domId15Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_f_InlineLabel11(), get_domId16Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_phone(), get_domId17Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_f_InlineLabel12(), get_domId18Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_fax(), get_domId19Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_save(), get_domId20Element().get());
      f_HTMLPanel2.addAndReplaceElement(get_close(), get_domId21Element().get());

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
      f_InlineLabel3.setText("Display Name:");


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
     * Getter for displayName called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextBox get_displayName() {
      return build_displayName();
    }
    private com.google.gwt.user.client.ui.TextBox build_displayName() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox displayName = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      displayName.ensureDebugId("user-input");


      this.owner.displayName = displayName;

      return displayName;
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
     * Getter for firstName called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextBox get_firstName() {
      return build_firstName();
    }
    private com.google.gwt.user.client.ui.TextBox build_firstName() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox firstName = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      firstName.ensureDebugId("user-input");


      this.owner.firstName = firstName;

      return firstName;
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
     * Getter for lastName called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextBox get_lastName() {
      return build_lastName();
    }
    private com.google.gwt.user.client.ui.TextBox build_lastName() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox lastName = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      lastName.ensureDebugId("user-input");


      this.owner.lastName = lastName;

      return lastName;
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
     * Getter for f_InlineLabel6 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel6() {
      return build_f_InlineLabel6();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel6() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel6 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel6.setText("Username:");


      return f_InlineLabel6;
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
     * Getter for username called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextBox get_username() {
      return build_username();
    }
    private com.google.gwt.user.client.ui.TextBox build_username() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox username = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      username.ensureDebugId("user-input");


      this.owner.username = username;

      return username;
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
     * Getter for f_InlineLabel7 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel7() {
      return build_f_InlineLabel7();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel7() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel7 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel7.setText("Password:");


      return f_InlineLabel7;
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
     * Getter for hashPassword called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextBox get_hashPassword() {
      return build_hashPassword();
    }
    private com.google.gwt.user.client.ui.TextBox build_hashPassword() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox hashPassword = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      hashPassword.ensureDebugId("user-input");


      this.owner.hashPassword = hashPassword;

      return hashPassword;
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
     * Getter for f_InlineLabel8 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel8() {
      return build_f_InlineLabel8();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel8() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel8 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel8.setText("Role:");


      return f_InlineLabel8;
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
     * Getter for role called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextBox get_role() {
      return build_role();
    }
    private com.google.gwt.user.client.ui.TextBox build_role() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox role = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      role.ensureDebugId("user-input");


      this.owner.role = role;

      return role;
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
     * Getter for f_InlineLabel9 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel9() {
      return build_f_InlineLabel9();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel9() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel9 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel9.setText("Email:");


      return f_InlineLabel9;
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
     * Getter for email called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextBox get_email() {
      return build_email();
    }
    private com.google.gwt.user.client.ui.TextBox build_email() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox email = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      email.ensureDebugId("user-input");


      this.owner.email = email;

      return email;
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
     * Getter for f_InlineLabel10 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel10() {
      return build_f_InlineLabel10();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel10() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel10 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel10.setText("Mailing Address:");


      return f_InlineLabel10;
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
     * Getter for mailAddress called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.TextBox get_mailAddress() {
      return build_mailAddress();
    }
    private com.google.gwt.user.client.ui.TextBox build_mailAddress() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox mailAddress = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      mailAddress.ensureDebugId("user-input");


      this.owner.mailAddress = mailAddress;

      return mailAddress;
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
     * Getter for f_InlineLabel11 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel11() {
      return build_f_InlineLabel11();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel11() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel11 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel11.setText("Phone:");


      return f_InlineLabel11;
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

    /**
     * Getter for domId17 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId17;
    private java.lang.String get_domId17() {
      return domId17;
    }
    private java.lang.String build_domId17() {
      // Creation section.
      domId17 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId17;
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
      phone.ensureDebugId("user-input");


      this.owner.phone = phone;

      return phone;
    }

    /**
     * Getter for domId17Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId17Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId17Element() {
      return domId17Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId17Element() {
      // Creation section.
      domId17Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId17());
      // Setup section.


      return domId17Element;
    }

    /**
     * Getter for domId18 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId18;
    private java.lang.String get_domId18() {
      return domId18;
    }
    private java.lang.String build_domId18() {
      // Creation section.
      domId18 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId18;
    }

    /**
     * Getter for f_InlineLabel12 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel12() {
      return build_f_InlineLabel12();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel12() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel12 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel12.setText("Fax:");


      return f_InlineLabel12;
    }

    /**
     * Getter for domId18Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId18Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId18Element() {
      return domId18Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId18Element() {
      // Creation section.
      domId18Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId18());
      // Setup section.


      return domId18Element;
    }

    /**
     * Getter for domId19 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId19;
    private java.lang.String get_domId19() {
      return domId19;
    }
    private java.lang.String build_domId19() {
      // Creation section.
      domId19 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId19;
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
      fax.ensureDebugId("user-input");


      this.owner.fax = fax;

      return fax;
    }

    /**
     * Getter for domId19Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId19Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId19Element() {
      return domId19Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId19Element() {
      // Creation section.
      domId19Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId19());
      // Setup section.


      return domId19Element;
    }

    /**
     * Getter for domId20 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId20;
    private java.lang.String get_domId20() {
      return domId20;
    }
    private java.lang.String build_domId20() {
      // Creation section.
      domId20 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId20;
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
      save.ensureDebugId("user-save");
      save.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);


      return save;
    }

    /**
     * Getter for domId20Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId20Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId20Element() {
      return domId20Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId20Element() {
      // Creation section.
      domId20Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId20());
      // Setup section.


      return domId20Element;
    }

    /**
     * Getter for domId21 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId21;
    private java.lang.String get_domId21() {
      return domId21;
    }
    private java.lang.String build_domId21() {
      // Creation section.
      domId21 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId21;
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
      close.ensureDebugId("user-close");
      close.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);


      return close;
    }

    /**
     * Getter for domId21Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId21Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId21Element() {
      return domId21Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId21Element() {
      // Creation section.
      domId21Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId21());
      // Setup section.


      return domId21Element;
    }
  }
}
