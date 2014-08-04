package com.anova.anovacloud.shared.dto;

public class CustomerRatingDtoBeanJsonDeserializerImpl extends com.github.nmorel.gwtjackson.client.deser.bean.AbstractBeanJsonDeserializer<com.anova.anovacloud.shared.dto.CustomerRatingDto> {
  
  public CustomerRatingDtoBeanJsonDeserializerImpl() {}
  
  @Override
  protected com.github.nmorel.gwtjackson.client.deser.bean.InstanceBuilder<com.anova.anovacloud.shared.dto.CustomerRatingDto> initInstanceBuilder() {
    return new com.github.nmorel.gwtjackson.client.deser.bean.InstanceBuilder<com.anova.anovacloud.shared.dto.CustomerRatingDto>() {
      private final com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<java.lang.String, com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.String>> deserializer_customer = new com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<java.lang.String, com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.String>>() {
        @Override
        protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
          return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
        }
      };
      private final com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<java.lang.Double, com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.Double>> deserializer_rating = new com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<java.lang.Double, com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.Double>>() {
        @Override
        protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
          return com.github.nmorel.gwtjackson.client.deser.BaseNumberJsonDeserializer.DoubleJsonDeserializer.getInstance();
        }
      };
      
      @Override
      public com.github.nmorel.gwtjackson.client.deser.bean.Instance<com.anova.anovacloud.shared.dto.CustomerRatingDto> newInstance( com.github.nmorel.gwtjackson.client.stream.JsonReader reader, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx, java.util.Map<String, String> bufferedProperties ) {
        java.lang.String v_customer = null;
        java.lang.Double v_rating = null;
        
        int nbParamToFind = 2;
        
        if(null != bufferedProperties) {
          String value;
          
          value = bufferedProperties.remove("customer");
          if(null != value) {
            v_customer = deserializer_customer.deserialize(ctx.newJsonReader(value), ctx);
            nbParamToFind--;
          }
          
          value = bufferedProperties.remove("rating");
          if(null != value) {
            v_rating = deserializer_rating.deserialize(ctx.newJsonReader(value), ctx);
            nbParamToFind--;
          }
        }
        
        String name;
        while (nbParamToFind > 0 && com.github.nmorel.gwtjackson.client.stream.JsonToken.NAME == reader.peek()) {
          name = reader.nextName();
          
          if("customer".equals(name)) {
            v_customer = deserializer_customer.deserialize(reader, ctx);
            nbParamToFind--;
            continue;
          }
          if("rating".equals(name)) {
            v_rating = deserializer_rating.deserialize(reader, ctx);
            nbParamToFind--;
            continue;
          }
          
          if(null == bufferedProperties) {
            bufferedProperties = new java.util.HashMap<String, String>();
          }
          bufferedProperties.put( name, reader.nextValue() );
        }
        
        return new com.github.nmorel.gwtjackson.client.deser.bean.Instance<com.anova.anovacloud.shared.dto.CustomerRatingDto>( create(v_customer, v_rating), bufferedProperties );
      }
      
      private com.anova.anovacloud.shared.dto.CustomerRatingDto create(java.lang.String customer, java.lang.Double rating) {
        return new com.anova.anovacloud.shared.dto.CustomerRatingDto(customer, rating);
      }
    };
  }
  
  
  @Override
  public java.lang.Class getDeserializedType() {
    return com.anova.anovacloud.shared.dto.CustomerRatingDto.class;
  }
  
}
