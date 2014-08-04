package com.anova.anovacloud.shared.dto;

public class CustomerRatingDtoBeanJsonSerializerImpl extends com.github.nmorel.gwtjackson.client.ser.bean.AbstractBeanJsonSerializer<com.anova.anovacloud.shared.dto.CustomerRatingDto> {
  
  public CustomerRatingDtoBeanJsonSerializerImpl() {}
  
  @Override
  protected java.util.Map<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.CustomerRatingDto, ?>> initSerializers() {
    java.util.Map<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.CustomerRatingDto, ?>> map = new java.util.LinkedHashMap<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.CustomerRatingDto, ?>>(2);
    
    map.put("customer", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.CustomerRatingDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.CustomerRatingDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getCustomer();
      }
    });
    
    map.put("rating", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.CustomerRatingDto, java.lang.Double>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.BaseNumberJsonSerializer.DoubleJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.Double getValue(com.anova.anovacloud.shared.dto.CustomerRatingDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getRating();
      }
    });
    
    return map;
  }
  
  @Override
  public java.lang.Class getSerializedType() {
    return com.anova.anovacloud.shared.dto.CustomerRatingDto.class;
  }
  
}
