package com.anova.anovacloud.client.application.matterAction.ui;

public class EditMatterActionView_matter_Context extends com.google.gwt.editor.client.impl.AbstractEditorContext<com.anova.anovacloud.shared.dto.MatterDto> {
  private final com.anova.anovacloud.shared.dto.MatterActionDto parent;
  public EditMatterActionView_matter_Context(com.anova.anovacloud.shared.dto.MatterActionDto parent, com.google.gwt.editor.client.Editor<com.anova.anovacloud.shared.dto.MatterDto> editor, String path) {
    super(editor,path);
    this.parent = parent;
  }
  @Override public boolean canSetInModel() {
    return parent != null && true && true;
  }
  @Override public com.anova.anovacloud.shared.dto.MatterDto checkAssignment(Object value) {
    return (com.anova.anovacloud.shared.dto.MatterDto) value;
  }
  @Override public Class getEditedType() { return com.anova.anovacloud.shared.dto.MatterDto.class; }
  @Override public com.anova.anovacloud.shared.dto.MatterDto getFromModel() {
    return (parent != null && true) ? parent.getMatter() : null;
  }
  @Override public void setInModel(com.anova.anovacloud.shared.dto.MatterDto data) {
    parent.setMatter(data);
  }
}
