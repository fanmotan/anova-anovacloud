package com.anova.anovacloud.shared.dto;

public class UserRoleDtoBeanJsonDeserializerImpl extends com.github.nmorel.gwtjackson.client.deser.bean.AbstractBeanJsonDeserializer<com.anova.anovacloud.shared.dto.UserRoleDto> {
  
  public UserRoleDtoBeanJsonDeserializerImpl() {}
  
  @Override
  protected com.github.nmorel.gwtjackson.client.deser.bean.InstanceBuilder<com.anova.anovacloud.shared.dto.UserRoleDto> initInstanceBuilder() {
    return new com.github.nmorel.gwtjackson.client.deser.bean.InstanceBuilder<com.anova.anovacloud.shared.dto.UserRoleDto>() {
      @Override
      public com.github.nmorel.gwtjackson.client.deser.bean.Instance<com.anova.anovacloud.shared.dto.UserRoleDto> newInstance( com.github.nmorel.gwtjackson.client.stream.JsonReader reader, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx, java.util.Map<String, String> bufferedProperties ) {
        return new com.github.nmorel.gwtjackson.client.deser.bean.Instance<com.anova.anovacloud.shared.dto.UserRoleDto>(create(), bufferedProperties);
      }
      
      private com.anova.anovacloud.shared.dto.UserRoleDto create() {
        return new com.anova.anovacloud.shared.dto.UserRoleDto();
      }
    };
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.deser.bean.SimpleStringMap<com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.UserRoleDto, ?>> initDeserializers() {
    com.github.nmorel.gwtjackson.client.deser.bean.SimpleStringMap<com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.UserRoleDto, ?>> map = com.github.nmorel.gwtjackson.client.deser.bean.SimpleStringMap.createObject().cast();
    
    map.put("roleName", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.UserRoleDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.UserRoleDto bean, java.lang.String value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setRoleName(value);
      }
    });
    
    map.put("id", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.UserRoleDto, java.lang.Long>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.BaseNumberJsonDeserializer.LongJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.UserRoleDto bean, java.lang.Long value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
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
    return com.anova.anovacloud.shared.dto.UserRoleDto.class;
  }
  
}
