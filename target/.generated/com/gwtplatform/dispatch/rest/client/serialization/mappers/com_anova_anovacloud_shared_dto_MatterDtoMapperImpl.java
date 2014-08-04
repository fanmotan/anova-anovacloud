package com.gwtplatform.dispatch.rest.client.serialization.mappers;

public class com_anova_anovacloud_shared_dto_MatterDtoMapperImpl extends com.github.nmorel.gwtjackson.client.AbstractObjectMapper<com.anova.anovacloud.shared.dto.MatterDto> implements com.gwtplatform.dispatch.rest.client.serialization.mappers.com_anova_anovacloud_shared_dto_MatterDtoMapper {
  
  public com_anova_anovacloud_shared_dto_MatterDtoMapperImpl() {
    super("MatterDto");
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonDeserializer<com.anova.anovacloud.shared.dto.MatterDto> newDeserializer() {
    return new com.anova.anovacloud.shared.dto.MatterDtoBeanJsonDeserializerImpl();
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonSerializer<com.anova.anovacloud.shared.dto.MatterDto> newSerializer() {
    return new com.anova.anovacloud.shared.dto.MatterDtoBeanJsonSerializerImpl();
  }
  
}
