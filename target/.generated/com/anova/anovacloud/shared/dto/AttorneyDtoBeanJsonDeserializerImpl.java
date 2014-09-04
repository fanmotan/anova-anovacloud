package com.anova.anovacloud.shared.dto;

public class AttorneyDtoBeanJsonDeserializerImpl extends com.github.nmorel.gwtjackson.client.deser.bean.AbstractBeanJsonDeserializer<com.anova.anovacloud.shared.dto.AttorneyDto> {
  
  public AttorneyDtoBeanJsonDeserializerImpl() {}
  
  @Override
  protected com.github.nmorel.gwtjackson.client.deser.bean.InstanceBuilder<com.anova.anovacloud.shared.dto.AttorneyDto> initInstanceBuilder() {
    return new com.github.nmorel.gwtjackson.client.deser.bean.InstanceBuilder<com.anova.anovacloud.shared.dto.AttorneyDto>() {
      @Override
      public com.github.nmorel.gwtjackson.client.deser.bean.Instance<com.anova.anovacloud.shared.dto.AttorneyDto> newInstance( com.github.nmorel.gwtjackson.client.stream.JsonReader reader, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx, java.util.Map<String, String> bufferedProperties ) {
        return new com.github.nmorel.gwtjackson.client.deser.bean.Instance<com.anova.anovacloud.shared.dto.AttorneyDto>(create(), bufferedProperties);
      }
      
      private com.anova.anovacloud.shared.dto.AttorneyDto create() {
        return new com.anova.anovacloud.shared.dto.AttorneyDto();
      }
    };
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.deser.bean.SimpleStringMap<com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.AttorneyDto, ?>> initDeserializers() {
    com.github.nmorel.gwtjackson.client.deser.bean.SimpleStringMap<com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.AttorneyDto, ?>> map = com.github.nmorel.gwtjackson.client.deser.bean.SimpleStringMap.createObject().cast();
    
    map.put("displayName", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.AttorneyDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.AttorneyDto bean, java.lang.String value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setDisplayName(value);
      }
    });
    
    map.put("firstName", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.AttorneyDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.AttorneyDto bean, java.lang.String value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setFirstName(value);
      }
    });
    
    map.put("lastName", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.AttorneyDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.AttorneyDto bean, java.lang.String value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setLastName(value);
      }
    });
    
    map.put("mailAddress", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.AttorneyDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.AttorneyDto bean, java.lang.String value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setMailAddress(value);
      }
    });
    
    map.put("email", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.AttorneyDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.AttorneyDto bean, java.lang.String value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setEmail(value);
      }
    });
    
    map.put("phone", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.AttorneyDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.AttorneyDto bean, java.lang.String value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setPhone(value);
      }
    });
    
    map.put("fax", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.AttorneyDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.AttorneyDto bean, java.lang.String value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setFax(value);
      }
    });
    
    map.put("id", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.AttorneyDto, java.lang.Long>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.BaseNumberJsonDeserializer.LongJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.AttorneyDto bean, java.lang.Long value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setId(value);
      }
    });
    
    return map;
  }
  
  @Override
  protected java.util.Set<java.lang.String> initIgnoredProperties() {
    java.util.HashSet<java.lang.String> col = new java.util.HashSet<java.lang.String>(1);
    col.add("saved");
    return col;
  }
  
  
  @Override
  public java.lang.Class getDeserializedType() {
    return com.anova.anovacloud.shared.dto.AttorneyDto.class;
  }
  
}
