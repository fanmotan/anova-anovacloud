package com.anova.anovacloud.shared.dto;

public class MatterPropertiesDtoBeanJsonSerializerImpl extends com.github.nmorel.gwtjackson.client.ser.bean.AbstractBeanJsonSerializer<com.anova.anovacloud.shared.dto.MatterPropertiesDto> {
  
  public MatterPropertiesDtoBeanJsonSerializerImpl() {}
  
  @Override
  protected java.util.Map<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterPropertiesDto, ?>> initSerializers() {
    java.util.Map<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterPropertiesDto, ?>> map = new java.util.LinkedHashMap<java.lang.String, com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterPropertiesDto, ?>>(22);
    
    map.put("caseTitle", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterPropertiesDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.MatterPropertiesDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getCaseTitle();
      }
    });
    
    map.put("applicationNum", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterPropertiesDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.MatterPropertiesDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getApplicationNum();
      }
    });
    
    map.put("patentNum", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterPropertiesDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.MatterPropertiesDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getPatentNum();
      }
    });
    
    map.put("pubNum", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterPropertiesDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.MatterPropertiesDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getPubNum();
      }
    });
    
    map.put("assignee", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterPropertiesDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.MatterPropertiesDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getAssignee();
      }
    });
    
    map.put("assignmentRecord", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterPropertiesDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.MatterPropertiesDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getAssignmentRecord();
      }
    });
    
    map.put("remarks", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterPropertiesDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.MatterPropertiesDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getRemarks();
      }
    });
    
    map.put("priority", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterPropertiesDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.MatterPropertiesDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getPriority();
      }
    });
    
    map.put("patentTermAdj", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterPropertiesDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.MatterPropertiesDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getPatentTermAdj();
      }
    });
    
    map.put("country", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterPropertiesDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.MatterPropertiesDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getCountry();
      }
    });
    
    map.put("fileDate", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterPropertiesDto, java.util.Date>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.BaseDateJsonSerializer.DateJsonSerializer.getInstance();
      }
      
      @Override
      public java.util.Date getValue(com.anova.anovacloud.shared.dto.MatterPropertiesDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getFileDate();
      }
    });
    
    map.put("issueDate", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterPropertiesDto, java.util.Date>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.BaseDateJsonSerializer.DateJsonSerializer.getInstance();
      }
      
      @Override
      public java.util.Date getValue(com.anova.anovacloud.shared.dto.MatterPropertiesDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getIssueDate();
      }
    });
    
    map.put("expriationDate", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterPropertiesDto, java.util.Date>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.BaseDateJsonSerializer.DateJsonSerializer.getInstance();
      }
      
      @Override
      public java.util.Date getValue(com.anova.anovacloud.shared.dto.MatterPropertiesDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getExpriationDate();
      }
    });
    
    map.put("pubDate", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterPropertiesDto, java.util.Date>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.BaseDateJsonSerializer.DateJsonSerializer.getInstance();
      }
      
      @Override
      public java.util.Date getValue(com.anova.anovacloud.shared.dto.MatterPropertiesDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getPubDate();
      }
    });
    
    map.put("parentPCTNum", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterPropertiesDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.MatterPropertiesDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getParentPCTNum();
      }
    });
    
    map.put("pctDate", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterPropertiesDto, java.util.Date>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.BaseDateJsonSerializer.DateJsonSerializer.getInstance();
      }
      
      @Override
      public java.util.Date getValue(com.anova.anovacloud.shared.dto.MatterPropertiesDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getPctDate();
      }
    });
    
    map.put("createBy", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterPropertiesDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.MatterPropertiesDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getCreateBy();
      }
    });
    
    map.put("updateBy", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterPropertiesDto, java.lang.String>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.StringJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.String getValue(com.anova.anovacloud.shared.dto.MatterPropertiesDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getUpdateBy();
      }
    });
    
    map.put("createDate", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterPropertiesDto, java.util.Date>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.BaseDateJsonSerializer.DateJsonSerializer.getInstance();
      }
      
      @Override
      public java.util.Date getValue(com.anova.anovacloud.shared.dto.MatterPropertiesDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getCreateDate();
      }
    });
    
    map.put("updateDate", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterPropertiesDto, java.util.Date>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.BaseDateJsonSerializer.DateJsonSerializer.getInstance();
      }
      
      @Override
      public java.util.Date getValue(com.anova.anovacloud.shared.dto.MatterPropertiesDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getUpdateDate();
      }
    });
    
    map.put("matter", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterPropertiesDto, com.anova.anovacloud.shared.dto.MatterDto>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return new com.anova.anovacloud.shared.dto.MatterDtoBeanJsonSerializerImpl();
      }
      
      @Override
      public com.anova.anovacloud.shared.dto.MatterDto getValue(com.anova.anovacloud.shared.dto.MatterPropertiesDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getMatter();
      }
    });
    
    map.put("id", new com.github.nmorel.gwtjackson.client.ser.bean.BeanPropertySerializer<com.anova.anovacloud.shared.dto.MatterPropertiesDto, java.lang.Long>() {
      @Override
      protected com.github.nmorel.gwtjackson.client.JsonSerializer<?> newSerializer() {
        return com.github.nmorel.gwtjackson.client.ser.BaseNumberJsonSerializer.LongJsonSerializer.getInstance();
      }
      
      @Override
      public java.lang.Long getValue(com.anova.anovacloud.shared.dto.MatterPropertiesDto bean, com.github.nmorel.gwtjackson.client.JsonSerializationContext ctx) {
        return bean.getId();
      }
    });
    
    return map;
  }
  
  @Override
  public java.lang.Class getSerializedType() {
    return com.anova.anovacloud.shared.dto.MatterPropertiesDto.class;
  }
  
}
