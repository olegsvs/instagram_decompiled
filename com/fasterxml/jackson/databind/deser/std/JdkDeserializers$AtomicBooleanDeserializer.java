package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.util.concurrent.atomic.AtomicBoolean;

public class JdkDeserializers$AtomicBooleanDeserializer extends StdScalarDeserializer {
    public static final JdkDeserializers$AtomicBooleanDeserializer instance = new JdkDeserializers$AtomicBooleanDeserializer();

    public JdkDeserializers$AtomicBooleanDeserializer() {
        super(AtomicBoolean.class);
    }

    public AtomicBoolean deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return new AtomicBoolean(_parseBooleanPrimitive(jsonParser, deserializationContext));
    }
}
