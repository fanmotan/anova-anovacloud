package com.anova.anovacloud.client.application.matterAction;

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

public class MatterActionDetailView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.anova.anovacloud.client.application.matterAction.MatterActionDetailView>, com.anova.anovacloud.client.application.matterAction.MatterActionDetailView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("<div class='{0}'> <span id='{1}'></span> <span id='{2}'></span> </div>  <div> <span id='{3}'></span> <span id='{4}'></span> </div> <div> <span id='{5}'></span> <span id='{6}'></span> </div> <div> <span id='{7}'></span> <span id='{8}'></span> </div> <div> <span id='{9}'></span> <span id='{10}'></span> </div> <div> <span id='{11}'></span> <span id='{12}'></span> </div> <div> <span id='{13}'></span> <span id='{14}'></span> </div> <div> <span id='{15}'></span>  <span id='{16}'></span> </div> <div> <span id='{17}'></span> <span id='{18}'></span> </div> <div> <span id='{19}'></span> <span id='{20}'></span> </div> <div> <span id='{21}'></span> <span id='{22}'></span> </div> <div> <span id='{23}'></span> <span id='{24}'></span> </div> <div> <span id='{25}'></span> <span id='{26}'></span> </div> <div> <span id='{27}'></span> <span id='{28}'></span> </div>")
    SafeHtml html1(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12, String arg13, String arg14, String arg15, String arg16, String arg17, String arg18, String arg19, String arg20, String arg21, String arg22, String arg23, String arg24, String arg25, String arg26, String arg27, String arg28);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.anova.anovacloud.client.application.matterAction.MatterActionDetailView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.anova.anovacloud.client.application.matterAction.MatterActionDetailView owner;


    public Widgets(final com.anova.anovacloud.client.application.matterAction.MatterActionDetailView owner) {
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
    }

    SafeHtml template_html1() {
      return template.html1("" + get_style().formRow() + "", get_domId0(), get_domId1(), get_domId2(), get_domId3(), get_domId4(), get_domId5(), get_domId6(), get_domId7(), get_domId8(), get_domId9(), get_domId10(), get_domId11(), get_domId12(), get_domId13(), get_domId14(), get_domId15(), get_domId16(), get_domId17(), get_domId18(), get_domId19(), get_domId20(), get_domId21(), get_domId22(), get_domId23(), get_domId24(), get_domId25(), get_domId26(), get_domId27());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_BinderImpl_GenBundle) GWT.create(com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_BinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for resource called 13 times. Type: IMPORTED. Build precedence: 1.
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
     * Getter for style called 2 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_BinderImpl_GenCss_style style;
    private com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_BinderImpl_GenCss_style build_style() {
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
      f_HTMLPanel1.setStyleName("" + get_style().panelWrapper() + "");

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord10 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
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

      // Detach section.
      attachRecord10.detach();
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel2(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_matter(), get_domId1Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel3(), get_domId2Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_dueDate(), get_domId3Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel4(), get_domId4Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_actionDue(), get_domId5Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel5(), get_domId6Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_ptoMailDate(), get_domId7Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel6(), get_domId8Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_responseDate(), get_domId9Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel7(), get_domId10Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_takenDate(), get_domId11Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel8(), get_domId12Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_assignee1(), get_domId13Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel9(), get_domId14Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_assignee1Role(), get_domId15Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel10(), get_domId16Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_assignee2(), get_domId17Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel11(), get_domId18Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_assignee2Role(), get_domId19Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel12(), get_domId20Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_assignee3(), get_domId21Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel13(), get_domId22Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_assignee3Role(), get_domId23Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel14(), get_domId24Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_actionRemarks(), get_domId25Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_InlineLabel15(), get_domId26Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_actionStatus(), get_domId27Element().get());

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
      f_InlineLabel2.setText("Case Number:");


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
     * Getter for matter called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.ValueListBox get_matter() {
      return build_matter();
    }
    private com.google.gwt.user.client.ui.ValueListBox build_matter() {
      // Creation section.
      final com.google.gwt.user.client.ui.ValueListBox matter = owner.matter;
      assert matter != null : "UiField matter with 'provided = true' was null";
      // Setup section.


      return matter;
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
      f_InlineLabel3.setText("Due Date:");


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
     * Getter for dueDate called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.datepicker.client.DateBox get_dueDate() {
      return build_dueDate();
    }
    private com.google.gwt.user.datepicker.client.DateBox build_dueDate() {
      // Creation section.
      final com.google.gwt.user.datepicker.client.DateBox dueDate = (com.google.gwt.user.datepicker.client.DateBox) GWT.create(com.google.gwt.user.datepicker.client.DateBox.class);
      // Setup section.
      dueDate.ensureDebugId("dueDateInput");
      dueDate.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.dueDate = dueDate;

      return dueDate;
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
      f_InlineLabel4.setText("Action Due:");


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
     * Getter for actionDue called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.TextBox get_actionDue() {
      return build_actionDue();
    }
    private com.google.gwt.user.client.ui.TextBox build_actionDue() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox actionDue = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      actionDue.ensureDebugId("actionDueInput");
      actionDue.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.actionDue = actionDue;

      return actionDue;
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
      f_InlineLabel5.setText("PTO Mail Date:");


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
     * Getter for ptoMailDate called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.datepicker.client.DateBox get_ptoMailDate() {
      return build_ptoMailDate();
    }
    private com.google.gwt.user.datepicker.client.DateBox build_ptoMailDate() {
      // Creation section.
      final com.google.gwt.user.datepicker.client.DateBox ptoMailDate = (com.google.gwt.user.datepicker.client.DateBox) GWT.create(com.google.gwt.user.datepicker.client.DateBox.class);
      // Setup section.
      ptoMailDate.ensureDebugId("ptoMailDateInput");
      ptoMailDate.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.ptoMailDate = ptoMailDate;

      return ptoMailDate;
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
      f_InlineLabel6.setText("Respone Date:");


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
     * Getter for responseDate called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.datepicker.client.DateBox get_responseDate() {
      return build_responseDate();
    }
    private com.google.gwt.user.datepicker.client.DateBox build_responseDate() {
      // Creation section.
      final com.google.gwt.user.datepicker.client.DateBox responseDate = (com.google.gwt.user.datepicker.client.DateBox) GWT.create(com.google.gwt.user.datepicker.client.DateBox.class);
      // Setup section.
      responseDate.ensureDebugId("responseDateInput");
      responseDate.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.responseDate = responseDate;

      return responseDate;
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
      f_InlineLabel7.setText("Date Taken:");


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
     * Getter for takenDate called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.datepicker.client.DateBox get_takenDate() {
      return build_takenDate();
    }
    private com.google.gwt.user.datepicker.client.DateBox build_takenDate() {
      // Creation section.
      final com.google.gwt.user.datepicker.client.DateBox takenDate = (com.google.gwt.user.datepicker.client.DateBox) GWT.create(com.google.gwt.user.datepicker.client.DateBox.class);
      // Setup section.
      takenDate.ensureDebugId("takenDateInput");
      takenDate.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.takenDate = takenDate;

      return takenDate;
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
      f_InlineLabel8.setText("Assignee1:");


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
     * Getter for assignee1 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.ValueListBox get_assignee1() {
      return build_assignee1();
    }
    private com.google.gwt.user.client.ui.ValueListBox build_assignee1() {
      // Creation section.
      final com.google.gwt.user.client.ui.ValueListBox assignee1 = owner.assignee1;
      assert assignee1 != null : "UiField assignee1 with 'provided = true' was null";
      // Setup section.
      assignee1.ensureDebugId("assignee1Input");
      assignee1.setStyleName("" + get_resource().styles().mobileTextField() + "");


      return assignee1;
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
      f_InlineLabel9.setText("Assignee1 Role:");


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
     * Getter for assignee1Role called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.ValueListBox get_assignee1Role() {
      return build_assignee1Role();
    }
    private com.google.gwt.user.client.ui.ValueListBox build_assignee1Role() {
      // Creation section.
      final com.google.gwt.user.client.ui.ValueListBox assignee1Role = owner.assignee1Role;
      assert assignee1Role != null : "UiField assignee1Role with 'provided = true' was null";
      // Setup section.
      assignee1Role.ensureDebugId("assignee1RoleInput");
      assignee1Role.setStyleName("" + get_resource().styles().mobileTextField() + "");


      return assignee1Role;
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
      f_InlineLabel10.setText("Assignee2:");


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
     * Getter for assignee2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.ValueListBox get_assignee2() {
      return build_assignee2();
    }
    private com.google.gwt.user.client.ui.ValueListBox build_assignee2() {
      // Creation section.
      final com.google.gwt.user.client.ui.ValueListBox assignee2 = owner.assignee2;
      assert assignee2 != null : "UiField assignee2 with 'provided = true' was null";
      // Setup section.
      assignee2.ensureDebugId("assignee2Input");
      assignee2.setStyleName("" + get_resource().styles().mobileTextField() + "");


      return assignee2;
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
      f_InlineLabel11.setText("Assignee2 Role:");


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
     * Getter for assignee2Role called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.ValueListBox get_assignee2Role() {
      return build_assignee2Role();
    }
    private com.google.gwt.user.client.ui.ValueListBox build_assignee2Role() {
      // Creation section.
      final com.google.gwt.user.client.ui.ValueListBox assignee2Role = owner.assignee2Role;
      assert assignee2Role != null : "UiField assignee2Role with 'provided = true' was null";
      // Setup section.
      assignee2Role.ensureDebugId("assignee2RoleInput");
      assignee2Role.setStyleName("" + get_resource().styles().mobileTextField() + "");


      return assignee2Role;
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
      f_InlineLabel12.setText("Assignee3:");


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
     * Getter for assignee3 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.ValueListBox get_assignee3() {
      return build_assignee3();
    }
    private com.google.gwt.user.client.ui.ValueListBox build_assignee3() {
      // Creation section.
      final com.google.gwt.user.client.ui.ValueListBox assignee3 = owner.assignee3;
      assert assignee3 != null : "UiField assignee3 with 'provided = true' was null";
      // Setup section.
      assignee3.ensureDebugId("assignee3Input");
      assignee3.setStyleName("" + get_resource().styles().mobileTextField() + "");


      return assignee3;
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
      f_InlineLabel13.setText("Assignee3 Role:");


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
     * Getter for assignee3Role called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.ValueListBox get_assignee3Role() {
      return build_assignee3Role();
    }
    private com.google.gwt.user.client.ui.ValueListBox build_assignee3Role() {
      // Creation section.
      final com.google.gwt.user.client.ui.ValueListBox assignee3Role = owner.assignee3Role;
      assert assignee3Role != null : "UiField assignee3Role with 'provided = true' was null";
      // Setup section.
      assignee3Role.ensureDebugId("assignee3RoleInput");
      assignee3Role.setStyleName("" + get_resource().styles().mobileTextField() + "");


      return assignee3Role;
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
      f_InlineLabel14.setText("Action Remarks:");


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
     * Getter for actionRemarks called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.TextBox get_actionRemarks() {
      return build_actionRemarks();
    }
    private com.google.gwt.user.client.ui.TextBox build_actionRemarks() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox actionRemarks = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      actionRemarks.ensureDebugId("actionRemarksInput");
      actionRemarks.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.actionRemarks = actionRemarks;

      return actionRemarks;
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
      f_InlineLabel15.setText("Action Status:");


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
     * Getter for actionStatus called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.ValueListBox get_actionStatus() {
      return build_actionStatus();
    }
    private com.google.gwt.user.client.ui.ValueListBox build_actionStatus() {
      // Creation section.
      final com.google.gwt.user.client.ui.ValueListBox actionStatus = owner.actionStatus;
      assert actionStatus != null : "UiField actionStatus with 'provided = true' was null";
      // Setup section.
      actionStatus.ensureDebugId("actionStatusInput");
      actionStatus.setStyleName("" + get_resource().styles().mobileTextField() + "");


      return actionStatus;
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
  }
}
