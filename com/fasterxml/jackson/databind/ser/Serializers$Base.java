package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;

public class Serializers$Base implements Serializers {
    public JsonSerializer findArraySerializer(SerializationConfig serializationConfig, ArrayType arrayType, BeanDescription beanDescription, TypeSerializer typeSerializer, JsonSerializer jsonSerializer) {
        return null;
    }

    public JsonSerializer findCollectionLikeSerializer(SerializationConfig serializationConfig, CollectionLikeType collectionLikeType, BeanDescription beanDescription, TypeSerializer typeSerializer, JsonSerializer jsonSerializer) {
        return null;
    }

    public JsonSerializer findCollectionSerializer(SerializationConfig serializationConfig, CollectionType collectionType, BeanDescription beanDescription, TypeSerializer typeSerializer, JsonSerializer jsonSerializer) {
        return null;
    }

    public JsonSerializer findMapLikeSerializer(SerializationConfig serializationConfig, MapLikeType mapLikeType, BeanDescription beanDescription, JsonSerializer jsonSerializer, TypeSerializer typeSerializer, JsonSerializer jsonSerializer2) {
        return null;
    }

    public JsonSerializer findMapSerializer(SerializationConfig serializationConfig, MapType mapType, BeanDescription beanDescription, JsonSerializer jsonSerializer, TypeSerializer typeSerializer, JsonSerializer jsonSerializer2) {
        return null;
    }

    public JsonSerializer findSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription) {
        return null;
    }
}
