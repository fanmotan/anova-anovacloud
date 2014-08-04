package com.anova.anovacloud.client.application.matters.matter.widget;

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

public class MatterPropertiesEditor_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor>, com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("<div class='{0}'> <span id='{1}'></span> <span id='{2}'></span> </div> <div class='{3}'> <span id='{4}'></span> <span id='{5}'></span> </div> <div class='{6}'> <span id='{7}'></span> <span id='{8}'></span> </div> <div class='{9}'> <span id='{10}'></span> <span id='{11}'></span> </div> <div class='{12}'> <span id='{13}'></span> <span id='{14}'></span> </div> <div class='{15}'> <span id='{16}'></span> <span id='{17}'></span> </div> <div class='{18}'> <span id='{19}'></span> <span id='{20}'></span> </div> <div class='{21}'> <span id='{22}'></span> <span id='{23}'></span> </div> <div class='{24}'> <span id='{25}'></span> <span id='{26}'></span> </div> <div class='{27}'> <span id='{28}'></span> <span id='{29}'></span> </div> <div class='{30}'> <span id='{31}'></span> <span id='{32}'></span> </div> <div> <span id='{33}'></span> <span id='{34}'></span> </div> <div> <span id='{35}'></span> <span id='{36}'></span> </div> <div> <span id='{37}'></span> <span id='{38}'></span> </div> <div> <span id='{39}'></span> <span id='{40}'></span> </div> <div class='{41}'> <span id='{42}'></span> <span id='{43}'></span> </div> <div> <span id='{44}'></span> <span id='{45}'></span> </div>")
    SafeHtml html1(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12, String arg13, String arg14, String arg15, String arg16, String arg17, String arg18, String arg19, String arg20, String arg21, String arg22, String arg23, String arg24, String arg25, String arg26, String arg27, String arg28, String arg29, String arg30, String arg31, String arg32, String arg33, String arg34, String arg35, String arg36, String arg37, String arg38, String arg39, String arg40, String arg41, String arg42, String arg43, String arg44, String arg45);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor owner;


    public Widgets(final com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_resource();  // more than one getter call detected. Type: IMPORTED, precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId4();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId5();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId6();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId7();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId8();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId9();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId10();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId11();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId12();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId13();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId14();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId15();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId16();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId17();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId18();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId19();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId20();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId21();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId22();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId23();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId24();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId25();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId26();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId27();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId28();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId29();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId30();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId31();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId32();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId33();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId4Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId5Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId6Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId7Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId8Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId9Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId10Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId11Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId12Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId13Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId14Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId15Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId16Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId17Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId18Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId19Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId20Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId21Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId22Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId23Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId24Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId25Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId26Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId27Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId28Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId29Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId30Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId31Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId32Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId33Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1("" + get_style().formRow() + "", get_domId0(), get_domId1(), "" + get_style().formRow() + "", get_domId2(), get_domId3(), "" + get_style().formRow() + "", get_domId4(), get_domId5(), "" + get_style().formRow() + "", get_domId6(), get_domId7(), "" + get_style().formRow() + "", get_domId8(), get_domId9(), "" + get_style().formRow() + "", get_domId10(), get_domId11(), "" + get_style().formRow() + "", get_domId12(), get_domId13(), "" + get_style().formRow() + "", get_domId14(), get_domId15(), "" + get_style().formRow() + "", get_domId16(), get_domId17(), "" + get_style().formRow() + "", get_domId18(), get_domId19(), "" + get_style().formRow() + "", get_domId20(), get_domId21(), get_domId22(), get_domId23(), get_domId24(), get_domId25(), get_domId26(), get_domId27(), get_domId28(), get_domId29(), "" + get_style().formRow() + "", get_domId30(), get_domId31(), get_domId32(), get_domId33());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_BinderImpl_GenBundle) GWT.create(com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_BinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for resource called 17 times. Type: IMPORTED. Build precedence: 1.
     */
    private com.anova.anovacloud.client.resources.AppResources resource;
    private com.anova.anovacloud.client.resources.AppResources get_resource() {
      return resource;
    }
    private com.anova.anovacloud.client.resources.AppResources build_resource() {
      // Creation section.
      resource = (com.anova.anovacloud.client.resources.AppResources) GWT.create(com.anova.anovacloud.client.resources.AppResources.class);
      // Setup section.


      return resource;
    }

    /**
     * Getter for style called 12 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_BinderImpl_GenCss_style style;
    private com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_BinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord27 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
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
      get_domId22Element().get();
      get_domId23Element().get();
      get_domId24Element().get();
      get_domId25Element().get();
      get_domId26Element().get();
      get_domId27Element().get();
      get_domId28Element().get();
      get_domId29Element().get();
      get_domId30Element().get();
      get_domId31Element().get();
      get_domId32Element().get();
      get_domId33Element().get();

      // Detach section.
      attachRecord27.detach();
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel2(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_matterTitle(), get_domId1Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel3(), get_domId2Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_applicationNum(), get_domId3Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel4(), get_domId4Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_patentNum(), get_domId5Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel5(), get_domId6Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_status(), get_domId7Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel6(), get_domId8Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_pubNum(), get_domId9Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel7(), get_domId10Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_assignee(), get_domId11Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel8(), get_domId12Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_assignmentRecord(), get_domId13Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel9(), get_domId14Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_remarks(), get_domId15Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel10(), get_domId16Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_priority(), get_domId17Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel11(), get_domId18Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_patentTermAdj(), get_domId19Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel12(), get_domId20Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_country(), get_domId21Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel13(), get_domId22Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_fileDate(), get_domId23Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel14(), get_domId24Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_issueDate(), get_domId25Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel15(), get_domId26Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_expriationDate(), get_domId27Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel16(), get_domId28Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_pubDate(), get_domId29Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel17(), get_domId30Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_parentPCTNum(), get_domId31Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel18(), get_domId32Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_pctDate(), get_domId33Element().get());

      return f_HTMLPanel1;
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
     * Getter for f_InlineLabel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel2() {
      return build_f_InlineLabel2();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel2 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel2.setText("Title:");


      return f_InlineLabel2;
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
     * Getter for matterTitle called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.TextBox get_matterTitle() {
      return build_matterTitle();
    }
    private com.google.gwt.user.client.ui.TextBox build_matterTitle() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox matterTitle = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      matterTitle.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.matterTitle = matterTitle;

      return matterTitle;
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

    /**
     * Getter for domId2 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
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
     * Getter for f_InlineLabel3 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel3() {
      return build_f_InlineLabel3();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel3() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel3 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel3.setText("Application No.:");


      return f_InlineLabel3;
    }

    /**
     * Getter for domId2Element called 2 times. Type: DEFAULT. Build precedence: 2.
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
     * Getter for domId3 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
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
     * Getter for applicationNum called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.TextBox get_applicationNum() {
      return build_applicationNum();
    }
    private com.google.gwt.user.client.ui.TextBox build_applicationNum() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox applicationNum = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      applicationNum.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.applicationNum = applicationNum;

      return applicationNum;
    }

    /**
     * Getter for domId3Element called 2 times. Type: DEFAULT. Build precedence: 2.
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
     * Getter for domId4 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
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
     * Getter for f_InlineLabel4 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel4() {
      return build_f_InlineLabel4();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel4() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel4 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel4.setText("Patent No.:");


      return f_InlineLabel4;
    }

    /**
     * Getter for domId4Element called 2 times. Type: DEFAULT. Build precedence: 2.
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
     * Getter for domId5 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
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
     * Getter for patentNum called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.TextBox get_patentNum() {
      return build_patentNum();
    }
    private com.google.gwt.user.client.ui.TextBox build_patentNum() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox patentNum = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      patentNum.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.patentNum = patentNum;

      return patentNum;
    }

    /**
     * Getter for domId5Element called 2 times. Type: DEFAULT. Build precedence: 2.
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
     * Getter for domId6 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
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
     * Getter for f_InlineLabel5 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel5() {
      return build_f_InlineLabel5();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel5() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel5 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel5.setText("Status:");


      return f_InlineLabel5;
    }

    /**
     * Getter for domId6Element called 2 times. Type: DEFAULT. Build precedence: 2.
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
     * Getter for domId7 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
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
     * Getter for status called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.TextBox get_status() {
      return build_status();
    }
    private com.google.gwt.user.client.ui.TextBox build_status() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox status = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      status.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.status = status;

      return status;
    }

    /**
     * Getter for domId7Element called 2 times. Type: DEFAULT. Build precedence: 2.
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
     * Getter for domId8 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
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
     * Getter for f_InlineLabel6 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel6() {
      return build_f_InlineLabel6();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel6() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel6 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel6.setText("Pub. No.:");


      return f_InlineLabel6;
    }

    /**
     * Getter for domId8Element called 2 times. Type: DEFAULT. Build precedence: 2.
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
     * Getter for domId9 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
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
     * Getter for pubNum called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.TextBox get_pubNum() {
      return build_pubNum();
    }
    private com.google.gwt.user.client.ui.TextBox build_pubNum() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox pubNum = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      pubNum.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.pubNum = pubNum;

      return pubNum;
    }

    /**
     * Getter for domId9Element called 2 times. Type: DEFAULT. Build precedence: 2.
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
     * Getter for domId10 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
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
     * Getter for f_InlineLabel7 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel7() {
      return build_f_InlineLabel7();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel7() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel7 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel7.setText("Assignee:");


      return f_InlineLabel7;
    }

    /**
     * Getter for domId10Element called 2 times. Type: DEFAULT. Build precedence: 2.
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
     * Getter for domId11 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
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
     * Getter for assignee called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.TextBox get_assignee() {
      return build_assignee();
    }
    private com.google.gwt.user.client.ui.TextBox build_assignee() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox assignee = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      assignee.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.assignee = assignee;

      return assignee;
    }

    /**
     * Getter for domId11Element called 2 times. Type: DEFAULT. Build precedence: 2.
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
     * Getter for domId12 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
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
     * Getter for f_InlineLabel8 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel8() {
      return build_f_InlineLabel8();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel8() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel8 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel8.setText("Assignment Record:");


      return f_InlineLabel8;
    }

    /**
     * Getter for domId12Element called 2 times. Type: DEFAULT. Build precedence: 2.
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
     * Getter for domId13 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
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
     * Getter for assignmentRecord called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.TextBox get_assignmentRecord() {
      return build_assignmentRecord();
    }
    private com.google.gwt.user.client.ui.TextBox build_assignmentRecord() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox assignmentRecord = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      assignmentRecord.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.assignmentRecord = assignmentRecord;

      return assignmentRecord;
    }

    /**
     * Getter for domId13Element called 2 times. Type: DEFAULT. Build precedence: 2.
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
     * Getter for domId14 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
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
     * Getter for f_InlineLabel9 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel9() {
      return build_f_InlineLabel9();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel9() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel9 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel9.setText("Remarks:");


      return f_InlineLabel9;
    }

    /**
     * Getter for domId14Element called 2 times. Type: DEFAULT. Build precedence: 2.
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
     * Getter for domId15 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
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
     * Getter for remarks called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.TextBox get_remarks() {
      return build_remarks();
    }
    private com.google.gwt.user.client.ui.TextBox build_remarks() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox remarks = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      remarks.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.remarks = remarks;

      return remarks;
    }

    /**
     * Getter for domId15Element called 2 times. Type: DEFAULT. Build precedence: 2.
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
     * Getter for domId16 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
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
     * Getter for f_InlineLabel10 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel10() {
      return build_f_InlineLabel10();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel10() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel10 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel10.setText("Priority:");


      return f_InlineLabel10;
    }

    /**
     * Getter for domId16Element called 2 times. Type: DEFAULT. Build precedence: 2.
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
     * Getter for domId17 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
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
     * Getter for priority called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.TextBox get_priority() {
      return build_priority();
    }
    private com.google.gwt.user.client.ui.TextBox build_priority() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox priority = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      priority.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.priority = priority;

      return priority;
    }

    /**
     * Getter for domId17Element called 2 times. Type: DEFAULT. Build precedence: 2.
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
     * Getter for domId18 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
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
     * Getter for f_InlineLabel11 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel11() {
      return build_f_InlineLabel11();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel11() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel11 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel11.setText("Patent Term Adj.:");


      return f_InlineLabel11;
    }

    /**
     * Getter for domId18Element called 2 times. Type: DEFAULT. Build precedence: 2.
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
     * Getter for domId19 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
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
     * Getter for patentTermAdj called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.TextBox get_patentTermAdj() {
      return build_patentTermAdj();
    }
    private com.google.gwt.user.client.ui.TextBox build_patentTermAdj() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox patentTermAdj = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      patentTermAdj.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.patentTermAdj = patentTermAdj;

      return patentTermAdj;
    }

    /**
     * Getter for domId19Element called 2 times. Type: DEFAULT. Build precedence: 2.
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
     * Getter for domId20 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
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
     * Getter for f_InlineLabel12 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel12() {
      return build_f_InlineLabel12();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel12() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel12 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel12.setText("Country:");


      return f_InlineLabel12;
    }

    /**
     * Getter for domId20Element called 2 times. Type: DEFAULT. Build precedence: 2.
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
     * Getter for domId21 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
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
     * Getter for country called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.TextBox get_country() {
      return build_country();
    }
    private com.google.gwt.user.client.ui.TextBox build_country() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox country = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      country.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.country = country;

      return country;
    }

    /**
     * Getter for domId21Element called 2 times. Type: DEFAULT. Build precedence: 2.
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

    /**
     * Getter for domId22 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId22;
    private java.lang.String get_domId22() {
      return domId22;
    }
    private java.lang.String build_domId22() {
      // Creation section.
      domId22 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId22;
    }

    /**
     * Getter for f_InlineLabel13 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel13() {
      return build_f_InlineLabel13();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel13() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel13 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel13.setText("File Date:");


      return f_InlineLabel13;
    }

    /**
     * Getter for domId22Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId22Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId22Element() {
      return domId22Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId22Element() {
      // Creation section.
      domId22Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId22());
      // Setup section.


      return domId22Element;
    }

    /**
     * Getter for domId23 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId23;
    private java.lang.String get_domId23() {
      return domId23;
    }
    private java.lang.String build_domId23() {
      // Creation section.
      domId23 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId23;
    }

    /**
     * Getter for fileDate called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.datepicker.client.DateBox get_fileDate() {
      return build_fileDate();
    }
    private com.google.gwt.user.datepicker.client.DateBox build_fileDate() {
      // Creation section.
      final com.google.gwt.user.datepicker.client.DateBox fileDate = (com.google.gwt.user.datepicker.client.DateBox) GWT.create(com.google.gwt.user.datepicker.client.DateBox.class);
      // Setup section.
      fileDate.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.fileDate = fileDate;

      return fileDate;
    }

    /**
     * Getter for domId23Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId23Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId23Element() {
      return domId23Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId23Element() {
      // Creation section.
      domId23Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId23());
      // Setup section.


      return domId23Element;
    }

    /**
     * Getter for domId24 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId24;
    private java.lang.String get_domId24() {
      return domId24;
    }
    private java.lang.String build_domId24() {
      // Creation section.
      domId24 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId24;
    }

    /**
     * Getter for f_InlineLabel14 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel14() {
      return build_f_InlineLabel14();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel14() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel14 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel14.setText("Issue Date:");


      return f_InlineLabel14;
    }

    /**
     * Getter for domId24Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId24Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId24Element() {
      return domId24Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId24Element() {
      // Creation section.
      domId24Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId24());
      // Setup section.


      return domId24Element;
    }

    /**
     * Getter for domId25 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId25;
    private java.lang.String get_domId25() {
      return domId25;
    }
    private java.lang.String build_domId25() {
      // Creation section.
      domId25 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId25;
    }

    /**
     * Getter for issueDate called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.datepicker.client.DateBox get_issueDate() {
      return build_issueDate();
    }
    private com.google.gwt.user.datepicker.client.DateBox build_issueDate() {
      // Creation section.
      final com.google.gwt.user.datepicker.client.DateBox issueDate = (com.google.gwt.user.datepicker.client.DateBox) GWT.create(com.google.gwt.user.datepicker.client.DateBox.class);
      // Setup section.
      issueDate.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.issueDate = issueDate;

      return issueDate;
    }

    /**
     * Getter for domId25Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId25Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId25Element() {
      return domId25Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId25Element() {
      // Creation section.
      domId25Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId25());
      // Setup section.


      return domId25Element;
    }

    /**
     * Getter for domId26 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId26;
    private java.lang.String get_domId26() {
      return domId26;
    }
    private java.lang.String build_domId26() {
      // Creation section.
      domId26 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId26;
    }

    /**
     * Getter for f_InlineLabel15 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel15() {
      return build_f_InlineLabel15();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel15() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel15 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel15.setText("Expiration Date:");


      return f_InlineLabel15;
    }

    /**
     * Getter for domId26Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId26Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId26Element() {
      return domId26Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId26Element() {
      // Creation section.
      domId26Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId26());
      // Setup section.


      return domId26Element;
    }

    /**
     * Getter for domId27 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId27;
    private java.lang.String get_domId27() {
      return domId27;
    }
    private java.lang.String build_domId27() {
      // Creation section.
      domId27 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId27;
    }

    /**
     * Getter for expriationDate called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.datepicker.client.DateBox get_expriationDate() {
      return build_expriationDate();
    }
    private com.google.gwt.user.datepicker.client.DateBox build_expriationDate() {
      // Creation section.
      final com.google.gwt.user.datepicker.client.DateBox expriationDate = (com.google.gwt.user.datepicker.client.DateBox) GWT.create(com.google.gwt.user.datepicker.client.DateBox.class);
      // Setup section.
      expriationDate.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.expriationDate = expriationDate;

      return expriationDate;
    }

    /**
     * Getter for domId27Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId27Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId27Element() {
      return domId27Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId27Element() {
      // Creation section.
      domId27Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId27());
      // Setup section.


      return domId27Element;
    }

    /**
     * Getter for domId28 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId28;
    private java.lang.String get_domId28() {
      return domId28;
    }
    private java.lang.String build_domId28() {
      // Creation section.
      domId28 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId28;
    }

    /**
     * Getter for f_InlineLabel16 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel16() {
      return build_f_InlineLabel16();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel16() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel16 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel16.setText("Pub Date:");


      return f_InlineLabel16;
    }

    /**
     * Getter for domId28Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId28Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId28Element() {
      return domId28Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId28Element() {
      // Creation section.
      domId28Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId28());
      // Setup section.


      return domId28Element;
    }

    /**
     * Getter for domId29 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId29;
    private java.lang.String get_domId29() {
      return domId29;
    }
    private java.lang.String build_domId29() {
      // Creation section.
      domId29 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId29;
    }

    /**
     * Getter for pubDate called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.datepicker.client.DateBox get_pubDate() {
      return build_pubDate();
    }
    private com.google.gwt.user.datepicker.client.DateBox build_pubDate() {
      // Creation section.
      final com.google.gwt.user.datepicker.client.DateBox pubDate = (com.google.gwt.user.datepicker.client.DateBox) GWT.create(com.google.gwt.user.datepicker.client.DateBox.class);
      // Setup section.
      pubDate.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.pubDate = pubDate;

      return pubDate;
    }

    /**
     * Getter for domId29Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId29Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId29Element() {
      return domId29Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId29Element() {
      // Creation section.
      domId29Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId29());
      // Setup section.


      return domId29Element;
    }

    /**
     * Getter for domId30 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId30;
    private java.lang.String get_domId30() {
      return domId30;
    }
    private java.lang.String build_domId30() {
      // Creation section.
      domId30 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId30;
    }

    /**
     * Getter for f_InlineLabel17 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel17() {
      return build_f_InlineLabel17();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel17() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel17 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel17.setText("Parent/PCT No.:");


      return f_InlineLabel17;
    }

    /**
     * Getter for domId30Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId30Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId30Element() {
      return domId30Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId30Element() {
      // Creation section.
      domId30Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId30());
      // Setup section.


      return domId30Element;
    }

    /**
     * Getter for domId31 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId31;
    private java.lang.String get_domId31() {
      return domId31;
    }
    private java.lang.String build_domId31() {
      // Creation section.
      domId31 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId31;
    }

    /**
     * Getter for parentPCTNum called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.TextBox get_parentPCTNum() {
      return build_parentPCTNum();
    }
    private com.google.gwt.user.client.ui.TextBox build_parentPCTNum() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox parentPCTNum = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      parentPCTNum.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.parentPCTNum = parentPCTNum;

      return parentPCTNum;
    }

    /**
     * Getter for domId31Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId31Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId31Element() {
      return domId31Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId31Element() {
      // Creation section.
      domId31Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId31());
      // Setup section.


      return domId31Element;
    }

    /**
     * Getter for domId32 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId32;
    private java.lang.String get_domId32() {
      return domId32;
    }
    private java.lang.String build_domId32() {
      // Creation section.
      domId32 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId32;
    }

    /**
     * Getter for f_InlineLabel18 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_f_InlineLabel18() {
      return build_f_InlineLabel18();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_f_InlineLabel18() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel f_InlineLabel18 = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      f_InlineLabel18.setText("PCT Date:");


      return f_InlineLabel18;
    }

    /**
     * Getter for domId32Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId32Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId32Element() {
      return domId32Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId32Element() {
      // Creation section.
      domId32Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId32());
      // Setup section.


      return domId32Element;
    }

    /**
     * Getter for domId33 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId33;
    private java.lang.String get_domId33() {
      return domId33;
    }
    private java.lang.String build_domId33() {
      // Creation section.
      domId33 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId33;
    }

    /**
     * Getter for pctDate called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.datepicker.client.DateBox get_pctDate() {
      return build_pctDate();
    }
    private com.google.gwt.user.datepicker.client.DateBox build_pctDate() {
      // Creation section.
      final com.google.gwt.user.datepicker.client.DateBox pctDate = (com.google.gwt.user.datepicker.client.DateBox) GWT.create(com.google.gwt.user.datepicker.client.DateBox.class);
      // Setup section.
      pctDate.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.pctDate = pctDate;

      return pctDate;
    }

    /**
     * Getter for domId33Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId33Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId33Element() {
      return domId33Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId33Element() {
      // Creation section.
      domId33Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId33());
      // Setup section.


      return domId33Element;
    }
  }
}
