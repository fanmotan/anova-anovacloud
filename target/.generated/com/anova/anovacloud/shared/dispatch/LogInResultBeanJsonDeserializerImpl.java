package com.anova.anovacloud.shared.dispatch;

public class LogInResultBeanJsonDeserializerImpl extends com.github.nmorel.gwtjackson.client.deser.bean.AbstractBeanJsonDeserializer<com.anova.anovacloud.shared.dispatch.LogInResult> {
  
  public LogInResultBeanJsonDeserializerImpl() {}
  
  @Override
  protected com.github.nmorel.gwtjackson.client.deser.bean.InstanceBuilder<com.anova.anovacloud.shared.dispatch.LogInResult> initInstanceBuilder() {
    return new com.github.nmorel.gwtjackson.client.deser.bean.InstanceBuilder<com.anova.anovacloud.shared.dispatch.LogInResult>() {
      private final com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<com.anova.anovacloud.shared.dto.ActionType, com.github.nmorel.gwtjackson.client.JsonDeserializer<com.anova.anovacloud.shared.dto.ActionType>> deserializer_actionType = new com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<com.anova.anovacloud.shared.dto.ActionType, com.github.nmorel.gwtjackson.client.JsonDeserializer<com.anova.anovacloud.shared.dto.ActionType>>() {
        @Override
        protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
          return com.github.nmorel.gwtjackson.client.deser.EnumJsonDeserializer.newInstance(com.anova.anovacloud.shared.dto.ActionType.class);
        }
      };
      private final com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<com.anova.anovacloud.shared.dto.CurrentUserDto, com.github.nmorel.gwtjackson.client.JsonDeserializer<com.anova.anovacloud.shared.dto.CurrentUserDto>> deserializer_currentUserDto = new com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<com.anova.anovacloud.shared.dto.CurrentUserDto, com.github.nmorel.gwtjackson.client.JsonDeserializer<com.anova.anovacloud.shared.dto.CurrentUserDto>>() {
        @Override
        protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
          return new com.anova.anovacloud.shared.dto.CurrentUserDtoBeanJsonDeserializerImpl();
        }
      };
      private final com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<java.lang.String, com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.String>> deserializer_loggedInCookie = new com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<java.lang.String, com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.String>>() {
        @Override
        protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
          return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
        }
      };
      
      @Override
      public com.github.nmorel.gwtjackson.client.deser.bean.Instance<com.anova.anovacloud.shared.dispatch.LogInResult> newInstance( com.github.nmorel.gwtjackson.client.stream.JsonReader reader, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx, java.util.Map<String, String> bufferedProperties ) {
        com.anova.anovacloud.shared.dto.ActionType v_actionType = null;
        com.anova.anovacloud.shared.dto.CurrentUserDto v_currentUserDto = null;
        java.lang.String v_loggedInCookie = null;
        
        int nbParamToFind = 3;
        
        if(null != bufferedProperties) {
          String value;
          
          value = bufferedProperties.remove("actionType");
          if(null != value) {
            v_actionType = deserializer_actionType.deserialize(ctx.newJsonReader(value), ctx);
            nbParamToFind--;
          }
          
          value = bufferedProperties.remove("currentUserDto");
          if(null != value) {
            v_currentUserDto = deserializer_currentUserDto.deserialize(ctx.newJsonReader(value), ctx);
            nbParamToFind--;
          }
          
          value = bufferedProperties.remove("loggedInCookie");
          if(null != value) {
            v_loggedInCookie = deserializer_loggedInCookie.deserialize(ctx.newJsonReader(value), ctx);
            nbParamToFind--;
          }
        }
        
        String name;
        while (nbParamToFind > 0 && com.github.nmorel.gwtjackson.client.stream.JsonToken.NAME == reader.peek()) {
          name = reader.nextName();
          
          if("actionType".equals(name)) {
            v_actionType = deserializer_actionType.deserialize(reader, ctx);
            nbParamToFind--;
            continue;
          }
          if("currentUserDto".equals(name)) {
            v_currentUserDto = deserializer_currentUserDto.deserialize(reader, ctx);
            nbParamToFind--;
            continue;
          }
          if("loggedInCookie".equals(name)) {
            v_loggedInCookie = deserializer_loggedInCookie.deserialize(reader, ctx);
            nbParamToFind--;
            continue;
          }
          
          if(null == bufferedProperties) {
            bufferedProperties = new java.util.HashMap<String, String>();
          }
          bufferedProperties.put( name, reader.nextValue() );
        }
        
        return new com.github.nmorel.gwtjackson.client.deser.bean.Instance<com.anova.anovacloud.shared.dispatch.LogInResult>( create(v_actionType, v_currentUserDto, v_loggedInCookie), bufferedProperties );
      }
      
      private com.anova.anovacloud.shared.dispatch.LogInResult create(com.anova.anovacloud.shared.dto.ActionType actionType, com.anova.anovacloud.shared.dto.CurrentUserDto currentUserDto, java.lang.String loggedInCookie) {
        return new com.anova.anovacloud.shared.dispatch.LogInResult(actionType, currentUserDto, loggedInCookie);
      }
    };
  }
  
  
  @Override
  public java.lang.Class getDeserializedType() {
    return com.anova.anovacloud.shared.dispatch.LogInResult.class;
  }
  
}
