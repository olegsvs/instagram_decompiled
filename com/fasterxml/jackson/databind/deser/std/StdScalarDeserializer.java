package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

public abstract class StdScalarDeserializer extends StdDeserializer {
    private static final long serialVersionUID = 1;

    public StdScalarDeserializer(JavaType javaType) {
        super(javaType);
    }

    public StdScalarDeserializer(Class cls) {
        super(cls);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromScalar(jsonParser, deserializationContext);
    }
}
