package com.fasterxml.jackson.databind.deser.std;

import com.facebook.common.dextricks.StartupQEsConfig;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

@JacksonStdImpl
public final class NumberDeserializers$DoubleDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$DoubleDeserializer primitiveInstance = new NumberDeserializers$DoubleDeserializer(Double.class, Double.valueOf(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED));
    private static final long serialVersionUID = 1;
    public static final NumberDeserializers$DoubleDeserializer wrapperInstance = new NumberDeserializers$DoubleDeserializer(Double.TYPE, null);

    public NumberDeserializers$DoubleDeserializer(Class cls, Double d) {
        super(cls, d);
    }

    public Double deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return _parseDouble(jsonParser, deserializationContext);
    }

    public Double deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return _parseDouble(jsonParser, deserializationContext);
    }
}
