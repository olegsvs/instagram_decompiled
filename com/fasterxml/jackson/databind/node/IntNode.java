package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser$NumberType;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class IntNode extends NumericNode {
    private static final IntNode[] CANONICALS = new IntNode[12];
    public static final int MAX_CANONICAL = 10;
    public static final int MIN_CANONICAL = -1;
    public final int _value;

    public boolean canConvertToInt() {
        return true;
    }

    public boolean canConvertToLong() {
        return true;
    }

    public boolean isInt() {
        return true;
    }

    public boolean isIntegralNumber() {
        return true;
    }

    static {
        for (int i = 0; i < 12; i++) {
            CANONICALS[i] = new IntNode(i - 1);
        }
    }

    public IntNode(int i) {
        this._value = i;
    }

    public boolean asBoolean(boolean z) {
        return this._value != 0;
    }

    public String asText() {
        return NumberOutput.toString(this._value);
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_INT;
    }

    public BigInteger bigIntegerValue() {
        return BigInteger.valueOf((long) this._value);
    }

    public BigDecimal decimalValue() {
        return BigDecimal.valueOf((long) this._value);
    }

    public double doubleValue() {
        return (double) this._value;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (obj != null) {
                if (obj.getClass() == getClass()) {
                    if (((IntNode) obj)._value != this._value) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public float floatValue() {
        return (float) this._value;
    }

    public int hashCode() {
        return this._value;
    }

    public int intValue() {
        return this._value;
    }

    public long longValue() {
        return (long) this._value;
    }

    public JsonParser$NumberType numberType() {
        return JsonParser$NumberType.INT;
    }

    public Number numberValue() {
        return Integer.valueOf(this._value);
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNumber(this._value);
    }

    public short shortValue() {
        return (short) this._value;
    }

    public static IntNode valueOf(int i) {
        if (i <= 10) {
            if (i >= -1) {
                return CANONICALS[i - -1];
            }
        }
        return new IntNode(i);
    }
}
