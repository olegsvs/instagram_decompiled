package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.lang.reflect.Type;

@JacksonStdImpl
public class ToStringSerializer extends StdSerializer {
    public static final ToStringSerializer instance = new ToStringSerializer();

    public ToStringSerializer() {
        super(Object.class);
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        if (jsonFormatVisitorWrapper != null) {
            jsonFormatVisitorWrapper.expectStringFormat(javaType);
        }
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode("string", true);
    }

    public boolean isEmpty(Object obj) {
        if (obj == null) {
            return true;
        }
        String obj2 = obj.toString();
        if (obj2 == null) {
            return true;
        }
        if (obj2.length() == 0) {
            return true;
        }
        return false;
    }

    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeString(obj.toString());
    }

    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        typeSerializer.writeTypePrefixForScalar(obj, jsonGenerator);
        serialize(obj, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffixForScalar(obj, jsonGenerator);
    }
}
