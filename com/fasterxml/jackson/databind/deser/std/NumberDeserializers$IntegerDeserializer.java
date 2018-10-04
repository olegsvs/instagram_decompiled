package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

@JacksonStdImpl
public final class NumberDeserializers$IntegerDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$IntegerDeserializer primitiveInstance = new NumberDeserializers$IntegerDeserializer(Integer.class, Integer.valueOf(0));
    private static final long serialVersionUID = 1;
    public static final NumberDeserializers$IntegerDeserializer wrapperInstance = new NumberDeserializers$IntegerDeserializer(Integer.TYPE, null);

    public NumberDeserializers$IntegerDeserializer(Class cls, Integer num) {
        super(cls, num);
    }

    public Integer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _parseInteger(jsonParser, deserializationContext);
    }

    public Integer deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return _parseInteger(jsonParser, deserializationContext);
    }
}
