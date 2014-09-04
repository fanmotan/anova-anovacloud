package com.anova.anovacloud.client.application.user;

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

public class UserDetailView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.anova.anovacloud.client.application.user.UserDetailView>, com.anova.anovacloud.client.application.user.UserDetailView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span> <span id='{1}'></span> <span id='{2}'></span> <span id='{3}'></span> <span id='{4}'></span> <span id='{5}'></span>  <span id='{6}'></span>")
    SafeHtml html1(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.anova.anovacloud.client.application.user.UserDetailView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.anova.anovacloud.client.application.user.UserDetailView owner;


    public Widgets(final com.anova.anovacloud.client.application.user.UserDetailView owner) {
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
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId4Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId5Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId6Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0(), get_domId1(), get_domId2(), get_domId3(), get_domId4(), get_domId5(), get_domId6());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.anova.anovacloud.client.application.user.UserDetailView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.anova.anovacloud.client.application.user.UserDetailView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.anova.anovacloud.client.application.user.UserDetailView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.anova.anovacloud.client.application.user.UserDetailView_BinderImpl_GenBundle) GWT.create(com.anova.anovacloud.client.application.user.UserDetailView_BinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for resource called 6 times. Type: IMPORTED. Build precedence: 1.
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
     * Getter for style called 1 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.anova.anovacloud.client.application.user.UserDetailView_BinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.anova.anovacloud.client.application.user.UserDetailView_BinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.anova.anovacloud.client.application.user.UserDetailView_BinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      UiBinderUtil.TempAttachment attachRecord15 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();
      get_domId1Element().get();
      get_domId2Element().get();
      get_domId3Element().get();
      get_domId4Element().get();
      get_domId5Element().get();
      get_domId6Element().get();

      // Detach section.
      attachRecord15.detach();
      f_HTMLPanel1.addAndReplaceElement(get_displayName(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_firstName(), get_domId1Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_lastName(), get_domId2Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_username(), get_domId3Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_hashPassword(), get_domId4Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_userRole(), get_domId5Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_email(), get_domId6Element().get());

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
     * Getter for displayName called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.TextBox get_displayName() {
      return build_displayName();
    }
    private com.google.gwt.user.client.ui.TextBox build_displayName() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox displayName = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      displayName.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.displayName = displayName;

      return displayName;
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
     * Getter for firstName called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.TextBox get_firstName() {
      return build_firstName();
    }
    private com.google.gwt.user.client.ui.TextBox build_firstName() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox firstName = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      firstName.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.firstName = firstName;

      return firstName;
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
     * Getter for lastName called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.TextBox get_lastName() {
      return build_lastName();
    }
    private com.google.gwt.user.client.ui.TextBox build_lastName() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox lastName = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      lastName.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.lastName = lastName;

      return lastName;
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
     * Getter for username called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.TextBox get_username() {
      return build_username();
    }
    private com.google.gwt.user.client.ui.TextBox build_username() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox username = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      username.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.username = username;

      return username;
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
     * Getter for hashPassword called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.PasswordTextBox get_hashPassword() {
      return build_hashPassword();
    }
    private com.google.gwt.user.client.ui.PasswordTextBox build_hashPassword() {
      // Creation section.
      final com.google.gwt.user.client.ui.PasswordTextBox hashPassword = (com.google.gwt.user.client.ui.PasswordTextBox) GWT.create(com.google.gwt.user.client.ui.PasswordTextBox.class);
      // Setup section.
      hashPassword.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.hashPassword = hashPassword;

      return hashPassword;
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
     * Getter for userRole called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.ValueListBox get_userRole() {
      return build_userRole();
    }
    private com.google.gwt.user.client.ui.ValueListBox build_userRole() {
      // Creation section.
      final com.google.gwt.user.client.ui.ValueListBox userRole = owner.userRole;
      assert userRole != null : "UiField userRole with 'provided = true' was null";
      // Setup section.


      return userRole;
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
     * Getter for email called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.TextBox get_email() {
      return build_email();
    }
    private com.google.gwt.user.client.ui.TextBox build_email() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox email = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      email.setStyleName("" + get_resource().styles().mobileTextField() + "");


      this.owner.email = email;

      return email;
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
  }
}
