package com.anova.anovacloud.client.application.matterAction;

public class MatterActionDetailView_assignee1Role_Context extends com.google.gwt.editor.client.impl.AbstractEditorContext<java.lang.String> {
  private final com.anova.anovacloud.shared.dto.MatterActionDto parent;
  public MatterActionDetailView_assignee1Role_Context(com.anova.anovacloud.shared.dto.MatterActionDto parent, com.google.gwt.editor.client.Editor<java.lang.String> editor, String path) {
    super(editor,path);
    this.parent = parent;
  }
  @Override public boolean canSetInModel() {
    return parent != null && true && true;
  }
  @Override public java.lang.String checkAssignment(Object value) {
    return (java.lang.String) value;
  }
  @Override public Class getEditedType() { return java.lang.String.class; }
  @Override public java.lang.String getFromModel() {
    return (parent != null && true) ? parent.getAssignee1Role() : null;
  }
  @Override public void setInModel(java.lang.String data) {
    parent.setAssignee1Role(data);
  }
}
