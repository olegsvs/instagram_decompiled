package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser$NumberType;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class FloatNode extends NumericNode {
    public final float _value;

    public boolean isFloat() {
        return true;
    }

    public boolean isFloatingPointNumber() {
        return true;
    }

    public FloatNode(float f) {
        this._value = f;
    }

    public String asText() {
        return NumberOutput.toString((double) this._value);
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public BigInteger bigIntegerValue() {
        return decimalValue().toBigInteger();
    }

    public boolean canConvertToInt() {
        float f = this._value;
        return f >= -2.14748365E9f && f <= 2.14748365E9f;
    }

    public boolean canConvertToLong() {
        float f = this._value;
        return f >= -9.223372E18f && f <= 9.223372E18f;
    }

    public BigDecimal decimalValue() {
        return BigDecimal.valueOf((double) this._value);
    }

    public double doubleValue() {
        return (double) this._value;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (obj != null) {
                if (obj.getClass() == getClass()) {
                    if (Float.compare(this._value, ((FloatNode) obj)._value) != 0) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public float floatValue() {
        return this._value;
    }

    public int hashCode() {
        return Float.floatToIntBits(this._value);
    }

    public int intValue() {
        return (int) this._value;
    }

    public long longValue() {
        return (long) this._value;
    }

    public JsonParser$NumberType numberType() {
        return JsonParser$NumberType.FLOAT;
    }

    public Number numberValue() {
        return Float.valueOf(this._value);
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNumber(this._value);
    }

    public short shortValue() {
        return (short) ((int) this._value);
    }

    public static FloatNode valueOf(float f) {
        return new FloatNode(f);
    }
}
