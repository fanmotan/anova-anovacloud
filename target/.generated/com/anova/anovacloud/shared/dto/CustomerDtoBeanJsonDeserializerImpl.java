package com.anova.anovacloud.shared.dto;

public class CustomerDtoBeanJsonDeserializerImpl extends com.github.nmorel.gwtjackson.client.deser.bean.AbstractBeanJsonDeserializer<com.anova.anovacloud.shared.dto.CustomerDto> {
  
  public CustomerDtoBeanJsonDeserializerImpl() {}
  
  @Override
  protected com.github.nmorel.gwtjackson.client.deser.bean.InstanceBuilder<com.anova.anovacloud.shared.dto.CustomerDto> initInstanceBuilder() {
    return new com.github.nmorel.gwtjackson.client.deser.bean.InstanceBuilder<com.anova.anovacloud.shared.dto.CustomerDto>() {
      @Override
      public com.github.nmorel.gwtjackson.client.deser.bean.Instance<com.anova.anovacloud.shared.dto.CustomerDto> newInstance( com.github.nmorel.gwtjackson.client.stream.JsonReader reader, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx, java.util.Map<String, String> bufferedProperties ) {
        return new com.github.nmorel.gwtjackson.client.deser.bean.Instance<com.anova.anovacloud.shared.dto.CustomerDto>(create(), bufferedProperties);
      }
      
      private com.anova.anovacloud.shared.dto.CustomerDto create() {
        return new com.anova.anovacloud.shared.dto.CustomerDto();
      }
    };
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.deser.bean.SimpleStringMap<com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.CustomerDto, ?>> initDeserializers() {
    com.github.nmorel.gwtjackson.client.deser.bean.SimpleStringMap<com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.CustomerDto, ?>> map = com.github.nmorel.gwtjackson.client.deser.bean.SimpleStringMap.createObject().cast();
    
    map.put("name", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.CustomerDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.CustomerDto bean, java.lang.String value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setName(value);
      }
    });
    
    map.put("code", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.CustomerDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.CustomerDto bean, java.lang.String value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setCode(value);
      }
    });
    
    map.put("address", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.CustomerDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.CustomerDto bean, java.lang.String value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setAddress(value);
      }
    });
    
    map.put("phone", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.CustomerDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.CustomerDto bean, java.lang.String value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setPhone(value);
      }
    });
    
    map.put("email", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.CustomerDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.CustomerDto bean, java.lang.String value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setEmail(value);
      }
    });
    
    map.put("fax", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.CustomerDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.CustomerDto bean, java.lang.String value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setFax(value);
      }
    });
    
    map.put("customerStatus", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.CustomerDto, com.anova.anovacloud.shared.dto.CustomerStatusDto>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return new com.anova.anovacloud.shared.dto.CustomerStatusDtoBeanJsonDeserializerImpl();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.CustomerDto bean, com.anova.anovacloud.shared.dto.CustomerStatusDto value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setCustomerStatus(value);
      }
    });
    
    map.put("id", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.CustomerDto, java.lang.Long>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.BaseNumberJsonDeserializer.LongJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.CustomerDto bean, java.lang.Long value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
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
    return com.anova.anovacloud.shared.dto.CustomerDto.class;
  }
  
}
