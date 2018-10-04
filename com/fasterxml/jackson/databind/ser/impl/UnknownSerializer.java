package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.lang.reflect.Type;

public class UnknownSerializer extends StdSerializer {
    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return null;
    }

    public UnknownSerializer() {
        super(Object.class);
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        jsonFormatVisitorWrapper.expectAnyFormat(javaType);
    }

    public void failForEmpty(Object obj) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No serializer found for class ");
        stringBuilder.append(obj.getClass().getName());
        stringBuilder.append(" and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS) )");
        throw new JsonMappingException(stringBuilder.toString());
    }

    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (serializerProvider.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            failForEmpty(obj);
        }
        jsonGenerator.writeStartObject();
        jsonGenerator.writeEndObject();
    }

    public final void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        if (serializerProvider.isEnabled(SerializationFeature.FAIL_ON_EMPTY_BEANS)) {
            failForEmpty(obj);
        }
        typeSerializer.writeTypePrefixForObject(obj, jsonGenerator);
        typeSerializer.writeTypeSuffixForObject(obj, jsonGenerator);
    }
}
