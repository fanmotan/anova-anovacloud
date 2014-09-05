package com.anova.anovacloud.shared.dto;

public class AttorneyDtoBeanJsonSerializerImpl extends com.github.nmorel.gwtjackson.client.ser.bean.AbstractBeanJsonSerializer<com.anova.anovacloud.shared.dto.AttorneyDto> {
  
  public AttorneyDtoBeanJsonSerializerImpl() {}
  
  @Override
  protected java.util.Map<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.AttorneyDto, ?>> initSerializers() {
    java.util.Map<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.AttorneyDto, ?>> map = new java.util.LinkedHashMap<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.AttorneyDto, ?>>(9);
    
    map.put("displayName", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.AttorneyDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.AttorneyDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getDisplayName();
      }
    });
    
    map.put("firstName", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.AttorneyDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.AttorneyDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getFirstName();
      }
    });
    
    map.put("lastName", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.AttorneyDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.AttorneyDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getLastName();
      }
    });
    
    map.put("mailAddress", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.AttorneyDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.AttorneyDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getMailAddress();
      }
    });
    
    map.put("email", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.AttorneyDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.AttorneyDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getEmail();
      }
    });
    
    map.put("phone", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.AttorneyDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.AttorneyDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getPhone();
      }
    });
    
    map.put("fax", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.AttorneyDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.AttorneyDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getFax();
      }
    });
    
    map.put("attorneyStatus", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.AttorneyDto, com.anova.anovacloud.shared.dto.AttorneyStatusDto>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return new com.anova.anovacloud.shared.dto.AttorneyStatusDtoBeanJsonSerializerImpl();
      }
      
      @Override
      public com.anova.anovacloud.shared.dto.AttorneyStatusDto getValue(com.anova.anovacloud.shared.dto.AttorneyDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getAttorneyStatus();
      }
    });
    
    map.put("id", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.AttorneyDto, java.lang.Long>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.BaseNumberJsonSerializer.LongJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.Long getValue(com.anova.anovacloud.shared.dto.AttorneyDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getId();
      }
    });
    
    return map;
  }
  
  @Override
  public java.lang.Class getSerializedType() {
    return com.anova.anovacloud.shared.dto.AttorneyDto.class;
  }
  
}
