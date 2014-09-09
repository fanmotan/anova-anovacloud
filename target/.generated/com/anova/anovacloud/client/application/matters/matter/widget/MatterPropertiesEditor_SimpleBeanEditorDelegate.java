package com.anova.anovacloud.client.application.matters.matter.widget;

public class MatterPropertiesEditor_SimpleBeanEditorDelegate extends com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate {
  private com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor editor;
  @Override protected com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor)editor;}
  private com.anova.anovacloud.shared.dto.MatterPropertiesDto object;
  @Override public com.anova.anovacloud.shared.dto.MatterPropertiesDto getObject() {return object;}
  @Override protected void setObject(Object object) {this.object=(com.anova.anovacloud.shared.dto.MatterPropertiesDto)object;}
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate caseTitleDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate applicationNumDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate patentNumDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate pubNumDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate assigneeDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate assignmentRecordDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate remarksDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate priorityDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate patentTermAdjDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate countryDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate parentPCTNumDelegate;
  @Override protected void initializeSubDelegates() {
    if (editor.caseTitle.asEditor() != null) {
      caseTitleDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(caseTitleDelegate, appendPath("caseTitle"), editor.caseTitle.asEditor());
    }
    if (editor.applicationNum.asEditor() != null) {
      applicationNumDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(applicationNumDelegate, appendPath("applicationNum"), editor.applicationNum.asEditor());
    }
    if (editor.patentNum.asEditor() != null) {
      patentNumDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(patentNumDelegate, appendPath("patentNum"), editor.patentNum.asEditor());
    }
    if (editor.pubNum.asEditor() != null) {
      pubNumDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(pubNumDelegate, appendPath("pubNum"), editor.pubNum.asEditor());
    }
    if (editor.assignee.asEditor() != null) {
      assigneeDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(assigneeDelegate, appendPath("assignee"), editor.assignee.asEditor());
    }
    if (editor.assignmentRecord.asEditor() != null) {
      assignmentRecordDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(assignmentRecordDelegate, appendPath("assignmentRecord"), editor.assignmentRecord.asEditor());
    }
    if (editor.remarks.asEditor() != null) {
      remarksDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(remarksDelegate, appendPath("remarks"), editor.remarks.asEditor());
    }
    if (editor.priority.asEditor() != null) {
      priorityDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(priorityDelegate, appendPath("priority"), editor.priority.asEditor());
    }
    if (editor.patentTermAdj.asEditor() != null) {
      patentTermAdjDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(patentTermAdjDelegate, appendPath("patentTermAdj"), editor.patentTermAdj.asEditor());
    }
    if (editor.country.asEditor() != null) {
      countryDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(countryDelegate, appendPath("country"), editor.country.asEditor());
    }
    if (editor.parentPCTNum.asEditor() != null) {
      parentPCTNumDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(parentPCTNumDelegate, appendPath("parentPCTNum"), editor.parentPCTNum.asEditor());
    }
  }
  @Override public void accept(com.google.gwt.editor.client.EditorVisitor visitor) {
    if (caseTitleDelegate != null) 
    {
      com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_caseTitle_Context ctx = new com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_caseTitle_Context(getObject(), editor.caseTitle.asEditor(), appendPath("caseTitle"));
      ctx.setEditorDelegate(caseTitleDelegate);
      ctx.traverse(visitor, caseTitleDelegate);
    }
    if (applicationNumDelegate != null) 
    {
      com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_applicationNum_Context ctx = new com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_applicationNum_Context(getObject(), editor.applicationNum.asEditor(), appendPath("applicationNum"));
      ctx.setEditorDelegate(applicationNumDelegate);
      ctx.traverse(visitor, applicationNumDelegate);
    }
    if (patentNumDelegate != null) 
    {
      com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_patentNum_Context ctx = new com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_patentNum_Context(getObject(), editor.patentNum.asEditor(), appendPath("patentNum"));
      ctx.setEditorDelegate(patentNumDelegate);
      ctx.traverse(visitor, patentNumDelegate);
    }
    if (pubNumDelegate != null) 
    {
      com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_pubNum_Context ctx = new com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_pubNum_Context(getObject(), editor.pubNum.asEditor(), appendPath("pubNum"));
      ctx.setEditorDelegate(pubNumDelegate);
      ctx.traverse(visitor, pubNumDelegate);
    }
    if (assigneeDelegate != null) 
    {
      com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_assignee_Context ctx = new com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_assignee_Context(getObject(), editor.assignee.asEditor(), appendPath("assignee"));
      ctx.setEditorDelegate(assigneeDelegate);
      ctx.traverse(visitor, assigneeDelegate);
    }
    if (assignmentRecordDelegate != null) 
    {
      com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_assignmentRecord_Context ctx = new com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_assignmentRecord_Context(getObject(), editor.assignmentRecord.asEditor(), appendPath("assignmentRecord"));
      ctx.setEditorDelegate(assignmentRecordDelegate);
      ctx.traverse(visitor, assignmentRecordDelegate);
    }
    if (remarksDelegate != null) 
    {
      com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_remarks_Context ctx = new com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_remarks_Context(getObject(), editor.remarks.asEditor(), appendPath("remarks"));
      ctx.setEditorDelegate(remarksDelegate);
      ctx.traverse(visitor, remarksDelegate);
    }
    if (priorityDelegate != null) 
    {
      com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_priority_Context ctx = new com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_priority_Context(getObject(), editor.priority.asEditor(), appendPath("priority"));
      ctx.setEditorDelegate(priorityDelegate);
      ctx.traverse(visitor, priorityDelegate);
    }
    if (patentTermAdjDelegate != null) 
    {
      com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_patentTermAdj_Context ctx = new com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_patentTermAdj_Context(getObject(), editor.patentTermAdj.asEditor(), appendPath("patentTermAdj"));
      ctx.setEditorDelegate(patentTermAdjDelegate);
      ctx.traverse(visitor, patentTermAdjDelegate);
    }
    if (countryDelegate != null) 
    {
      com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_country_Context ctx = new com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_country_Context(getObject(), editor.country.asEditor(), appendPath("country"));
      ctx.setEditorDelegate(countryDelegate);
      ctx.traverse(visitor, countryDelegate);
    }
    {
      com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_fileDate_Context ctx = new com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_fileDate_Context(getObject(), editor.fileDate.asEditor(), appendPath("fileDate"));
      ctx.traverse(visitor, null);
    }
    {
      com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_issueDate_Context ctx = new com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_issueDate_Context(getObject(), editor.issueDate.asEditor(), appendPath("issueDate"));
      ctx.traverse(visitor, null);
    }
    {
      com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_expriationDate_Context ctx = new com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_expriationDate_Context(getObject(), editor.expriationDate.asEditor(), appendPath("expriationDate"));
      ctx.traverse(visitor, null);
    }
    {
      com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_pubDate_Context ctx = new com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_pubDate_Context(getObject(), editor.pubDate.asEditor(), appendPath("pubDate"));
      ctx.traverse(visitor, null);
    }
    if (parentPCTNumDelegate != null) 
    {
      com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_parentPCTNum_Context ctx = new com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_parentPCTNum_Context(getObject(), editor.parentPCTNum.asEditor(), appendPath("parentPCTNum"));
      ctx.setEditorDelegate(parentPCTNumDelegate);
      ctx.traverse(visitor, parentPCTNumDelegate);
    }
    {
      com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_pctDate_Context ctx = new com.anova.anovacloud.client.application.matters.matter.widget.MatterPropertiesEditor_pctDate_Context(getObject(), editor.pctDate.asEditor(), appendPath("pctDate"));
      ctx.traverse(visitor, null);
    }
  }
}
