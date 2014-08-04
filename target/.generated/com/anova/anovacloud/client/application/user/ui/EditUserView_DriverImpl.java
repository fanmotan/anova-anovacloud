package com.anova.anovacloud.client.application.user.ui;

public class EditUserView_DriverImpl extends com.google.gwt.editor.client.impl.AbstractSimpleBeanEditorDriver<com.anova.anovacloud.shared.dto.UserDto, com.anova.anovacloud.client.application.user.ui.EditUserView> implements com.anova.anovacloud.client.application.user.ui.EditUserView.Driver {
  @Override public void accept(com.google.gwt.editor.client.EditorVisitor visitor) {
    com.google.gwt.editor.client.impl.RootEditorContext ctx = new com.google.gwt.editor.client.impl.RootEditorContext(getDelegate(), com.anova.anovacloud.shared.dto.UserDto.class, getObject());
    ctx.traverse(visitor, getDelegate());
  }
  @Override protected com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate createDelegate() {
    return new com.anova.anovacloud.client.application.user.ui.EditUserView_SimpleBeanEditorDelegate();
  }
}
