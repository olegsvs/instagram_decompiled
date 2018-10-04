package com.fasterxml.jackson.databind.ser.std;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.lang.reflect.Type;

@JacksonStdImpl
public final class StdArraySerializers$ByteArraySerializer extends StdSerializer {
    public StdArraySerializers$ByteArraySerializer() {
        super(byte[].class);
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
        JsonNode createSchemaNode = createSchemaNode("array", true);
        createSchemaNode.put(DialogModule.KEY_ITEMS, createSchemaNode("string"));
        return createSchemaNode;
    }

    public boolean isEmpty(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length != 0) {
                return false;
            }
        }
        return true;
    }

    public void serialize(byte[] bArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeBinary(serializerProvider.getConfig().getBase64Variant(), bArr, 0, bArr.length);
    }

    public void serializeWithType(byte[] bArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        typeSerializer.writeTypePrefixForScalar(bArr, jsonGenerator);
        jsonGenerator.writeBinary(serializerProvider.getConfig().getBase64Variant(), bArr, 0, bArr.length);
        typeSerializer.writeTypeSuffixForScalar(bArr, jsonGenerator);
    }
}
