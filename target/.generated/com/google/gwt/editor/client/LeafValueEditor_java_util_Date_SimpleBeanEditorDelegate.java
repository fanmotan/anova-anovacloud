package com.google.gwt.editor.client;

public class LeafValueEditor_java_util_Date_SimpleBeanEditorDelegate extends com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate {
  private com.google.gwt.editor.client.LeafValueEditor editor;
  @Override protected com.google.gwt.editor.client.LeafValueEditor getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(com.google.gwt.editor.client.LeafValueEditor)editor;}
  private java.util.Date object;
  @Override public java.util.Date getObject() {return object;}
  @Override protected void setObject(Object object) {this.object=(java.util.Date)object;}
  @Override protected void initializeSubDelegates() {
  }
  @Override public void accept(com.google.gwt.editor.client.EditorVisitor visitor) {
  }
}
