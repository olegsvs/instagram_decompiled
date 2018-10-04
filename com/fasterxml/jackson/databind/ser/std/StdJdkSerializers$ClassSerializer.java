package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import java.lang.reflect.Type;

public final class StdJdkSerializers$ClassSerializer extends StdScalarSerializer {
    public StdJdkSerializers$ClassSerializer() {
        super(Class.class, false);
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        jsonFormatVisitorWrapper.expectStringFormat(javaType);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("string", true);
    }

    public void serialize(Class cls, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeString(cls.getName());
    }
}
