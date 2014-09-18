package com.anova.anovacloud.shared.dto;

public class MatterActionDtoBeanJsonSerializerImpl extends com.github.nmorel.gwtjackson.client.ser.bean.AbstractBeanJsonSerializer<com.anova.anovacloud.shared.dto.MatterActionDto> {
  
  public MatterActionDtoBeanJsonSerializerImpl() {}
  
  @Override
  protected java.util.Map<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterActionDto, ?>> initSerializers() {
    java.util.Map<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterActionDto, ?>> map = new java.util.LinkedHashMap<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterActionDto, ?>>(20);
    
    map.put("dueDate", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterActionDto, java.util.Date>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.BaseDateJsonSerializer.DateJsonSerializer.getInstance();
      }
      
      @Override
      public java.util.Date getValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getDueDate();
      }
    });
    
    map.put("actionDue", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterActionDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getActionDue();
      }
    });
    
    map.put("ptoMailDate", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterActionDto, java.util.Date>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.BaseDateJsonSerializer.DateJsonSerializer.getInstance();
      }
      
      @Override
      public java.util.Date getValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getPtoMailDate();
      }
    });
    
    map.put("responseDate", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterActionDto, java.util.Date>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.BaseDateJsonSerializer.DateJsonSerializer.getInstance();
      }
      
      @Override
      public java.util.Date getValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getResponseDate();
      }
    });
    
    map.put("takenDate", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterActionDto, java.util.Date>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.BaseDateJsonSerializer.DateJsonSerializer.getInstance();
      }
      
      @Override
      public java.util.Date getValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getTakenDate();
      }
    });
    
    map.put("assignee1", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterActionDto, com.anova.anovacloud.shared.dto.AttorneyDto>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return new com.anova.anovacloud.shared.dto.AttorneyDtoBeanJsonSerializerImpl();
      }
      
      @Override
      public com.anova.anovacloud.shared.dto.AttorneyDto getValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getAssignee1();
      }
    });
    
    map.put("assignee1Role", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterActionDto, com.anova.anovacloud.shared.dto.AttorneyRoleDto>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return new com.anova.anovacloud.shared.dto.AttorneyRoleDtoBeanJsonSerializerImpl();
      }
      
      @Override
      public com.anova.anovacloud.shared.dto.AttorneyRoleDto getValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getAssignee1Role();
      }
    });
    
    map.put("assignee2", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterActionDto, com.anova.anovacloud.shared.dto.AttorneyDto>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return new com.anova.anovacloud.shared.dto.AttorneyDtoBeanJsonSerializerImpl();
      }
      
      @Override
      public com.anova.anovacloud.shared.dto.AttorneyDto getValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getAssignee2();
      }
    });
    
    map.put("assignee2Role", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterActionDto, com.anova.anovacloud.shared.dto.AttorneyRoleDto>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return new com.anova.anovacloud.shared.dto.AttorneyRoleDtoBeanJsonSerializerImpl();
      }
      
      @Override
      public com.anova.anovacloud.shared.dto.AttorneyRoleDto getValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getAssignee2Role();
      }
    });
    
    map.put("assignee3", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterActionDto, com.anova.anovacloud.shared.dto.AttorneyDto>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return new com.anova.anovacloud.shared.dto.AttorneyDtoBeanJsonSerializerImpl();
      }
      
      @Override
      public com.anova.anovacloud.shared.dto.AttorneyDto getValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getAssignee3();
      }
    });
    
    map.put("assignee3Role", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterActionDto, com.anova.anovacloud.shared.dto.AttorneyRoleDto>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return new com.anova.anovacloud.shared.dto.AttorneyRoleDtoBeanJsonSerializerImpl();
      }
      
      @Override
      public com.anova.anovacloud.shared.dto.AttorneyRoleDto getValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getAssignee3Role();
      }
    });
    
    map.put("atty", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterActionDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getAtty();
      }
    });
    
    map.put("actionRemarks", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterActionDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getActionRemarks();
      }
    });
    
    map.put("createBy", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterActionDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getCreateBy();
      }
    });
    
    map.put("createDate", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterActionDto, java.util.Date>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.BaseDateJsonSerializer.DateJsonSerializer.getInstance();
      }
      
      @Override
      public java.util.Date getValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getCreateDate();
      }
    });
    
    map.put("updateBy", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterActionDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getUpdateBy();
      }
    });
    
    map.put("updateDate", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterActionDto, java.util.Date>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.BaseDateJsonSerializer.DateJsonSerializer.getInstance();
      }
      
      @Override
      public java.util.Date getValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getUpdateDate();
      }
    });
    
    map.put("matter", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterActionDto, com.anova.anovacloud.shared.dto.MatterDto>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return new com.anova.anovacloud.shared.dto.MatterDtoBeanJsonSerializerImpl();
      }
      
      @Override
      public com.anova.anovacloud.shared.dto.MatterDto getValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getMatter();
      }
    });
    
    map.put("actionStatus", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterActionDto, com.anova.anovacloud.shared.dto.MatterActionStatusDto>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return new com.anova.anovacloud.shared.dto.MatterActionStatusDtoBeanJsonSerializerImpl();
      }
      
      @Override
      public com.anova.anovacloud.shared.dto.MatterActionStatusDto getValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getActionStatus();
      }
    });
    
    map.put("id", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterActionDto, java.lang.Long>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.BaseNumberJsonSerializer.LongJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.Long getValue(com.anova.anovacloud.shared.dto.MatterActionDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getId();
      }
    });
    
    return map;
  }
  
  @Override
  public java.lang.Class getSerializedType() {
    return com.anova.anovacloud.shared.dto.MatterActionDto.class;
  }
  
}
