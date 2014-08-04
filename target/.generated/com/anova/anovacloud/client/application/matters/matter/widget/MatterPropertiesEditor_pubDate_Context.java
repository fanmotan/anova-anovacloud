package com.anova.anovacloud.client.application.matters.matter.widget;

public class MatterPropertiesEditor_pubDate_Context extends com.google.gwt.editor.client.impl.AbstractEditorContext<java.util.Date> {
  private final com.anova.anovacloud.shared.dto.MatterPropertiesDto parent;
  public MatterPropertiesEditor_pubDate_Context(com.anova.anovacloud.shared.dto.MatterPropertiesDto parent, com.google.gwt.editor.client.Editor<java.util.Date> editor, String path) {
    super(editor,path);
    this.parent = parent;
  }
  @Override public boolean canSetInModel() {
    return parent != null && true && true;
  }
  @Override public java.util.Date checkAssignment(Object value) {
    return (java.util.Date) value;
  }
  @Override public Class getEditedType() { return java.util.Date.class; }
  @Override public java.util.Date getFromModel() {
    return (parent != null && true) ? parent.getPubDate() : null;
  }
  @Override public void setInModel(java.util.Date data) {
    parent.setPubDate(data);
  }
}
