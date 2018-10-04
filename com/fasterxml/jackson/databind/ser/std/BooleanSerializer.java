package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import java.lang.reflect.Type;

@JacksonStdImpl
public final class BooleanSerializer extends NonTypedScalarSerializerBase {
    public final boolean _forPrimitive;

    public BooleanSerializer(boolean z) {
        super(Boolean.class);
        this._forPrimitive = z;
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        if (jsonFormatVisitorWrapper != null) {
            jsonFormatVisitorWrapper.expectBooleanFormat(javaType);
        }
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("boolean", this._forPrimitive ^ 1);
    }

    public void serialize(Boolean bool, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeBoolean(bool.booleanValue());
    }
}
