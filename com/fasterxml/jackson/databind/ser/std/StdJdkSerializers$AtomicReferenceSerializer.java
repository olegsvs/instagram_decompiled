package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;

public final class StdJdkSerializers$AtomicReferenceSerializer extends StdSerializer {
    public StdJdkSerializers$AtomicReferenceSerializer() {
        super(AtomicReference.class, false);
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        jsonFormatVisitorWrapper.expectAnyFormat(javaType);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("any", true);
    }

    public void serialize(AtomicReference atomicReference, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        serializerProvider.defaultSerializeValue(atomicReference.get(), jsonGenerator);
    }
}
