package com.anova.anovacloud.client.application.matterAction;

public class MatterActionDetailView_assignee2_Context extends com.google.gwt.editor.client.impl.AbstractEditorContext<com.anova.anovacloud.shared.dto.AttorneyDto> {
  private final com.anova.anovacloud.shared.dto.MatterActionDto parent;
  public MatterActionDetailView_assignee2_Context(com.anova.anovacloud.shared.dto.MatterActionDto parent, com.google.gwt.editor.client.Editor<com.anova.anovacloud.shared.dto.AttorneyDto> editor, String path) {
    super(editor,path);
    this.parent = parent;
  }
  @Override public boolean canSetInModel() {
    return parent != null && true && true;
  }
  @Override public com.anova.anovacloud.shared.dto.AttorneyDto checkAssignment(Object value) {
    return (com.anova.anovacloud.shared.dto.AttorneyDto) value;
  }
  @Override public Class getEditedType() { return com.anova.anovacloud.shared.dto.AttorneyDto.class; }
  @Override public com.anova.anovacloud.shared.dto.AttorneyDto getFromModel() {
    return (parent != null && true) ? parent.getAssignee2() : null;
  }
  @Override public void setInModel(com.anova.anovacloud.shared.dto.AttorneyDto data) {
    parent.setAssignee2(data);
  }
}
