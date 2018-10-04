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
import java.util.List;

@JacksonStdImpl
public final class IndexedStringListSerializer extends StaticListSerializerBase implements ContextualSerializer {
    public static final IndexedStringListSerializer instance = new IndexedStringListSerializer();
    public final JsonSerializer _serializer;

    public IndexedStringListSerializer() {
        this(null);
    }

    public IndexedStringListSerializer(JsonSerializer jsonSerializer) {
        super(List.class);
        this._serializer = jsonSerializer;
    }

    private final void _serializeUnwrapped(List list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (this._serializer == null) {
            serializeContents(list, jsonGenerator, serializerProvider, 1);
        } else {
            serializeUsingCustom(list, jsonGenerator, serializerProvider, 1);
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
                    return new IndexedStringListSerializer(findConvertingContentSerializer);
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
            return new IndexedStringListSerializer(findConvertingContentSerializer);
        }
        return this;
    }

    public void serialize(List list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        int size = list.size();
        if (size == 1 && serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) {
            _serializeUnwrapped(list, jsonGenerator, serializerProvider);
            return;
        }
        jsonGenerator.writeStartArray();
        if (this._serializer == null) {
            serializeContents(list, jsonGenerator, serializerProvider, size);
        } else {
            serializeUsingCustom(list, jsonGenerator, serializerProvider, size);
        }
        jsonGenerator.writeEndArray();
    }

    private final void serializeContents(List list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, int i) {
        int i2 = 0;
        while (i2 < i) {
            try {
                String str = (String) list.get(i2);
                if (str == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else {
                    jsonGenerator.writeString(str);
                }
                i2++;
            } catch (Throwable e) {
                wrapAndThrow(serializerProvider, e, (Object) list, i2);
                return;
            }
        }
    }

    private final void serializeUsingCustom(List list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, int i) {
        int i2 = 0;
        try {
            JsonSerializer jsonSerializer = this._serializer;
            while (i2 < i) {
                String str = (String) list.get(i2);
                if (str == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else {
                    jsonSerializer.serialize(str, jsonGenerator, serializerProvider);
                }
                i2++;
            }
        } catch (Throwable e) {
            wrapAndThrow(serializerProvider, e, (Object) list, 0);
        }
    }

    public void serializeWithType(List list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        int size = list.size();
        typeSerializer.writeTypePrefixForArray(list, jsonGenerator);
        if (this._serializer == null) {
            serializeContents(list, jsonGenerator, serializerProvider, size);
        } else {
            serializeUsingCustom(list, jsonGenerator, serializerProvider, size);
        }
        typeSerializer.writeTypeSuffixForArray(list, jsonGenerator);
    }
}
