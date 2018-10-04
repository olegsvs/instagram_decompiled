package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;

public final class NullNode extends ValueNode {
    public static final NullNode instance = new NullNode();

    public String asText() {
        return "null";
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    private NullNode() {
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_NULL;
    }

    public static NullNode getInstance() {
        return instance;
    }

    public JsonNodeType getNodeType() {
        return JsonNodeType.NULL;
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        serializerProvider.defaultSerializeNull(jsonGenerator);
    }
}
