package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import java.io.File;
import java.lang.reflect.Type;

public final class StdJdkSerializers$FileSerializer extends StdScalarSerializer {
    public StdJdkSerializers$FileSerializer() {
        super(File.class);
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        jsonFormatVisitorWrapper.expectStringFormat(javaType);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("string", true);
    }

    public void serialize(File file, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeString(file.getAbsolutePath());
    }
}
