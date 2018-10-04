package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser$NumberType;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class ShortNode extends NumericNode {
    public final short _value;

    public boolean canConvertToInt() {
        return true;
    }

    public boolean canConvertToLong() {
        return true;
    }

    public boolean isIntegralNumber() {
        return true;
    }

    public boolean isShort() {
        return true;
    }

    public ShortNode(short s) {
        this._value = s;
    }

    public boolean asBoolean(boolean z) {
        return this._value != (short) 0;
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
                    if (((ShortNode) obj)._value != this._value) {
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
        return Short.valueOf(this._value);
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNumber(this._value);
    }

    public short shortValue() {
        return this._value;
    }

    public static ShortNode valueOf(short s) {
        return new ShortNode(s);
    }
}
