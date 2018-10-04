package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public final class NumberDeserializers$ShortDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$ShortDeserializer primitiveInstance = new NumberDeserializers$ShortDeserializer(Short.class, Short.valueOf((short) 0));
    private static final long serialVersionUID = 1;
    public static final NumberDeserializers$ShortDeserializer wrapperInstance = new NumberDeserializers$ShortDeserializer(Short.TYPE, null);

    public NumberDeserializers$ShortDeserializer(Class cls, Short sh) {
        super(cls, sh);
    }

    public Short deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _parseShort(jsonParser, deserializationContext);
    }
}
