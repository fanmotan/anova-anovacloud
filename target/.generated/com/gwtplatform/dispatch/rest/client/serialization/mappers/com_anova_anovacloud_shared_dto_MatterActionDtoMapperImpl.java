package com.gwtplatform.dispatch.rest.client.serialization.mappers;

public class com_anova_anovacloud_shared_dto_MatterActionDtoMapperImpl extends com.github.nmorel.gwtjackson.client.AbstractObjectMapper<com.anova.anovacloud.shared.dto.MatterActionDto> implements com.gwtplatform.dispatch.rest.client.serialization.mappers.com_anova_anovacloud_shared_dto_MatterActionDtoMapper {
  
  public com_anova_anovacloud_shared_dto_MatterActionDtoMapperImpl() {
    super("MatterActionDto");
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonDeserializer<com.anova.anovacloud.shared.dto.MatterActionDto> newDeserializer() {
    return new com.anova.anovacloud.shared.dto.MatterActionDtoBeanJsonDeserializerImpl();
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonSerializer<com.anova.anovacloud.shared.dto.MatterActionDto> newSerializer() {
    return new com.anova.anovacloud.shared.dto.MatterActionDtoBeanJsonSerializerImpl();
  }
  
}
