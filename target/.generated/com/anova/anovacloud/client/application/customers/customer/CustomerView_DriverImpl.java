package com.anova.anovacloud.client.application.customers.customer;

public class CustomerView_DriverImpl extends com.google.gwt.editor.client.impl.AbstractSimpleBeanEditorDriver<com.anova.anovacloud.shared.dto.CustomerDto, com.anova.anovacloud.client.application.customers.customer.CustomerView> implements com.anova.anovacloud.client.application.customers.customer.CustomerView.Driver {
  @Override public void accept(com.google.gwt.editor.client.EditorVisitor visitor) {
    com.google.gwt.editor.client.impl.RootEditorContext ctx = new com.google.gwt.editor.client.impl.RootEditorContext(getDelegate(), com.anova.anovacloud.shared.dto.CustomerDto.class, getObject());
    ctx.traverse(visitor, getDelegate());
  }
  @Override protected com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate createDelegate() {
    return new com.anova.anovacloud.client.application.customers.customer.CustomerView_SimpleBeanEditorDelegate();
  }
}
