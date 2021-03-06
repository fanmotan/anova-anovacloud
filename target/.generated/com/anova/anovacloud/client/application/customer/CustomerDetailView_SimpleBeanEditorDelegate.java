package com.anova.anovacloud.client.application.customer;

public class CustomerDetailView_SimpleBeanEditorDelegate extends com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate {
  private com.anova.anovacloud.client.application.customer.CustomerDetailView editor;
  @Override protected com.anova.anovacloud.client.application.customer.CustomerDetailView getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(com.anova.anovacloud.client.application.customer.CustomerDetailView)editor;}
  private com.anova.anovacloud.shared.dto.CustomerDto object;
  @Override public com.anova.anovacloud.shared.dto.CustomerDto getObject() {return object;}
  @Override protected void setObject(Object object) {this.object=(com.anova.anovacloud.shared.dto.CustomerDto)object;}
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate nameDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate codeDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate addressDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate emailDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate phoneDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate faxDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate customerStatusDelegate;
  @Override protected void initializeSubDelegates() {
    if (editor.name.asEditor() != null) {
      nameDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(nameDelegate, appendPath("name"), editor.name.asEditor());
    }
    if (editor.code.asEditor() != null) {
      codeDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(codeDelegate, appendPath("code"), editor.code.asEditor());
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
    if (editor.customerStatus.asEditor() != null) {
      customerStatusDelegate = new com.google.gwt.editor.client.adapters.TakesValueEditor_com_anova_anovacloud_shared_dto_CustomerStatusDto_SimpleBeanEditorDelegate();
      addSubDelegate(customerStatusDelegate, appendPath("customerStatus"), editor.customerStatus.asEditor());
    }
  }
  @Override public void accept(com.google.gwt.editor.client.EditorVisitor visitor) {
    if (nameDelegate != null) 
    {
      com.anova.anovacloud.client.application.customer.CustomerDetailView_name_Context ctx = new com.anova.anovacloud.client.application.customer.CustomerDetailView_name_Context(getObject(), editor.name.asEditor(), appendPath("name"));
      ctx.setEditorDelegate(nameDelegate);
      ctx.traverse(visitor, nameDelegate);
    }
    if (codeDelegate != null) 
    {
      com.anova.anovacloud.client.application.customer.CustomerDetailView_code_Context ctx = new com.anova.anovacloud.client.application.customer.CustomerDetailView_code_Context(getObject(), editor.code.asEditor(), appendPath("code"));
      ctx.setEditorDelegate(codeDelegate);
      ctx.traverse(visitor, codeDelegate);
    }
    if (addressDelegate != null) 
    {
      com.anova.anovacloud.client.application.customer.CustomerDetailView_address_Context ctx = new com.anova.anovacloud.client.application.customer.CustomerDetailView_address_Context(getObject(), editor.address.asEditor(), appendPath("address"));
      ctx.setEditorDelegate(addressDelegate);
      ctx.traverse(visitor, addressDelegate);
    }
    if (emailDelegate != null) 
    {
      com.anova.anovacloud.client.application.customer.CustomerDetailView_email_Context ctx = new com.anova.anovacloud.client.application.customer.CustomerDetailView_email_Context(getObject(), editor.email.asEditor(), appendPath("email"));
      ctx.setEditorDelegate(emailDelegate);
      ctx.traverse(visitor, emailDelegate);
    }
    if (phoneDelegate != null) 
    {
      com.anova.anovacloud.client.application.customer.CustomerDetailView_phone_Context ctx = new com.anova.anovacloud.client.application.customer.CustomerDetailView_phone_Context(getObject(), editor.phone.asEditor(), appendPath("phone"));
      ctx.setEditorDelegate(phoneDelegate);
      ctx.traverse(visitor, phoneDelegate);
    }
    if (faxDelegate != null) 
    {
      com.anova.anovacloud.client.application.customer.CustomerDetailView_fax_Context ctx = new com.anova.anovacloud.client.application.customer.CustomerDetailView_fax_Context(getObject(), editor.fax.asEditor(), appendPath("fax"));
      ctx.setEditorDelegate(faxDelegate);
      ctx.traverse(visitor, faxDelegate);
    }
    if (customerStatusDelegate != null) 
    {
      com.anova.anovacloud.client.application.customer.CustomerDetailView_customerStatus_Context ctx = new com.anova.anovacloud.client.application.customer.CustomerDetailView_customerStatus_Context(getObject(), editor.customerStatus.asEditor(), appendPath("customerStatus"));
      ctx.setEditorDelegate(customerStatusDelegate);
      ctx.traverse(visitor, customerStatusDelegate);
    }
  }
}
