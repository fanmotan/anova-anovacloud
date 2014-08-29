package com.anova.anovacloud.client.application.attorney.ui;

public class EditAttorneyView_DriverImpl extends com.google.gwt.editor.client.impl.AbstractSimpleBeanEditorDriver<com.anova.anovacloud.shared.dto.AttorneyDto, com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView> implements com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView.Driver {
  @Override public void accept(com.google.gwt.editor.client.EditorVisitor visitor) {
    com.google.gwt.editor.client.impl.RootEditorContext ctx = new com.google.gwt.editor.client.impl.RootEditorContext(getDelegate(), com.anova.anovacloud.shared.dto.AttorneyDto.class, getObject());
    ctx.traverse(visitor, getDelegate());
  }
  @Override protected com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate createDelegate() {
    return new com.anova.anovacloud.client.application.attorney.ui.EditAttorneyView_SimpleBeanEditorDelegate();
  }
}
