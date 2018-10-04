package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

@JacksonStdImpl
public final class NumberDeserializers$BooleanDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$BooleanDeserializer primitiveInstance = new NumberDeserializers$BooleanDeserializer(Boolean.class, Boolean.FALSE);
    private static final long serialVersionUID = 1;
    public static final NumberDeserializers$BooleanDeserializer wrapperInstance = new NumberDeserializers$BooleanDeserializer(Boolean.TYPE, null);

    public NumberDeserializers$BooleanDeserializer(Class cls, Boolean bool) {
        super(cls, bool);
    }

    public Boolean deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _parseBoolean(jsonParser, deserializationContext);
    }

    public Boolean deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return _parseBoolean(jsonParser, deserializationContext);
    }
}
