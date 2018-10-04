package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.TypeAndSerializer;

public final class PropertySerializerMap$Double extends PropertySerializerMap {
    private final JsonSerializer _serializer1;
    private final JsonSerializer _serializer2;
    private final Class _type1;
    private final Class _type2;

    public PropertySerializerMap$Double(Class cls, JsonSerializer jsonSerializer, Class cls2, JsonSerializer jsonSerializer2) {
        this._type1 = cls;
        this._serializer1 = jsonSerializer;
        this._type2 = cls2;
        this._serializer2 = jsonSerializer2;
    }

    public PropertySerializerMap newWith(Class cls, JsonSerializer jsonSerializer) {
        return new PropertySerializerMap$Multi(new TypeAndSerializer[]{new TypeAndSerializer(this._type1, this._serializer1), new TypeAndSerializer(this._type2, this._serializer2)});
    }

    public JsonSerializer serializerFor(Class cls) {
        if (cls == this._type1) {
            return this._serializer1;
        }
        return cls == this._type2 ? this._serializer2 : null;
    }
}
