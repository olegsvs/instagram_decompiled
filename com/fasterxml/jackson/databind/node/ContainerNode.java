package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class ContainerNode extends BaseJsonNode implements JsonNodeCreator {
    public final JsonNodeFactory _nodeFactory;

    public String asText() {
        return JsonProperty.USE_DEFAULT_NAME;
    }

    public abstract JsonToken asToken();

    public abstract JsonNode get(int i);

    public abstract JsonNode get(String str);

    public abstract ContainerNode removeAll();

    public abstract int size();

    public ContainerNode(JsonNodeFactory jsonNodeFactory) {
        this._nodeFactory = jsonNodeFactory;
    }

    public final POJONode POJONode(Object obj) {
        return (POJONode) this._nodeFactory.pojoNode(obj);
    }

    public final ArrayNode arrayNode() {
        return this._nodeFactory.arrayNode();
    }

    public final BinaryNode binaryNode(byte[] bArr) {
        return this._nodeFactory.binaryNode(bArr);
    }

    public final BinaryNode binaryNode(byte[] bArr, int i, int i2) {
        return this._nodeFactory.binaryNode(bArr, i, i2);
    }

    public final BooleanNode booleanNode(boolean z) {
        return this._nodeFactory.booleanNode(z);
    }

    public final NullNode nullNode() {
        return this._nodeFactory.nullNode();
    }

    public final NumericNode numberNode(byte b) {
        return this._nodeFactory.numberNode(b);
    }

    public final NumericNode numberNode(double d) {
        return this._nodeFactory.numberNode(d);
    }

    public final NumericNode numberNode(float f) {
        return this._nodeFactory.numberNode(f);
    }

    public final NumericNode numberNode(int i) {
        return this._nodeFactory.numberNode(i);
    }

    public final NumericNode numberNode(long j) {
        return this._nodeFactory.numberNode(j);
    }

    public final NumericNode numberNode(BigDecimal bigDecimal) {
        return this._nodeFactory.numberNode(bigDecimal);
    }

    public final NumericNode numberNode(BigInteger bigInteger) {
        return this._nodeFactory.numberNode(bigInteger);
    }

    public final NumericNode numberNode(short s) {
        return this._nodeFactory.numberNode(s);
    }

    public final ValueNode numberNode(Byte b) {
        return this._nodeFactory.numberNode(b);
    }

    public final ValueNode numberNode(Double d) {
        return this._nodeFactory.numberNode(d);
    }

    public final ValueNode numberNode(Float f) {
        return this._nodeFactory.numberNode(f);
    }

    public final ValueNode numberNode(Integer num) {
        return this._nodeFactory.numberNode(num);
    }

    public final ValueNode numberNode(Long l) {
        return this._nodeFactory.numberNode(l);
    }

    public final ValueNode numberNode(Short sh) {
        return this._nodeFactory.numberNode(sh);
    }

    public final ObjectNode objectNode() {
        return this._nodeFactory.objectNode();
    }

    public final ValueNode pojoNode(Object obj) {
        return this._nodeFactory.pojoNode(obj);
    }

    public final TextNode textNode(String str) {
        return this._nodeFactory.textNode(str);
    }
}
