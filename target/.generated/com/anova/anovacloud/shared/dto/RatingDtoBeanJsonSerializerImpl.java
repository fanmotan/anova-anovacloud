package com.anova.anovacloud.shared.dto;

public class RatingDtoBeanJsonSerializerImpl extends com.github.nmorel.gwtjackson.client.ser.bean.AbstractBeanJsonSerializer<com.anova.anovacloud.shared.dto.RatingDto> {
  
  public RatingDtoBeanJsonSerializerImpl() {}
  
  @Override
  protected java.util.Map<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.RatingDto, ?>> initSerializers() {
    java.util.Map<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.RatingDto, ?>> map = new java.util.LinkedHashMap<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.RatingDto, ?>>(3);
    
    map.put("rating", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.RatingDto, java.lang.Integer>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.BaseNumberJsonSerializer.IntegerJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.Integer getValue(com.anova.anovacloud.shared.dto.RatingDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getRating();
      }
    });
    
    map.put("matter", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.RatingDto, com.anova.anovacloud.shared.dto.MatterDto>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return new com.anova.anovacloud.shared.dto.MatterDtoBeanJsonSerializerImpl();
      }
      
      @Override
      public com.anova.anovacloud.shared.dto.MatterDto getValue(com.anova.anovacloud.shared.dto.RatingDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getMatter();
      }
    });
    
    map.put("id", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.RatingDto, java.lang.Long>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.BaseNumberJsonSerializer.LongJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.Long getValue(com.anova.anovacloud.shared.dto.RatingDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getId();
      }
    });
    
    return map;
  }
  
  @Override
  public java.lang.Class getSerializedType() {
    return com.anova.anovacloud.shared.dto.RatingDto.class;
  }
  
}
