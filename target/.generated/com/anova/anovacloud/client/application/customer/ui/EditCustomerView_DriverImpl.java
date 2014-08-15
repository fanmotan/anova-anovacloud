package com.anova.anovacloud.client.application.customer.ui;

public class EditCustomerView_DriverImpl extends com.google.gwt.editor.client.impl.AbstractSimpleBeanEditorDriver<com.anova.anovacloud.shared.dto.CustomerDto, com.anova.anovacloud.client.application.customer.ui.EditCustomerView> implements com.anova.anovacloud.client.application.customer.ui.EditCustomerView.Driver {
  @Override public void accept(com.google.gwt.editor.client.EditorVisitor visitor) {
    com.google.gwt.editor.client.impl.RootEditorContext ctx = new com.google.gwt.editor.client.impl.RootEditorContext(getDelegate(), com.anova.anovacloud.shared.dto.CustomerDto.class, getObject());
    ctx.traverse(visitor, getDelegate());
  }
  @Override protected com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate createDelegate() {
    return new com.anova.anovacloud.client.application.customer.ui.EditCustomerView_SimpleBeanEditorDelegate();
  }
}
