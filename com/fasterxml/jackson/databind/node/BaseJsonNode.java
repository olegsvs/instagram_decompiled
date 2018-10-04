package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser$NumberType;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public abstract class BaseJsonNode extends JsonNode implements JsonSerializable {
    public abstract JsonToken asToken();

    public JsonParser$NumberType numberType() {
        return null;
    }

    public abstract void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider);

    public abstract void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer);

    public final JsonNode findPath(String str) {
        JsonNode findValue = findValue(str);
        return findValue == null ? MissingNode.getInstance() : findValue;
    }

    public JsonParser traverse() {
        return new TreeTraversingParser(this);
    }

    public JsonParser traverse(ObjectCodec objectCodec) {
        return new TreeTraversingParser(this, objectCodec);
    }
}
