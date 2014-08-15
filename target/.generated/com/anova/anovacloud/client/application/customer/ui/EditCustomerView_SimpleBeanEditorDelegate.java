package com.anova.anovacloud.client.application.customer.ui;

public class EditCustomerView_SimpleBeanEditorDelegate extends com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate {
  private com.anova.anovacloud.client.application.customer.ui.EditCustomerView editor;
  @Override protected com.anova.anovacloud.client.application.customer.ui.EditCustomerView getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(com.anova.anovacloud.client.application.customer.ui.EditCustomerView)editor;}
  private com.anova.anovacloud.shared.dto.CustomerDto object;
  @Override public com.anova.anovacloud.shared.dto.CustomerDto getObject() {return object;}
  @Override protected void setObject(Object object) {this.object=(com.anova.anovacloud.shared.dto.CustomerDto)object;}
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate nameDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate refNumDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate addressDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate emailDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate phoneDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate faxDelegate;
  @Override protected void initializeSubDelegates() {
    if (editor.name.asEditor() != null) {
      nameDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(nameDelegate, appendPath("name"), editor.name.asEditor());
    }
    if (editor.refNum.asEditor() != null) {
      refNumDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(refNumDelegate, appendPath("refNum"), editor.refNum.asEditor());
    }
    if (editor.address.asEditor() != null) {
      addressDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(addressDelegate, appendPath("address"), editor.address.asEditor());
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
    if (nameDelegate != null) 
    {
      com.anova.anovacloud.client.application.customer.ui.EditCustomerView_name_Context ctx = new com.anova.anovacloud.client.application.customer.ui.EditCustomerView_name_Context(getObject(), editor.name.asEditor(), appendPath("name"));
      ctx.setEditorDelegate(nameDelegate);
      ctx.traverse(visitor, nameDelegate);
    }
    if (refNumDelegate != null) 
    {
      com.anova.anovacloud.client.application.customer.ui.EditCustomerView_refNum_Context ctx = new com.anova.anovacloud.client.application.customer.ui.EditCustomerView_refNum_Context(getObject(), editor.refNum.asEditor(), appendPath("refNum"));
      ctx.setEditorDelegate(refNumDelegate);
      ctx.traverse(visitor, refNumDelegate);
    }
    if (addressDelegate != null) 
    {
      com.anova.anovacloud.client.application.customer.ui.EditCustomerView_address_Context ctx = new com.anova.anovacloud.client.application.customer.ui.EditCustomerView_address_Context(getObject(), editor.address.asEditor(), appendPath("address"));
      ctx.setEditorDelegate(addressDelegate);
      ctx.traverse(visitor, addressDelegate);
    }
    if (emailDelegate != null) 
    {
      com.anova.anovacloud.client.application.customer.ui.EditCustomerView_email_Context ctx = new com.anova.anovacloud.client.application.customer.ui.EditCustomerView_email_Context(getObject(), editor.email.asEditor(), appendPath("email"));
      ctx.setEditorDelegate(emailDelegate);
      ctx.traverse(visitor, emailDelegate);
    }
    if (phoneDelegate != null) 
    {
      com.anova.anovacloud.client.application.customer.ui.EditCustomerView_phone_Context ctx = new com.anova.anovacloud.client.application.customer.ui.EditCustomerView_phone_Context(getObject(), editor.phone.asEditor(), appendPath("phone"));
      ctx.setEditorDelegate(phoneDelegate);
      ctx.traverse(visitor, phoneDelegate);
    }
    if (faxDelegate != null) 
    {
      com.anova.anovacloud.client.application.customer.ui.EditCustomerView_fax_Context ctx = new com.anova.anovacloud.client.application.customer.ui.EditCustomerView_fax_Context(getObject(), editor.fax.asEditor(), appendPath("fax"));
      ctx.setEditorDelegate(faxDelegate);
      ctx.traverse(visitor, faxDelegate);
    }
  }
}
