package com.gwtplatform.dispatch.rest.client.serialization.mappers;

public class com_anova_anovacloud_shared_dispatch_LogInRequestMapperImpl extends com.github.nmorel.gwtjackson.client.AbstractObjectMapper<com.anova.anovacloud.shared.dispatch.LogInRequest> implements com.gwtplatform.dispatch.rest.client.serialization.mappers.com_anova_anovacloud_shared_dispatch_LogInRequestMapper {
  
  public com_anova_anovacloud_shared_dispatch_LogInRequestMapperImpl() {
    super("LogInRequest");
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonDeserializer<com.anova.anovacloud.shared.dispatch.LogInRequest> newDeserializer() {
    return new com.anova.anovacloud.shared.dispatch.LogInRequestBeanJsonDeserializerImpl();
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonSerializer<com.anova.anovacloud.shared.dispatch.LogInRequest> newSerializer() {
    return new com.anova.anovacloud.shared.dispatch.LogInRequestBeanJsonSerializerImpl();
  }
  
}
