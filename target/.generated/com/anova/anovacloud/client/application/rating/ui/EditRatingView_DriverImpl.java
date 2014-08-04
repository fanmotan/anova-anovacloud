package com.anova.anovacloud.client.application.rating.ui;

public class EditRatingView_DriverImpl extends com.google.gwt.editor.client.impl.AbstractSimpleBeanEditorDriver<com.anova.anovacloud.shared.dto.RatingDto, com.anova.anovacloud.client.application.rating.ui.EditRatingView> implements com.anova.anovacloud.client.application.rating.ui.EditRatingView.Driver {
  @Override public void accept(com.google.gwt.editor.client.EditorVisitor visitor) {
    com.google.gwt.editor.client.impl.RootEditorContext ctx = new com.google.gwt.editor.client.impl.RootEditorContext(getDelegate(), com.anova.anovacloud.shared.dto.RatingDto.class, getObject());
    ctx.traverse(visitor, getDelegate());
  }
  @Override protected com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate createDelegate() {
    return new com.anova.anovacloud.client.application.rating.ui.EditRatingView_SimpleBeanEditorDelegate();
  }
}
