package com.anova.anovacloud.shared.dto;

public class CurrentUserDtoBeanJsonDeserializerImpl extends com.github.nmorel.gwtjackson.client.deser.bean.AbstractBeanJsonDeserializer<com.anova.anovacloud.shared.dto.CurrentUserDto> {
  
  public CurrentUserDtoBeanJsonDeserializerImpl() {}
  
  @Override
  protected com.github.nmorel.gwtjackson.client.deser.bean.InstanceBuilder<com.anova.anovacloud.shared.dto.CurrentUserDto> initInstanceBuilder() {
    return new com.github.nmorel.gwtjackson.client.deser.bean.InstanceBuilder<com.anova.anovacloud.shared.dto.CurrentUserDto>() {
      private final com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<java.lang.Boolean, com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.Boolean>> deserializer_loggedIn = new com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<java.lang.Boolean, com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.Boolean>>() {
        @Override
        protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
          return com.github.nmorel.gwtjackson.client.deser.BooleanJsonDeserializer.getInstance();
        }
      };
      private final com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<com.anova.anovacloud.shared.dto.UserDto, com.github.nmorel.gwtjackson.client.JsonDeserializer<com.anova.anovacloud.shared.dto.UserDto>> deserializer_user = new com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<com.anova.anovacloud.shared.dto.UserDto, com.github.nmorel.gwtjackson.client.JsonDeserializer<com.anova.anovacloud.shared.dto.UserDto>>() {
        @Override
        protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
          return new com.anova.anovacloud.shared.dto.UserDtoBeanJsonDeserializerImpl();
        }
      };
      
      @Override
      public com.github.nmorel.gwtjackson.client.deser.bean.Instance<com.anova.anovacloud.shared.dto.CurrentUserDto> newInstance( com.github.nmorel.gwtjackson.client.stream.JsonReader reader, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx, java.util.Map<String, String> bufferedProperties ) {
        java.lang.Boolean v_loggedIn = null;
        com.anova.anovacloud.shared.dto.UserDto v_user = null;
        
        int nbParamToFind = 2;
        
        if(null != bufferedProperties) {
          String value;
          
          value = bufferedProperties.remove("loggedIn");
          if(null != value) {
            v_loggedIn = deserializer_loggedIn.deserialize(ctx.newJsonReader(value), ctx);
            nbParamToFind--;
          }
          
          value = bufferedProperties.remove("user");
          if(null != value) {
            v_user = deserializer_user.deserialize(ctx.newJsonReader(value), ctx);
            nbParamToFind--;
          }
        }
        
        String name;
        while (nbParamToFind > 0 && com.github.nmorel.gwtjackson.client.stream.JsonToken.NAME == reader.peek()) {
          name = reader.nextName();
          
          if("loggedIn".equals(name)) {
            v_loggedIn = deserializer_loggedIn.deserialize(reader, ctx);
            nbParamToFind--;
            continue;
          }
          if("user".equals(name)) {
            v_user = deserializer_user.deserialize(reader, ctx);
            nbParamToFind--;
            continue;
          }
          
          if(null == bufferedProperties) {
            bufferedProperties = new java.util.HashMap<String, String>();
          }
          bufferedProperties.put( name, reader.nextValue() );
        }
        
        return new com.github.nmorel.gwtjackson.client.deser.bean.Instance<com.anova.anovacloud.shared.dto.CurrentUserDto>( create(v_loggedIn, v_user), bufferedProperties );
      }
      
      private com.anova.anovacloud.shared.dto.CurrentUserDto create(java.lang.Boolean loggedIn, com.anova.anovacloud.shared.dto.UserDto user) {
        return new com.anova.anovacloud.shared.dto.CurrentUserDto(loggedIn, user);
      }
    };
  }
  
  
  @Override
  public java.lang.Class getDeserializedType() {
    return com.anova.anovacloud.shared.dto.CurrentUserDto.class;
  }
  
}
