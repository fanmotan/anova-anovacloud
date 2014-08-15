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
    
    map.put("refNum", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.CustomerDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.CustomerDto bean, java.lang.String value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setRefNum(value);
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
    
    map.put("status", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.CustomerDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.CustomerDto bean, java.lang.String value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setStatus(value);
      }
    });
    
    map.put("matters", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.CustomerDto, java.util.List<com.anova.anovacloud.shared.dto.MatterDto>>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.collection.ListJsonDeserializer.newInstance(new com.anova.anovacloud.shared.dto.MatterDtoBeanJsonDeserializerImpl());
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.CustomerDto bean, java.util.List<com.anova.anovacloud.shared.dto.MatterDto> value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setMatters(value);
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
