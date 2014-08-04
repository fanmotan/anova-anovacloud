package com.anova.anovacloud.shared.dispatch;

public class LogInRequestBeanJsonDeserializerImpl extends com.github.nmorel.gwtjackson.client.deser.bean.AbstractBeanJsonDeserializer<com.anova.anovacloud.shared.dispatch.LogInRequest> {
  
  public LogInRequestBeanJsonDeserializerImpl() {}
  
  @Override
  protected com.github.nmorel.gwtjackson.client.deser.bean.InstanceBuilder<com.anova.anovacloud.shared.dispatch.LogInRequest> initInstanceBuilder() {
    return new com.github.nmorel.gwtjackson.client.deser.bean.InstanceBuilder<com.anova.anovacloud.shared.dispatch.LogInRequest>() {
      private final com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<java.lang.String, com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.String>> deserializer_username = new com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<java.lang.String, com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.String>>() {
        @Override
        protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
          return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
        }
      };
      private final com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<java.lang.String, com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.String>> deserializer_password = new com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<java.lang.String, com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.String>>() {
        @Override
        protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
          return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
        }
      };
      
      @Override
      public com.github.nmorel.gwtjackson.client.deser.bean.Instance<com.anova.anovacloud.shared.dispatch.LogInRequest> newInstance( com.github.nmorel.gwtjackson.client.stream.JsonReader reader, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx, java.util.Map<String, String> bufferedProperties ) {
        java.lang.String v_username = null;
        java.lang.String v_password = null;
        
        int nbParamToFind = 2;
        
        if(null != bufferedProperties) {
          String value;
          
          value = bufferedProperties.remove("username");
          if(null != value) {
            v_username = deserializer_username.deserialize(ctx.newJsonReader(value), ctx);
            nbParamToFind--;
          }
          
          value = bufferedProperties.remove("password");
          if(null != value) {
            v_password = deserializer_password.deserialize(ctx.newJsonReader(value), ctx);
            nbParamToFind--;
          }
        }
        
        String name;
        while (nbParamToFind > 0 && com.github.nmorel.gwtjackson.client.stream.JsonToken.NAME == reader.peek()) {
          name = reader.nextName();
          
          if("username".equals(name)) {
            v_username = deserializer_username.deserialize(reader, ctx);
            nbParamToFind--;
            continue;
          }
          if("password".equals(name)) {
            v_password = deserializer_password.deserialize(reader, ctx);
            nbParamToFind--;
            continue;
          }
          
          if(null == bufferedProperties) {
            bufferedProperties = new java.util.HashMap<String, String>();
          }
          bufferedProperties.put( name, reader.nextValue() );
        }
        
        return new com.github.nmorel.gwtjackson.client.deser.bean.Instance<com.anova.anovacloud.shared.dispatch.LogInRequest>( create(v_username, v_password), bufferedProperties );
      }
      
      private com.anova.anovacloud.shared.dispatch.LogInRequest create(java.lang.String username, java.lang.String password) {
        return new com.anova.anovacloud.shared.dispatch.LogInRequest(username, password);
      }
    };
  }
  
  
  @Override
  public java.lang.Class getDeserializedType() {
    return com.anova.anovacloud.shared.dispatch.LogInRequest.class;
  }
  
}
