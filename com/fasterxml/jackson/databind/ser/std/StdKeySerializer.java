package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import java.lang.reflect.Type;
import java.util.Date;

public class StdKeySerializer extends StdSerializer {
    public static final StdKeySerializer instace = new StdKeySerializer();

    public StdKeySerializer() {
        super(Object.class);
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        jsonFormatVisitorWrapper.expectStringFormat(javaType);
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("string");
    }

    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (obj instanceof Date) {
            serializerProvider.defaultSerializeDateKey((Date) obj, jsonGenerator);
        } else {
            jsonGenerator.writeFieldName(obj.toString());
        }
    }
}
