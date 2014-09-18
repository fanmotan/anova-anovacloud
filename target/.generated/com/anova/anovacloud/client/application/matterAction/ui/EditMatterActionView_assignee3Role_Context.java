package com.anova.anovacloud.client.application.matterAction.ui;

public class EditMatterActionView_assignee3Role_Context extends com.google.gwt.editor.client.impl.AbstractEditorContext<com.anova.anovacloud.shared.dto.AttorneyRoleDto> {
  private final com.anova.anovacloud.shared.dto.MatterActionDto parent;
  public EditMatterActionView_assignee3Role_Context(com.anova.anovacloud.shared.dto.MatterActionDto parent, com.google.gwt.editor.client.Editor<com.anova.anovacloud.shared.dto.AttorneyRoleDto> editor, String path) {
    super(editor,path);
    this.parent = parent;
  }
  @Override public boolean canSetInModel() {
    return parent != null && true && true;
  }
  @Override public com.anova.anovacloud.shared.dto.AttorneyRoleDto checkAssignment(Object value) {
    return (com.anova.anovacloud.shared.dto.AttorneyRoleDto) value;
  }
  @Override public Class getEditedType() { return com.anova.anovacloud.shared.dto.AttorneyRoleDto.class; }
  @Override public com.anova.anovacloud.shared.dto.AttorneyRoleDto getFromModel() {
    return (parent != null && true) ? parent.getAssignee3Role() : null;
  }
  @Override public void setInModel(com.anova.anovacloud.shared.dto.AttorneyRoleDto data) {
    parent.setAssignee3Role(data);
  }
}
