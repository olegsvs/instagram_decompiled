package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;

public final class StdJdkSerializers$AtomicBooleanSerializer extends StdScalarSerializer {
    public StdJdkSerializers$AtomicBooleanSerializer() {
        super(AtomicBoolean.class, false);
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        jsonFormatVisitorWrapper.expectBooleanFormat(javaType);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("boolean", true);
    }

    public void serialize(AtomicBoolean atomicBoolean, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeBoolean(atomicBoolean.get());
    }
}
