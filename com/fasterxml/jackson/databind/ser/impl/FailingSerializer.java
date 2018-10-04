package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.lang.reflect.Type;

public final class FailingSerializer extends StdSerializer {
    public final String _msg;

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return null;
    }

    public FailingSerializer(String str) {
        super(Object.class);
        this._msg = str;
    }

    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        throw new JsonGenerationException(this._msg);
    }
}
