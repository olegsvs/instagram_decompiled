package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

public final class TypeWrappedDeserializer extends JsonDeserializer {
    public final JsonDeserializer _deserializer;
    public final TypeDeserializer _typeDeserializer;

    public TypeWrappedDeserializer(TypeDeserializer typeDeserializer, JsonDeserializer jsonDeserializer) {
        this._typeDeserializer = typeDeserializer;
        this._deserializer = jsonDeserializer;
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        return this._deserializer.deserializeWithType(jsonParser, deserializationContext, this._typeDeserializer);
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        return this._deserializer.deserialize(jsonParser, deserializationContext, obj);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        throw new IllegalStateException("Type-wrapped deserializer's deserializeWithType should never get called");
    }
}
