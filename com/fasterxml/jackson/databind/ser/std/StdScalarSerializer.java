package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.lang.reflect.Type;

public abstract class StdScalarSerializer extends StdSerializer {
    public StdScalarSerializer(Class cls) {
        super(cls);
    }

    public StdScalarSerializer(Class cls, boolean z) {
        super(cls);
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        jsonFormatVisitorWrapper.expectAnyFormat(javaType);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("string", true);
    }

    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        typeSerializer.writeTypePrefixForScalar(obj, jsonGenerator);
        serialize(obj, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffixForScalar(obj, jsonGenerator);
    }
}
