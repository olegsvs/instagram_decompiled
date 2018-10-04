package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public final class MissingNode extends ValueNode {
    private static final MissingNode instance = new MissingNode();

    public String asText() {
        return JsonProperty.USE_DEFAULT_NAME;
    }

    public JsonNode deepCopy() {
        return this;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public String toString() {
        return JsonProperty.USE_DEFAULT_NAME;
    }

    private MissingNode() {
    }

    public JsonToken asToken() {
        return JsonToken.NOT_AVAILABLE;
    }

    public static MissingNode getInstance() {
        return instance;
    }

    public JsonNodeType getNodeType() {
        return JsonNodeType.MISSING;
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNull();
    }

    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        jsonGenerator.writeNull();
    }
}
