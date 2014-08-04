package com.anova.anovacloud.shared.dto;

public class ActionDueDtoBeanJsonDeserializerImpl extends com.github.nmorel.gwtjackson.client.deser.bean.AbstractBeanJsonDeserializer<com.anova.anovacloud.shared.dto.ActionDueDto> {
  
  public ActionDueDtoBeanJsonDeserializerImpl() {}
  
  @Override
  protected com.github.nmorel.gwtjackson.client.deser.bean.InstanceBuilder<com.anova.anovacloud.shared.dto.ActionDueDto> initInstanceBuilder() {
    return new com.github.nmorel.gwtjackson.client.deser.bean.InstanceBuilder<com.anova.anovacloud.shared.dto.ActionDueDto>() {
      private final com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<java.lang.String, com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.String>> deserializer_caseNumber = new com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<java.lang.String, com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.String>>() {
        @Override
        protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
          return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
        }
      };
      private final com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<java.lang.String, com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.String>> deserializer_clientRefNum = new com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<java.lang.String, com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.String>>() {
        @Override
        protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
          return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
        }
      };
      private final com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<java.lang.String, com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.String>> deserializer_title = new com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<java.lang.String, com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.String>>() {
        @Override
        protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
          return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
        }
      };
      private final com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<java.lang.String, com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.String>> deserializer_status = new com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<java.lang.String, com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.String>>() {
        @Override
        protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
          return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
        }
      };
      private final com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<java.lang.String, com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.String>> deserializer_dueDate = new com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<java.lang.String, com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.String>>() {
        @Override
        protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
          return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
        }
      };
      private final com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<java.lang.String, com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.String>> deserializer_actionDue = new com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<java.lang.String, com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.String>>() {
        @Override
        protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
          return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
        }
      };
      private final com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<java.lang.String, com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.String>> deserializer_atty = new com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<java.lang.String, com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.String>>() {
        @Override
        protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
          return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
        }
      };
      private final com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<java.lang.String, com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.String>> deserializer_actionRemarks = new com.github.nmorel.gwtjackson.client.deser.bean.HasDeserializerAndParameters<java.lang.String, com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.String>>() {
        @Override
        protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
          return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
        }
      };
      
      @Override
      public com.github.nmorel.gwtjackson.client.deser.bean.Instance<com.anova.anovacloud.shared.dto.ActionDueDto> newInstance( com.github.nmorel.gwtjackson.client.stream.JsonReader reader, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx, java.util.Map<String, String> bufferedProperties ) {
        java.lang.String v_caseNumber = null;
        java.lang.String v_clientRefNum = null;
        java.lang.String v_title = null;
        java.lang.String v_status = null;
        java.lang.String v_dueDate = null;
        java.lang.String v_actionDue = null;
        java.lang.String v_atty = null;
        java.lang.String v_actionRemarks = null;
        
        int nbParamToFind = 8;
        
        if(null != bufferedProperties) {
          String value;
          
          value = bufferedProperties.remove("caseNumber");
          if(null != value) {
            v_caseNumber = deserializer_caseNumber.deserialize(ctx.newJsonReader(value), ctx);
            nbParamToFind--;
          }
          
          value = bufferedProperties.remove("clientRefNum");
          if(null != value) {
            v_clientRefNum = deserializer_clientRefNum.deserialize(ctx.newJsonReader(value), ctx);
            nbParamToFind--;
          }
          
          value = bufferedProperties.remove("title");
          if(null != value) {
            v_title = deserializer_title.deserialize(ctx.newJsonReader(value), ctx);
            nbParamToFind--;
          }
          
          value = bufferedProperties.remove("status");
          if(null != value) {
            v_status = deserializer_status.deserialize(ctx.newJsonReader(value), ctx);
            nbParamToFind--;
          }
          
          value = bufferedProperties.remove("dueDate");
          if(null != value) {
            v_dueDate = deserializer_dueDate.deserialize(ctx.newJsonReader(value), ctx);
            nbParamToFind--;
          }
          
          value = bufferedProperties.remove("actionDue");
          if(null != value) {
            v_actionDue = deserializer_actionDue.deserialize(ctx.newJsonReader(value), ctx);
            nbParamToFind--;
          }
          
          value = bufferedProperties.remove("atty");
          if(null != value) {
            v_atty = deserializer_atty.deserialize(ctx.newJsonReader(value), ctx);
            nbParamToFind--;
          }
          
          value = bufferedProperties.remove("actionRemarks");
          if(null != value) {
            v_actionRemarks = deserializer_actionRemarks.deserialize(ctx.newJsonReader(value), ctx);
            nbParamToFind--;
          }
        }
        
        String name;
        while (nbParamToFind > 0 && com.github.nmorel.gwtjackson.client.stream.JsonToken.NAME == reader.peek()) {
          name = reader.nextName();
          
          if("caseNumber".equals(name)) {
            v_caseNumber = deserializer_caseNumber.deserialize(reader, ctx);
            nbParamToFind--;
            continue;
          }
          if("clientRefNum".equals(name)) {
            v_clientRefNum = deserializer_clientRefNum.deserialize(reader, ctx);
            nbParamToFind--;
            continue;
          }
          if("title".equals(name)) {
            v_title = deserializer_title.deserialize(reader, ctx);
            nbParamToFind--;
            continue;
          }
          if("status".equals(name)) {
            v_status = deserializer_status.deserialize(reader, ctx);
            nbParamToFind--;
            continue;
          }
          if("dueDate".equals(name)) {
            v_dueDate = deserializer_dueDate.deserialize(reader, ctx);
            nbParamToFind--;
            continue;
          }
          if("actionDue".equals(name)) {
            v_actionDue = deserializer_actionDue.deserialize(reader, ctx);
            nbParamToFind--;
            continue;
          }
          if("atty".equals(name)) {
            v_atty = deserializer_atty.deserialize(reader, ctx);
            nbParamToFind--;
            continue;
          }
          if("actionRemarks".equals(name)) {
            v_actionRemarks = deserializer_actionRemarks.deserialize(reader, ctx);
            nbParamToFind--;
            continue;
          }
          
          if(null == bufferedProperties) {
            bufferedProperties = new java.util.HashMap<String, String>();
          }
          bufferedProperties.put( name, reader.nextValue() );
        }
        
        return new com.github.nmorel.gwtjackson.client.deser.bean.Instance<com.anova.anovacloud.shared.dto.ActionDueDto>( create(v_caseNumber, v_clientRefNum, v_title, v_status, v_dueDate, v_actionDue, v_atty, v_actionRemarks), bufferedProperties );
      }
      
      private com.anova.anovacloud.shared.dto.ActionDueDto create(java.lang.String caseNumber, java.lang.String clientRefNum, java.lang.String title, java.lang.String status, java.lang.String dueDate, java.lang.String actionDue, java.lang.String atty, java.lang.String actionRemarks) {
        return new com.anova.anovacloud.shared.dto.ActionDueDto(caseNumber, clientRefNum, title, status, dueDate, actionDue, atty, actionRemarks);
      }
    };
  }
  
  
  @Override
  public java.lang.Class getDeserializedType() {
    return com.anova.anovacloud.shared.dto.ActionDueDto.class;
  }
  
}
