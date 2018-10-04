package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser$NumberType;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class DoubleNode extends NumericNode {
    public final double _value;

    public boolean isDouble() {
        return true;
    }

    public boolean isFloatingPointNumber() {
        return true;
    }

    public DoubleNode(double d) {
        this._value = d;
    }

    public String asText() {
        return NumberOutput.toString(this._value);
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public BigInteger bigIntegerValue() {
        return decimalValue().toBigInteger();
    }

    public boolean canConvertToInt() {
        double d = this._value;
        return d >= -2.147483648E9d && d <= 2.147483647E9d;
    }

    public boolean canConvertToLong() {
        double d = this._value;
        return d >= -9.223372036854776E18d && d <= 9.223372036854776E18d;
    }

    public BigDecimal decimalValue() {
        return BigDecimal.valueOf(this._value);
    }

    public double doubleValue() {
        return this._value;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (obj != null) {
                if (obj.getClass() == getClass()) {
                    if (Double.compare(this._value, ((DoubleNode) obj)._value) != 0) {
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
        long doubleToLongBits = Double.doubleToLongBits(this._value);
        return ((int) (doubleToLongBits >> 32)) ^ ((int) doubleToLongBits);
    }

    public int intValue() {
        return (int) this._value;
    }

    public long longValue() {
        return (long) this._value;
    }

    public JsonParser$NumberType numberType() {
        return JsonParser$NumberType.DOUBLE;
    }

    public Number numberValue() {
        return Double.valueOf(this._value);
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeNumber(this._value);
    }

    public short shortValue() {
        return (short) ((int) this._value);
    }

    public static DoubleNode valueOf(double d) {
        return new DoubleNode(d);
    }
}
