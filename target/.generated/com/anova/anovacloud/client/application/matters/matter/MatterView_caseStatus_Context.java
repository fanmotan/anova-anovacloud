package com.anova.anovacloud.client.application.matters.matter;

public class MatterView_caseStatus_Context extends com.google.gwt.editor.client.impl.AbstractEditorContext<com.anova.anovacloud.shared.dto.CaseStatusDto> {
  private final com.anova.anovacloud.shared.dto.MatterDto parent;
  public MatterView_caseStatus_Context(com.anova.anovacloud.shared.dto.MatterDto parent, com.google.gwt.editor.client.Editor<com.anova.anovacloud.shared.dto.CaseStatusDto> editor, String path) {
    super(editor,path);
    this.parent = parent;
  }
  @Override public boolean canSetInModel() {
    return parent != null && true && true;
  }
  @Override public com.anova.anovacloud.shared.dto.CaseStatusDto checkAssignment(Object value) {
    return (com.anova.anovacloud.shared.dto.CaseStatusDto) value;
  }
  @Override public Class getEditedType() { return com.anova.anovacloud.shared.dto.CaseStatusDto.class; }
  @Override public com.anova.anovacloud.shared.dto.CaseStatusDto getFromModel() {
    return (parent != null && true) ? parent.getCaseStatus() : null;
  }
  @Override public void setInModel(com.anova.anovacloud.shared.dto.CaseStatusDto data) {
    parent.setCaseStatus(data);
  }
}
