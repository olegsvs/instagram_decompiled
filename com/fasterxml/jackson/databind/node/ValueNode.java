package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.util.List;

public abstract class ValueNode extends BaseJsonNode {
    public abstract JsonToken asToken();

    public JsonNode deepCopy() {
        return this;
    }

    public final ObjectNode findParent(String str) {
        return null;
    }

    public final List findParents(String str, List list) {
        return list;
    }

    public final JsonNode findValue(String str) {
        return null;
    }

    public final List findValues(String str, List list) {
        return list;
    }

    public final List findValuesAsText(String str, List list) {
        return list;
    }

    public final JsonNode get(int i) {
        return null;
    }

    public final JsonNode get(String str) {
        return null;
    }

    public final boolean has(int i) {
        return false;
    }

    public final boolean has(String str) {
        return false;
    }

    public final boolean hasNonNull(int i) {
        return false;
    }

    public final boolean hasNonNull(String str) {
        return false;
    }

    public final JsonNode path(int i) {
        return MissingNode.getInstance();
    }

    public final JsonNode path(String str) {
        return MissingNode.getInstance();
    }

    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        typeSerializer.writeTypePrefixForScalar(this, jsonGenerator);
        serialize(jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffixForScalar(this, jsonGenerator);
    }

    public String toString() {
        return asText();
    }
}
