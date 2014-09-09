package com.anova.anovacloud.client.application.matters.matter;

public class MatterView_SimpleBeanEditorDelegate extends com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate {
  private com.anova.anovacloud.client.application.matters.matter.MatterView editor;
  @Override protected com.anova.anovacloud.client.application.matters.matter.MatterView getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(com.anova.anovacloud.client.application.matters.matter.MatterView)editor;}
  private com.anova.anovacloud.shared.dto.MatterDto object;
  @Override public com.anova.anovacloud.shared.dto.MatterDto getObject() {return object;}
  @Override protected void setObject(Object object) {this.object=(com.anova.anovacloud.shared.dto.MatterDto)object;}
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate caseNumDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate clientRefDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate customerDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate caseStatusDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate matterPropertiesDelegate;
  @Override protected void initializeSubDelegates() {
    if (editor.caseNum.asEditor() != null) {
      caseNumDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(caseNumDelegate, appendPath("caseNum"), editor.caseNum.asEditor());
    }
    if (editor.clientRef.asEditor() != null) {
      clientRefDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(clientRefDelegate, appendPath("clientRef"), editor.clientRef.asEditor());
    }
    if (editor.customer.asEditor() != null) {
      customerDelegate = new com.google.gwt.editor.client.adapters.TakesValueEditor_com_anova_anovacloud_shared_dto_CustomerDto_SimpleBeanEditorDelegate();
      addSubDelegate(customerDelegate, appendPath("customer"), editor.customer.asEditor());
    }
    if (editor.caseStatus.asEditor() != null) {
      caseStatusDelegate = new com.google.gwt.editor.client.adapters.TakesValueEditor_com_anova_anovacloud_shared_dto_CaseStatusDto_SimpleBeanEditorDelegate();
      addSubDelegate(caseStatusDelegate, appendPath("caseStatus"), editor.caseStatus.asEditor());
    }
    if (editor.matterProperties != null) {
      matterPropertiesDelegate = new com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_SimpleBeanEditorDelegate();
      addSubDelegate(matterPropertiesDelegate, appendPath("matterProperties"), editor.matterProperties);
    }
  }
  @Override public void accept(com.google.gwt.editor.client.EditorVisitor visitor) {
    if (caseNumDelegate != null) 
    {
      com.anova.anovacloud.client.application.matters.matter.MatterView_caseNum_Context ctx = new com.anova.anovacloud.client.application.matters.matter.MatterView_caseNum_Context(getObject(), editor.caseNum.asEditor(), appendPath("caseNum"));
      ctx.setEditorDelegate(caseNumDelegate);
      ctx.traverse(visitor, caseNumDelegate);
    }
    if (clientRefDelegate != null) 
    {
      com.anova.anovacloud.client.application.matters.matter.MatterView_clientRef_Context ctx = new com.anova.anovacloud.client.application.matters.matter.MatterView_clientRef_Context(getObject(), editor.clientRef.asEditor(), appendPath("clientRef"));
      ctx.setEditorDelegate(clientRefDelegate);
      ctx.traverse(visitor, clientRefDelegate);
    }
    if (customerDelegate != null) 
    {
      com.anova.anovacloud.client.application.matters.matter.MatterView_customer_Context ctx = new com.anova.anovacloud.client.application.matters.matter.MatterView_customer_Context(getObject(), editor.customer.asEditor(), appendPath("customer"));
      ctx.setEditorDelegate(customerDelegate);
      ctx.traverse(visitor, customerDelegate);
    }
    if (caseStatusDelegate != null) 
    {
      com.anova.anovacloud.client.application.matters.matter.MatterView_caseStatus_Context ctx = new com.anova.anovacloud.client.application.matters.matter.MatterView_caseStatus_Context(getObject(), editor.caseStatus.asEditor(), appendPath("caseStatus"));
      ctx.setEditorDelegate(caseStatusDelegate);
      ctx.traverse(visitor, caseStatusDelegate);
    }
    if (matterPropertiesDelegate != null) 
    {
      com.anova.anovacloud.client.application.matters.matter.MatterView_matterProperties_Context ctx = new com.anova.anovacloud.client.application.matters.matter.MatterView_matterProperties_Context(getObject(), editor.matterProperties, appendPath("matterProperties"));
      ctx.setEditorDelegate(matterPropertiesDelegate);
      ctx.traverse(visitor, matterPropertiesDelegate);
    }
  }
}
