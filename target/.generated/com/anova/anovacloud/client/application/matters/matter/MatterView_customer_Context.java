package com.anova.anovacloud.client.application.matters.matter;

public class MatterView_customer_Context extends com.google.gwt.editor.client.impl.AbstractEditorContext<com.anova.anovacloud.shared.dto.CustomerDto> {
  private final com.anova.anovacloud.shared.dto.MatterDto parent;
  public MatterView_customer_Context(com.anova.anovacloud.shared.dto.MatterDto parent, com.google.gwt.editor.client.Editor<com.anova.anovacloud.shared.dto.CustomerDto> editor, String path) {
    super(editor,path);
    this.parent = parent;
  }
  @Override public boolean canSetInModel() {
    return parent != null && true && true;
  }
  @Override public com.anova.anovacloud.shared.dto.CustomerDto checkAssignment(Object value) {
    return (com.anova.anovacloud.shared.dto.CustomerDto) value;
  }
  @Override public Class getEditedType() { return com.anova.anovacloud.shared.dto.CustomerDto.class; }
  @Override public com.anova.anovacloud.shared.dto.CustomerDto getFromModel() {
    return (parent != null && true) ? parent.getCustomer() : null;
  }
  @Override public void setInModel(com.anova.anovacloud.shared.dto.CustomerDto data) {
    parent.setCustomer(data);
  }
}
