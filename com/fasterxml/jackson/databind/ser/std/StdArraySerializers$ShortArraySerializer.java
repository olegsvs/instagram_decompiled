package com.fasterxml.jackson.databind.ser.std;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
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
public final class StdArraySerializers$ShortArraySerializer extends StdArraySerializers$TypedPrimitiveArraySerializer {
    private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Short.TYPE);

    public JsonSerializer getContentSerializer() {
        return null;
    }

    public StdArraySerializers$ShortArraySerializer() {
        super(short[].class);
    }

    public StdArraySerializers$ShortArraySerializer(StdArraySerializers$ShortArraySerializer stdArraySerializers$ShortArraySerializer, BeanProperty beanProperty, TypeSerializer typeSerializer) {
        super(stdArraySerializers$ShortArraySerializer, beanProperty, typeSerializer);
    }

    public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new StdArraySerializers$ShortArraySerializer(this, this._property, typeSerializer);
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        if (jsonFormatVisitorWrapper != null) {
            jsonFormatVisitorWrapper = jsonFormatVisitorWrapper.expectArrayFormat(javaType);
            if (jsonFormatVisitorWrapper != null) {
                jsonFormatVisitorWrapper.itemsFormat(JsonFormatTypes.INTEGER);
            }
        }
    }

    public JavaType getContentType() {
        return VALUE_TYPE;
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        JsonNode createSchemaNode = createSchemaNode("array", true);
        createSchemaNode.put(DialogModule.KEY_ITEMS, createSchemaNode("integer"));
        return createSchemaNode;
    }

    public boolean hasSingleElement(short[] sArr) {
        return sArr.length == 1;
    }

    public boolean isEmpty(short[] sArr) {
        if (sArr != null) {
            if (sArr.length != 0) {
                return false;
            }
        }
        return true;
    }

    public void serializeContents(short[] sArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        int i = 0;
        if (this._valueTypeSerializer != null) {
            int length = sArr.length;
            while (i < length) {
                this._valueTypeSerializer.writeTypePrefixForScalar(null, jsonGenerator, Short.TYPE);
                jsonGenerator.writeNumber(sArr[i]);
                this._valueTypeSerializer.writeTypeSuffixForScalar(null, jsonGenerator);
                i++;
            }
            return;
        }
        int length2 = sArr.length;
        while (i < length2) {
            jsonGenerator.writeNumber(sArr[i]);
            i++;
        }
    }
}
