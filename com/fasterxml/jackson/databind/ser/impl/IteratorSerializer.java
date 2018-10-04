package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import java.util.Iterator;

@JacksonStdImpl
public class IteratorSerializer extends AsArraySerializerBase {
    public boolean hasSingleElement(Iterator it) {
        return false;
    }

    public IteratorSerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer, BeanProperty beanProperty) {
        super(Iterator.class, javaType, z, typeSerializer, beanProperty, null);
    }

    public IteratorSerializer(IteratorSerializer iteratorSerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer jsonSerializer) {
        super(iteratorSerializer, beanProperty, typeSerializer, jsonSerializer);
    }

    public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new IteratorSerializer(this._elementType, this._staticTyping, typeSerializer, this._property);
    }

    public boolean isEmpty(Iterator it) {
        if (it != null) {
            if (it.hasNext()) {
                return false;
            }
        }
        return true;
    }

    public void serializeContents(Iterator it, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (it.hasNext()) {
            TypeSerializer typeSerializer = this._valueTypeSerializer;
            Class cls = null;
            JsonSerializer jsonSerializer = null;
            do {
                Object next = it.next();
                if (next == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else {
                    Class cls2 = next.getClass();
                    if (cls2 != cls) {
                        jsonSerializer = serializerProvider.findValueSerializer(cls2, this._property);
                        cls = cls2;
                    }
                    if (typeSerializer == null) {
                        jsonSerializer.serialize(next, jsonGenerator, serializerProvider);
                    } else {
                        jsonSerializer.serializeWithType(next, jsonGenerator, serializerProvider, typeSerializer);
                    }
                }
            } while (it.hasNext());
        }
    }

    public IteratorSerializer withResolved(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer jsonSerializer) {
        return new IteratorSerializer(this, beanProperty, typeSerializer, jsonSerializer);
    }
}
