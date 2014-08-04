package com.anova.anovacloud.client.application.rating;

public class RatingDetailView_SimpleBeanEditorDelegate extends com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate {
  private com.anova.anovacloud.client.application.rating.RatingDetailView editor;
  @Override protected com.anova.anovacloud.client.application.rating.RatingDetailView getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(com.anova.anovacloud.client.application.rating.RatingDetailView)editor;}
  private com.anova.anovacloud.shared.dto.RatingDto object;
  @Override public com.anova.anovacloud.shared.dto.RatingDto getObject() {return object;}
  @Override protected void setObject(Object object) {this.object=(com.anova.anovacloud.shared.dto.RatingDto)object;}
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate ratingDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate matterDelegate;
  @Override protected void initializeSubDelegates() {
    if (editor.rating.asEditor() != null) {
      ratingDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_Integer_SimpleBeanEditorDelegate();
      addSubDelegate(ratingDelegate, appendPath("rating"), editor.rating.asEditor());
    }
    if (editor.matter.asEditor() != null) {
      matterDelegate = new com.google.gwt.editor.client.adapters.TakesValueEditor_com_anova_anovacloud_shared_dto_MatterDto_SimpleBeanEditorDelegate();
      addSubDelegate(matterDelegate, appendPath("matter"), editor.matter.asEditor());
    }
  }
  @Override public void accept(com.google.gwt.editor.client.EditorVisitor visitor) {
    if (ratingDelegate != null) 
    {
      com.anova.anovacloud.client.application.rating.RatingDetailView_rating_Context ctx = new com.anova.anovacloud.client.application.rating.RatingDetailView_rating_Context(getObject(), editor.rating.asEditor(), appendPath("rating"));
      ctx.setEditorDelegate(ratingDelegate);
      ctx.traverse(visitor, ratingDelegate);
    }
    if (matterDelegate != null) 
    {
      com.anova.anovacloud.client.application.rating.RatingDetailView_matter_Context ctx = new com.anova.anovacloud.client.application.rating.RatingDetailView_matter_Context(getObject(), editor.matter.asEditor(), appendPath("matter"));
      ctx.setEditorDelegate(matterDelegate);
      ctx.traverse(visitor, matterDelegate);
    }
  }
}
