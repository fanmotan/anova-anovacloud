package com.anova.anovacloud.client.application.rating;

public class RatingDetailView_DriverImpl extends com.google.gwt.editor.client.impl.AbstractSimpleBeanEditorDriver<com.anova.anovacloud.shared.dto.RatingDto, com.anova.anovacloud.client.application.rating.RatingDetailView> implements com.anova.anovacloud.client.application.rating.RatingDetailView.Driver {
  @Override public void accept(com.google.gwt.editor.client.EditorVisitor visitor) {
    com.google.gwt.editor.client.impl.RootEditorContext ctx = new com.google.gwt.editor.client.impl.RootEditorContext(getDelegate(), com.anova.anovacloud.shared.dto.RatingDto.class, getObject());
    ctx.traverse(visitor, getDelegate());
  }
  @Override protected com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate createDelegate() {
    return new com.anova.anovacloud.client.application.rating.RatingDetailView_SimpleBeanEditorDelegate();
  }
}
