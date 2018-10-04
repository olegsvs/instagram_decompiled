package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SimpleDeserializers implements Deserializers, Serializable {
    private static final long serialVersionUID = -3006673354353448880L;
    public HashMap _classMappings = null;

    public SimpleDeserializers(Map map) {
        addDeserializers(map);
    }

    public void addDeserializer(Class cls, JsonDeserializer jsonDeserializer) {
        ClassKey classKey = new ClassKey(cls);
        if (this._classMappings == null) {
            this._classMappings = new HashMap();
        }
        this._classMappings.put(classKey, jsonDeserializer);
    }

    public void addDeserializers(Map map) {
        for (Entry entry : map.entrySet()) {
            addDeserializer((Class) entry.getKey(), (JsonDeserializer) entry.getValue());
        }
    }

    public JsonDeserializer findArrayDeserializer(ArrayType arrayType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer jsonDeserializer) {
        HashMap hashMap = this._classMappings;
        return hashMap == null ? null : (JsonDeserializer) hashMap.get(new ClassKey(arrayType.getRawClass()));
    }

    public JsonDeserializer findBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        HashMap hashMap = this._classMappings;
        return hashMap == null ? null : (JsonDeserializer) hashMap.get(new ClassKey(javaType.getRawClass()));
    }

    public JsonDeserializer findCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer jsonDeserializer) {
        HashMap hashMap = this._classMappings;
        return hashMap == null ? null : (JsonDeserializer) hashMap.get(new ClassKey(collectionType.getRawClass()));
    }

    public JsonDeserializer findCollectionLikeDeserializer(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer jsonDeserializer) {
        HashMap hashMap = this._classMappings;
        return hashMap == null ? null : (JsonDeserializer) hashMap.get(new ClassKey(collectionLikeType.getRawClass()));
    }

    public JsonDeserializer findEnumDeserializer(Class cls, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        HashMap hashMap = this._classMappings;
        return hashMap == null ? null : (JsonDeserializer) hashMap.get(new ClassKey(cls));
    }

    public JsonDeserializer findMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer jsonDeserializer) {
        HashMap hashMap = this._classMappings;
        return hashMap == null ? null : (JsonDeserializer) hashMap.get(new ClassKey(mapType.getRawClass()));
    }

    public JsonDeserializer findMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer jsonDeserializer) {
        HashMap hashMap = this._classMappings;
        return hashMap == null ? null : (JsonDeserializer) hashMap.get(new ClassKey(mapLikeType.getRawClass()));
    }

    public JsonDeserializer findTreeNodeDeserializer(Class cls, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        HashMap hashMap = this._classMappings;
        return hashMap == null ? null : (JsonDeserializer) hashMap.get(new ClassKey(cls));
    }
}
