package com.fasterxml.jackson.databind.node;

import com.facebook.common.dextricks.StartupQEsConfig;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;

public final class BooleanNode extends ValueNode {
    public static final BooleanNode FALSE = new BooleanNode(false);
    public static final BooleanNode TRUE = new BooleanNode(true);
    private final boolean _value;

    private BooleanNode(boolean z) {
        this._value = z;
    }

    public boolean asBoolean() {
        return this._value;
    }

    public boolean asBoolean(boolean z) {
        return this._value;
    }

    public double asDouble(double d) {
        return this._value ? 1.0d : StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
    }

    public int asInt(int i) {
        return this._value;
    }

    public long asLong(long j) {
        return this._value ? 1 : 0;
    }

    public String asText() {
        return this._value ? "true" : "false";
    }

    public JsonToken asToken() {
        return this._value ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE;
    }

    public boolean booleanValue() {
        return this._value;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (obj != null) {
                if (obj.getClass() == getClass()) {
                    if (this._value != ((BooleanNode) obj)._value) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public static BooleanNode getFalse() {
        return FALSE;
    }

    public JsonNodeType getNodeType() {
        return JsonNodeType.BOOLEAN;
    }

    public static BooleanNode getTrue() {
        return TRUE;
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        jsonGenerator.writeBoolean(this._value);
    }

    public static BooleanNode valueOf(boolean z) {
        return z ? TRUE : FALSE;
    }
}
