package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public final class TypeWrappedSerializer extends JsonSerializer {
    public final JsonSerializer _serializer;
    public final TypeSerializer _typeSerializer;

    public TypeWrappedSerializer(TypeSerializer typeSerializer, JsonSerializer jsonSerializer) {
        this._typeSerializer = typeSerializer;
        this._serializer = jsonSerializer;
    }

    public Class handledType() {
        return Object.class;
    }

    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        this._serializer.serializeWithType(obj, jsonGenerator, serializerProvider, this._typeSerializer);
    }

    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        this._serializer.serializeWithType(obj, jsonGenerator, serializerProvider, typeSerializer);
    }
}
