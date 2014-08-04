package com.anova.anovacloud.client.application.rating.ui;

public class EditRatingView_rating_Context extends com.google.gwt.editor.client.impl.AbstractEditorContext<java.lang.Integer> {
  private final com.anova.anovacloud.shared.dto.RatingDto parent;
  public EditRatingView_rating_Context(com.anova.anovacloud.shared.dto.RatingDto parent, com.google.gwt.editor.client.Editor<java.lang.Integer> editor, String path) {
    super(editor,path);
    this.parent = parent;
  }
  @Override public boolean canSetInModel() {
    return parent != null && true && true;
  }
  @Override public java.lang.Integer checkAssignment(Object value) {
    return (java.lang.Integer) value;
  }
  @Override public Class getEditedType() { return java.lang.Integer.class; }
  @Override public java.lang.Integer getFromModel() {
    return (parent != null && true) ? parent.getRating() : null;
  }
  @Override public void setInModel(java.lang.Integer data) {
    parent.setRating(data);
  }
}
