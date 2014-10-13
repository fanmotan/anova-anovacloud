package com.anova.anovacloud.client.application;

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

public class UnauthorizedView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.anova.anovacloud.client.application.UnauthorizedView>, com.anova.anovacloud.client.application.UnauthorizedView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("Please login first")
    SafeHtml html1();
     
    @Template("You are not authorized to view this page. <span id='{0}'></span>")
    SafeHtml html2(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.anova.anovacloud.client.application.UnauthorizedView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.anova.anovacloud.client.application.UnauthorizedView owner;


    public Widgets(final com.anova.anovacloud.client.application.UnauthorizedView owner) {
      this.owner = owner;
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1();
    }
    SafeHtml template_html2() {
      return template.html2(get_domId0());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.anova.anovacloud.client.application.UnauthorizedView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.anova.anovacloud.client.application.UnauthorizedView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.anova.anovacloud.client.application.UnauthorizedView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.anova.anovacloud.client.application.UnauthorizedView_BinderImpl_GenBundle) GWT.create(com.anova.anovacloud.client.application.UnauthorizedView_BinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for UNAUTHORIZED called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private java.lang.String get_UNAUTHORIZED() {
      return build_UNAUTHORIZED();
    }
    private java.lang.String build_UNAUTHORIZED() {
      // Creation section.
      final java.lang.String UNAUTHORIZED = com.anova.anovacloud.client.place.NameTokens.UNAUTHORIZED;
      // Setup section.


      return UNAUTHORIZED;
    }

    /**
     * Getter for LOGIN called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private java.lang.String get_LOGIN() {
      return build_LOGIN();
    }
    private java.lang.String build_LOGIN() {
      // Creation section.
      final java.lang.String LOGIN = com.anova.anovacloud.client.place.NameTokens.LOGIN;
      // Setup section.


      return LOGIN;
    }

    /**
     * Getter for CUSTOMER called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private java.lang.String get_CUSTOMER() {
      return build_CUSTOMER();
    }
    private java.lang.String build_CUSTOMER() {
      // Creation section.
      final java.lang.String CUSTOMER = com.anova.anovacloud.client.place.NameTokens.CUSTOMER;
      // Setup section.


      return CUSTOMER;
    }

    /**
     * Getter for CUSTOMERSTATUS called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private java.lang.String get_CUSTOMERSTATUS() {
      return build_CUSTOMERSTATUS();
    }
    private java.lang.String build_CUSTOMERSTATUS() {
      // Creation section.
      final java.lang.String CUSTOMERSTATUS = com.anova.anovacloud.client.place.NameTokens.CUSTOMERSTATUS;
      // Setup section.


      return CUSTOMERSTATUS;
    }

    /**
     * Getter for ATTORNEYSTATUS called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private java.lang.String get_ATTORNEYSTATUS() {
      return build_ATTORNEYSTATUS();
    }
    private java.lang.String build_ATTORNEYSTATUS() {
      // Creation section.
      final java.lang.String ATTORNEYSTATUS = com.anova.anovacloud.client.place.NameTokens.ATTORNEYSTATUS;
      // Setup section.


      return ATTORNEYSTATUS;
    }

    /**
     * Getter for CASESTATUS called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private java.lang.String get_CASESTATUS() {
      return build_CASESTATUS();
    }
    private java.lang.String build_CASESTATUS() {
      // Creation section.
      final java.lang.String CASESTATUS = com.anova.anovacloud.client.place.NameTokens.CASESTATUS;
      // Setup section.


      return CASESTATUS;
    }

    /**
     * Getter for DETAIL_CUSTOMER called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private java.lang.String get_DETAIL_CUSTOMER() {
      return build_DETAIL_CUSTOMER();
    }
    private java.lang.String build_DETAIL_CUSTOMER() {
      // Creation section.
      final java.lang.String DETAIL_CUSTOMER = com.anova.anovacloud.client.place.NameTokens.DETAIL_CUSTOMER;
      // Setup section.


      return DETAIL_CUSTOMER;
    }

    /**
     * Getter for MATTERS called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private java.lang.String get_MATTERS() {
      return build_MATTERS();
    }
    private java.lang.String build_MATTERS() {
      // Creation section.
      final java.lang.String MATTERS = com.anova.anovacloud.client.place.NameTokens.MATTERS;
      // Setup section.


      return MATTERS;
    }

    /**
     * Getter for DUETODAY called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private java.lang.String get_DUETODAY() {
      return build_DUETODAY();
    }
    private java.lang.String build_DUETODAY() {
      // Creation section.
      final java.lang.String DUETODAY = com.anova.anovacloud.client.place.NameTokens.DUETODAY;
      // Setup section.


      return DUETODAY;
    }

    /**
     * Getter for DUETHREEDAY called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private java.lang.String get_DUETHREEDAY() {
      return build_DUETHREEDAY();
    }
    private java.lang.String build_DUETHREEDAY() {
      // Creation section.
      final java.lang.String DUETHREEDAY = com.anova.anovacloud.client.place.NameTokens.DUETHREEDAY;
      // Setup section.


      return DUETHREEDAY;
    }

    /**
     * Getter for DUEONEWEEK called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private java.lang.String get_DUEONEWEEK() {
      return build_DUEONEWEEK();
    }
    private java.lang.String build_DUEONEWEEK() {
      // Creation section.
      final java.lang.String DUEONEWEEK = com.anova.anovacloud.client.place.NameTokens.DUEONEWEEK;
      // Setup section.


      return DUEONEWEEK;
    }

    /**
     * Getter for DUEONEMONTH called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private java.lang.String get_DUEONEMONTH() {
      return build_DUEONEMONTH();
    }
    private java.lang.String build_DUEONEMONTH() {
      // Creation section.
      final java.lang.String DUEONEMONTH = com.anova.anovacloud.client.place.NameTokens.DUEONEMONTH;
      // Setup section.


      return DUEONEMONTH;
    }

    /**
     * Getter for NEW_MATTER called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private java.lang.String get_NEW_MATTER() {
      return build_NEW_MATTER();
    }
    private java.lang.String build_NEW_MATTER() {
      // Creation section.
      final java.lang.String NEW_MATTER = com.anova.anovacloud.client.place.NameTokens.NEW_MATTER;
      // Setup section.


      return NEW_MATTER;
    }

    /**
     * Getter for MATTERACTION called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private java.lang.String get_MATTERACTION() {
      return build_MATTERACTION();
    }
    private java.lang.String build_MATTERACTION() {
      // Creation section.
      final java.lang.String MATTERACTION = com.anova.anovacloud.client.place.NameTokens.MATTERACTION;
      // Setup section.


      return MATTERACTION;
    }

    /**
     * Getter for MATTERACTIONSTATUS called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private java.lang.String get_MATTERACTIONSTATUS() {
      return build_MATTERACTIONSTATUS();
    }
    private java.lang.String build_MATTERACTIONSTATUS() {
      // Creation section.
      final java.lang.String MATTERACTIONSTATUS = com.anova.anovacloud.client.place.NameTokens.MATTERACTIONSTATUS;
      // Setup section.


      return MATTERACTIONSTATUS;
    }

    /**
     * Getter for DETAIL_MATTERACTION called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private java.lang.String get_DETAIL_MATTERACTION() {
      return build_DETAIL_MATTERACTION();
    }
    private java.lang.String build_DETAIL_MATTERACTION() {
      // Creation section.
      final java.lang.String DETAIL_MATTERACTION = com.anova.anovacloud.client.place.NameTokens.DETAIL_MATTERACTION;
      // Setup section.


      return DETAIL_MATTERACTION;
    }

    /**
     * Getter for USER called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private java.lang.String get_USER() {
      return build_USER();
    }
    private java.lang.String build_USER() {
      // Creation section.
      final java.lang.String USER = com.anova.anovacloud.client.place.NameTokens.USER;
      // Setup section.


      return USER;
    }

    /**
     * Getter for USERROLE called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private java.lang.String get_USERROLE() {
      return build_USERROLE();
    }
    private java.lang.String build_USERROLE() {
      // Creation section.
      final java.lang.String USERROLE = com.anova.anovacloud.client.place.NameTokens.USERROLE;
      // Setup section.


      return USERROLE;
    }

    /**
     * Getter for DETAIL_USER called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private java.lang.String get_DETAIL_USER() {
      return build_DETAIL_USER();
    }
    private java.lang.String build_DETAIL_USER() {
      // Creation section.
      final java.lang.String DETAIL_USER = com.anova.anovacloud.client.place.NameTokens.DETAIL_USER;
      // Setup section.


      return DETAIL_USER;
    }

    /**
     * Getter for ATTORNEY called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private java.lang.String get_ATTORNEY() {
      return build_ATTORNEY();
    }
    private java.lang.String build_ATTORNEY() {
      // Creation section.
      final java.lang.String ATTORNEY = com.anova.anovacloud.client.place.NameTokens.ATTORNEY;
      // Setup section.


      return ATTORNEY;
    }

    /**
     * Getter for DETAIL_ATTORNEY called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private java.lang.String get_DETAIL_ATTORNEY() {
      return build_DETAIL_ATTORNEY();
    }
    private java.lang.String build_DETAIL_ATTORNEY() {
      // Creation section.
      final java.lang.String DETAIL_ATTORNEY = com.anova.anovacloud.client.place.NameTokens.DETAIL_ATTORNEY;
      // Setup section.


      return DETAIL_ATTORNEY;
    }

    /**
     * Getter for ATTORNEYROLE called 0 times. Type: DEFAULT. Build precedence: 1.
     */
    private java.lang.String get_ATTORNEYROLE() {
      return build_ATTORNEYROLE();
    }
    private java.lang.String build_ATTORNEYROLE() {
      // Creation section.
      final java.lang.String ATTORNEYROLE = com.anova.anovacloud.client.place.NameTokens.ATTORNEYROLE;
      // Setup section.


      return ATTORNEYROLE;
    }

    /**
     * Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html2().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord3 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();

      // Detach section.
      attachRecord3.detach();
      f_HTMLPanel1.addAndReplaceElement(get_linkToLogin(), get_domId0Element().get());

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
     * Getter for linkToLogin called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Hyperlink get_linkToLogin() {
      return build_linkToLogin();
    }
    private com.google.gwt.user.client.ui.Hyperlink build_linkToLogin() {
      // Creation section.
      final com.google.gwt.user.client.ui.Hyperlink linkToLogin = (com.google.gwt.user.client.ui.Hyperlink) GWT.create(com.google.gwt.user.client.ui.Hyperlink.class);
      // Setup section.
      linkToLogin.setHTML(template_html1().asString());
      linkToLogin.ensureDebugId("linkToLogin");


      this.owner.linkToLogin = linkToLogin;

      return linkToLogin;
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
  }
}
