package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JsonSerializer;

public final class PropertySerializerMap$Single extends PropertySerializerMap {
    private final JsonSerializer _serializer;
    private final Class _type;

    public PropertySerializerMap$Single(Class cls, JsonSerializer jsonSerializer) {
        this._type = cls;
        this._serializer = jsonSerializer;
    }

    public PropertySerializerMap newWith(Class cls, JsonSerializer jsonSerializer) {
        return new PropertySerializerMap$Double(this._type, this._serializer, cls, jsonSerializer);
    }

    public JsonSerializer serializerFor(Class cls) {
        return cls == this._type ? this._serializer : null;
    }
}
