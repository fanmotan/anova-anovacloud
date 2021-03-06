package com.anova.anovacloud.client.application.attorney.ui;

public class EditAttorneyView_SimpleBeanEditorDelegate extends com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate {
  private com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView editor;
  @Override protected com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView)editor;}
  private com.anova.anovacloud.shared.dto.AttorneyDto object;
  @Override public com.anova.anovacloud.shared.dto.AttorneyDto getObject() {return object;}
  @Override protected void setObject(Object object) {this.object=(com.anova.anovacloud.shared.dto.AttorneyDto)object;}
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate firstNameDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate lastNameDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate emailDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate mailAddressDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate phoneDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate faxDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate attorneyStatusDelegate;
  @Override protected void initializeSubDelegates() {
    if (editor.firstName.asEditor() != null) {
      firstNameDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(firstNameDelegate, appendPath("firstName"), editor.firstName.asEditor());
    }
    if (editor.lastName.asEditor() != null) {
      lastNameDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(lastNameDelegate, appendPath("lastName"), editor.lastName.asEditor());
    }
    if (editor.email.asEditor() != null) {
      emailDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(emailDelegate, appendPath("email"), editor.email.asEditor());
    }
    if (editor.mailAddress.asEditor() != null) {
      mailAddressDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(mailAddressDelegate, appendPath("mailAddress"), editor.mailAddress.asEditor());
    }
    if (editor.phone.asEditor() != null) {
      phoneDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(phoneDelegate, appendPath("phone"), editor.phone.asEditor());
    }
    if (editor.fax.asEditor() != null) {
      faxDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(faxDelegate, appendPath("fax"), editor.fax.asEditor());
    }
    if (editor.attorneyStatus.asEditor() != null) {
      attorneyStatusDelegate = new com.google.gwt.editor.client.adapters.TakesValueEditor_com_anova_anovacloud_shared_dto_AttorneyStatusDto_SimpleBeanEditorDelegate();
      addSubDelegate(attorneyStatusDelegate, appendPath("attorneyStatus"), editor.attorneyStatus.asEditor());
    }
  }
  @Override public void accept(com.google.gwt.editor.client.EditorVisitor visitor) {
    if (firstNameDelegate != null) 
    {
      com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView_firstName_Context ctx = new com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView_firstName_Context(getObject(), editor.firstName.asEditor(), appendPath("firstName"));
      ctx.setEditorDelegate(firstNameDelegate);
      ctx.traverse(visitor, firstNameDelegate);
    }
    if (lastNameDelegate != null) 
    {
      com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView_lastName_Context ctx = new com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView_lastName_Context(getObject(), editor.lastName.asEditor(), appendPath("lastName"));
      ctx.setEditorDelegate(lastNameDelegate);
      ctx.traverse(visitor, lastNameDelegate);
    }
    if (emailDelegate != null) 
    {
      com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView_email_Context ctx = new com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView_email_Context(getObject(), editor.email.asEditor(), appendPath("email"));
      ctx.setEditorDelegate(emailDelegate);
      ctx.traverse(visitor, emailDelegate);
    }
    if (mailAddressDelegate != null) 
    {
      com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView_mailAddress_Context ctx = new com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView_mailAddress_Context(getObject(), editor.mailAddress.asEditor(), appendPath("mailAddress"));
      ctx.setEditorDelegate(mailAddressDelegate);
      ctx.traverse(visitor, mailAddressDelegate);
    }
    if (phoneDelegate != null) 
    {
      com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView_phone_Context ctx = new com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView_phone_Context(getObject(), editor.phone.asEditor(), appendPath("phone"));
      ctx.setEditorDelegate(phoneDelegate);
      ctx.traverse(visitor, phoneDelegate);
    }
    if (faxDelegate != null) 
    {
      com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView_fax_Context ctx = new com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView_fax_Context(getObject(), editor.fax.asEditor(), appendPath("fax"));
      ctx.setEditorDelegate(faxDelegate);
      ctx.traverse(visitor, faxDelegate);
    }
    if (attorneyStatusDelegate != null) 
    {
      com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView_attorneyStatus_Context ctx = new com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView_attorneyStatus_Context(getObject(), editor.attorneyStatus.asEditor(), appendPath("attorneyStatus"));
      ctx.setEditorDelegate(attorneyStatusDelegate);
      ctx.traverse(visitor, attorneyStatusDelegate);
    }
  }
}
