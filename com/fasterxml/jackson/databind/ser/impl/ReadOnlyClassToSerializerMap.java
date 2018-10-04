package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.SerializerCache.TypeKey;
import java.util.HashMap;

public final class ReadOnlyClassToSerializerMap {
    public TypeKey _cacheKey = null;
    public final JsonSerializerMap _map;

    private ReadOnlyClassToSerializerMap(JsonSerializerMap jsonSerializerMap) {
        this._map = jsonSerializerMap;
    }

    public static ReadOnlyClassToSerializerMap from(HashMap hashMap) {
        return new ReadOnlyClassToSerializerMap(new JsonSerializerMap(hashMap));
    }

    public ReadOnlyClassToSerializerMap instance() {
        return new ReadOnlyClassToSerializerMap(this._map);
    }

    public JsonSerializer typedValueSerializer(JavaType javaType) {
        TypeKey typeKey = this._cacheKey;
        if (typeKey == null) {
            this._cacheKey = new TypeKey(javaType, true);
        } else {
            typeKey.resetTyped(javaType);
        }
        return this._map.find(this._cacheKey);
    }

    public JsonSerializer typedValueSerializer(Class cls) {
        TypeKey typeKey = this._cacheKey;
        if (typeKey == null) {
            this._cacheKey = new TypeKey(cls, true);
        } else {
            typeKey.resetTyped(cls);
        }
        return this._map.find(this._cacheKey);
    }

    public JsonSerializer untypedValueSerializer(JavaType javaType) {
        TypeKey typeKey = this._cacheKey;
        if (typeKey == null) {
            this._cacheKey = new TypeKey(javaType, false);
        } else {
            typeKey.resetUntyped(javaType);
        }
        return this._map.find(this._cacheKey);
    }

    public JsonSerializer untypedValueSerializer(Class cls) {
        TypeKey typeKey = this._cacheKey;
        if (typeKey == null) {
            this._cacheKey = new TypeKey(cls, false);
        } else {
            typeKey.resetUntyped(cls);
        }
        return this._map.find(this._cacheKey);
    }
}
