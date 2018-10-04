package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JsonSerializer;

public final class PropertySerializerMap$Empty extends PropertySerializerMap {
    public static final PropertySerializerMap$Empty instance = new PropertySerializerMap$Empty();

    public JsonSerializer serializerFor(Class cls) {
        return null;
    }

    private PropertySerializerMap$Empty() {
    }

    public PropertySerializerMap newWith(Class cls, JsonSerializer jsonSerializer) {
        return new PropertySerializerMap$Single(cls, jsonSerializer);
    }
}
