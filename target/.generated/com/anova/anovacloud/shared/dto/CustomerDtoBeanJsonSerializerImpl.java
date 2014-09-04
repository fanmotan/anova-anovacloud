package com.anova.anovacloud.shared.dto;

public class CustomerDtoBeanJsonSerializerImpl extends com.github.nmorel.gwtjackson.client.ser.bean.AbstractBeanJsonSerializer<com.anova.anovacloud.shared.dto.CustomerDto> {
  
  public CustomerDtoBeanJsonSerializerImpl() {}
  
  @Override
  protected java.util.Map<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.CustomerDto, ?>> initSerializers() {
    java.util.Map<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.CustomerDto, ?>> map = new java.util.LinkedHashMap<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.CustomerDto, ?>>(8);
    
    map.put("name", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.CustomerDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.CustomerDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getName();
      }
    });
    
    map.put("code", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.CustomerDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.CustomerDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getCode();
      }
    });
    
    map.put("address", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.CustomerDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.CustomerDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getAddress();
      }
    });
    
    map.put("phone", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.CustomerDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.CustomerDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getPhone();
      }
    });
    
    map.put("email", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.CustomerDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.CustomerDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getEmail();
      }
    });
    
    map.put("fax", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.CustomerDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.CustomerDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getFax();
      }
    });
    
    map.put("customerStatus", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.CustomerDto, com.anova.anovacloud.shared.dto.CustomerStatusDto>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return new com.anova.anovacloud.shared.dto.CustomerStatusDtoBeanJsonSerializerImpl();
      }
      
      @Override
      public com.anova.anovacloud.shared.dto.CustomerStatusDto getValue(com.anova.anovacloud.shared.dto.CustomerDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getCustomerStatus();
      }
    });
    
    map.put("id", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.CustomerDto, java.lang.Long>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.BaseNumberJsonSerializer.LongJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.Long getValue(com.anova.anovacloud.shared.dto.CustomerDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getId();
      }
    });
    
    return map;
  }
  
  @Override
  public java.lang.Class getSerializedType() {
    return com.anova.anovacloud.shared.dto.CustomerDto.class;
  }
  
}
