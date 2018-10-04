package com.fasterxml.jackson.databind.node;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public class JsonNodeFactory implements JsonNodeCreator, Serializable {
    private static final JsonNodeFactory decimalsAsIs = new JsonNodeFactory(true);
    private static final JsonNodeFactory decimalsNormalized = new JsonNodeFactory(false);
    public static final JsonNodeFactory instance = decimalsNormalized;
    private static final long serialVersionUID = -3271940633258788634L;
    private final boolean _cfgBigDecimalExact;

    public JsonNodeFactory() {
        this(false);
    }

    public JsonNodeFactory(boolean z) {
        this._cfgBigDecimalExact = z;
    }

    public POJONode POJONode(Object obj) {
        return new POJONode(obj);
    }

    public ArrayNode arrayNode() {
        return new ArrayNode(this);
    }

    public BinaryNode binaryNode(byte[] bArr) {
        return BinaryNode.valueOf(bArr);
    }

    public BinaryNode binaryNode(byte[] bArr, int i, int i2) {
        return BinaryNode.valueOf(bArr, i, i2);
    }

    public BooleanNode booleanNode(boolean z) {
        return z ? BooleanNode.getTrue() : BooleanNode.getFalse();
    }

    public NullNode nullNode() {
        return NullNode.getInstance();
    }

    public NumericNode numberNode(byte b) {
        return IntNode.valueOf(b);
    }

    public NumericNode numberNode(double d) {
        return DoubleNode.valueOf(d);
    }

    public NumericNode numberNode(float f) {
        return FloatNode.valueOf(f);
    }

    public NumericNode numberNode(int i) {
        return IntNode.valueOf(i);
    }

    public NumericNode numberNode(long j) {
        return LongNode.valueOf(j);
    }

    public NumericNode numberNode(BigDecimal bigDecimal) {
        if (this._cfgBigDecimalExact) {
            return DecimalNode.valueOf(bigDecimal);
        }
        NumericNode numericNode;
        if (bigDecimal.compareTo(BigDecimal.ZERO) == 0) {
            numericNode = DecimalNode.ZERO;
        } else {
            numericNode = DecimalNode.valueOf(bigDecimal.stripTrailingZeros());
        }
        return numericNode;
    }

    public NumericNode numberNode(BigInteger bigInteger) {
        return BigIntegerNode.valueOf(bigInteger);
    }

    public NumericNode numberNode(short s) {
        return ShortNode.valueOf(s);
    }

    public ValueNode numberNode(Byte b) {
        return b == null ? nullNode() : IntNode.valueOf(b.intValue());
    }

    public ValueNode numberNode(Double d) {
        return d == null ? nullNode() : DoubleNode.valueOf(d.doubleValue());
    }

    public ValueNode numberNode(Float f) {
        return f == null ? nullNode() : FloatNode.valueOf(f.floatValue());
    }

    public ValueNode numberNode(Integer num) {
        return num == null ? nullNode() : IntNode.valueOf(num.intValue());
    }

    public ValueNode numberNode(Long l) {
        return l == null ? nullNode() : LongNode.valueOf(l.longValue());
    }

    public ValueNode numberNode(Short sh) {
        return sh == null ? nullNode() : ShortNode.valueOf(sh.shortValue());
    }

    public ObjectNode objectNode() {
        return new ObjectNode(this);
    }

    public ValueNode pojoNode(Object obj) {
        return new POJONode(obj);
    }

    public TextNode textNode(String str) {
        return TextNode.valueOf(str);
    }

    public static JsonNodeFactory withExactBigDecimals(boolean z) {
        return z ? decimalsAsIs : decimalsNormalized;
    }
}
