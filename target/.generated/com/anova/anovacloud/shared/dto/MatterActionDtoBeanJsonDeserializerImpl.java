package com.anova.anovacloud.shared.dto;

public class MatterActionDtoBeanJsonDeserializerImpl extends com.github.nmorel.gwtjackson.client.deser.bean.AbstractBeanJsonDeserializer<com.anova.anovacloud.shared.dto.MatterActionDto> {
  
  public MatterActionDtoBeanJsonDeserializerImpl() {}
  
  @Override
  protected com.github.nmorel.gwtjackson.client.deser.bean.InstanceBuilder<com.anova.anovacloud.shared.dto.MatterActionDto> initInstanceBuilder() {
    return new com.github.nmorel.gwtjackson.client.deser.bean.InstanceBuilder<com.anova.anovacloud.shared.dto.MatterActionDto>() {
      @Override
      public com.github.nmorel.gwtjackson.client.deser.bean.Instance<com.anova.anovacloud.shared.dto.MatterActionDto> newInstance( com.github.nmorel.gwtjackson.client.stream.JsonReader reader, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx, java.util.Map<String, String> bufferedProperties ) {
        return new com.github.nmorel.gwtjackson.client.deser.bean.Instance<com.anova.anovacloud.shared.dto.MatterActionDto>(create(), bufferedProperties);
      }
      
      private com.anova.anovacloud.shared.dto.MatterActionDto create() {
        return new com.anova.anovacloud.shared.dto.MatterActionDto();
      }
    };
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.deser.bean.SimpleStringMap<com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.MatterActionDto, ?>> initDeserializers() {
    com.github.nmorel.gwtjackson.client.deser.bean.SimpleStringMap<com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.MatterActionDto, ?>> map = com.github.nmorel.gwtjackson.client.deser.bean.SimpleStringMap.createObject().cast();
    
    map.put("dueDate", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.MatterActionDto, java.util.Date>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.BaseDateJsonDeserializer.DateJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, java.util.Date value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setDueDate(value);
      }
    });
    
    map.put("actionDue", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.MatterActionDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, java.lang.String value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setActionDue(value);
      }
    });
    
    map.put("ptoMailDate", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.MatterActionDto, java.util.Date>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.BaseDateJsonDeserializer.DateJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, java.util.Date value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setPtoMailDate(value);
      }
    });
    
    map.put("responseDate", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.MatterActionDto, java.util.Date>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.BaseDateJsonDeserializer.DateJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, java.util.Date value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setResponseDate(value);
      }
    });
    
    map.put("takenDate", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.MatterActionDto, java.util.Date>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.BaseDateJsonDeserializer.DateJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, java.util.Date value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setTakenDate(value);
      }
    });
    
    map.put("assignee1", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.MatterActionDto, com.anova.anovacloud.shared.dto.AttorneyDto>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return new com.anova.anovacloud.shared.dto.AttorneyDtoBeanJsonDeserializerImpl();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, com.anova.anovacloud.shared.dto.AttorneyDto value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setAssignee1(value);
      }
    });
    
    map.put("assignee1Role", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.MatterActionDto, com.anova.anovacloud.shared.dto.AttorneyRoleDto>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return new com.anova.anovacloud.shared.dto.AttorneyRoleDtoBeanJsonDeserializerImpl();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, com.anova.anovacloud.shared.dto.AttorneyRoleDto value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setAssignee1Role(value);
      }
    });
    
    map.put("assignee2", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.MatterActionDto, com.anova.anovacloud.shared.dto.AttorneyDto>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return new com.anova.anovacloud.shared.dto.AttorneyDtoBeanJsonDeserializerImpl();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, com.anova.anovacloud.shared.dto.AttorneyDto value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setAssignee2(value);
      }
    });
    
    map.put("assignee2Role", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.MatterActionDto, com.anova.anovacloud.shared.dto.AttorneyRoleDto>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return new com.anova.anovacloud.shared.dto.AttorneyRoleDtoBeanJsonDeserializerImpl();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, com.anova.anovacloud.shared.dto.AttorneyRoleDto value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setAssignee2Role(value);
      }
    });
    
    map.put("assignee3", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.MatterActionDto, com.anova.anovacloud.shared.dto.AttorneyDto>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return new com.anova.anovacloud.shared.dto.AttorneyDtoBeanJsonDeserializerImpl();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, com.anova.anovacloud.shared.dto.AttorneyDto value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setAssignee3(value);
      }
    });
    
    map.put("assignee3Role", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.MatterActionDto, com.anova.anovacloud.shared.dto.AttorneyRoleDto>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return new com.anova.anovacloud.shared.dto.AttorneyRoleDtoBeanJsonDeserializerImpl();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, com.anova.anovacloud.shared.dto.AttorneyRoleDto value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setAssignee3Role(value);
      }
    });
    
    map.put("atty", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.MatterActionDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, java.lang.String value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setAtty(value);
      }
    });
    
    map.put("actionRemarks", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.MatterActionDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, java.lang.String value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setActionRemarks(value);
      }
    });
    
    map.put("createBy", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.MatterActionDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, java.lang.String value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setCreateBy(value);
      }
    });
    
    map.put("createDate", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.MatterActionDto, java.util.Date>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.BaseDateJsonDeserializer.DateJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, java.util.Date value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setCreateDate(value);
      }
    });
    
    map.put("updateBy", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.MatterActionDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.StringJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, java.lang.String value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setUpdateBy(value);
      }
    });
    
    map.put("updateDate", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.MatterActionDto, java.util.Date>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.BaseDateJsonDeserializer.DateJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, java.util.Date value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setUpdateDate(value);
      }
    });
    
    map.put("matter", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.MatterActionDto, com.anova.anovacloud.shared.dto.MatterDto>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return new com.anova.anovacloud.shared.dto.MatterDtoBeanJsonDeserializerImpl();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, com.anova.anovacloud.shared.dto.MatterDto value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setMatter(value);
      }
    });
    
    map.put("actionStatus", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.MatterActionDto, com.anova.anovacloud.shared.dto.MatterActionStatusDto>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return new com.anova.anovacloud.shared.dto.MatterActionStatusDtoBeanJsonDeserializerImpl();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, com.anova.anovacloud.shared.dto.MatterActionStatusDto value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
        bean.setActionStatus(value);
      }
    });
    
    map.put("id", new com.github.nmorel.gwtjackson.client.deser.bean.BeanPropertyDeserializer<com.anova.anovacloud.shared.dto.MatterActionDto, java.lang.Long>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonDeserializer<?> newDeserializer() {
        return com.github.nmorel.gwtjackson.client.deser.BaseNumberJsonDeserializer.LongJsonDeserializer.getInstance();
      }
      
      @Override
      public void setValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, java.lang.Long value, com.github.nmorel.gwtjackson.client.JsonDeserializationContext ctx) {
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
    return com.anova.anovacloud.shared.dto.MatterActionDto.class;
  }
  
}
