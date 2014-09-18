package com.anova.anovacloud.client.application.matterAction;

public class MatterActionDetailView_SimpleBeanEditorDelegate extends com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate {
  private com.anova.anovacloud.client.application.matterAction.MatterActionDetailView editor;
  @Override protected com.anova.anovacloud.client.application.matterAction.MatterActionDetailView getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(com.anova.anovacloud.client.application.matterAction.MatterActionDetailView)editor;}
  private com.anova.anovacloud.shared.dto.MatterActionDto object;
  @Override public com.anova.anovacloud.shared.dto.MatterActionDto getObject() {return object;}
  @Override protected void setObject(Object object) {this.object=(com.anova.anovacloud.shared.dto.MatterActionDto)object;}
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate actionDueDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate actionRemarksDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate matterDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate assignee1Delegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate assignee2Delegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate assignee3Delegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate assignee1RoleDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate assignee2RoleDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate assignee3RoleDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate actionStatusDelegate;
  @Override protected void initializeSubDelegates() {
    if (editor.actionDue.asEditor() != null) {
      actionDueDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(actionDueDelegate, appendPath("actionDue"), editor.actionDue.asEditor());
    }
    if (editor.actionRemarks.asEditor() != null) {
      actionRemarksDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(actionRemarksDelegate, appendPath("actionRemarks"), editor.actionRemarks.asEditor());
    }
    if (editor.matter.asEditor() != null) {
      matterDelegate = new com.google.gwt.editor.client.adapters.TakesValueEditor_com_anova_anovacloud_shared_dto_MatterDto_SimpleBeanEditorDelegate();
      addSubDelegate(matterDelegate, appendPath("matter"), editor.matter.asEditor());
    }
    if (editor.assignee1.asEditor() != null) {
      assignee1Delegate = new com.google.gwt.editor.client.adapters.TakesValueEditor_com_anova_anovacloud_shared_dto_AttorneyDto_SimpleBeanEditorDelegate();
      addSubDelegate(assignee1Delegate, appendPath("assignee1"), editor.assignee1.asEditor());
    }
    if (editor.assignee2.asEditor() != null) {
      assignee2Delegate = new com.google.gwt.editor.client.adapters.TakesValueEditor_com_anova_anovacloud_shared_dto_AttorneyDto_SimpleBeanEditorDelegate();
      addSubDelegate(assignee2Delegate, appendPath("assignee2"), editor.assignee2.asEditor());
    }
    if (editor.assignee3.asEditor() != null) {
      assignee3Delegate = new com.google.gwt.editor.client.adapters.TakesValueEditor_com_anova_anovacloud_shared_dto_AttorneyDto_SimpleBeanEditorDelegate();
      addSubDelegate(assignee3Delegate, appendPath("assignee3"), editor.assignee3.asEditor());
    }
    if (editor.assignee1Role.asEditor() != null) {
      assignee1RoleDelegate = new com.google.gwt.editor.client.adapters.TakesValueEditor_com_anova_anovacloud_shared_dto_AttorneyRoleDto_SimpleBeanEditorDelegate();
      addSubDelegate(assignee1RoleDelegate, appendPath("assignee1Role"), editor.assignee1Role.asEditor());
    }
    if (editor.assignee2Role.asEditor() != null) {
      assignee2RoleDelegate = new com.google.gwt.editor.client.adapters.TakesValueEditor_com_anova_anovacloud_shared_dto_AttorneyRoleDto_SimpleBeanEditorDelegate();
      addSubDelegate(assignee2RoleDelegate, appendPath("assignee2Role"), editor.assignee2Role.asEditor());
    }
    if (editor.assignee3Role.asEditor() != null) {
      assignee3RoleDelegate = new com.google.gwt.editor.client.adapters.TakesValueEditor_com_anova_anovacloud_shared_dto_AttorneyRoleDto_SimpleBeanEditorDelegate();
      addSubDelegate(assignee3RoleDelegate, appendPath("assignee3Role"), editor.assignee3Role.asEditor());
    }
    if (editor.actionStatus.asEditor() != null) {
      actionStatusDelegate = new com.google.gwt.editor.client.adapters.TakesValueEditor_com_anova_anovacloud_shared_dto_MatterActionStatusDto_SimpleBeanEditorDelegate();
      addSubDelegate(actionStatusDelegate, appendPath("actionStatus"), editor.actionStatus.asEditor());
    }
  }
  @Override public void accept(com.google.gwt.editor.client.EditorVisitor visitor) {
    {
      com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_dueDate_Context ctx = new com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_dueDate_Context(getObject(), editor.dueDate.asEditor(), appendPath("dueDate"));
      ctx.traverse(visitor, null);
    }
    if (actionDueDelegate != null) 
    {
      com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_actionDue_Context ctx = new com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_actionDue_Context(getObject(), editor.actionDue.asEditor(), appendPath("actionDue"));
      ctx.setEditorDelegate(actionDueDelegate);
      ctx.traverse(visitor, actionDueDelegate);
    }
    {
      com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_ptoMailDate_Context ctx = new com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_ptoMailDate_Context(getObject(), editor.ptoMailDate.asEditor(), appendPath("ptoMailDate"));
      ctx.traverse(visitor, null);
    }
    {
      com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_responseDate_Context ctx = new com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_responseDate_Context(getObject(), editor.responseDate.asEditor(), appendPath("responseDate"));
      ctx.traverse(visitor, null);
    }
    {
      com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_takenDate_Context ctx = new com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_takenDate_Context(getObject(), editor.takenDate.asEditor(), appendPath("takenDate"));
      ctx.traverse(visitor, null);
    }
    if (actionRemarksDelegate != null) 
    {
      com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_actionRemarks_Context ctx = new com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_actionRemarks_Context(getObject(), editor.actionRemarks.asEditor(), appendPath("actionRemarks"));
      ctx.setEditorDelegate(actionRemarksDelegate);
      ctx.traverse(visitor, actionRemarksDelegate);
    }
    if (matterDelegate != null) 
    {
      com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_matter_Context ctx = new com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_matter_Context(getObject(), editor.matter.asEditor(), appendPath("matter"));
      ctx.setEditorDelegate(matterDelegate);
      ctx.traverse(visitor, matterDelegate);
    }
    if (assignee1Delegate != null) 
    {
      com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_assignee1_Context ctx = new com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_assignee1_Context(getObject(), editor.assignee1.asEditor(), appendPath("assignee1"));
      ctx.setEditorDelegate(assignee1Delegate);
      ctx.traverse(visitor, assignee1Delegate);
    }
    if (assignee2Delegate != null) 
    {
      com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_assignee2_Context ctx = new com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_assignee2_Context(getObject(), editor.assignee2.asEditor(), appendPath("assignee2"));
      ctx.setEditorDelegate(assignee2Delegate);
      ctx.traverse(visitor, assignee2Delegate);
    }
    if (assignee3Delegate != null) 
    {
      com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_assignee3_Context ctx = new com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_assignee3_Context(getObject(), editor.assignee3.asEditor(), appendPath("assignee3"));
      ctx.setEditorDelegate(assignee3Delegate);
      ctx.traverse(visitor, assignee3Delegate);
    }
    if (assignee1RoleDelegate != null) 
    {
      com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_assignee1Role_Context ctx = new com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_assignee1Role_Context(getObject(), editor.assignee1Role.asEditor(), appendPath("assignee1Role"));
      ctx.setEditorDelegate(assignee1RoleDelegate);
      ctx.traverse(visitor, assignee1RoleDelegate);
    }
    if (assignee2RoleDelegate != null) 
    {
      com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_assignee2Role_Context ctx = new com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_assignee2Role_Context(getObject(), editor.assignee2Role.asEditor(), appendPath("assignee2Role"));
      ctx.setEditorDelegate(assignee2RoleDelegate);
      ctx.traverse(visitor, assignee2RoleDelegate);
    }
    if (assignee3RoleDelegate != null) 
    {
      com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_assignee3Role_Context ctx = new com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_assignee3Role_Context(getObject(), editor.assignee3Role.asEditor(), appendPath("assignee3Role"));
      ctx.setEditorDelegate(assignee3RoleDelegate);
      ctx.traverse(visitor, assignee3RoleDelegate);
    }
    if (actionStatusDelegate != null) 
    {
      com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_actionStatus_Context ctx = new com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_actionStatus_Context(getObject(), editor.actionStatus.asEditor(), appendPath("actionStatus"));
      ctx.setEditorDelegate(actionStatusDelegate);
      ctx.traverse(visitor, actionStatusDelegate);
    }
  }
}
