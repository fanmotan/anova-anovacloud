package com.anova.anovacloud.client.application.user;

public class UserDetailView_userRole_Context extends com.google.gwt.editor.client.impl.AbstractEditorContext<com.anova.anovacloud.shared.dto.UserRoleDto> {
  private final com.anova.anovacloud.shared.dto.UserDto parent;
  public UserDetailView_userRole_Context(com.anova.anovacloud.shared.dto.UserDto parent, com.google.gwt.editor.client.Editor<com.anova.anovacloud.shared.dto.UserRoleDto> editor, String path) {
    super(editor,path);
    this.parent = parent;
  }
  @Override public boolean canSetInModel() {
    return parent != null && true && true;
  }
  @Override public com.anova.anovacloud.shared.dto.UserRoleDto checkAssignment(Object value) {
    return (com.anova.anovacloud.shared.dto.UserRoleDto) value;
  }
  @Override public Class getEditedType() { return com.anova.anovacloud.shared.dto.UserRoleDto.class; }
  @Override public com.anova.anovacloud.shared.dto.UserRoleDto getFromModel() {
    return (parent != null && true) ? parent.getUserRole() : null;
  }
  @Override public void setInModel(com.anova.anovacloud.shared.dto.UserRoleDto data) {
    parent.setUserRole(data);
  }
}
