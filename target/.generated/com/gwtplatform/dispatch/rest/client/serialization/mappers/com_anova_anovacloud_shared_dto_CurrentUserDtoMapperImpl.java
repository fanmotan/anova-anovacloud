package com.gwtplatform.dispatch.rest.client.serialization.mappers;

public class com_anova_anovacloud_shared_dto_CurrentUserDtoMapperImpl extends com.github.nmorel.gwtjackson.client.AbstractObjectMapper<com.anova.anovacloud.shared.dto.CurrentUserDto> implements com.gwtplatform.dispatch.rest.client.serialization.mappers.com_anova_anovacloud_shared_dto_CurrentUserDtoMapper {
  
  public com_anova_anovacloud_shared_dto_CurrentUserDtoMapperImpl() {
    super("CurrentUserDto");
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonDeserializer<com.anova.anovacloud.shared.dto.CurrentUserDto> newDeserializer() {
    return new com.anova.anovacloud.shared.dto.CurrentUserDtoBeanJsonDeserializerImpl();
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonSerializer<com.anova.anovacloud.shared.dto.CurrentUserDto> newSerializer() {
    return new com.anova.anovacloud.shared.dto.CurrentUserDtoBeanJsonSerializerImpl();
  }
  
}
