package com.gwtplatform.dispatch.rest.client.serialization.mappers;

public class com_anova_anovacloud_shared_dispatch_LogInResultMapperImpl extends com.github.nmorel.gwtjackson.client.AbstractObjectMapper<com.anova.anovacloud.shared.dispatch.LogInResult> implements com.gwtplatform.dispatch.rest.client.serialization.mappers.com_anova_anovacloud_shared_dispatch_LogInResultMapper {
  
  public com_anova_anovacloud_shared_dispatch_LogInResultMapperImpl() {
    super("LogInResult");
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonDeserializer<com.anova.anovacloud.shared.dispatch.LogInResult> newDeserializer() {
    return new com.anova.anovacloud.shared.dispatch.LogInResultBeanJsonDeserializerImpl();
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonSerializer<com.anova.anovacloud.shared.dispatch.LogInResult> newSerializer() {
    return new com.anova.anovacloud.shared.dispatch.LogInResultBeanJsonSerializerImpl();
  }
  
}
