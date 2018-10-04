package com.fasterxml.jackson.databind.ser.impl;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.std.ArraySerializerBase;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Type;

@JacksonStdImpl
public class StringArraySerializer extends ArraySerializerBase implements ContextualSerializer {
    private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(String.class);
    public static final StringArraySerializer instance = new StringArraySerializer();
    public final JsonSerializer _elementSerializer;

    public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return this;
    }

    public StringArraySerializer() {
        super(String[].class, null);
        this._elementSerializer = null;
    }

    public StringArraySerializer(StringArraySerializer stringArraySerializer, BeanProperty beanProperty, JsonSerializer jsonSerializer) {
        super((ArraySerializerBase) stringArraySerializer, beanProperty);
        this._elementSerializer = jsonSerializer;
    }

    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) {
        if (jsonFormatVisitorWrapper != null) {
            jsonFormatVisitorWrapper = jsonFormatVisitorWrapper.expectArrayFormat(javaType);
            if (jsonFormatVisitorWrapper != null) {
                jsonFormatVisitorWrapper.itemsFormat(JsonFormatTypes.STRING);
            }
        }
    }

    public JsonSerializer createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) {
        JsonSerializer serializerInstance;
        JsonSerializer findConvertingContentSerializer;
        if (beanProperty != null) {
            Annotated member = beanProperty.getMember();
            if (member != null) {
                Object findContentSerializer = serializerProvider.getAnnotationIntrospector().findContentSerializer(member);
                if (findContentSerializer != null) {
                    serializerInstance = serializerProvider.serializerInstance(member, findContentSerializer);
                    if (serializerInstance == null) {
                        serializerInstance = this._elementSerializer;
                    }
                    findConvertingContentSerializer = findConvertingContentSerializer(serializerProvider, beanProperty, serializerInstance);
                    if (findConvertingContentSerializer == null) {
                        findConvertingContentSerializer = serializerProvider.findValueSerializer(String.class, beanProperty);
                    } else if (findConvertingContentSerializer instanceof ContextualSerializer) {
                        findConvertingContentSerializer = ((ContextualSerializer) findConvertingContentSerializer).createContextual(serializerProvider, beanProperty);
                    }
                    if (isDefaultSerializer(findConvertingContentSerializer)) {
                        findConvertingContentSerializer = null;
                    }
                    if (findConvertingContentSerializer != this._elementSerializer) {
                        return this;
                    }
                    return new StringArraySerializer(this, beanProperty, findConvertingContentSerializer);
                }
            }
        }
        serializerInstance = null;
        if (serializerInstance == null) {
            serializerInstance = this._elementSerializer;
        }
        findConvertingContentSerializer = findConvertingContentSerializer(serializerProvider, beanProperty, serializerInstance);
        if (findConvertingContentSerializer == null) {
            findConvertingContentSerializer = serializerProvider.findValueSerializer(String.class, beanProperty);
        } else if (findConvertingContentSerializer instanceof ContextualSerializer) {
            findConvertingContentSerializer = ((ContextualSerializer) findConvertingContentSerializer).createContextual(serializerProvider, beanProperty);
        }
        if (isDefaultSerializer(findConvertingContentSerializer)) {
            findConvertingContentSerializer = null;
        }
        if (findConvertingContentSerializer != this._elementSerializer) {
            return new StringArraySerializer(this, beanProperty, findConvertingContentSerializer);
        }
        return this;
    }

    public JsonSerializer getContentSerializer() {
        return this._elementSerializer;
    }

    public JavaType getContentType() {
        return VALUE_TYPE;
    }

    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        JsonNode createSchemaNode = createSchemaNode("array", true);
        createSchemaNode.put(DialogModule.KEY_ITEMS, createSchemaNode("string"));
        return createSchemaNode;
    }

    public boolean hasSingleElement(String[] strArr) {
        return strArr.length == 1;
    }

    public boolean isEmpty(String[] strArr) {
        if (strArr != null) {
            if (strArr.length != 0) {
                return false;
            }
        }
        return true;
    }

    public void serializeContents(String[] strArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        int length = strArr.length;
        if (length != 0) {
            JsonSerializer jsonSerializer = this._elementSerializer;
            if (jsonSerializer != null) {
                serializeContentsSlow(strArr, jsonGenerator, serializerProvider, jsonSerializer);
                return;
            }
            for (int i = 0; i < length; i++) {
                if (strArr[i] == null) {
                    jsonGenerator.writeNull();
                } else {
                    jsonGenerator.writeString(strArr[i]);
                }
            }
        }
    }

    private void serializeContentsSlow(String[] strArr, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, JsonSerializer jsonSerializer) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (strArr[i] == null) {
                serializerProvider.defaultSerializeNull(jsonGenerator);
            } else {
                jsonSerializer.serialize(strArr[i], jsonGenerator, serializerProvider);
            }
        }
    }
}
