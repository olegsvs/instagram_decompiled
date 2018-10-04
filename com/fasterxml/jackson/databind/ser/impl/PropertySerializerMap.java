package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public abstract class PropertySerializerMap {

    public final class SerializerAndMapResult {
        public final PropertySerializerMap map;
        public final JsonSerializer serializer;

        public SerializerAndMapResult(JsonSerializer jsonSerializer, PropertySerializerMap propertySerializerMap) {
            this.serializer = jsonSerializer;
            this.map = propertySerializerMap;
        }
    }

    public final class TypeAndSerializer {
        public final JsonSerializer serializer;
        public final Class type;

        public TypeAndSerializer(Class cls, JsonSerializer jsonSerializer) {
            this.type = cls;
            this.serializer = jsonSerializer;
        }
    }

    public abstract PropertySerializerMap newWith(Class cls, JsonSerializer jsonSerializer);

    public abstract JsonSerializer serializerFor(Class cls);

    public static PropertySerializerMap emptyMap() {
        return PropertySerializerMap$Empty.instance;
    }

    public final SerializerAndMapResult findAndAddSerializer(JavaType javaType, SerializerProvider serializerProvider, BeanProperty beanProperty) {
        JsonSerializer findValueSerializer = serializerProvider.findValueSerializer(javaType, beanProperty);
        return new SerializerAndMapResult(findValueSerializer, newWith(javaType.getRawClass(), findValueSerializer));
    }

    public final SerializerAndMapResult findAndAddSerializer(Class cls, SerializerProvider serializerProvider, BeanProperty beanProperty) {
        JsonSerializer findValueSerializer = serializerProvider.findValueSerializer(cls, beanProperty);
        return new SerializerAndMapResult(findValueSerializer, newWith(cls, findValueSerializer));
    }
}
