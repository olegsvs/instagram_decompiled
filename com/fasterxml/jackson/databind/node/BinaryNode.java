package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.util.Arrays;

public final class BinaryNode extends ValueNode {
    public static final BinaryNode EMPTY_BINARY_NODE = new BinaryNode(new byte[0]);
    public final byte[] _data;

    public BinaryNode(byte[] bArr) {
        this._data = bArr;
    }

    public BinaryNode(byte[] bArr, int i, int i2) {
        if (i == 0 && i2 == bArr.length) {
            this._data = bArr;
            return;
        }
        Object obj = new byte[i2];
        this._data = obj;
        System.arraycopy(bArr, i, obj, 0, i2);
    }

    public String asText() {
        return Base64Variants.getDefaultVariant().encode(this._data, false);
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_EMBEDDED_OBJECT;
    }

    public byte[] binaryValue() {
        return this._data;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null) {
            if (obj.getClass() == getClass()) {
                return Arrays.equals(((BinaryNode) obj)._data, this._data);
            }
        }
        return false;
    }

    public JsonNodeType getNodeType() {
        return JsonNodeType.BINARY;
    }

    public int hashCode() {
        byte[] bArr = this._data;
        return bArr == null ? -1 : bArr.length;
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Base64Variant base64Variant = serializerProvider.getConfig().getBase64Variant();
        byte[] bArr = this._data;
        jsonGenerator.writeBinary(base64Variant, bArr, 0, bArr.length);
    }

    public String toString() {
        return Base64Variants.getDefaultVariant().encode(this._data, true);
    }

    public static BinaryNode valueOf(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return EMPTY_BINARY_NODE;
        }
        return new BinaryNode(bArr);
    }

    public static BinaryNode valueOf(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return null;
        }
        if (i2 == 0) {
            return EMPTY_BINARY_NODE;
        }
        return new BinaryNode(bArr, i, i2);
    }
}
