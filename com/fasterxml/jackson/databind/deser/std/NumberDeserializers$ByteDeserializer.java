package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public final class NumberDeserializers$ByteDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$ByteDeserializer primitiveInstance = new NumberDeserializers$ByteDeserializer(Byte.TYPE, Byte.valueOf((byte) 0));
    private static final long serialVersionUID = 1;
    public static final NumberDeserializers$ByteDeserializer wrapperInstance = new NumberDeserializers$ByteDeserializer(Byte.class, null);

    public NumberDeserializers$ByteDeserializer(Class cls, Byte b) {
        super(cls, b);
    }

    public Byte deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _parseByte(jsonParser, deserializationContext);
    }
}
