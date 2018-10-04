package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;

public class Deserializers$Base implements Deserializers {
    public JsonDeserializer findArrayDeserializer(ArrayType arrayType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer jsonDeserializer) {
        return null;
    }

    public JsonDeserializer findBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        return null;
    }

    public JsonDeserializer findCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer jsonDeserializer) {
        return null;
    }

    public JsonDeserializer findCollectionLikeDeserializer(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer jsonDeserializer) {
        return null;
    }

    public JsonDeserializer findEnumDeserializer(Class cls, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        return null;
    }

    public JsonDeserializer findMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer jsonDeserializer) {
        return null;
    }

    public JsonDeserializer findMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer jsonDeserializer) {
        return null;
    }

    public JsonDeserializer findTreeNodeDeserializer(Class cls, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        return null;
    }
}
