package com.anova.anovacloud.client.application.matterAction;

public class MatterActionDetailView_DriverImpl extends com.google.gwt.editor.client.impl.AbstractSimpleBeanEditorDriver<com.anova.anovacloud.shared.dto.MatterActionDto, com.anova.anovacloud.client.application.matterAction.MatterActionDetailView> implements com.anova.anovacloud.client.application.matterAction.MatterActionDetailView.Driver {
  @Override public void accept(com.google.gwt.editor.client.EditorVisitor visitor) {
    com.google.gwt.editor.client.impl.RootEditorContext ctx = new com.google.gwt.editor.client.impl.RootEditorContext(getDelegate(), com.anova.anovacloud.shared.dto.MatterActionDto.class, getObject());
    ctx.traverse(visitor, getDelegate());
  }
  @Override protected com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate createDelegate() {
    return new com.anova.anovacloud.client.application.matterAction.MatterActionDetailView_SimpleBeanEditorDelegate();
  }
}
