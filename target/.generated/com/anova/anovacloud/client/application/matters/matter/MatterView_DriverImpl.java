package com.anova.anovacloud.client.application.matters.matter;

public class MatterView_DriverImpl extends com.google.gwt.editor.client.impl.AbstractSimpleBeanEditorDriver<com.anova.anovacloud.shared.dto.MatterDto, com.anova.anovacloud.client.application.matters.matter.MatterView> implements com.anova.anovacloud.client.application.matters.matter.MatterView.Driver {
  @Override public void accept(com.google.gwt.editor.client.EditorVisitor visitor) {
    com.google.gwt.editor.client.impl.RootEditorContext ctx = new com.google.gwt.editor.client.impl.RootEditorContext(getDelegate(), com.anova.anovacloud.shared.dto.MatterDto.class, getObject());
    ctx.traverse(visitor, getDelegate());
  }
  @Override protected com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate createDelegate() {
    return new com.anova.anovacloud.client.application.matters.matter.MatterView_SimpleBeanEditorDelegate();
  }
}
