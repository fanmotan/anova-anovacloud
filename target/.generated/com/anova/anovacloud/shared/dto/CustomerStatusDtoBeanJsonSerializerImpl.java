package com.anova.anovacloud.shared.dto;

public class CustomerStatusDtoBeanJsonSerializerImpl extends com.github.nmorel.gwtjackson.client.ser.bean.AbstractBeanJsonSerializer<com.anova.anovacloud.shared.dto.CustomerStatusDto> {
  
  public CustomerStatusDtoBeanJsonSerializerImpl() {}
  
  @Override
  protected java.util.Map<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.CustomerStatusDto, ?>> initSerializers() {
    java.util.Map<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.CustomerStatusDto, ?>> map = new java.util.LinkedHashMap<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.CustomerStatusDto, ?>>(3);
    
    map.put("statusName", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.CustomerStatusDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.CustomerStatusDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getStatusName();
      }
    });
    
    map.put("statusValue", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.CustomerStatusDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.CustomerStatusDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getStatusValue();
      }
    });
    
    map.put("id", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.CustomerStatusDto, java.lang.Long>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.BaseNumberJsonSerializer.LongJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.Long getValue(com.anova.anovacloud.shared.dto.CustomerStatusDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getId();
      }
    });
    
    return map;
  }
  
  @Override
  public java.lang.Class getSerializedType() {
    return com.anova.anovacloud.shared.dto.CustomerStatusDto.class;
  }
  
}
