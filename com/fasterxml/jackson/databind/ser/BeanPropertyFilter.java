package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.node.ObjectNode;

public interface BeanPropertyFilter {
    void depositSchemaProperty(BeanPropertyWriter beanPropertyWriter, JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider);

    void depositSchemaProperty(BeanPropertyWriter beanPropertyWriter, ObjectNode objectNode, SerializerProvider serializerProvider);

    void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, BeanPropertyWriter beanPropertyWriter);
}
