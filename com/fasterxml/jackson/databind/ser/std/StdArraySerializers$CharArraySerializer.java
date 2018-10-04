package com.fasterxml.jackson.databind.ser.std;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.lang.reflect.Type;

@JacksonStdImpl
public final class StdArraySerializers$CharArraySerializer extends StdSerializer {
    public StdArraySerializers$CharArraySerializer() {
        super(char[].class);
    }

    private final void _writeArrayContents(JsonGenerator jsonGenerator, char[] cArr) {
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            jsonGenerator.writeString(cArr, i, 1);
        }
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        if (jsonFormatVisitorWrapper != null) {
            jsonFormatVisitorWrapper = jsonFormatVisitorWrapper.expectArrayFormat(javaType);
            if (jsonFormatVisitorWrapper != null) {
                jsonFormatVisitorWrapper.itemsFormat(JsonFormatTypes.STRING);
            }
        }
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        serializerProvider = createSchemaNode("array", true);
        String str = "string";
        JsonNode createSchemaNode = createSchemaNode(str);
        createSchemaNode.put("type", str);
        serializerProvider.put(DialogModule.KEY_ITEMS, createSchemaNode);
        return serializerProvider;
    }

    public boolean isEmpty(char[] cArr) {
        if (cArr != null) {
            if (cArr.length != 0) {
                return false;
            }
        }
        return true;
    }

    public void serialize(char[] cArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (serializerProvider.isEnabled(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
            jsonGenerator.writeStartArray();
            _writeArrayContents(jsonGenerator, cArr);
            jsonGenerator.writeEndArray();
            return;
        }
        jsonGenerator.writeString(cArr, 0, cArr.length);
    }

    public void serializeWithType(char[] cArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        if (serializerProvider.isEnabled(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
            typeSerializer.writeTypePrefixForArray(cArr, jsonGenerator);
            _writeArrayContents(jsonGenerator, cArr);
            typeSerializer.writeTypeSuffixForArray(cArr, jsonGenerator);
            return;
        }
        typeSerializer.writeTypePrefixForScalar(cArr, jsonGenerator);
        jsonGenerator.writeString(cArr, 0, cArr.length);
        typeSerializer.writeTypeSuffixForScalar(cArr, jsonGenerator);
    }
}
