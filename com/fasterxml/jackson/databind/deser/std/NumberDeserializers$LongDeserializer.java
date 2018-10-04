package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public final class NumberDeserializers$LongDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$LongDeserializer primitiveInstance = new NumberDeserializers$LongDeserializer(Long.class, Long.valueOf(0));
    private static final long serialVersionUID = 1;
    public static final NumberDeserializers$LongDeserializer wrapperInstance = new NumberDeserializers$LongDeserializer(Long.TYPE, null);

    public NumberDeserializers$LongDeserializer(Class cls, Long l) {
        super(cls, l);
    }

    public Long deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _parseLong(jsonParser, deserializationContext);
    }
}
