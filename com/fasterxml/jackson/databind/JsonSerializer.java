package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.NameTransformer;

public abstract class JsonSerializer implements JsonFormatVisitable {

    public abstract class None extends JsonSerializer {
    }

    public JsonSerializer getDelegatee() {
        return null;
    }

    public Class handledType() {
        return null;
    }

    public boolean isEmpty(Object obj) {
        return obj == null;
    }

    public boolean isUnwrappingSerializer() {
        return false;
    }

    public abstract void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider);

    public JsonSerializer unwrappingSerializer(NameTransformer nameTransformer) {
        return this;
    }

    public boolean usesObjectId() {
        return false;
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        if (jsonFormatVisitorWrapper != null) {
            jsonFormatVisitorWrapper.expectAnyFormat(javaType);
        }
    }

    public JsonSerializer replaceDelegatee(JsonSerializer jsonSerializer) {
        throw new UnsupportedOperationException();
    }

    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        serializerProvider = handledType();
        if (serializerProvider == null) {
            serializerProvider = obj.getClass();
        }
        obj = new StringBuilder();
        obj.append("Type id handling not implemented for type ");
        obj.append(serializerProvider.getName());
        throw new UnsupportedOperationException(obj.toString());
    }
}
