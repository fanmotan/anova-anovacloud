package com.anova.anovacloud.shared.dispatch;

public class LogInRequestBeanJsonSerializerImpl extends com.github.nmorel.gwtjackson.client.ser.bean.AbstractBeanJsonSerializer<com.anova.anovacloud.shared.dispatch.LogInRequest> {
  
  public LogInRequestBeanJsonSerializerImpl() {}
  
  @Override
  protected java.util.Map<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dispatch.LogInRequest, ?>> initSerializers() {
    java.util.Map<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dispatch.LogInRequest, ?>> map = new java.util.LinkedHashMap<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dispatch.LogInRequest, ?>>(4);
    
    map.put("username", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dispatch.LogInRequest, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dispatch.LogInRequest bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getUsername();
      }
    });
    
    map.put("password", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dispatch.LogInRequest, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dispatch.LogInRequest bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getPassword();
      }
    });
    
    map.put("actionType", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dispatch.LogInRequest, com.anova.anovacloud.shared.dto.ActionType>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.EnumJsonSerializer.<com.anova.anovacloud.shared.dto.ActionType>getInstance();
      }
      
      @Override
      public com.anova.anovacloud.shared.dto.ActionType getValue(com.anova.anovacloud.shared.dispatch.LogInRequest bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getActionType();
      }
    });
    
    map.put("loggedInCookie", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dispatch.LogInRequest, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dispatch.LogInRequest bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getLoggedInCookie();
      }
    });
    
    return map;
  }
  
  @Override
  public java.lang.Class getSerializedType() {
    return com.anova.anovacloud.shared.dispatch.LogInRequest.class;
  }
  
}
