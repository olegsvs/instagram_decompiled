package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public abstract class NonTypedScalarSerializerBase extends StdScalarSerializer {
    public NonTypedScalarSerializerBase(Class cls) {
        super(cls);
    }

    public final void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        serialize(obj, jsonGenerator, serializerProvider);
    }
}
