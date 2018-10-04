package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public abstract class StdArraySerializers$TypedPrimitiveArraySerializer extends ArraySerializerBase {
    public final TypeSerializer _valueTypeSerializer;

    public StdArraySerializers$TypedPrimitiveArraySerializer(StdArraySerializers$TypedPrimitiveArraySerializer stdArraySerializers$TypedPrimitiveArraySerializer, BeanProperty beanProperty, TypeSerializer typeSerializer) {
        super((ArraySerializerBase) stdArraySerializers$TypedPrimitiveArraySerializer, beanProperty);
        this._valueTypeSerializer = typeSerializer;
    }

    public StdArraySerializers$TypedPrimitiveArraySerializer(Class cls) {
        super(cls);
        this._valueTypeSerializer = null;
    }
}
