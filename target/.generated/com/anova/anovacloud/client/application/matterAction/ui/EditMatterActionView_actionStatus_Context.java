package com.anova.anovacloud.client.application.matterAction.ui;

public class EditMatterActionView_actionStatus_Context extends com.google.gwt.editor.client.impl.AbstractEditorContext<com.anova.anovacloud.shared.dto.MatterActionStatusDto> {
  private final com.anova.anovacloud.shared.dto.MatterActionDto parent;
  public EditMatterActionView_actionStatus_Context(com.anova.anovacloud.shared.dto.MatterActionDto parent, com.google.gwt.editor.client.Editor<com.anova.anovacloud.shared.dto.MatterActionStatusDto> editor, String path) {
    super(editor,path);
    this.parent = parent;
  }
  @Override public boolean canSetInModel() {
    return parent != null && true && true;
  }
  @Override public com.anova.anovacloud.shared.dto.MatterActionStatusDto checkAssignment(Object value) {
    return (com.anova.anovacloud.shared.dto.MatterActionStatusDto) value;
  }
  @Override public Class getEditedType() { return com.anova.anovacloud.shared.dto.MatterActionStatusDto.class; }
  @Override public com.anova.anovacloud.shared.dto.MatterActionStatusDto getFromModel() {
    return (parent != null && true) ? parent.getActionStatus() : null;
  }
  @Override public void setInModel(com.anova.anovacloud.shared.dto.MatterActionStatusDto data) {
    parent.setActionStatus(data);
  }
}
