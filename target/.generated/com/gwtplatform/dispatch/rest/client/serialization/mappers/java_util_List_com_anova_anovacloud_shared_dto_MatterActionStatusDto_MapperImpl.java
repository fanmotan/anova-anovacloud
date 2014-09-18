package com.gwtplatform.dispatch.rest.client.serialization.mappers;

public class java_util_List_com_anova_anovacloud_shared_dto_MatterActionStatusDto_MapperImpl extends com.github.nmorel.gwtjackson.client.AbstractObjectMapper<java.util.List<com.anova.anovacloud.shared.dto.MatterActionStatusDto>> implements com.gwtplatform.dispatch.rest.client.serialization.mappers.java_util_List_com_anova_anovacloud_shared_dto_MatterActionStatusDto_Mapper {
  
  public java_util_List_com_anova_anovacloud_shared_dto_MatterActionStatusDto_MapperImpl() {
    super("List");
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonDeserializer<java.util.List<com.anova.anovacloud.shared.dto.MatterActionStatusDto>> newDeserializer() {
    return com.github.nmorel.gwtjackson.client.deser.collection.ListJsonDeserializer.newInstance(new com.anova.anovacloud.shared.dto.MatterActionStatusDtoBeanJsonDeserializerImpl());
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonSerializer<java.util.List<com.anova.anovacloud.shared.dto.MatterActionStatusDto>> newSerializer() {
    return com.github.nmorel.gwtjackson.client.ser.IterableJsonSerializer.newInstance(new com.anova.anovacloud.shared.dto.MatterActionStatusDtoBeanJsonSerializerImpl());
  }
  
}
