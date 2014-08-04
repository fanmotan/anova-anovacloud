package com.gwtplatform.dispatch.rest.client.serialization.mappers;

public class com_anova_anovacloud_shared_dto_RatingDtoMapperImpl extends com.github.nmorel.gwtjackson.client.AbstractObjectMapper<com.anova.anovacloud.shared.dto.RatingDto> implements com.gwtplatform.dispatch.rest.client.serialization.mappers.com_anova_anovacloud_shared_dto_RatingDtoMapper {
  
  public com_anova_anovacloud_shared_dto_RatingDtoMapperImpl() {
    super("RatingDto");
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonDeserializer<com.anova.anovacloud.shared.dto.RatingDto> newDeserializer() {
    return new com.anova.anovacloud.shared.dto.RatingDtoBeanJsonDeserializerImpl();
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonSerializer<com.anova.anovacloud.shared.dto.RatingDto> newSerializer() {
    return new com.anova.anovacloud.shared.dto.RatingDtoBeanJsonSerializerImpl();
  }
  
}
