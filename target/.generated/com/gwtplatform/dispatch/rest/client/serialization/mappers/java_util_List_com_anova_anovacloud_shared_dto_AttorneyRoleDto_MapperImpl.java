package com.gwtplatform.dispatch.rest.client.serialization.mappers;

public class java_util_List_com_anova_anovacloud_shared_dto_AttorneyRoleDto_MapperImpl extends com.github.nmorel.gwtjackson.client.AbstractObjectMapper<java.util.List<com.anova.anovacloud.shared.dto.AttorneyRoleDto>> implements com.gwtplatform.dispatch.rest.client.serialization.mappers.java_util_List_com_anova_anovacloud_shared_dto_AttorneyRoleDto_Mapper {
  
  public java_util_List_com_anova_anovacloud_shared_dto_AttorneyRoleDto_MapperImpl() {
    super("List");
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonDeserializer<java.util.List<com.anova.anovacloud.shared.dto.AttorneyRoleDto>> newDeserializer() {
    return com.github.nmorel.gwtjackson.client.deser.collection.ListJsonDeserializer.newInstance(new com.anova.anovacloud.shared.dto.AttorneyRoleDtoBeanJsonDeserializerImpl());
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonSerializer<java.util.List<com.anova.anovacloud.shared.dto.AttorneyRoleDto>> newSerializer() {
    return com.github.nmorel.gwtjackson.client.ser.IterableJsonSerializer.newInstance(new com.anova.anovacloud.shared.dto.AttorneyRoleDtoBeanJsonSerializerImpl());
  }
  
}
