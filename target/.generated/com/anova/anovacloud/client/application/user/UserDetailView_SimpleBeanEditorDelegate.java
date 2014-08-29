package com.anova.anovacloud.client.application.user;

public class UserDetailView_SimpleBeanEditorDelegate extends com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate {
  private com.anova.anovacloud.client.application.user.UserDetailView editor;
  @Override protected com.anova.anovacloud.client.application.user.UserDetailView getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(com.anova.anovacloud.client.application.user.UserDetailView)editor;}
  private com.anova.anovacloud.shared.dto.UserDto object;
  @Override public com.anova.anovacloud.shared.dto.UserDto getObject() {return object;}
  @Override protected void setObject(Object object) {this.object=(com.anova.anovacloud.shared.dto.UserDto)object;}
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate displayNameDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate firstNameDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate lastNameDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate usernameDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate hashPasswordDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate emailDelegate;
  com.google.gwt.editor.client.impl.SimpleBeanEditorDelegate userRoleDelegate;
  @Override protected void initializeSubDelegates() {
    if (editor.displayName.asEditor() != null) {
      displayNameDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(displayNameDelegate, appendPath("displayName"), editor.displayName.asEditor());
    }
    if (editor.firstName.asEditor() != null) {
      firstNameDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(firstNameDelegate, appendPath("firstName"), editor.firstName.asEditor());
    }
    if (editor.lastName.asEditor() != null) {
      lastNameDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(lastNameDelegate, appendPath("lastName"), editor.lastName.asEditor());
    }
    if (editor.username.asEditor() != null) {
      usernameDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(usernameDelegate, appendPath("username"), editor.username.asEditor());
    }
    if (editor.hashPassword.asEditor() != null) {
      hashPasswordDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(hashPasswordDelegate, appendPath("hashPassword"), editor.hashPassword.asEditor());
    }
    if (editor.email.asEditor() != null) {
      emailDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_SimpleBeanEditorDelegate();
      addSubDelegate(emailDelegate, appendPath("email"), editor.email.asEditor());
    }
    if (editor.userRole.asEditor() != null) {
      userRoleDelegate = new com.google.gwt.editor.client.adapters.TakesValueEditor_com_anova_anovacloud_shared_dto_UserRoleDto_SimpleBeanEditorDelegate();
      addSubDelegate(userRoleDelegate, appendPath("userRole"), editor.userRole.asEditor());
    }
  }
  @Override public void accept(com.google.gwt.editor.client.EditorVisitor visitor) {
    if (displayNameDelegate != null) 
    {
      com.anova.anovacloud.client.application.user.UserDetailView_displayName_Context ctx = new com.anova.anovacloud.client.application.user.UserDetailView_displayName_Context(getObject(), editor.displayName.asEditor(), appendPath("displayName"));
      ctx.setEditorDelegate(displayNameDelegate);
      ctx.traverse(visitor, displayNameDelegate);
    }
    if (firstNameDelegate != null) 
    {
      com.anova.anovacloud.client.application.user.UserDetailView_firstName_Context ctx = new com.anova.anovacloud.client.application.user.UserDetailView_firstName_Context(getObject(), editor.firstName.asEditor(), appendPath("firstName"));
      ctx.setEditorDelegate(firstNameDelegate);
      ctx.traverse(visitor, firstNameDelegate);
    }
    if (lastNameDelegate != null) 
    {
      com.anova.anovacloud.client.application.user.UserDetailView_lastName_Context ctx = new com.anova.anovacloud.client.application.user.UserDetailView_lastName_Context(getObject(), editor.lastName.asEditor(), appendPath("lastName"));
      ctx.setEditorDelegate(lastNameDelegate);
      ctx.traverse(visitor, lastNameDelegate);
    }
    if (usernameDelegate != null) 
    {
      com.anova.anovacloud.client.application.user.UserDetailView_username_Context ctx = new com.anova.anovacloud.client.application.user.UserDetailView_username_Context(getObject(), editor.username.asEditor(), appendPath("username"));
      ctx.setEditorDelegate(usernameDelegate);
      ctx.traverse(visitor, usernameDelegate);
    }
    if (hashPasswordDelegate != null) 
    {
      com.anova.anovacloud.client.application.user.UserDetailView_hashPassword_Context ctx = new com.anova.anovacloud.client.application.user.UserDetailView_hashPassword_Context(getObject(), editor.hashPassword.asEditor(), appendPath("hashPassword"));
      ctx.setEditorDelegate(hashPasswordDelegate);
      ctx.traverse(visitor, hashPasswordDelegate);
    }
    if (emailDelegate != null) 
    {
      com.anova.anovacloud.client.application.user.UserDetailView_email_Context ctx = new com.anova.anovacloud.client.application.user.UserDetailView_email_Context(getObject(), editor.email.asEditor(), appendPath("email"));
      ctx.setEditorDelegate(emailDelegate);
      ctx.traverse(visitor, emailDelegate);
    }
    if (userRoleDelegate != null) 
    {
      com.anova.anovacloud.client.application.user.UserDetailView_userRole_Context ctx = new com.anova.anovacloud.client.application.user.UserDetailView_userRole_Context(getObject(), editor.userRole.asEditor(), appendPath("userRole"));
      ctx.setEditorDelegate(userRoleDelegate);
      ctx.traverse(visitor, userRoleDelegate);
    }
  }
}
