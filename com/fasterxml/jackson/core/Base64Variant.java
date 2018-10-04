package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.Serializable;
import java.util.Arrays;

public final class Base64Variant implements Serializable {
    private final transient int[] _asciiToBase64;
    private final transient byte[] _base64ToAsciiB;
    private final transient char[] _base64ToAsciiC;
    public final transient int _maxLineLength;
    public final String _name;
    public final transient char _paddingChar;
    public final transient boolean _usesPadding;

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public Base64Variant(Base64Variant base64Variant, String str, int i) {
        this(base64Variant, str, base64Variant._usesPadding, base64Variant._paddingChar, i);
    }

    public Base64Variant(Base64Variant base64Variant, String str, boolean z, char c, int i) {
        this._asciiToBase64 = new int[128];
        this._base64ToAsciiC = new char[64];
        this._base64ToAsciiB = new byte[64];
        this._name = str;
        Object obj = base64Variant._base64ToAsciiB;
        System.arraycopy(obj, 0, this._base64ToAsciiB, 0, obj.length);
        obj = base64Variant._base64ToAsciiC;
        System.arraycopy(obj, 0, this._base64ToAsciiC, 0, obj.length);
        obj = base64Variant._asciiToBase64;
        System.arraycopy(obj, 0, this._asciiToBase64, 0, obj.length);
        this._usesPadding = z;
        this._paddingChar = c;
        this._maxLineLength = i;
    }

