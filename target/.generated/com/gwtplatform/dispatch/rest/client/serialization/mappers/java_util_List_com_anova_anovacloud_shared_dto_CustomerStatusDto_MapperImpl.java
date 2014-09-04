package com.gwtplatform.dispatch.rest.client.serialization.mappers;

public class java_util_List_com_anova_anovacloud_shared_dto_CustomerStatusDto_MapperImpl extends com.github.nmorel.gwtjackson.client.AbstractObjectMapper<java.util.List<com.anova.anovacloud.shared.dto.CustomerStatusDto>> implements com.gwtplatform.dispatch.rest.client.serialization.mappers.java_util_List_com_anova_anovacloud_shared_dto_CustomerStatusDto_Mapper {
  
  public java_util_List_com_anova_anovacloud_shared_dto_CustomerStatusDto_MapperImpl() {
    super("List");
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonDeserializer<java.util.List<com.anova.anovacloud.shared.dto.CustomerStatusDto>> newDeserializer() {
    return com.github.nmorel.gwtjackson.client.deser.collection.ListJsonDeserializer.newInstance(new com.anova.anovacloud.shared.dto.CustomerStatusDtoBeanJsonDeserializerImpl());
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonSerializer<java.util.List<com.anova.anovacloud.shared.dto.CustomerStatusDto>> newSerializer() {
    return com.github.nmorel.gwtjackson.client.ser.IterableJsonSerializer.newInstance(new com.anova.anovacloud.shared.dto.CustomerStatusDtoBeanJsonSerializerImpl());
  }
  
}
