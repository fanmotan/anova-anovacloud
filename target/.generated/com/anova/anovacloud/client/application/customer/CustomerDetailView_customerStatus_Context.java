package com.anova.anovacloud.client.application.customer;

public class CustomerDetailView_customerStatus_Context extends com.google.gwt.editor.client.impl.AbstractEditorContext<com.anova.anovacloud.shared.dto.CustomerStatusDto> {
  private final com.anova.anovacloud.shared.dto.CustomerDto parent;
  public CustomerDetailView_customerStatus_Context(com.anova.anovacloud.shared.dto.CustomerDto parent, com.google.gwt.editor.client.Editor<com.anova.anovacloud.shared.dto.CustomerStatusDto> editor, String path) {
    super(editor,path);
    this.parent = parent;
  }
  @Override public boolean canSetInModel() {
    return parent != null && true && true;
  }
  @Override public com.anova.anovacloud.shared.dto.CustomerStatusDto checkAssignment(Object value) {
    return (com.anova.anovacloud.shared.dto.CustomerStatusDto) value;
  }
  @Override public Class getEditedType() { return com.anova.anovacloud.shared.dto.CustomerStatusDto.class; }
  @Override public com.anova.anovacloud.shared.dto.CustomerStatusDto getFromModel() {
    return (parent != null && true) ? parent.getCustomerStatus() : null;
  }
  @Override public void setInModel(com.anova.anovacloud.shared.dto.CustomerStatusDto data) {
    parent.setCustomerStatus(data);
  }
}
