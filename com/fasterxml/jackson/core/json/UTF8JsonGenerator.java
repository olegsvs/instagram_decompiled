package com.fasterxml.jackson.core.json;

import com.facebook.common.dextricks.DexStore;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class UTF8JsonGenerator extends JsonGeneratorImpl {
    private static final byte[] FALSE_BYTES = new byte[]{(byte) 102, (byte) 97, (byte) 108, (byte) 115, (byte) 101};
    public static final byte[] HEX_CHARS = CharTypes.copyHexBytes();
    private static final byte[] NULL_BYTES = new byte[]{(byte) 110, (byte) 117, (byte) 108, (byte) 108};
    private static final byte[] TRUE_BYTES = new byte[]{(byte) 116, (byte) 114, (byte) 117, (byte) 101};
    public boolean _bufferRecyclable;
    public char[] _charBuffer;
    public final int _charBufferLength;
    public byte[] _outputBuffer;
    public final int _outputEnd;
    public final int _outputMaxContiguous;
    public final OutputStream _outputStream;
    public int _outputTail = 0;

    public UTF8JsonGenerator(IOContext iOContext, int i, ObjectCodec objectCodec, OutputStream outputStream) {
        super(iOContext, i, objectCodec);
        this._outputStream = outputStream;
        this._bufferRecyclable = true;
        byte[] allocWriteEncodingBuffer = iOContext.allocWriteEncodingBuffer();
        this._outputBuffer = allocWriteEncodingBuffer;
        int length = allocWriteEncodingBuffer.length;
        this._outputEnd = length;
        this._outputMaxContiguous = length >> 3;
        char[] allocConcatBuffer = iOContext.allocConcatBuffer();
        this._charBuffer = allocConcatBuffer;
        this._charBufferLength = allocConcatBuffer.length;
        if (isEnabled(Feature.ESCAPE_NON_ASCII)) {
            setHighestNonEscapedChar(127);
        }
    }

    public final int _decodeSurrogate(int i, int i2) {
        if (i2 < 56320 || i2 > 57343) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Incomplete surrogate pair: first char 0x");
            stringBuilder.append(Integer.toHexString(i));
            stringBuilder.append(", second 0x");
            stringBuilder.append(Integer.toHexString(i2));
            GeneratorBase._reportError(stringBuilder.toString());
        }
        return (((i - 55296) << 10) + 65536) + (i2 - 56320);
    }

    public final void _flushBuffer() {
        int i = this._outputTail;
        if (i > 0) {
            this._outputTail = 0;
            this._outputStream.write(this._outputBuffer, 0, i);
        }
    }

    private int _handleLongCustomEscape(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int length = bArr2.length;
        if (i + length > i2) {
            this._outputTail = i;
            _flushBuffer();
            i = this._outputTail;
            if (length > bArr.length) {
                this._outputStream.write(bArr2, 0, length);
                return i;
            }
            System.arraycopy(bArr2, 0, bArr, i, length);
            i += length;
        }
        if ((i3 * 6) + i <= i2) {
            return i;
        }
        _flushBuffer();
        return this._outputTail;
    }

    private int _outputMultiByteChar(int i, int i2) {
        byte[] bArr = this._outputBuffer;
        if (i < 55296 || i > 57343) {
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((i >> 12) | 224);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((i >> 6) & 63) | 128);
            i3 = i4 + 1;
            bArr[i4] = (byte) ((i & 63) | 128);
            return i3;
        }
        i4 = i2 + 1;
        bArr[i2] = (byte) 92;
        i3 = i4 + 1;
        bArr[i4] = (byte) 117;
        i4 = i3 + 1;
        byte[] bArr2 = HEX_CHARS;
        bArr[i3] = bArr2[(i >> 12) & 15];
        i3 = i4 + 1;
        bArr[i4] = bArr2[(i >> 8) & 15];
        i4 = i3 + 1;
        bArr[i3] = bArr2[(i >> 4) & 15];
        i3 = i4 + 1;
        bArr[i4] = bArr2[i & 15];
        return i3;
    }

    private int _outputRawMultiByteChar(int i, char[] cArr, int i2, int i3) {
        if (i < 55296 || i > 57343) {
            byte[] bArr = this._outputBuffer;
            int i4 = this._outputTail;
            this._outputTail = i4 + 1;
            bArr[i4] = (byte) ((i >> 12) | 224);
            i4 = this._outputTail;
            this._outputTail = i4 + 1;
            bArr[i4] = (byte) (((i >> 6) & 63) | 128);
            i4 = this._outputTail;
            this._outputTail = i4 + 1;
            bArr[i4] = (byte) ((i & 63) | 128);
            return i2;
        }
        if (i2 >= i3) {
            GeneratorBase._reportError("Split surrogate on writeRaw() input (last character)");
        }
        _outputSurrogates(i, cArr[i2]);
        return i2 + 1;
    }

    public final void _outputSurrogates(int i, int i2) {
        int _decodeSurrogate = _decodeSurrogate(i, i2);
        if (this._outputTail + 4 > this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = (byte) ((_decodeSurrogate >> 18) | 240);
        i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = (byte) (((_decodeSurrogate >> 12) & 63) | 128);
        i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = (byte) (((_decodeSurrogate >> 6) & 63) | 128);
        i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = (byte) ((_decodeSurrogate & 63) | 128);
    }

    private static int _readMore(InputStream inputStream, byte[] bArr, int i, int i2, int i3) {
        int i4;
        int i5 = 0;
        while (i < i2) {
            int i6 = i5 + 1;
            i4 = i + 1;
            bArr[i5] = bArr[i];
            i5 = i6;
            i = i4;
        }
        i4 = Math.min(i3, bArr.length);
        do {
            int i7 = i4 - i5;
            if (i7 == 0) {
                break;
            }
            i7 = inputStream.read(bArr, i5, i7);
            if (i7 < 0) {
                break;
            }
            i5 += i7;
        } while (i5 < 3);
        return i5;
    }

    public final void _releaseBuffers() {
        byte[] bArr = this._outputBuffer;
        if (bArr != null && this._bufferRecyclable) {
            this._outputBuffer = null;
            this._ioContext.releaseWriteEncodingBuffer(bArr);
        }
        char[] cArr = this._charBuffer;
        if (cArr != null) {
            this._charBuffer = null;
            this._ioContext.releaseConcatBuffer(cArr);
        }
    }

    public final void _verifyPrettyValueWrite(String str, int i) {
        switch (i) {
            case 0:
                if (this._writeContext.inArray()) {
                    this._cfgPrettyPrinter.beforeArrayValues(this);
                    return;
                } else if (this._writeContext.inObject()) {
                    this._cfgPrettyPrinter.beforeObjectEntries(this);
                    return;
                } else {
                    return;
                }
            case 1:
                this._cfgPrettyPrinter.writeArrayValueSeparator(this);
                return;
            case 2:
                this._cfgPrettyPrinter.writeObjectFieldValueSeparator(this);
                return;
            case 3:
                this._cfgPrettyPrinter.writeRootValueSeparator(this);
                return;
            default:
                VersionUtil.throwInternal();
                return;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void _verifyValueWrite(java.lang.String r4) {
        /*
        r3 = this;
        r0 = r3._writeContext;
        r2 = r0.writeValue();
        r0 = 5;
        if (r2 != r0) goto L_0x0022;
    L_0x0009:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Can not ";
        r1.append(r0);
        r1.append(r4);
        r0 = ", expecting field name";
        r1.append(r0);
        r0 = r1.toString();
        com.fasterxml.jackson.core.base.GeneratorBase._reportError(r0);
    L_0x0022:
        r0 = r3._cfgPrettyPrinter;
        if (r0 != 0) goto L_0x0054;
    L_0x0026:
        switch(r2) {
            case 1: goto L_0x003e;
            case 2: goto L_0x003b;
            case 3: goto L_0x002a;
            default: goto L_0x0029;
        };
    L_0x0029:
        return;
    L_0x002a:
        r0 = r3._rootValueSeparator;
        if (r0 == 0) goto L_0x0029;
    L_0x002e:
        r0 = r3._rootValueSeparator;
        r1 = r0.asUnquotedUTF8();
        r0 = r1.length;
        if (r0 <= 0) goto L_0x0029;
    L_0x0037:
        r3._writeBytes(r1);
        goto L_0x0029;
    L_0x003b:
        r2 = 58;
        goto L_0x0040;
    L_0x003e:
        r2 = 44;
    L_0x0040:
        r1 = r3._outputTail;
        r0 = r3._outputEnd;
        if (r1 < r0) goto L_0x0049;
    L_0x0046:
        r3._flushBuffer();
    L_0x0049:
        r1 = r3._outputBuffer;
        r0 = r3._outputTail;
        r1[r0] = r2;
        r0 = r0 + 1;
        r3._outputTail = r0;
        return;
    L_0x0054:
        r3._verifyPrettyValueWrite(r4, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8JsonGenerator._verifyValueWrite(java.lang.String):void");
    }

    public final int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) {
        int i = this._outputEnd - 6;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i2 = -3;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 > i2) {
                i5 = _readMore(inputStream, bArr, i4, i5, bArr.length);
                if (i5 < 3) {
                    break;
                }
                i2 = i5 - 3;
                i4 = 0;
            }
            if (this._outputTail > i) {
                _flushBuffer();
            }
            int i6 = i4 + 1;
            i4 = bArr[i4] << 8;
            int i7 = i6 + 1;
            i4 = i7 + 1;
            i3 += 3;
            this._outputTail = base64Variant.encodeBase64Chunk((((bArr[i6] & 255) | i4) << 8) | (bArr[i7] & 255), this._outputBuffer, this._outputTail);
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this._outputBuffer;
                int i8 = this._outputTail;
                this._outputTail = i8 + 1;
                bArr2[i8] = (byte) 92;
                i8 = this._outputTail;
                this._outputTail = i8 + 1;
                bArr2[i8] = (byte) 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i5 <= 0) {
            return i3;
        }
        if (this._outputTail > i) {
            _flushBuffer();
        }
        i2 = bArr[0] << 16;
        i7 = 1;
        if (1 < i5) {
            i2 |= (bArr[1] & 255) << 8;
            i7 = 2;
        }
        i3 += i7;
        this._outputTail = base64Variant.encodeBase64Partial(i2, i7, this._outputBuffer, this._outputTail);
        return i3;
    }

    public final int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i) {
        int i2 = this._outputEnd - 6;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i3 = -3;
        int i4 = 0;
        int i5 = 0;
        while (i > 2) {
            if (i4 > i3) {
                i5 = _readMore(inputStream, bArr, i4, i5, i);
                if (i5 < 3) {
                    i4 = 0;
                    break;
                }
                i3 = i5 - 3;
                i4 = 0;
            }
            if (this._outputTail > i2) {
                _flushBuffer();
            }
            int i6 = i4 + 1;
            int i7 = bArr[i4] << 8;
            int i8 = i6 + 1;
            i4 = i8 + 1;
            i -= 3;
            this._outputTail = base64Variant.encodeBase64Chunk((((bArr[i6] & 255) | i7) << 8) | (bArr[i8] & 255), this._outputBuffer, this._outputTail);
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this._outputBuffer;
                i8 = this._outputTail;
                this._outputTail = i8 + 1;
                bArr2[i8] = (byte) 92;
                i8 = this._outputTail;
                this._outputTail = i8 + 1;
                bArr2[i8] = (byte) 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i <= 0) {
            return i;
        }
        i8 = _readMore(inputStream, bArr, i4, i5, i);
        if (i8 <= 0) {
            return i;
        }
        if (this._outputTail > i2) {
            _flushBuffer();
        }
        i3 = bArr[0] << 16;
        i7 = 1;
        if (1 < i8) {
            i3 |= (bArr[1] & 255) << 8;
            i7 = 2;
        }
        this._outputTail = base64Variant.encodeBase64Partial(i3, i7, this._outputBuffer, this._outputTail);
        return i - i7;
    }

    public final void _writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) {
        int i3 = i2 - 3;
        int i4 = this._outputEnd - 6;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        while (i <= i3) {
            if (this._outputTail > i4) {
                _flushBuffer();
            }
            int i5 = i + 1;
            int i6 = i5 + 1;
            i = i6 + 1;
            this._outputTail = base64Variant.encodeBase64Chunk((((bArr[i] << 8) | (bArr[i5] & 255)) << 8) | (bArr[i6] & 255), this._outputBuffer, this._outputTail);
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this._outputBuffer;
                int i7 = this._outputTail;
                this._outputTail = i7 + 1;
                bArr2[i7] = (byte) 92;
                i7 = this._outputTail;
                this._outputTail = i7 + 1;
                bArr2[i7] = (byte) 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        i2 -= i;
        if (i2 > 0) {
            if (this._outputTail > i4) {
                _flushBuffer();
            }
            i7 = i + 1;
            i6 = bArr[i] << 16;
            if (i2 == 2) {
                i6 |= (bArr[i7] & 255) << 8;
            }
            this._outputTail = base64Variant.encodeBase64Partial(i6, i2, this._outputBuffer, this._outputTail);
        }
    }

    private final void _writeBytes(byte[] bArr) {
        int length = bArr.length;
        if (this._outputTail + length > this._outputEnd) {
            _flushBuffer();
            if (length > DexStore.LOAD_RESULT_DEX2OAT_QUICKENED) {
                this._outputStream.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this._outputBuffer, this._outputTail, length);
        this._outputTail += length;
    }

    private final void _writeBytes(byte[] bArr, int i, int i2) {
        if (this._outputTail + i2 > this._outputEnd) {
            _flushBuffer();
            if (i2 > DexStore.LOAD_RESULT_DEX2OAT_QUICKENED) {
                this._outputStream.write(bArr, i, i2);
                return;
            }
        }
        System.arraycopy(bArr, i, this._outputBuffer, this._outputTail, i2);
        this._outputTail += i2;
    }

    private int _writeCustomEscape(byte[] bArr, int i, SerializableString serializableString, int i2) {
        int i3 = i;
        Object asUnquotedUTF8 = serializableString.asUnquotedUTF8();
        int length = asUnquotedUTF8.length;
        byte[] bArr2 = bArr;
        if (length > 6) {
            return _handleLongCustomEscape(bArr2, i3, this._outputEnd, asUnquotedUTF8, i2);
        }
        System.arraycopy(asUnquotedUTF8, 0, bArr, i, length);
        return i + length;
    }

    private void _writeCustomStringSegment2(char[] cArr, int i, int i2) {
        if (this._outputTail + ((i2 - i) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i3 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        char c = this._maximumNonEscapedChar <= 0 ? '￿' : this._maximumNonEscapedChar;
        CharacterEscapes characterEscapes = this._characterEscapes;
        while (i < i2) {
            SerializableString escapeSequence;
            int i4 = i + 1;
            char c2 = cArr[i];
            int i5;
            if (c2 <= '') {
                if (iArr[c2] == 0) {
                    i5 = i3 + 1;
                    bArr[i3] = (byte) c2;
                    i = i4;
                    i3 = i5;
                } else {
                    int i6 = iArr[c2];
                    if (i6 > 0) {
                        i5 = i3 + 1;
                        bArr[i3] = (byte) 92;
                        i3 = i5 + 1;
                        bArr[i5] = (byte) i6;
                        i = i4;
                    } else {
                        if (i6 == -2) {
                            escapeSequence = characterEscapes.getEscapeSequence(c2);
                            if (escapeSequence == null) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Invalid custom escape definitions; custom escape not found for character code 0x");
                                stringBuilder.append(Integer.toHexString(c2));
                                stringBuilder.append(", although was supposed to have one");
                                GeneratorBase._reportError(stringBuilder.toString());
                            }
                        }
                        i3 = _writeGenericEscape(c2, i3);
                        i = i4;
                    }
                }
            } else if (c2 > c) {
                i3 = _writeGenericEscape(c2, i3);
                i = i4;
            } else {
                escapeSequence = characterEscapes.getEscapeSequence(c2);
                if (escapeSequence == null) {
                    if (c2 <= '߿') {
                        i5 = i3 + 1;
                        bArr[i3] = (byte) ((c2 >> 6) | 192);
                        i3 = i5 + 1;
                        bArr[i5] = (byte) ((c2 & 63) | 128);
                    } else {
                        i3 = _outputMultiByteChar(c2, i3);
                    }
                    i = i4;
                }
            }
            i3 = _writeCustomEscape(bArr, i3, escapeSequence, i2 - i4);
            i = i4;
        }
        this._outputTail = i3;
    }

    public final void _writeFieldName(SerializableString serializableString) {
        int i;
        if (isEnabled(Feature.QUOTE_FIELD_NAMES)) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = (byte) 34;
            i = serializableString.appendQuotedUTF8(bArr, this._outputTail);
            if (i < 0) {
                _writeBytes(serializableString.asQuotedUTF8());
            } else {
                this._outputTail += i;
            }
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            bArr = this._outputBuffer;
            i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = (byte) 34;
            return;
        }
        i = serializableString.appendQuotedUTF8(this._outputBuffer, this._outputTail);
        if (i < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += i;
        }
    }

    public final void _writeFieldName(String str) {
        if (isEnabled(Feature.QUOTE_FIELD_NAMES)) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = (byte) 34;
            int length = str.length();
            if (length <= this._charBufferLength) {
                str.getChars(0, length, this._charBuffer, 0);
                if (length <= this._outputMaxContiguous) {
                    if (this._outputTail + length > this._outputEnd) {
                        _flushBuffer();
                    }
                    _writeStringSegment(this._charBuffer, 0, length);
                } else {
                    _writeStringSegments(this._charBuffer, 0, length);
                }
            } else {
                _writeStringSegments(str);
            }
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            bArr = this._outputBuffer;
            i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = (byte) 34;
            return;
        }
        _writeStringSegments(str);
    }

    private int _writeGenericEscape(int i, int i2) {
        int i3;
        byte[] bArr = this._outputBuffer;
        int i4 = i2 + 1;
        bArr[i2] = (byte) 92;
        int i5 = i4 + 1;
        bArr[i4] = (byte) 117;
        if (i > 255) {
            i3 = 255 & (i >> 8);
            int i6 = i5 + 1;
            byte[] bArr2 = HEX_CHARS;
            bArr[i5] = bArr2[i3 >> 4];
            i5 = i6 + 1;
            bArr[i6] = bArr2[i3 & 15];
            i &= 255;
        } else {
            i4 = i5 + 1;
            bArr[i5] = (byte) 48;
            i5 = i4 + 1;
            bArr[i4] = (byte) 48;
        }
        i3 = i5 + 1;
        byte[] bArr3 = HEX_CHARS;
        bArr[i5] = bArr3[i >> 4];
        i4 = i3 + 1;
        bArr[i3] = bArr3[i & 15];
        return i4;
    }

    private void _writeLongString(String str) {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = (byte) 34;
        _writeStringSegments(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        bArr = this._outputBuffer;
        i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = (byte) 34;
    }

    private void _writeLongString(char[] cArr, int i, int i2) {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = (byte) 34;
        _writeStringSegments(this._charBuffer, 0, i2);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        bArr = this._outputBuffer;
        i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = (byte) 34;
    }

    private void _writeNull() {
        if (this._outputTail + 4 >= this._outputEnd) {
            _flushBuffer();
        }
        System.arraycopy(NULL_BYTES, 0, this._outputBuffer, this._outputTail, 4);
        this._outputTail += 4;
    }

    public final void _writePPFieldName(SerializableString serializableString, boolean z) {
        if (z) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        boolean isEnabled = isEnabled(Feature.QUOTE_FIELD_NAMES);
        if (isEnabled) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = (byte) 34;
        }
        _writeBytes(serializableString.asQuotedUTF8());
        if (isEnabled) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            bArr = this._outputBuffer;
            i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = (byte) 34;
        }
    }

    public final void _writePPFieldName(String str, boolean z) {
        if (z) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        if (isEnabled(Feature.QUOTE_FIELD_NAMES)) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = (byte) 34;
            int length = str.length();
            if (length <= this._charBufferLength) {
                str.getChars(0, length, this._charBuffer, 0);
                if (length <= this._outputMaxContiguous) {
                    if (this._outputTail + length > this._outputEnd) {
                        _flushBuffer();
                    }
                    _writeStringSegment(this._charBuffer, 0, length);
                } else {
                    _writeStringSegments(this._charBuffer, 0, length);
                }
            } else {
                _writeStringSegments(str);
            }
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            bArr = this._outputBuffer;
            i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = (byte) 34;
            return;
        }
        _writeStringSegments(str);
    }

    private void _writeQuotedInt(int i) {
        if (this._outputTail + 13 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = (byte) 34;
        this._outputTail = NumberOutput.outputInt(i, bArr, this._outputTail);
        bArr = this._outputBuffer;
        i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = (byte) 34;
    }

    private void _writeQuotedLong(long j) {
        if (this._outputTail + 23 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = (byte) 34;
        this._outputTail = NumberOutput.outputLong(j, bArr, this._outputTail);
        bArr = this._outputBuffer;
        i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = (byte) 34;
    }

    private void _writeQuotedRaw(Object obj) {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = (byte) 34;
        writeRaw(obj.toString());
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        bArr = this._outputBuffer;
        i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = (byte) 34;
    }

    private void _writeQuotedShort(short s) {
        if (this._outputTail + 8 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = (byte) 34;
        this._outputTail = NumberOutput.outputInt((int) s, bArr, this._outputTail);
        bArr = this._outputBuffer;
        i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = (byte) 34;
    }

    private final void _writeSegmentedRaw(char[] cArr, int i, int i2) {
        int i3 = this._outputEnd;
        byte[] bArr = this._outputBuffer;
        while (i < i2) {
            while (true) {
                char c = cArr[i];
                if (c >= '') {
                    break;
                }
                if (this._outputTail >= i3) {
                    _flushBuffer();
                }
                int i4 = this._outputTail;
                this._outputTail = i4 + 1;
                bArr[i4] = (byte) c;
                i++;
                if (i >= i2) {
                    return;
                }
            }
            if (this._outputTail + 3 >= this._outputEnd) {
                _flushBuffer();
            }
            int i5 = i + 1;
            char c2 = cArr[i];
            if (c2 < 'ࠀ') {
                i4 = this._outputTail;
                this._outputTail = i4 + 1;
                bArr[i4] = (byte) ((c2 >> 6) | 192);
                i4 = this._outputTail;
                this._outputTail = i4 + 1;
                bArr[i4] = (byte) ((c2 & 63) | 128);
            } else {
                _outputRawMultiByteChar(c2, cArr, i5, i2);
            }
            i = i5;
        }
    }

    private final void _writeStringSegment(char[] cArr, int i, int i2) {
        i2 += i;
        int i3 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i < i2) {
            char c = cArr[i];
            if (c > '') {
                break;
            } else if (iArr[c] != 0) {
                break;
            } else {
                int i4 = i3 + 1;
                bArr[i3] = (byte) c;
                i++;
                i3 = i4;
            }
        }
        this._outputTail = i3;
        if (i >= i2) {
            return;
        }
        if (this._characterEscapes != null) {
            _writeCustomStringSegment2(cArr, i, i2);
        } else if (this._maximumNonEscapedChar == 0) {
            _writeStringSegment2(cArr, i, i2);
        } else {
            _writeStringSegmentASCII2(cArr, i, i2);
        }
    }

    private final void _writeStringSegment2(char[] cArr, int i, int i2) {
        if (this._outputTail + ((i2 - i) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i3 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i < i2) {
            int i4 = i + 1;
            char c = cArr[i];
            int i5;
            if (c <= '') {
                if (iArr[c] == 0) {
                    i5 = i3 + 1;
                    bArr[i3] = (byte) c;
                    i = i4;
                    i3 = i5;
                } else {
                    int i6 = iArr[c];
                    if (i6 > 0) {
                        i5 = i3 + 1;
                        bArr[i3] = (byte) 92;
                        i3 = i5 + 1;
                        bArr[i5] = (byte) i6;
                    } else {
                        i3 = _writeGenericEscape(c, i3);
                    }
                }
            } else if (c <= '߿') {
                i5 = i3 + 1;
                bArr[i3] = (byte) ((c >> 6) | 192);
                i3 = i5 + 1;
                bArr[i5] = (byte) ((c & 63) | 128);
            } else {
                i3 = _outputMultiByteChar(c, i3);
            }
            i = i4;
        }
        this._outputTail = i3;
    }

    private final void _writeStringSegmentASCII2(char[] cArr, int i, int i2) {
        if (this._outputTail + ((i2 - i) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i3 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        char c = this._maximumNonEscapedChar;
        while (i < i2) {
            int i4 = i + 1;
            char c2 = cArr[i];
            int i5;
            if (c2 <= '') {
                if (iArr[c2] == 0) {
                    i5 = i3 + 1;
                    bArr[i3] = (byte) c2;
                    i = i4;
                    i3 = i5;
                } else {
                    int i6 = iArr[c2];
                    if (i6 > 0) {
                        i5 = i3 + 1;
                        bArr[i3] = (byte) 92;
                        i3 = i5 + 1;
                        bArr[i5] = (byte) i6;
                        i = i4;
                    }
                }
            } else if (c2 <= c) {
                if (c2 <= '߿') {
                    i5 = i3 + 1;
                    bArr[i3] = (byte) ((c2 >> 6) | 192);
                    i3 = i5 + 1;
                    bArr[i5] = (byte) ((c2 & 63) | 128);
                } else {
                    i3 = _outputMultiByteChar(c2, i3);
                }
                i = i4;
            }
            i3 = _writeGenericEscape(c2, i3);
            i = i4;
        }
        this._outputTail = i3;
    }

    private final void _writeStringSegments(String str) {
        int length = str.length();
        char[] cArr = this._charBuffer;
        int i = 0;
        while (length > 0) {
            int min = Math.min(this._outputMaxContiguous, length);
            int i2 = i + min;
            str.getChars(i, i2, cArr, 0);
            if (this._outputTail + min > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(cArr, 0, min);
            length -= min;
            i = i2;
        }
    }

    private final void _writeStringSegments(char[] cArr, int i, int i2) {
        do {
            int min = Math.min(this._outputMaxContiguous, i2);
            if (this._outputTail + min > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(cArr, i, min);
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    private void _writeUTF8Segment(byte[] bArr, int i, int i2) {
        int[] iArr = this._outputEscapes;
        int i3 = i + i2;
        int i4 = i;
        while (i4 < i3) {
            int i5 = i4 + 1;
            byte b = bArr[i4];
            if (b < (byte) 0 || iArr[b] == 0) {
                i4 = i5;
            } else {
                _writeUTF8Segment2(bArr, i, i2);
                return;
            }
        }
        if (this._outputTail + i2 > this._outputEnd) {
            _flushBuffer();
        }
        System.arraycopy(bArr, i, this._outputBuffer, this._outputTail, i2);
        this._outputTail += i2;
    }

    private void _writeUTF8Segment2(byte[] bArr, int i, int i2) {
        int i3 = this._outputTail;
        if ((i2 * 6) + i3 > this._outputEnd) {
            _flushBuffer();
            i3 = this._outputTail;
        }
        byte[] bArr2 = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        i2 += i;
        while (i < i2) {
            int i4 = i + 1;
            byte b = bArr[i];
            if (b >= (byte) 0) {
                if (iArr[b] != 0) {
                    int i5 = iArr[b];
                    if (i5 > 0) {
                        int i6 = i3 + 1;
                        bArr2[i3] = (byte) 92;
                        i3 = i6 + 1;
                        bArr2[i6] = (byte) i5;
                    } else {
                        i3 = _writeGenericEscape(b, i3);
                    }
                    i = i4;
                }
            }
            int i7 = i3 + 1;
            bArr2[i3] = b;
            i = i4;
            i3 = i7;
        }
        this._outputTail = i3;
    }

    private void _writeUTF8Segments(byte[] bArr, int i, int i2) {
        do {
            int min = Math.min(this._outputMaxContiguous, i2);
            _writeUTF8Segment(bArr, i, min);
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    public final void close() {
        super.close();
        if (this._outputBuffer != null && isEnabled(Feature.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                JsonStreamContext outputContext = getOutputContext();
                if (!outputContext.inArray()) {
                    if (!outputContext.inObject()) {
                        break;
                    }
                    writeEndObject();
                } else {
                    writeEndArray();
                }
            }
        }
        _flushBuffer();
        if (this._outputStream != null) {
            if (!this._ioContext.isResourceManaged()) {
                if (!isEnabled(Feature.AUTO_CLOSE_TARGET)) {
                    if (isEnabled(Feature.FLUSH_PASSED_TO_STREAM)) {
                        this._outputStream.flush();
                    }
                }
            }
            this._outputStream.close();
        }
        _releaseBuffers();
    }

    public final void flush() {
        _flushBuffer();
        if (this._outputStream != null && isEnabled(Feature.FLUSH_PASSED_TO_STREAM)) {
            this._outputStream.flush();
        }
    }

    public final Object getOutputTarget() {
        return this._outputStream;
    }

    public final int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i) {
        _verifyValueWrite("write binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = (byte) 34;
        byte[] allocBase64Buffer = this._ioContext.allocBase64Buffer();
        if (i < 0) {
            try {
                i = _writeBinary(base64Variant, inputStream, allocBase64Buffer);
            } catch (Throwable th) {
                this._ioContext.releaseBase64Buffer(allocBase64Buffer);
            }
        } else {
            int _writeBinary = _writeBinary(base64Variant, inputStream, allocBase64Buffer, i);
            if (_writeBinary > 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Too few bytes available: missing ");
                stringBuilder.append(_writeBinary);
                stringBuilder.append(" bytes (out of ");
                stringBuilder.append(i);
                stringBuilder.append(")");
                GeneratorBase._reportError(stringBuilder.toString());
            }
        }
        this._ioContext.releaseBase64Buffer(allocBase64Buffer);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        bArr = this._outputBuffer;
        i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = (byte) 34;
        return i;
    }

    public final void writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) {
        _verifyValueWrite("write binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = (byte) 34;
        _writeBinary(base64Variant, bArr, i, i2 + i);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        bArr2 = this._outputBuffer;
        i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = (byte) 34;
    }

    public final void writeBoolean(boolean z) {
        _verifyValueWrite("write boolean value");
        if (this._outputTail + 5 >= this._outputEnd) {
            _flushBuffer();
        }
        Object obj = z ? TRUE_BYTES : FALSE_BYTES;
        int length = obj.length;
        System.arraycopy(obj, 0, this._outputBuffer, this._outputTail, length);
        this._outputTail += length;
    }

    public final void writeEndArray() {
        if (!this._writeContext.inArray()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Current context not an ARRAY but ");
            stringBuilder.append(this._writeContext.getTypeDesc());
            GeneratorBase._reportError(stringBuilder.toString());
        }
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeEndArray(this, this._writeContext.getEntryCount());
        } else {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = (byte) 93;
        }
        this._writeContext = this._writeContext.getParent();
    }

    public final void writeEndObject() {
        if (!this._writeContext.inObject()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Current context not an object but ");
            stringBuilder.append(this._writeContext.getTypeDesc());
            GeneratorBase._reportError(stringBuilder.toString());
        }
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeEndObject(this, this._writeContext.getEntryCount());
        } else {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = (byte) 125;
        }
        this._writeContext = this._writeContext.getParent();
    }

    public final void writeFieldName(SerializableString serializableString) {
        int writeFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (writeFieldName == 4) {
            GeneratorBase._reportError("Can not write a field name, expecting a value");
        }
        boolean z = true;
        if (this._cfgPrettyPrinter != null) {
            if (writeFieldName != 1) {
                z = false;
            }
            _writePPFieldName(serializableString, z);
            return;
        }
        if (writeFieldName == 1) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = (byte) 44;
        }
        _writeFieldName(serializableString);
    }

    public final void writeFieldName(String str) {
        int writeFieldName = this._writeContext.writeFieldName(str);
        if (writeFieldName == 4) {
            GeneratorBase._reportError("Can not write a field name, expecting a value");
        }
        boolean z = true;
        if (this._cfgPrettyPrinter != null) {
            if (writeFieldName != 1) {
                z = false;
            }
            _writePPFieldName(str, z);
            return;
        }
        if (writeFieldName == 1) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = (byte) 44;
        }
        _writeFieldName(str);
    }

    public final void writeNull() {
        _verifyValueWrite("write null value");
        _writeNull();
    }

    public final void writeNumber(double d) {
        if (!this._cfgNumbersAsStrings) {
            if ((!Double.isNaN(d) && !Double.isInfinite(d)) || !isEnabled(Feature.QUOTE_NON_NUMERIC_NUMBERS)) {
                _verifyValueWrite("write number");
                writeRaw(String.valueOf(d));
                return;
            }
        }
        writeString(String.valueOf(d));
    }

    public final void writeNumber(float f) {
        if (!this._cfgNumbersAsStrings) {
            if ((!Float.isNaN(f) && !Float.isInfinite(f)) || !isEnabled(Feature.QUOTE_NON_NUMERIC_NUMBERS)) {
                _verifyValueWrite("write number");
                writeRaw(String.valueOf(f));
                return;
            }
        }
        writeString(String.valueOf(f));
    }

    public final void writeNumber(int i) {
        _verifyValueWrite("write number");
        if (this._outputTail + 11 >= this._outputEnd) {
            _flushBuffer();
        }
        if (this._cfgNumbersAsStrings) {
            _writeQuotedInt(i);
        } else {
            this._outputTail = NumberOutput.outputInt(i, this._outputBuffer, this._outputTail);
        }
    }

    public final void writeNumber(long j) {
        _verifyValueWrite("write number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedLong(j);
            return;
        }
        if (this._outputTail + 21 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputLong(j, this._outputBuffer, this._outputTail);
    }

    public final void writeNumber(String str) {
        _verifyValueWrite("write number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(str);
        } else {
            writeRaw(str);
        }
    }

    public final void writeNumber(BigDecimal bigDecimal) {
        _verifyValueWrite("write number");
        if (bigDecimal == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(bigDecimal);
        } else {
            writeRaw(bigDecimal.toString());
        }
    }

    public final void writeNumber(BigInteger bigInteger) {
        _verifyValueWrite("write number");
        if (bigInteger == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(bigInteger);
        } else {
            writeRaw(bigInteger.toString());
        }
    }

    public final void writeNumber(short s) {
        _verifyValueWrite("write number");
        if (this._outputTail + 6 >= this._outputEnd) {
            _flushBuffer();
        }
        if (this._cfgNumbersAsStrings) {
            _writeQuotedShort(s);
        } else {
            this._outputTail = NumberOutput.outputInt((int) s, this._outputBuffer, this._outputTail);
        }
    }

    public final void writeRaw(char c) {
        if (this._outputTail + 3 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i;
        if (c <= '') {
            i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = (byte) c;
        } else if (c < 'ࠀ') {
            i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = (byte) ((c >> 6) | 192);
            i = this._outputTail;
            this._outputTail = i + 1;
            bArr[i] = (byte) ((c & 63) | 128);
        } else {
            _outputRawMultiByteChar(c, null, 0, 0);
        }
    }

    public final void writeRaw(SerializableString serializableString) {
        byte[] asUnquotedUTF8 = serializableString.asUnquotedUTF8();
        if (asUnquotedUTF8.length > 0) {
            _writeBytes(asUnquotedUTF8);
        }
    }

    public final void writeRaw(String str) {
        int length = str.length();
        int i = 0;
        while (length > 0) {
            char[] cArr = this._charBuffer;
            int length2 = cArr.length;
            if (length < length2) {
                length2 = length;
            }
            int i2 = i + length2;
            str.getChars(i, i2, cArr, 0);
            writeRaw(cArr, 0, length2);
            length -= length2;
            i = i2;
        }
    }

    public final void writeRaw(String str, int i, int i2) {
        while (i2 > 0) {
            char[] cArr = this._charBuffer;
            int length = cArr.length;
            if (i2 < length) {
                length = i2;
            }
            int i3 = i + length;
            str.getChars(i, i3, cArr, 0);
            writeRaw(cArr, 0, length);
            i2 -= length;
            i = i3;
        }
    }

    public final void writeRaw(char[] cArr, int i, int i2) {
        int i3 = (i2 + i2) + i2;
        int i4 = this._outputTail + i3;
        int i5 = this._outputEnd;
        if (i4 > i5) {
            if (i5 < i3) {
                _writeSegmentedRaw(cArr, i, i2);
                return;
            }
            _flushBuffer();
        }
        i2 += i;
        loop0:
        while (i < i2) {
            while (true) {
                char c = cArr[i];
                if (c <= '') {
                    byte[] bArr = this._outputBuffer;
                    i4 = this._outputTail;
                    this._outputTail = i4 + 1;
                    bArr[i4] = (byte) c;
                    i++;
                    if (i >= i2) {
                        break loop0;
                    }
                }
                break;
            }
            int i6 = i + 1;
            char c2 = cArr[i];
            if (c2 < 'ࠀ') {
                bArr = this._outputBuffer;
                i4 = this._outputTail;
                this._outputTail = i4 + 1;
                bArr[i4] = (byte) ((c2 >> 6) | 192);
                i4 = this._outputTail;
                this._outputTail = i4 + 1;
                bArr[i4] = (byte) ((c2 & 63) | 128);
            } else {
                _outputRawMultiByteChar(c2, cArr, i6, i2);
            }
            i = i6;
        }
    }

    public final void writeRawUTF8String(byte[] bArr, int i, int i2) {
        _verifyValueWrite("write text value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = (byte) 34;
        _writeBytes(bArr, i, i2);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        bArr2 = this._outputBuffer;
        i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = (byte) 34;
    }

    public final void writeStartArray() {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.createChildArrayContext();
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeStartArray(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = (byte) 91;
    }

    public final void writeStartObject() {
        _verifyValueWrite("start an object");
        this._writeContext = this._writeContext.createChildObjectContext();
        if (this._cfgPrettyPrinter != null) {
            this._cfgPrettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = (byte) 123;
    }

    public final void writeString(SerializableString serializableString) {
        _verifyValueWrite("write text value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = (byte) 34;
        i = serializableString.appendQuotedUTF8(bArr, this._outputTail);
        if (i < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += i;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        bArr = this._outputBuffer;
        i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = (byte) 34;
    }

    public final void writeString(String str) {
        _verifyValueWrite("write text value");
        if (str == null) {
            _writeNull();
            return;
        }
        int length = str.length();
        if (length > this._charBufferLength) {
            _writeLongString(str);
            return;
        }
        str.getChars(0, length, this._charBuffer, 0);
        if (length > this._outputMaxContiguous) {
            _writeLongString(this._charBuffer, 0, length);
            return;
        }
        if (this._outputTail + length >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = (byte) 34;
        _writeStringSegment(this._charBuffer, 0, length);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        bArr = this._outputBuffer;
        i = this._outputTail;
        this._outputTail = i + 1;
        bArr[i] = (byte) 34;
    }

    public final void writeString(char[] cArr, int i, int i2) {
        _verifyValueWrite("write text value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = (byte) 34;
        if (i2 <= this._outputMaxContiguous) {
            if (this._outputTail + i2 > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(cArr, i, i2);
        } else {
            _writeStringSegments(cArr, i, i2);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        bArr = this._outputBuffer;
        i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = (byte) 34;
    }

    public final void writeUTF8String(byte[] bArr, int i, int i2) {
        _verifyValueWrite("write text value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = (byte) 34;
        if (i2 <= this._outputMaxContiguous) {
            _writeUTF8Segment(bArr, i, i2);
        } else {
            _writeUTF8Segments(bArr, i, i2);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        bArr2 = this._outputBuffer;
        i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = (byte) 34;
    }
}
