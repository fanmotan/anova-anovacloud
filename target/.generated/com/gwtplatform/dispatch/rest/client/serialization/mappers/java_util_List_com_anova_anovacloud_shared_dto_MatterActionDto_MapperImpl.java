package com.gwtplatform.dispatch.rest.client.serialization.mappers;

public class java_util_List_com_anova_anovacloud_shared_dto_MatterActionDto_MapperImpl extends com.github.nmorel.gwtjackson.client.AbstractObjectMapper<java.util.List<com.anova.anovacloud.shared.dto.MatterActionDto>> implements com.gwtplatform.dispatch.rest.client.serialization.mappers.java_util_List_com_anova_anovacloud_shared_dto_MatterActionDto_Mapper {
  
  public java_util_List_com_anova_anovacloud_shared_dto_MatterActionDto_MapperImpl() {
    super("List");
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonDeserializer<java.util.List<com.anova.anovacloud.shared.dto.MatterActionDto>> newDeserializer() {
    return com.github.nmorel.gwtjackson.client.deser.collection.ListJsonDeserializer.newInstance(new com.anova.anovacloud.shared.dto.MatterActionDtoBeanJsonDeserializerImpl());
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonSerializer<java.util.List<com.anova.anovacloud.shared.dto.MatterActionDto>> newSerializer() {
    return com.github.nmorel.gwtjackson.client.ser.IterableJsonSerializer.newInstance(new com.anova.anovacloud.shared.dto.MatterActionDtoBeanJsonSerializerImpl());
  }
  
}
