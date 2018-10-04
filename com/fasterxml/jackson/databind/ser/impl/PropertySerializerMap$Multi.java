package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.TypeAndSerializer;

public final class PropertySerializerMap$Multi extends PropertySerializerMap {
    private static final int MAX_ENTRIES = 8;
    private final TypeAndSerializer[] _entries;

    public PropertySerializerMap$Multi(TypeAndSerializer[] typeAndSerializerArr) {
        this._entries = typeAndSerializerArr;
    }

    public PropertySerializerMap newWith(Class cls, JsonSerializer jsonSerializer) {
        Object obj = this._entries;
        int length = obj.length;
        if (length == 8) {
            return this;
        }
        Object obj2 = new TypeAndSerializer[(length + 1)];
        System.arraycopy(obj, 0, obj2, 0, length);
        obj2[length] = new TypeAndSerializer(cls, jsonSerializer);
        return new PropertySerializerMap$Multi(obj2);
    }

    public JsonSerializer serializerFor(Class cls) {
        for (TypeAndSerializer typeAndSerializer : this._entries) {
            if (typeAndSerializer.type == cls) {
                return typeAndSerializer.serializer;
            }
        }
        return null;
    }
}
