package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.Collection;

public abstract class JsonDeserializer {
    public abstract Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext);

    public JsonDeserializer getDelegatee() {
        return null;
    }

    public Collection getKnownPropertyNames() {
        return null;
    }

    public Object getNullValue() {
        return null;
    }

    public ObjectIdReader getObjectIdReader() {
        return null;
    }

    public boolean isCachable() {
        return false;
    }

    public JsonDeserializer unwrappingDeserializer(NameTransformer nameTransformer) {
        return this;
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can not update object of type ");
        stringBuilder.append(obj.getClass().getName());
        stringBuilder.append(" (by deserializer of type ");
        stringBuilder.append(getClass().getName());
        stringBuilder.append(")");
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    public Object getEmptyValue() {
        return getNullValue();
    }

    public JsonDeserializer replaceDelegatee(JsonDeserializer jsonDeserializer) {
        throw new UnsupportedOperationException();
    }
}
