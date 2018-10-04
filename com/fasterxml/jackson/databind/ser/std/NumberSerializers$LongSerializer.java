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
public final class NumberSerializers$LongSerializer extends StdScalarSerializer {
    public static final NumberSerializers$LongSerializer instance = new NumberSerializers$LongSerializer();

    public NumberSerializers$LongSerializer() {
        super(Long.class);
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        jsonFormatVisitorWrapper = jsonFormatVisitorWrapper.expectIntegerFormat(javaType);
        if (jsonFormatVisitorWrapper != null) {
            jsonFormatVisitorWrapper.numberType(JsonParser$NumberType.LONG);
        }
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("number", true);
    }

    public void serialize(Long l, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNumber(l.longValue());
    }
}
