package com.gwtplatform.dispatch.rest.client.serialization.mappers;

public class com_anova_anovacloud_shared_dto_AttorneyDtoMapperImpl extends com.github.nmorel.gwtjackson.client.AbstractObjectMapper<com.anova.anovacloud.shared.dto.AttorneyDto> implements com.gwtplatform.dispatch.rest.client.serialization.mappers.com_anova_anovacloud_shared_dto_AttorneyDtoMapper {
  
  public com_anova_anovacloud_shared_dto_AttorneyDtoMapperImpl() {
    super("AttorneyDto");
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonDeserializer<com.anova.anovacloud.shared.dto.AttorneyDto> newDeserializer() {
    return new com.anova.anovacloud.shared.dto.AttorneyDtoBeanJsonDeserializerImpl();
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonSerializer<com.anova.anovacloud.shared.dto.AttorneyDto> newSerializer() {
    return new com.anova.anovacloud.shared.dto.AttorneyDtoBeanJsonSerializerImpl();
  }
  
}
