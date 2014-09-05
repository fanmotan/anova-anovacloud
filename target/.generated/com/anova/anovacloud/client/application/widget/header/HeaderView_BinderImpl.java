package com.anova.anovacloud.client.application.widget.header;

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

public class HeaderView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.anova.anovacloud.client.application.widget.header.HeaderView>, com.anova.anovacloud.client.application.widget.header.HeaderView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("<a href='{0}'>Home</a> <a href='{1}'>Matters</a> <a href='{2}'>Matter Actions</a> <a href='{3}'>Customers</a> <a href='{4}'>Attorneys</a> <a href='{5}'>Users</a>")
    SafeHtml html1(SafeUri arg0, SafeUri arg1, SafeUri arg2, SafeUri arg3, SafeUri arg4, SafeUri arg5);
     
    @Template("<div class='{0}'> Hello <span id='{1}'></span> ! </div> <div class='{2}'> <span id='{3}'></span> </div> <div class='{4}'></div>")
    SafeHtml html2(String arg0, String arg1, String arg2, String arg3, String arg4);
     
    @Template("<div class='{0}'> <div class='{1}'> <span id='{2}'></span> </div> <div class='{3}'> <span id='{4}'></span> </div> <span id='{5}'></span> <span id='{6}'></span> <div class='{7}'></div> </div>")
    SafeHtml html3(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.anova.anovacloud.client.application.widget.header.HeaderView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.anova.anovacloud.client.application.widget.header.HeaderView owner;


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onLogoutClicked((com.google.gwt.event.dom.client.ClickEvent) event);
      }
    };

    public Widgets(final com.anova.anovacloud.client.application.widget.header.HeaderView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId4();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId5();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId4Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId5Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(UriUtils.fromString("#" + get_REPORT() + ""), UriUtils.fromString("#" + get_MATTERS() + ""), UriUtils.fromString("#" + get_MATTERACTION() + ""), UriUtils.fromString("#" + get_CUSTOMER() + ""), UriUtils.fromString("#" + get_ATTORNEY() + ""), UriUtils.fromString("#" + get_USER() + ""));
    }
    SafeHtml template_html2() {
      return template.html2("" + get_style().userInfo() + "", get_domId4(), "" + get_style().floatLeft() + "", get_domId5(), "" + get_style().clear() + "");
    }
    SafeHtml template_html3() {
      return template.html3("" + get_style().headerContent() + "", "" + get_style().floatLeft() + "", get_domId0(), "" + get_style().floatLeft() + " " + get_style().applicationTitle() + "", get_domId1(), get_domId2(), get_domId3(), "" + get_style().clear() + "");
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.anova.anovacloud.client.application.widget.header.HeaderView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.anova.anovacloud.client.application.widget.header.HeaderView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.anova.anovacloud.client.application.widget.header.HeaderView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.anova.anovacloud.client.application.widget.header.HeaderView_BinderImpl_GenBundle) GWT.create(com.anova.anovacloud.client.application.widget.header.HeaderView_BinderImpl_GenBundle.class);
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
     * Getter for CUSTOMER called 1 times. Type: DEFAULT. Build precedence: 1.
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
     * Getter for MATTERS called 1 times. Type: DEFAULT. Build precedence: 1.
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
     * Getter for REPORT called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private java.lang.String get_REPORT() {
      return build_REPORT();
    }
    private java.lang.String build_REPORT() {
      // Creation section.
      final java.lang.String REPORT = com.anova.anovacloud.client.place.NameTokens.REPORT;
      // Setup section.


      return REPORT;
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
     * Getter for MATTERACTION called 1 times. Type: DEFAULT. Build precedence: 1.
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
     * Getter for USER called 1 times. Type: DEFAULT. Build precedence: 1.
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
     * Getter for ATTORNEY called 1 times. Type: DEFAULT. Build precedence: 1.
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
     * Getter for resource called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private com.anova.anovacloud.client.resources.AppResources get_resource() {
      return build_resource();
    }
    private com.anova.anovacloud.client.resources.AppResources build_resource() {
      // Creation section.
      final com.anova.anovacloud.client.resources.AppResources resource = (com.anova.anovacloud.client.resources.AppResources) GWT.create(com.anova.anovacloud.client.resources.AppResources.class);
      // Setup section.


      return resource;
    }

    /**
     * Getter for style called 15 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.anova.anovacloud.client.application.widget.header.HeaderView_BinderImpl_GenCss_style style;
    private com.anova.anovacloud.client.application.widget.header.HeaderView_BinderImpl_GenCss_style get_style() {
      return style;
    }
    private com.anova.anovacloud.client.application.widget.header.HeaderView_BinderImpl_GenCss_style build_style() {
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
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html3().asString());
      // Setup section.
      f_HTMLPanel1.setStyleName("" + get_style().header() + "");

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord18 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();
      get_domId1Element().get();
      get_domId2Element().get();
      get_domId3Element().get();

      // Detach section.
      attachRecord18.detach();
      f_HTMLPanel1.addAndReplaceElement(get_f_Image2(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_Label3(), get_domId1Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_menubar(), get_domId2Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_userOptions(), get_domId3Element().get());

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
     * Getter for f_Image2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Image get_f_Image2() {
      return build_f_Image2();
    }
    private com.google.gwt.user.client.ui.Image build_f_Image2() {
      // Creation section.
      final com.google.gwt.user.client.ui.Image f_Image2 = new com.google.gwt.user.client.ui.Image(get_resource().anovaLogo());
      // Setup section.


      return f_Image2;
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
     * Getter for f_Label3 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label3() {
      return build_f_Label3();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label3() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label3 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label3.setText("Anova Cloud");


      return f_Label3;
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
     * Getter for menubar called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_menubar() {
      return build_menubar();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_menubar() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel menubar = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.
      menubar.ensureDebugId("menubar");
      menubar.setStyleName("" + get_style().floatLeft() + " " + get_style().menuBarWrapper() + "");


      this.owner.menubar = menubar;

      return menubar;
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
     * Getter for userOptions called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_userOptions() {
      return build_userOptions();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_userOptions() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel userOptions = new com.google.gwt.user.client.ui.HTMLPanel(template_html2().asString());
      // Setup section.
      userOptions.setStyleName("" + get_style().floatRight() + " " + get_style().paddingTop() + "");

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord19 = UiBinderUtil.attachToDom(userOptions.getElement());
      get_domId4Element().get();
      get_domId5Element().get();

      // Detach section.
      attachRecord19.detach();
      userOptions.addAndReplaceElement(get_name(), get_domId4Element().get());
      userOptions.addAndReplaceElement(get_logout(), get_domId5Element().get());

      this.owner.userOptions = userOptions;

      return userOptions;
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
     * Getter for name called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.InlineLabel get_name() {
      return build_name();
    }
    private com.google.gwt.user.client.ui.InlineLabel build_name() {
      // Creation section.
      final com.google.gwt.user.client.ui.InlineLabel name = (com.google.gwt.user.client.ui.InlineLabel) GWT.create(com.google.gwt.user.client.ui.InlineLabel.class);
      // Setup section.
      name.setStyleName("" + get_style().userName() + "");


      this.owner.name = name;

      return name;
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
     * Getter for logout called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.Button get_logout() {
      return build_logout();
    }
    private com.google.gwt.user.client.ui.Button build_logout() {
      // Creation section.
      final com.google.gwt.user.client.ui.Button logout = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
      // Setup section.
      logout.ensureDebugId("logout");
      logout.setStyleName("" + get_style().logoutButton() + "");
      logout.setText("Logout");
      logout.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);


      this.owner.logout = logout;

      return logout;
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
  }
}
