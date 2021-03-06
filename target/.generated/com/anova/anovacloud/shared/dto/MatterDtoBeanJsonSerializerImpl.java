package com.anova.anovacloud.shared.dto;

public class MatterDtoBeanJsonSerializerImpl extends com.github.nmorel.gwtjackson.client.ser.bean.AbstractBeanJsonSerializer<com.anova.anovacloud.shared.dto.MatterDto> {
  
  public MatterDtoBeanJsonSerializerImpl() {}
  
  @Override
  protected java.util.Map<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterDto, ?>> initSerializers() {
    java.util.Map<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterDto, ?>> map = new java.util.LinkedHashMap<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterDto, ?>>(6);
    
    map.put("customer", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterDto, com.anova.anovacloud.shared.dto.CustomerDto>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return new com.anova.anovacloud.shared.dto.CustomerDtoBeanJsonSerializerImpl();
      }
      
      @Override
      public com.anova.anovacloud.shared.dto.CustomerDto getValue(com.anova.anovacloud.shared.dto.MatterDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getCustomer();
      }
    });
    
    map.put("caseNum", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.MatterDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getCaseNum();
      }
    });
    
    map.put("clientRef", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.MatterDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getClientRef();
      }
    });
    
    map.put("caseStatus", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterDto, com.anova.anovacloud.shared.dto.CaseStatusDto>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return new com.anova.anovacloud.shared.dto.CaseStatusDtoBeanJsonSerializerImpl();
      }
      
      @Override
      public com.anova.anovacloud.shared.dto.CaseStatusDto getValue(com.anova.anovacloud.shared.dto.MatterDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getCaseStatus();
      }
    });
    
    map.put("matterProperties", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterDto, com.anova.anovacloud.shared.dto.MatterPropertiesDto>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return new com.anova.anovacloud.shared.dto.MatterPropertiesDtoBeanJsonSerializerImpl();
      }
      
      @Override
      public com.anova.anovacloud.shared.dto.MatterPropertiesDto getValue(com.anova.anovacloud.shared.dto.MatterDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getMatterProperties();
      }
    });
    
    map.put("id", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterDto, java.lang.Long>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.BaseNumberJsonSerializer.LongJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.Long getValue(com.anova.anovacloud.shared.dto.MatterDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getId();
      }
    });
    
    return map;
  }
  
  @Override
  public java.lang.Class getSerializedType() {
    return com.anova.anovacloud.shared.dto.MatterDto.class;
  }
  
}
