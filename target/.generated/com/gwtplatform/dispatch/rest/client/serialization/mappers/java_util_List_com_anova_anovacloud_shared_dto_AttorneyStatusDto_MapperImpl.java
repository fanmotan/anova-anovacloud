package com.gwtplatform.dispatch.rest.client.serialization.mappers;

public class java_util_List_com_anova_anovacloud_shared_dto_AttorneyStatusDto_MapperImpl extends com.github.nmorel.gwtjackson.client.AbstractObjectMapper<java.util.List<com.anova.anovacloud.shared.dto.AttorneyStatusDto>> implements com.gwtplatform.dispatch.rest.client.serialization.mappers.java_util_List_com_anova_anovacloud_shared_dto_AttorneyStatusDto_Mapper {
  
  public java_util_List_com_anova_anovacloud_shared_dto_AttorneyStatusDto_MapperImpl() {
    super("List");
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonDeserializer<java.util.List<com.anova.anovacloud.shared.dto.AttorneyStatusDto>> newDeserializer() {
    return com.github.nmorel.gwtjackson.client.deser.collection.ListJsonDeserializer.newInstance(new com.anova.anovacloud.shared.dto.AttorneyStatusDtoBeanJsonDeserializerImpl());
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonSerializer<java.util.List<com.anova.anovacloud.shared.dto.AttorneyStatusDto>> newSerializer() {
    return com.github.nmorel.gwtjackson.client.ser.IterableJsonSerializer.newInstance(new com.anova.anovacloud.shared.dto.AttorneyStatusDtoBeanJsonSerializerImpl());
  }
  
}
