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
public final class NumberSerializers$IntegerSerializer extends NonTypedScalarSerializerBase {
    public NumberSerializers$IntegerSerializer() {
        super(Integer.class);
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

    public void serialize(Integer num, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNumber(num.intValue());
    }
}
