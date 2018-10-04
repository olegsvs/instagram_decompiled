package com.fasterxml.jackson.databind.ser.std;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Type;

@JacksonStdImpl
public final class StdArraySerializers$BooleanArraySerializer extends ArraySerializerBase {
    private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Boolean.class);

    public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return this;
    }

    public JsonSerializer getContentSerializer() {
        return null;
    }

    public StdArraySerializers$BooleanArraySerializer() {
        super(boolean[].class, null);
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        if (jsonFormatVisitorWrapper != null) {
            jsonFormatVisitorWrapper = jsonFormatVisitorWrapper.expectArrayFormat(javaType);
            if (jsonFormatVisitorWrapper != null) {
                jsonFormatVisitorWrapper.itemsFormat(JsonFormatTypes.BOOLEAN);
            }
        }
    }

    public JavaType getContentType() {
        return VALUE_TYPE;
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        JsonNode createSchemaNode = createSchemaNode("array", true);
        createSchemaNode.put(DialogModule.KEY_ITEMS, createSchemaNode("boolean"));
        return createSchemaNode;
    }

    public boolean hasSingleElement(boolean[] zArr) {
        return zArr.length == 1;
    }

    public boolean isEmpty(boolean[] zArr) {
        if (zArr != null) {
            if (zArr.length != 0) {
                return false;
            }
        }
        return true;
    }

    public void serializeContents(boolean[] zArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        for (boolean writeBoolean : zArr) {
            jsonGenerator.writeBoolean(writeBoolean);
        }
    }
}
