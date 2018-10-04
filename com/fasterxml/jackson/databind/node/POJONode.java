package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;

public final class POJONode extends ValueNode {
    public final Object _value;

    public POJONode(Object obj) {
        this._value = obj;
    }

    public boolean asBoolean(boolean z) {
        Object obj = this._value;
        return (obj == null || !(obj instanceof Boolean)) ? z : ((Boolean) obj).booleanValue();
    }

    public double asDouble(double d) {
        Object obj = this._value;
        return obj instanceof Number ? ((Number) obj).doubleValue() : d;
    }

    public int asInt(int i) {
        Object obj = this._value;
        return obj instanceof Number ? ((Number) obj).intValue() : i;
    }

    public long asLong(long j) {
        Object obj = this._value;
        return obj instanceof Number ? ((Number) obj).longValue() : j;
    }

    public String asText() {
        Object obj = this._value;
        return obj == null ? "null" : obj.toString();
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_EMBEDDED_OBJECT;
    }

    public byte[] binaryValue() {
        Object obj = this._value;
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        return super.binaryValue();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (obj != null) {
                if (obj.getClass() == getClass()) {
                    POJONode pOJONode = (POJONode) obj;
                    Object obj2 = this._value;
                    if (obj2 != null) {
                        return obj2.equals(pOJONode._value);
                    }
                    if (pOJONode._value != null) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public JsonNodeType getNodeType() {
        return JsonNodeType.POJO;
    }

    public Object getPojo() {
        return this._value;
    }

    public int hashCode() {
        return this._value.hashCode();
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Object obj = this._value;
        if (obj == null) {
            serializerProvider.defaultSerializeNull(jsonGenerator);
        } else {
            jsonGenerator.writeObject(obj);
        }
    }

    public String toString() {
        return String.valueOf(this._value);
    }
}
