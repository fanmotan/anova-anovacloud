package com.anova.anovacloud.client.application.matters.matter;

public class MatterView_matterProperties_Context extends com.google.gwt.editor.client.impl.AbstractEditorContext<com.anova.anovacloud.shared.dto.MatterPropertiesDto> {
  private final com.anova.anovacloud.shared.dto.MatterDto parent;
  public MatterView_matterProperties_Context(com.anova.anovacloud.shared.dto.MatterDto parent, com.google.gwt.editor.client.Editor<com.anova.anovacloud.shared.dto.MatterPropertiesDto> editor, String path) {
    super(editor,path);
    this.parent = parent;
  }
  @Override public boolean canSetInModel() {
    return parent != null && true && true;
  }
  @Override public com.anova.anovacloud.shared.dto.MatterPropertiesDto checkAssignment(Object value) {
    return (com.anova.anovacloud.shared.dto.MatterPropertiesDto) value;
  }
  @Override public Class getEditedType() { return com.anova.anovacloud.shared.dto.MatterPropertiesDto.class; }
  @Override public com.anova.anovacloud.shared.dto.MatterPropertiesDto getFromModel() {
    return (parent != null && true) ? parent.getMatterProperties() : null;
  }
  @Override public void setInModel(com.anova.anovacloud.shared.dto.MatterPropertiesDto data) {
    parent.setMatterProperties(data);
  }
}
