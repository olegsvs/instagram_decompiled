package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public final class NumberDeserializers$FloatDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$FloatDeserializer primitiveInstance = new NumberDeserializers$FloatDeserializer(Float.class, Float.valueOf(0.0f));
    private static final long serialVersionUID = 1;
    public static final NumberDeserializers$FloatDeserializer wrapperInstance = new NumberDeserializers$FloatDeserializer(Float.TYPE, null);

    public NumberDeserializers$FloatDeserializer(Class cls, Float f) {
        super(cls, f);
    }

    public Float deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _parseFloat(jsonParser, deserializationContext);
    }
}
