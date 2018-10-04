package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser$NumberType;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class DecimalNode extends NumericNode {
    private static final BigDecimal MAX_INTEGER = BigDecimal.valueOf(2147483647L);
    private static final BigDecimal MAX_LONG = BigDecimal.valueOf(Long.MAX_VALUE);
    private static final BigDecimal MIN_INTEGER = BigDecimal.valueOf(-2147483648L);
    private static final BigDecimal MIN_LONG = BigDecimal.valueOf(Long.MIN_VALUE);
    public static final DecimalNode ZERO = new DecimalNode(BigDecimal.ZERO);
    public final BigDecimal _value;

    public boolean isBigDecimal() {
        return true;
    }

    public boolean isFloatingPointNumber() {
        return true;
    }

    public DecimalNode(BigDecimal bigDecimal) {
        this._value = bigDecimal;
    }

    public String asText() {
        return this._value.toString();
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public BigInteger bigIntegerValue() {
        return this._value.toBigInteger();
    }

    public boolean canConvertToInt() {
        return this._value.compareTo(MIN_INTEGER) >= 0 && this._value.compareTo(MAX_INTEGER) <= 0;
    }

    public boolean canConvertToLong() {
        return this._value.compareTo(MIN_LONG) >= 0 && this._value.compareTo(MAX_LONG) <= 0;
    }

    public BigDecimal decimalValue() {
        return this._value;
    }

    public double doubleValue() {
        return this._value.doubleValue();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (obj != null) {
                if (obj.getClass() == getClass()) {
                    if (((DecimalNode) obj)._value.compareTo(this._value) != 0) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public float floatValue() {
        return this._value.floatValue();
    }

    public int hashCode() {
        return Double.valueOf(this._value.doubleValue()).hashCode();
    }

    public int intValue() {
        return this._value.intValue();
    }

    public long longValue() {
        return this._value.longValue();
    }

    public JsonParser$NumberType numberType() {
        return JsonParser$NumberType.BIG_DECIMAL;
    }

    public Number numberValue() {
        return this._value;
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (!serializerProvider.isEnabled(SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN) || (jsonGenerator instanceof TokenBuffer)) {
            jsonGenerator.writeNumber(this._value);
        } else {
            jsonGenerator.writeNumber(this._value.toPlainString());
        }
    }

    public short shortValue() {
        return this._value.shortValue();
    }

    public static DecimalNode valueOf(BigDecimal bigDecimal) {
        return new DecimalNode(bigDecimal);
    }
}
