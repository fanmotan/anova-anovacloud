package com.anova.anovacloud.shared.dispatch;

public class LogInResultBeanJsonSerializerImpl extends com.github.nmorel.gwtjackson.client.ser.bean.AbstractBeanJsonSerializer<com.anova.anovacloud.shared.dispatch.LogInResult> {
  
  public LogInResultBeanJsonSerializerImpl() {}
  
  @Override
  protected java.util.Map<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dispatch.LogInResult, ?>> initSerializers() {
    java.util.Map<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dispatch.LogInResult, ?>> map = new java.util.LinkedHashMap<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dispatch.LogInResult, ?>>(3);
    
    map.put("actionType", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dispatch.LogInResult, com.anova.anovacloud.shared.dto.ActionType>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.EnumJsonSerializer.<com.anova.anovacloud.shared.dto.ActionType>getInstance();
      }
      
      @Override
      public com.anova.anovacloud.shared.dto.ActionType getValue(com.anova.anovacloud.shared.dispatch.LogInResult bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getActionType();
      }
    });
    
    map.put("currentUserDto", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dispatch.LogInResult, com.anova.anovacloud.shared.dto.CurrentUserDto>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return new com.anova.anovacloud.shared.dto.CurrentUserDtoBeanJsonSerializerImpl();
      }
      
      @Override
      public com.anova.anovacloud.shared.dto.CurrentUserDto getValue(com.anova.anovacloud.shared.dispatch.LogInResult bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getCurrentUserDto();
      }
    });
    
    map.put("loggedInCookie", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dispatch.LogInResult, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dispatch.LogInResult bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getLoggedInCookie();
      }
    });
    
    return map;
  }
  
  @Override
  public java.lang.Class getSerializedType() {
    return com.anova.anovacloud.shared.dispatch.LogInResult.class;
  }
  
}