    public Base64Variant(String str, String str2, boolean z, char c, int i) {
        this._asciiToBase64 = new int[128];
        this._base64ToAsciiC = new char[64];
        this._base64ToAsciiB = new byte[64];
        this._name = str;
        this._usesPadding = z;
        this._paddingChar = c;
        this._maxLineLength = i;
        int length = str2.length();
        if (length == 64) {
            int i2 = 0;
            str2.getChars(0, length, this._base64ToAsciiC, 0);
            Arrays.fill(this._asciiToBase64, -1);
            while (i2 < length) {
                char c2 = this._base64ToAsciiC[i2];
                this._base64ToAsciiB[i2] = (byte) c2;
                this._asciiToBase64[c2] = i2;
                i2++;
            }
            if (z) {
                this._asciiToBase64[c] = -2;
                return;
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Base64Alphabet length must be exactly 64 (was ");
        stringBuilder.append(length);
        stringBuilder.append(")");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static final void _reportBase64EOF() {
        throw new IllegalArgumentException("Unexpected end-of-String in base64 content");
    }

    public final void _reportInvalidBase64(char c, int i, String str) {
        StringBuilder stringBuilder;
        String stringBuilder2;
        if (c <= ' ') {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal white space character (code 0x");
            stringBuilder.append(Integer.toHexString(c));
            stringBuilder.append(") as character #");
            stringBuilder.append(i + 1);
            stringBuilder.append(" of 4-char base64 unit: can only used between units");
            stringBuilder2 = stringBuilder.toString();
        } else if (usesPaddingChar(c)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected padding character ('");
            stringBuilder.append(getPaddingChar());
            stringBuilder.append("') as character #");
            stringBuilder.append(i + 1);
            stringBuilder.append(" of 4-char base64 unit: padding only legal as 3rd or 4th character");
            stringBuilder2 = stringBuilder.toString();
        } else {
            if (Character.isDefined(c)) {
                if (!Character.isISOControl(c)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Illegal character '");
                    stringBuilder.append(c);
                    stringBuilder.append("' (code 0x");
                    stringBuilder.append(Integer.toHexString(c));
                    stringBuilder.append(") in base64 content");
                    stringBuilder2 = stringBuilder.toString();
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal character (code 0x");
            stringBuilder.append(Integer.toHexString(c));
            stringBuilder.append(") in base64 content");
            stringBuilder2 = stringBuilder.toString();
        }
        if (str != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(stringBuilder2);
            stringBuilder.append(": ");
            stringBuilder.append(str);
            stringBuilder2 = stringBuilder.toString();
        }
        throw new IllegalArgumentException(stringBuilder2);
    }

    public final void decode(String str, ByteArrayBuilder byteArrayBuilder) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2;
            char charAt;
            while (true) {
                i2 = i + 1;
                charAt = str.charAt(i);
                if (i2 < length) {
                    if (charAt > ' ') {
                        break;
                    }
                    i = i2;
                } else {
                    return;
                }
            }
            int decodeBase64Char = decodeBase64Char(charAt);
            if (decodeBase64Char < 0) {
                _reportInvalidBase64(charAt, 0, null);
            }
            if (i2 >= length) {
                _reportBase64EOF();
            }
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            int decodeBase64Char2 = decodeBase64Char(charAt2);
            if (decodeBase64Char2 < 0) {
                _reportInvalidBase64(charAt2, 1, null);
            }
            int i4 = (decodeBase64Char << 6) | decodeBase64Char2;
            if (i3 >= length) {
                if (usesPadding()) {
                    _reportBase64EOF();
                } else {
                    byteArrayBuilder.append(i4 >> 4);
                    return;
                }
            }
            int i5 = i3 + 1;
            charAt2 = str.charAt(i3);
            decodeBase64Char2 = decodeBase64Char(charAt2);
            if (decodeBase64Char2 < 0) {
                if (decodeBase64Char2 != -2) {
                    _reportInvalidBase64(charAt2, 2, null);
                }
                if (i5 >= length) {
                    _reportBase64EOF();
                }
                i = i5 + 1;
                char charAt3 = str.charAt(i5);
                if (!usesPaddingChar(charAt3)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("expected padding character '");
                    stringBuilder.append(getPaddingChar());
                    stringBuilder.append("'");
                    _reportInvalidBase64(charAt3, 3, stringBuilder.toString());
                }
                byteArrayBuilder.append(i4 >> 4);
            } else {
                i3 = (i4 << 6) | decodeBase64Char2;
                if (i5 >= length) {
                    if (usesPadding()) {
                        _reportBase64EOF();
                    } else {
                        byteArrayBuilder.appendTwoBytes(i3 >> 2);
                        return;
                    }
                }
                i = i5 + 1;
                char charAt4 = str.charAt(i5);
                decodeBase64Char2 = decodeBase64Char(charAt4);
                if (decodeBase64Char2 < 0) {
                    if (decodeBase64Char2 != -2) {
                        _reportInvalidBase64(charAt4, 3, null);
                    }
                    byteArrayBuilder.appendTwoBytes(i3 >> 2);
                } else {
                    byteArrayBuilder.appendThreeBytes((i3 << 6) | decodeBase64Char2);
                }
            }
        }
    }

    public final int decodeBase64Char(char c) {
        return c <= '' ? this._asciiToBase64[c] : -1;
    }

    public final int decodeBase64Char(int i) {
        return i <= 127 ? this._asciiToBase64[i] : -1;
    }

    public final String encode(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder stringBuilder = new StringBuilder(((length >> 2) + length) + (length >> 3));
        if (z) {
            stringBuilder.append('\"');
        }
        int maxLineLength = getMaxLineLength() >> 2;
        int i = 0;
        int i2 = length - 3;
        while (i <= i2) {
            int i3 = i + 1;
            int i4 = i3 + 1;
            i3 = ((bArr[i] << 8) | (bArr[i3] & 255)) << 8;
            i = i4 + 1;
            encodeBase64Chunk(stringBuilder, i3 | (bArr[i4] & 255));
            maxLineLength--;
            if (maxLineLength <= 0) {
                stringBuilder.append('\\');
                stringBuilder.append('n');
                maxLineLength = getMaxLineLength() >> 2;
            }
        }
        length -= i;
        if (length > 0) {
            i3 = i + 1;
            i = bArr[i] << 16;
            if (length == 2) {
                i |= (bArr[i3] & 255) << 8;
            }
            encodeBase64Partial(stringBuilder, i, length);
        }
        if (z) {
            stringBuilder.append('\"');
        }
        return stringBuilder.toString();
    }

    public final int encodeBase64Chunk(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        byte[] bArr2 = this._base64ToAsciiB;
        bArr[i2] = bArr2[(i >> 18) & 63];
        int i4 = i3 + 1;
        bArr[i3] = bArr2[(i >> 12) & 63];
        i3 = i4 + 1;
        bArr[i4] = bArr2[(i >> 6) & 63];
        i4 = i3 + 1;
        bArr[i3] = bArr2[i & 63];
        return i4;
    }

    public final int encodeBase64Chunk(int i, char[] cArr, int i2) {
        int i3 = i2 + 1;
        char[] cArr2 = this._base64ToAsciiC;
        cArr[i2] = cArr2[(i >> 18) & 63];
        int i4 = i3 + 1;
        cArr[i3] = cArr2[(i >> 12) & 63];
        i3 = i4 + 1;
        cArr[i4] = cArr2[(i >> 6) & 63];
        i4 = i3 + 1;
        cArr[i3] = cArr2[i & 63];
        return i4;
    }

    public final void encodeBase64Chunk(StringBuilder stringBuilder, int i) {
        stringBuilder.append(this._base64ToAsciiC[(i >> 18) & 63]);
        stringBuilder.append(this._base64ToAsciiC[(i >> 12) & 63]);
        stringBuilder.append(this._base64ToAsciiC[(i >> 6) & 63]);
        stringBuilder.append(this._base64ToAsciiC[i & 63]);
    }

    public final int encodeBase64Partial(int i, int i2, byte[] bArr, int i3) {
        int i4 = i3 + 1;
        byte[] bArr2 = this._base64ToAsciiB;
        bArr[i3] = bArr2[(i >> 18) & 63];
        int i5 = i4 + 1;
        bArr[i4] = bArr2[(i >> 12) & 63];
        if (this._usesPadding) {
            byte b = (byte) this._paddingChar;
            i4 = i5 + 1;
            bArr[i5] = i2 == 2 ? bArr2[(i >> 6) & 63] : b;
            i5 = i4 + 1;
            bArr[i4] = b;
            return i5;
        } else if (i2 != 2) {
            return i5;
        } else {
            i4 = i5 + 1;
            bArr[i5] = bArr2[(i >> 6) & 63];
            return i4;
        }
    }

    public final int encodeBase64Partial(int i, int i2, char[] cArr, int i3) {
        int i4 = i3 + 1;
        char[] cArr2 = this._base64ToAsciiC;
        cArr[i3] = cArr2[(i >> 18) & 63];
        int i5 = i4 + 1;
        cArr[i4] = cArr2[(i >> 12) & 63];
        if (this._usesPadding) {
            i4 = i5 + 1;
            cArr[i5] = i2 == 2 ? cArr2[(i >> 6) & 63] : this._paddingChar;
            i5 = i4 + 1;
            cArr[i4] = this._paddingChar;
            return i5;
        } else if (i2 != 2) {
            return i5;
        } else {
            i4 = i5 + 1;
            cArr[i5] = cArr2[(i >> 6) & 63];
            return i4;
        }
    }

    public final void encodeBase64Partial(StringBuilder stringBuilder, int i, int i2) {
        stringBuilder.append(this._base64ToAsciiC[(i >> 18) & 63]);
        stringBuilder.append(this._base64ToAsciiC[(i >> 12) & 63]);
        if (this._usesPadding) {
            stringBuilder.append(i2 == 2 ? this._base64ToAsciiC[(i >> 6) & 63] : this._paddingChar);
            stringBuilder.append(this._paddingChar);
        } else if (i2 == 2) {
            stringBuilder.append(this._base64ToAsciiC[(i >> 6) & 63]);
        }
    }

    public final int getMaxLineLength() {
        return this._maxLineLength;
    }

    public final char getPaddingChar() {
        return this._paddingChar;
    }

    public final int hashCode() {
        return this._name.hashCode();
    }

    public final String toString() {
        return this._name;
    }

    public final boolean usesPadding() {
        return this._usesPadding;
    }

    public final boolean usesPaddingChar(char c) {
        return c == this._paddingChar;
    }

    public final boolean usesPaddingChar(int i) {
        return i == this._paddingChar;
    }
}
