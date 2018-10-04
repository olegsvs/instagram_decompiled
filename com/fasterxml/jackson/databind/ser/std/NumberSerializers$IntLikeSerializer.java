package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser$NumberType;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import java.lang.reflect.Type;

@JacksonStdImpl
public final class NumberSerializers$IntLikeSerializer extends StdScalarSerializer {
    public static final NumberSerializers$IntLikeSerializer instance = new NumberSerializers$IntLikeSerializer();

    public NumberSerializers$IntLikeSerializer() {
        super(Number.class);
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        jsonFormatVisitorWrapper = jsonFormatVisitorWrapper.expectIntegerFormat(javaType);
        if (jsonFormatVisitorWrapper != null) {
            jsonFormatVisitorWrapper.numberType(JsonParser$NumberType.INT);
        }
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("integer", true);
    }

    public void serialize(Number number, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNumber(number.intValue());
    }
}
