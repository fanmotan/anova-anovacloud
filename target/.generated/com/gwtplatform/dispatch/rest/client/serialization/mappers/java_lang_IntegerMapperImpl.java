package com.gwtplatform.dispatch.rest.client.serialization.mappers;

public class java_lang_IntegerMapperImpl extends com.github.nmorel.gwtjackson.client.AbstractObjectMapper<java.lang.Integer> implements com.gwtplatform.dispatch.rest.client.serialization.mappers.java_lang_IntegerMapper {
  
  public java_lang_IntegerMapperImpl() {
    super("Integer");
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonDeserializer<java.lang.Integer> newDeserializer() {
    return com.github.nmorel.gwtjackson.client.deser.BaseNumberJsonDeserializer.IntegerJsonDeserializer.getInstance();
  }
  
  @Override
  protected com.github.nmorel.gwtjackson.client.JsonSerializer<java.lang.Integer> newSerializer() {
    return com.github.nmorel.gwtjackson.client.ser.BaseNumberJsonSerializer.IntegerJsonSerializer.getInstance();
  }
  
}
