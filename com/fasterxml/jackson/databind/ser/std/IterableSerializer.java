package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import java.util.Iterator;

@JacksonStdImpl
public class IterableSerializer extends AsArraySerializerBase {
    public boolean hasSingleElement(Iterable iterable) {
        return false;
    }

    public IterableSerializer(JavaType javaType, boolean z, TypeSerializer typeSerializer, BeanProperty beanProperty) {
        super(Iterable.class, javaType, z, typeSerializer, beanProperty, null);
    }

    public IterableSerializer(IterableSerializer iterableSerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer jsonSerializer) {
        super(iterableSerializer, beanProperty, typeSerializer, jsonSerializer);
    }

    public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new IterableSerializer(this._elementType, this._staticTyping, typeSerializer, this._property);
    }

    public boolean isEmpty(Iterable iterable) {
        if (iterable != null) {
            if (iterable.iterator().hasNext()) {
                return false;
            }
        }
        return true;
    }

    public void serializeContents(Iterable iterable, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Iterator it = iterable.iterator();
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

    public IterableSerializer withResolved(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer jsonSerializer) {
        return new IterableSerializer(this, beanProperty, typeSerializer, jsonSerializer);
    }
}
