package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import java.lang.reflect.Type;

@JacksonStdImpl
public final class StringSerializer extends NonTypedScalarSerializerBase {
    public StringSerializer() {
        super(String.class);
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        if (jsonFormatVisitorWrapper != null) {
            jsonFormatVisitorWrapper.expectStringFormat(javaType);
        }
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("string", true);
    }

    public boolean isEmpty(String str) {
        if (str != null) {
            if (str.length() != 0) {
                return false;
            }
        }
        return true;
    }

    public void serialize(String str, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeString(str);
    }
}
