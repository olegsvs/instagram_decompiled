package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import java.util.Collection;

@JacksonStdImpl
public class StringCollectionSerializer extends StaticListSerializerBase implements ContextualSerializer {
    public static final StringCollectionSerializer instance = new StringCollectionSerializer();
    public final JsonSerializer _serializer;

    public StringCollectionSerializer() {
        this(null);
    }

    public StringCollectionSerializer(JsonSerializer jsonSerializer) {
        super(Collection.class);
        this._serializer = jsonSerializer;
    }

    private final void _serializeUnwrapped(Collection collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (this._serializer == null) {
            serializeContents(collection, jsonGenerator, serializerProvider);
        } else {
            serializeUsingCustom(collection, jsonGenerator, serializerProvider);
        }
    }

    public void acceptContentVisitor(JsonArrayFormatVisitor jsonArrayFormatVisitor) {
        jsonArrayFormatVisitor.itemsFormat(JsonFormatTypes.STRING);
    }

    public JsonNode contentSchema() {
        return createSchemaNode("string", true);
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
                        serializerInstance = this._serializer;
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
                    if (findConvertingContentSerializer != this._serializer) {
                        return this;
                    }
                    return new StringCollectionSerializer(findConvertingContentSerializer);
                }
            }
        }
        serializerInstance = null;
        if (serializerInstance == null) {
            serializerInstance = this._serializer;
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
        if (findConvertingContentSerializer != this._serializer) {
            return new StringCollectionSerializer(findConvertingContentSerializer);
        }
        return this;
    }

    public void serialize(Collection collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (collection.size() == 1 && serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) {
            _serializeUnwrapped(collection, jsonGenerator, serializerProvider);
            return;
        }
        jsonGenerator.writeStartArray();
        if (this._serializer == null) {
            serializeContents(collection, jsonGenerator, serializerProvider);
        } else {
            serializeUsingCustom(collection, jsonGenerator, serializerProvider);
        }
        jsonGenerator.writeEndArray();
    }

    private final void serializeContents(Collection collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (this._serializer != null) {
            serializeUsingCustom(collection, jsonGenerator, serializerProvider);
            return;
        }
        int i = 0;
        for (String str : collection) {
            if (str == null) {
                try {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } catch (Throwable e) {
                    wrapAndThrow(serializerProvider, e, (Object) collection, i);
                }
            } else {
                jsonGenerator.writeString(str);
            }
            i++;
        }
    }

    private void serializeUsingCustom(Collection collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        JsonSerializer jsonSerializer = this._serializer;
        for (String str : collection) {
            if (str == null) {
                try {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } catch (Throwable e) {
                    wrapAndThrow(serializerProvider, e, (Object) collection, 0);
                }
            } else {
                jsonSerializer.serialize(str, jsonGenerator, serializerProvider);
            }
        }
    }

    public void serializeWithType(Collection collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        typeSerializer.writeTypePrefixForArray(collection, jsonGenerator);
        if (this._serializer == null) {
            serializeContents(collection, jsonGenerator, serializerProvider);
        } else {
            serializeUsingCustom(collection, jsonGenerator, serializerProvider);
        }
        typeSerializer.writeTypeSuffixForArray(collection, jsonGenerator);
    }
}
