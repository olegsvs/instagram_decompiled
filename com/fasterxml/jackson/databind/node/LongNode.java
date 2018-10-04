package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser$NumberType;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class LongNode extends NumericNode {
    public final long _value;

    public boolean canConvertToLong() {
        return true;
    }

    public boolean isIntegralNumber() {
        return true;
    }

    public boolean isLong() {
        return true;
    }

    public LongNode(long j) {
        this._value = j;
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
        return BigInteger.valueOf(this._value);
    }

    public boolean canConvertToInt() {
        long j = this._value;
        return j >= -2147483648L && j <= 2147483647L;
    }

    public BigDecimal decimalValue() {
        return BigDecimal.valueOf(this._value);
    }

    public double doubleValue() {
        return (double) this._value;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (obj != null) {
                if (obj.getClass() == getClass()) {
                    if (((LongNode) obj)._value != this._value) {
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
        long j = this._value;
        return ((int) (j >> 32)) ^ ((int) j);
    }

    public int intValue() {
        return (int) this._value;
    }

    public long longValue() {
        return this._value;
    }

    public JsonParser$NumberType numberType() {
        return JsonParser$NumberType.LONG;
    }

    public Number numberValue() {
        return Long.valueOf(this._value);
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNumber(this._value);
    }

    public short shortValue() {
        return (short) ((int) this._value);
    }

    public static LongNode valueOf(long j) {
        return new LongNode(j);
    }
}
