package com.anova.anovacloud.client.application.attorney;

public class AttorneyDetailView_SimpleBeanEditorDelegate extends com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate {
  private com.anova.anovacloud.client.application.attorney.AttorneyDetailView editor;
  @Override protected com.anova.anovacloud.client.application.attorney.AttorneyDetailView getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(com.anova.anovacloud.client.application.attorney.AttorneyDetailView)editor;}
  private com.anova.anovacloud.shared.dto.AttorneyDto object;
  @Override public com.anova.anovacloud.shared.dto.AttorneyDto getObject() {return object;}
  @Override protected void setObject(Object object) {this.object=(com.anova.anovacloud.shared.dto.AttorneyDto)object;}
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate displayNameDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate firstNameDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate lastNameDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate mailAddressDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate emailDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate phoneDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate faxDelegate;
  @Override protected void initializeSubDelegates() {
    if (editor.displayName.asEditor() != null) {
      displayNameDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(displayNameDelegate, appendPath("displayName"), editor.displayName.asEditor());
    }
    if (editor.firstName.asEditor() != null) {
      firstNameDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(firstNameDelegate, appendPath("firstName"), editor.firstName.asEditor());
    }
    if (editor.lastName.asEditor() != null) {
      lastNameDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(lastNameDelegate, appendPath("lastName"), editor.lastName.asEditor());
    }
    if (editor.mailAddress.asEditor() != null) {
      mailAddressDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(mailAddressDelegate, appendPath("mailAddress"), editor.mailAddress.asEditor());
    }
    if (editor.email.asEditor() != null) {
      emailDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(emailDelegate, appendPath("email"), editor.email.asEditor());
    }
    if (editor.phone.asEditor() != null) {
      phoneDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(phoneDelegate, appendPath("phone"), editor.phone.asEditor());
    }
    if (editor.fax.asEditor() != null) {
      faxDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(faxDelegate, appendPath("fax"), editor.fax.asEditor());
    }
  }
  @Override public void accept(com.google.gwt.editor.client.EditorVisitor visitor) {
    if (displayNameDelegate != null) 
    {
      com.anova.anovacloud.client.application.attorney.AttorneyDetailView_displayName_Context ctx = new com.anova.anovacloud.client.application.attorney.AttorneyDetailView_displayName_Context(getObject(), editor.displayName.asEditor(), appendPath("displayName"));
      ctx.setEditorDelegate(displayNameDelegate);
      ctx.traverse(visitor, displayNameDelegate);
    }
    if (firstNameDelegate != null) 
    {
      com.anova.anovacloud.client.application.attorney.AttorneyDetailView_firstName_Context ctx = new com.anova.anovacloud.client.application.attorney.AttorneyDetailView_firstName_Context(getObject(), editor.firstName.asEditor(), appendPath("firstName"));
      ctx.setEditorDelegate(firstNameDelegate);
      ctx.traverse(visitor, firstNameDelegate);
    }
    if (lastNameDelegate != null) 
    {
      com.anova.anovacloud.client.application.attorney.AttorneyDetailView_lastName_Context ctx = new com.anova.anovacloud.client.application.attorney.AttorneyDetailView_lastName_Context(getObject(), editor.lastName.asEditor(), appendPath("lastName"));
      ctx.setEditorDelegate(lastNameDelegate);
      ctx.traverse(visitor, lastNameDelegate);
    }
    if (mailAddressDelegate != null) 
    {
      com.anova.anovacloud.client.application.attorney.AttorneyDetailView_mailAddress_Context ctx = new com.anova.anovacloud.client.application.attorney.AttorneyDetailView_mailAddress_Context(getObject(), editor.mailAddress.asEditor(), appendPath("mailAddress"));
      ctx.setEditorDelegate(mailAddressDelegate);
      ctx.traverse(visitor, mailAddressDelegate);
    }
    if (emailDelegate != null) 
    {
      com.anova.anovacloud.client.application.attorney.AttorneyDetailView_email_Context ctx = new com.anova.anovacloud.client.application.attorney.AttorneyDetailView_email_Context(getObject(), editor.email.asEditor(), appendPath("email"));
      ctx.setEditorDelegate(emailDelegate);
      ctx.traverse(visitor, emailDelegate);
    }
    if (phoneDelegate != null) 
    {
      com.anova.anovacloud.client.application.attorney.AttorneyDetailView_phone_Context ctx = new com.anova.anovacloud.client.application.attorney.AttorneyDetailView_phone_Context(getObject(), editor.phone.asEditor(), appendPath("phone"));
      ctx.setEditorDelegate(phoneDelegate);
      ctx.traverse(visitor, phoneDelegate);
    }
    if (faxDelegate != null) 
    {
      com.anova.anovacloud.client.application.attorney.AttorneyDetailView_fax_Context ctx = new com.anova.anovacloud.client.application.attorney.AttorneyDetailView_fax_Context(getObject(), editor.fax.asEditor(), appendPath("fax"));
      ctx.setEditorDelegate(faxDelegate);
      ctx.traverse(visitor, faxDelegate);
    }
  }
}
