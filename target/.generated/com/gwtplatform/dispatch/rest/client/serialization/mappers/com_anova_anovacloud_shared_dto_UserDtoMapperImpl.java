package com.gwtplatform.dispatch.rest.client.serialization.mappers;

public class com_anova_anovacloud_shared_dto_UserDtoMapperImpl extends com.github.nmorel.gwtjackson.client.AbstractObjectMapper<com.anova.anovacloud.shared.dto.UserDto> implements com.gwtplatform.dispatch.rest.client.serialization.mappers.com_anova_anovacloud_shared_dto_UserDtoMapper {
  
  public com_anova_anovacloud_shared_dto_UserDtoMapperImpl() {
    super("UserDto");
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonDeserializer<com.anova.anovacloud.shared.dto.UserDto> newDeserializer() {
    return new com.anova.anovacloud.shared.dto.UserDtoBeanJsonDeserializerImpl();
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonSerializer<com.anova.anovacloud.shared.dto.UserDto> newSerializer() {
    return new com.anova.anovacloud.shared.dto.UserDtoBeanJsonSerializerImpl();
  }
  
}
