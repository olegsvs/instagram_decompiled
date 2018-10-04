package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.SerializerProvider;

public final class TextNode extends ValueNode {
    public static final TextNode EMPTY_STRING_NODE = new TextNode(JsonProperty.USE_DEFAULT_NAME);
    public static final int INT_SPACE = 32;
    public final String _value;

    public TextNode(String str) {
        this._value = str;
    }

    public void _reportBase64EOF() {
        throw new JsonParseException("Unexpected end-of-String when base64 content", JsonLocation.NA);
    }

    public void _reportInvalidBase64(Base64Variant base64Variant, char c, int i) {
        _reportInvalidBase64(base64Variant, c, i, null);
    }

    public void _reportInvalidBase64(Base64Variant base64Variant, char c, int i, String str) {
        StringBuilder stringBuilder;
        if (c <= ' ') {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal white space character (code 0x");
            stringBuilder.append(Integer.toHexString(c));
            stringBuilder.append(") as character #");
            stringBuilder.append(i + 1);
            stringBuilder.append(" of 4-char base64 unit: can only used between units");
            base64Variant = stringBuilder.toString();
        } else if (base64Variant.usesPaddingChar(c)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected padding character ('");
            stringBuilder.append(base64Variant.getPaddingChar());
            stringBuilder.append("') as character #");
            stringBuilder.append(i + 1);
            stringBuilder.append(" of 4-char base64 unit: padding only legal as 3rd or 4th character");
            base64Variant = stringBuilder.toString();
        } else {
            if (Character.isDefined(c)) {
                if (!Character.isISOControl(c)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Illegal character '");
                    stringBuilder.append(c);
                    stringBuilder.append("' (code 0x");
                    stringBuilder.append(Integer.toHexString(c));
                    stringBuilder.append(") in base64 content");
                    base64Variant = stringBuilder.toString();
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal character (code 0x");
            stringBuilder.append(Integer.toHexString(c));
            stringBuilder.append(") in base64 content");
            base64Variant = stringBuilder.toString();
        }
        if (str != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(base64Variant);
            stringBuilder.append(": ");
            stringBuilder.append(str);
            base64Variant = stringBuilder.toString();
        }
        throw new JsonParseException(base64Variant, JsonLocation.NA);
    }

    public static void appendQuoted(StringBuilder stringBuilder, String str) {
        stringBuilder.append('\"');
        CharTypes.appendQuoted(stringBuilder, str);
        stringBuilder.append('\"');
    }

    public boolean asBoolean(boolean z) {
        String str = this._value;
        return (str == null || !"true".equals(str.trim())) ? z : true;
    }

    public double asDouble(double d) {
        return NumberInput.parseAsDouble(this._value, d);
    }

    public int asInt(int i) {
        return NumberInput.parseAsInt(this._value, i);
    }

    public long asLong(long j) {
        return NumberInput.parseAsLong(this._value, j);
    }

    public String asText() {
        return this._value;
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_STRING;
    }

    public byte[] binaryValue() {
        return getBinaryValue(Base64Variants.getDefaultVariant());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null) {
            if (obj.getClass() == getClass()) {
                return ((TextNode) obj)._value.equals(this._value);
            }
        }
        return false;
    }

    public byte[] getBinaryValue(Base64Variant base64Variant) {
        ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder(100);
        String str = this._value;
        int length = str.length();
        int i = 0;
        loop0:
        while (i < length) {
            int i2;
            char charAt;
            while (true) {
                i2 = i + 1;
                charAt = str.charAt(i);
                if (i2 >= length) {
                    break loop0;
                } else if (charAt > ' ') {
                    break;
                } else {
                    i = i2;
                }
            }
            int decodeBase64Char = base64Variant.decodeBase64Char(charAt);
            if (decodeBase64Char < 0) {
                _reportInvalidBase64(base64Variant, charAt, 0);
            }
            if (i2 >= length) {
                _reportBase64EOF();
            }
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            int decodeBase64Char2 = base64Variant.decodeBase64Char(charAt2);
            if (decodeBase64Char2 < 0) {
                _reportInvalidBase64(base64Variant, charAt2, 1);
            }
            int i4 = (decodeBase64Char << 6) | decodeBase64Char2;
            if (i3 >= length) {
                if (!base64Variant.usesPadding()) {
                    byteArrayBuilder.append(i4 >> 4);
                    break;
                }
                _reportBase64EOF();
            }
            int i5 = i3 + 1;
            charAt2 = str.charAt(i3);
            decodeBase64Char2 = base64Variant.decodeBase64Char(charAt2);
            if (decodeBase64Char2 < 0) {
                if (decodeBase64Char2 != -2) {
                    _reportInvalidBase64(base64Variant, charAt2, 2);
                }
                if (i5 >= length) {
                    _reportBase64EOF();
                }
                i = i5 + 1;
                char charAt3 = str.charAt(i5);
                if (!base64Variant.usesPaddingChar(charAt3)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("expected padding character '");
                    stringBuilder.append(base64Variant.getPaddingChar());
                    stringBuilder.append("'");
                    _reportInvalidBase64(base64Variant, charAt3, 3, stringBuilder.toString());
                }
                byteArrayBuilder.append(i4 >> 4);
            } else {
                i3 = (i4 << 6) | decodeBase64Char2;
                if (i5 >= length) {
                    if (!base64Variant.usesPadding()) {
                        byteArrayBuilder.appendTwoBytes(i3 >> 2);
                        break;
                    }
                    _reportBase64EOF();
                }
                i = i5 + 1;
                char charAt4 = str.charAt(i5);
                decodeBase64Char2 = base64Variant.decodeBase64Char(charAt4);
                if (decodeBase64Char2 < 0) {
                    if (decodeBase64Char2 != -2) {
                        _reportInvalidBase64(base64Variant, charAt4, 3);
                    }
                    byteArrayBuilder.appendTwoBytes(i3 >> 2);
                } else {
                    byteArrayBuilder.appendThreeBytes((i3 << 6) | decodeBase64Char2);
                }
            }
        }
        return byteArrayBuilder.toByteArray();
    }

    public JsonNodeType getNodeType() {
        return JsonNodeType.STRING;
    }

    public int hashCode() {
        return this._value.hashCode();
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        String str = this._value;
        if (str == null) {
            jsonGenerator.writeNull();
        } else {
            jsonGenerator.writeString(str);
        }
    }

    public String textValue() {
        return this._value;
    }

    public String toString() {
        int length = this._value.length();
        StringBuilder stringBuilder = new StringBuilder((length + 2) + (length >> 4));
        appendQuoted(stringBuilder, this._value);
        return stringBuilder.toString();
    }

    public static TextNode valueOf(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return EMPTY_STRING_NODE;
        }
        return new TextNode(str);
    }
}
