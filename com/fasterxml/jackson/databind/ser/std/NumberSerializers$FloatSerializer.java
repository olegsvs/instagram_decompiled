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
public final class NumberSerializers$FloatSerializer extends StdScalarSerializer {
    public static final NumberSerializers$FloatSerializer instance = new NumberSerializers$FloatSerializer();

    public NumberSerializers$FloatSerializer() {
        super(Float.class);
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        jsonFormatVisitorWrapper = jsonFormatVisitorWrapper.expectNumberFormat(javaType);
        if (jsonFormatVisitorWrapper != null) {
            jsonFormatVisitorWrapper.numberType(JsonParser$NumberType.FLOAT);
        }
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("number", true);
    }

    public void serialize(Float f, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNumber(f.floatValue());
    }
}
