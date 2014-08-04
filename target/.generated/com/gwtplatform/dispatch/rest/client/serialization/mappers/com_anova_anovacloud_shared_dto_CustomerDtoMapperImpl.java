package com.gwtplatform.dispatch.rest.client.serialization.mappers;

public class com_anova_anovacloud_shared_dto_CustomerDtoMapperImpl extends com.github.nmorel.gwtjackson.client.AbstractObjectMapper<com.anova.anovacloud.shared.dto.CustomerDto> implements com.gwtplatform.dispatch.rest.client.serialization.mappers.com_anova_anovacloud_shared_dto_CustomerDtoMapper {
  
  public com_anova_anovacloud_shared_dto_CustomerDtoMapperImpl() {
    super("CustomerDto");
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonDeserializer<com.anova.anovacloud.shared.dto.CustomerDto> newDeserializer() {
    return new com.anova.anovacloud.shared.dto.CustomerDtoBeanJsonDeserializerImpl();
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonSerializer<com.anova.anovacloud.shared.dto.CustomerDto> newSerializer() {
    return new com.anova.anovacloud.shared.dto.CustomerDtoBeanJsonSerializerImpl();
  }
  
}
