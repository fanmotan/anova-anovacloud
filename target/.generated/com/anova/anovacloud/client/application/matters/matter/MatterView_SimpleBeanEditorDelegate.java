package com.anova.anovacloud.client.application.matters.matter;

public class MatterView_SimpleBeanEditorDelegate extends com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate {
  private com.anova.anovacloud.client.application.matters.matter.MatterView editor;
  @Override protected com.anova.anovacloud.client.application.matters.matter.MatterView getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(com.anova.anovacloud.client.application.matters.matter.MatterView)editor;}
  private com.anova.anovacloud.shared.dto.MatterDto object;
  @Override public com.anova.anovacloud.shared.dto.MatterDto getObject() {return object;}
  @Override protected void setObject(Object object) {this.object=(com.anova.anovacloud.shared.dto.MatterDto)object;}
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate matterNumDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate matterSerialNumDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate customerDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate matterPropertiesDelegate;
  @Override protected void initializeSubDelegates() {
    if (editor.matterNum.asEditor() != null) {
      matterNumDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(matterNumDelegate, appendPath("matterNum"), editor.matterNum.asEditor());
    }
    if (editor.matterSerialNum.asEditor() != null) {
      matterSerialNumDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(matterSerialNumDelegate, appendPath("matterSerialNum"), editor.matterSerialNum.asEditor());
    }
    if (editor.customer.asEditor() != null) {
      customerDelegate = new com.google.gwt.editor.client.adapters.TakesValueEditor_com_anova_anovacloud_shared_dto_CustomerDto_SimpleBeanEditorDelegate();
      addSubDelegate(customerDelegate, appendPath("customer"), editor.customer.asEditor());
    }
    if (editor.matterProperties != null) {
      matterPropertiesDelegate = new com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_SimpleBeanEditorDelegate();
      addSubDelegate(matterPropertiesDelegate, appendPath("matterProperties"), editor.matterProperties);
    }
  }
  @Override public void accept(com.google.gwt.editor.client.EditorVisitor visitor) {
    if (matterNumDelegate != null) 
    {
      com.anova.anovacloud.client.application.matters.matter.MatterView_matterNum_Context ctx = new com.anova.anovacloud.client.application.matters.matter.MatterView_matterNum_Context(getObject(), editor.matterNum.asEditor(), appendPath("matterNum"));
      ctx.setEditorDelegate(matterNumDelegate);
      ctx.traverse(visitor, matterNumDelegate);
    }
    if (matterSerialNumDelegate != null) 
    {
      com.anova.anovacloud.client.application.matters.matter.MatterView_matterSerialNum_Context ctx = new com.anova.anovacloud.client.application.matters.matter.MatterView_matterSerialNum_Context(getObject(), editor.matterSerialNum.asEditor(), appendPath("matterSerialNum"));
      ctx.setEditorDelegate(matterSerialNumDelegate);
      ctx.traverse(visitor, matterSerialNumDelegate);
    }
    if (customerDelegate != null) 
    {
      com.anova.anovacloud.client.application.matters.matter.MatterView_customer_Context ctx = new com.anova.anovacloud.client.application.matters.matter.MatterView_customer_Context(getObject(), editor.customer.asEditor(), appendPath("customer"));
      ctx.setEditorDelegate(customerDelegate);
      ctx.traverse(visitor, customerDelegate);
    }
    if (matterPropertiesDelegate != null) 
    {
      com.anova.anovacloud.client.application.matters.matter.MatterView_matterProperties_Context ctx = new com.anova.anovacloud.client.application.matters.matter.MatterView_matterProperties_Context(getObject(), editor.matterProperties, appendPath("matterProperties"));
      ctx.setEditorDelegate(matterPropertiesDelegate);
      ctx.traverse(visitor, matterPropertiesDelegate);
    }
  }
}
