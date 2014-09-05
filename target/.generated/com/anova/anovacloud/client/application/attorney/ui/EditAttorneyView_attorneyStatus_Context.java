package com.anova.anovacloud.client.application.attorney.ui;

public class EditAttorneyView_attorneyStatus_Context extends com.google.gwt.editor.client.impl.AbstractEditorContext<com.anova.anovacloud.shared.dto.AttorneyStatusDto> {
  private final com.anova.anovacloud.shared.dto.AttorneyDto parent;
  public EditAttorneyView_attorneyStatus_Context(com.anova.anovacloud.shared.dto.AttorneyDto parent, com.google.gwt.editor.client.Editor<com.anova.anovacloud.shared.dto.AttorneyStatusDto> editor, String path) {
    super(editor,path);
    this.parent = parent;
  }
  @Override public boolean canSetInModel() {
    return parent != null && true && true;
  }
  @Override public com.anova.anovacloud.shared.dto.AttorneyStatusDto checkAssignment(Object value) {
    return (com.anova.anovacloud.shared.dto.AttorneyStatusDto) value;
  }
  @Override public Class getEditedType() { return com.anova.anovacloud.shared.dto.AttorneyStatusDto.class; }
  @Override public com.anova.anovacloud.shared.dto.AttorneyStatusDto getFromModel() {
    return (parent != null && true) ? parent.getAttorneyStatus() : null;
  }
  @Override public void setInModel(com.anova.anovacloud.shared.dto.AttorneyStatusDto data) {
    parent.setAttorneyStatus(data);
  }
}
