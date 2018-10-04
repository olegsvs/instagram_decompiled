package com.fasterxml.jackson.core.json;

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
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class WriterBasedJsonGenerator extends JsonGeneratorImpl {
    public static final char[] HEX_CHARS = CharTypes.copyHexChars();
    public SerializableString _currentEscape;
    public char[] _entityBuffer;
    public char[] _outputBuffer;
    public int _outputEnd;
    public int _outputHead = 0;
    public int _outputTail = 0;
    public final Writer _writer;

    public WriterBasedJsonGenerator(IOContext iOContext, int i, ObjectCodec objectCodec, Writer writer) {
        super(iOContext, i, objectCodec);
        this._writer = writer;
        char[] allocConcatBuffer = iOContext.allocConcatBuffer();
        this._outputBuffer = allocConcatBuffer;
        this._outputEnd = allocConcatBuffer.length;
    }

    private char[] _allocateEntityBuffer() {
        char[] cArr = new char[14];
        cArr[0] = '\\';
        cArr[2] = '\\';
        cArr[3] = 'u';
        cArr[4] = '0';
        cArr[5] = '0';
        cArr[8] = '\\';
        cArr[9] = 'u';
        this._entityBuffer = cArr;
        return cArr;
    }

    private void _appendCharacterEscape(char c, int i) {
        int i2;
        if (i >= 0) {
            if (this._outputTail + 2 > this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr = this._outputBuffer;
            i2 = this._outputTail;
            this._outputTail = i2 + 1;
            cArr[i2] = '\\';
            i2 = this._outputTail;
            this._outputTail = i2 + 1;
            cArr[i2] = (char) i;
        } else if (i != -2) {
            int i3;
            char[] cArr2;
            if (this._outputTail + 2 > this._outputEnd) {
                _flushBuffer();
            }
            int i4 = this._outputTail;
            char[] cArr3 = this._outputBuffer;
            i2 = i4 + 1;
            cArr3[i4] = '\\';
            r3 = i2 + 1;
            cArr3[i2] = 'u';
            if (c > 'ÿ') {
                int i5 = 255 & (c >> 8);
                i3 = r3 + 1;
                cArr2 = HEX_CHARS;
                cArr3[r3] = cArr2[i5 >> 4];
                r3 = i3 + 1;
                cArr3[i3] = cArr2[i5 & 15];
                c = (char) (c & 255);
            } else {
                i2 = r3 + 1;
                cArr3[r3] = '0';
                r3 = i2 + 1;
                cArr3[i2] = '0';
            }
            i3 = r3 + 1;
            cArr2 = HEX_CHARS;
            cArr3[r3] = cArr2[c >> 4];
            cArr3[i3] = cArr2[c & 15];
            this._outputTail = i3;
        } else {
            String value;
            SerializableString serializableString = this._currentEscape;
            if (serializableString == null) {
                value = this._characterEscapes.getEscapeSequence(c).getValue();
            } else {
                value = serializableString.getValue();
                this._currentEscape = null;
            }
            r3 = value.length();
            if (this._outputTail + r3 > this._outputEnd) {
                _flushBuffer();
                if (r3 > this._outputEnd) {
                    this._writer.write(value);
                    return;
                }
            }
            value.getChars(0, r3, this._outputBuffer, this._outputTail);
            this._outputTail += r3;
        }
    }

    public final void _flushBuffer() {
        int i = this._outputTail;
        int i2 = this._outputHead;
        i -= i2;
        if (i > 0) {
            this._outputHead = 0;
            this._outputTail = 0;
            this._writer.write(this._outputBuffer, i2, i);
        }
    }

    private int _prependOrWriteCharacterEscape(char[] cArr, int i, int i2, char c, int i3) {
        char[] cArr2;
        if (i3 >= 0) {
            if (i <= 1 || i >= i2) {
                cArr2 = this._entityBuffer;
                if (cArr2 == null) {
                    cArr2 = _allocateEntityBuffer();
                }
                cArr2[1] = (char) i3;
                this._writer.write(cArr2, 0, 2);
                return i;
            }
            i -= 2;
            cArr[i] = '\\';
            cArr[i + 1] = (char) i3;
            return i;
        } else if (i3 == -2) {
            String value;
            SerializableString serializableString = this._currentEscape;
            if (serializableString == null) {
                value = this._characterEscapes.getEscapeSequence(c).getValue();
            } else {
                value = serializableString.getValue();
                this._currentEscape = null;
            }
            r0 = value.length();
            if (i < r0 || i >= i2) {
                this._writer.write(value);
                return i;
            }
            i -= r0;
            value.getChars(0, r0, cArr, i);
            return i;
        } else if (i <= 5 || i >= i2) {
            char[] cArr3 = this._entityBuffer;
            if (cArr3 == null) {
                cArr3 = _allocateEntityBuffer();
            }
            this._outputHead = this._outputTail;
            char[] cArr4;
            if (c > 'ÿ') {
                int i4 = (c >> 8) & 255;
                c &= 'ÿ';
                cArr4 = HEX_CHARS;
                cArr3[10] = cArr4[i4 >> 4];
                cArr3[11] = cArr4[i4 & 15];
                cArr3[12] = cArr4[c >> 4];
                cArr3[13] = cArr4[c & 15];
                this._writer.write(cArr3, 8, 6);
                return i;
            }
            cArr4 = HEX_CHARS;
            cArr3[6] = cArr4[c >> 4];
            cArr3[7] = cArr4[c & 15];
            this._writer.write(cArr3, 2, 6);
            return i;
        } else {
            int i5;
            r0 = i - 6;
            int i6 = r0 + 1;
            cArr[r0] = '\\';
            int i7 = i6 + 1;
            cArr[i6] = 'u';
            if (c > 'ÿ') {
                int i8 = (c >> 8) & 255;
                i5 = i7 + 1;
                cArr2 = HEX_CHARS;
                cArr[i7] = cArr2[i8 >> 4];
                i7 = i5 + 1;
                cArr[i5] = cArr2[i8 & 15];
                c = (char) (c & 255);
            } else {
                i6 = i7 + 1;
                cArr[i7] = '0';
                i7 = i6 + 1;
                cArr[i6] = '0';
            }
            i5 = i7 + 1;
            cArr2 = HEX_CHARS;
            cArr[i7] = cArr2[c >> 4];
            cArr[i5] = cArr2[c & 15];
            return i5 - 5;
        }
    }

    private void _prependOrWriteCharacterEscape(char c, int i) {
        char[] cArr;
        int i2;
        char[] cArr2;
        if (i >= 0) {
            int i3 = this._outputTail;
            if (i3 >= 2) {
                i3 -= 2;
                this._outputHead = i3;
                cArr = this._outputBuffer;
                i2 = i3 + 1;
                cArr[i3] = '\\';
                cArr[i2] = (char) i;
                return;
            }
            cArr2 = this._entityBuffer;
            if (cArr2 == null) {
                cArr2 = _allocateEntityBuffer();
            }
            this._outputHead = this._outputTail;
            cArr2[1] = (char) i;
            this._writer.write(cArr2, 0, 2);
        } else if (i != -2) {
            int i4 = this._outputTail;
            if (i4 >= 6) {
                cArr = this._outputBuffer;
                i4 -= 6;
                this._outputHead = i4;
                cArr[i4] = '\\';
                i4++;
                cArr[i4] = 'u';
                if (c > 'ÿ') {
                    int i5 = (c >> 8) & 255;
                    i4++;
                    cArr2 = HEX_CHARS;
                    cArr[i4] = cArr2[i5 >> 4];
                    i4++;
                    cArr[i4] = cArr2[i5 & 15];
                    c = (char) (c & 255);
                } else {
                    i4++;
                    cArr[i4] = '0';
                    i4++;
                    cArr[i4] = '0';
                }
                i4++;
                cArr2 = HEX_CHARS;
                cArr[i4] = cArr2[c >> 4];
                cArr[i4 + 1] = cArr2[c & 15];
                return;
            }
            char[] cArr3 = this._entityBuffer;
            if (cArr3 == null) {
                cArr3 = _allocateEntityBuffer();
            }
            this._outputHead = this._outputTail;
            if (c > 'ÿ') {
                int i6 = (c >> 8) & 255;
                c &= 'ÿ';
                cArr = HEX_CHARS;
                cArr3[10] = cArr[i6 >> 4];
                cArr3[11] = cArr[i6 & 15];
                cArr3[12] = cArr[c >> 4];
                cArr3[13] = cArr[c & 15];
                this._writer.write(cArr3, 8, 6);
            } else {
                cArr = HEX_CHARS;
                cArr3[6] = cArr[c >> 4];
                cArr3[7] = cArr[c & 15];
                this._writer.write(cArr3, 2, 6);
            }
        } else {
            String value;
            SerializableString serializableString = this._currentEscape;
            if (serializableString == null) {
                value = this._characterEscapes.getEscapeSequence(c).getValue();
            } else {
                value = serializableString.getValue();
                this._currentEscape = null;
            }
            int length = value.length();
            i2 = this._outputTail;
            if (i2 >= length) {
                i2 -= length;
                this._outputHead = i2;
                value.getChars(0, length, this._outputBuffer, i2);
                return;
            }
            this._outputHead = i2;
            this._writer.write(value);
        }
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
        char[] cArr = this._outputBuffer;
        if (cArr != null) {
            this._outputBuffer = null;
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
        if (r0 != 0) goto L_0x0051;
    L_0x0026:
        switch(r2) {
            case 1: goto L_0x003b;
            case 2: goto L_0x0038;
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
        r0 = r0.getValue();
        r3.writeRaw(r0);
        goto L_0x0029;
    L_0x0038:
        r2 = 58;
        goto L_0x003d;
    L_0x003b:
        r2 = 44;
    L_0x003d:
        r1 = r3._outputTail;
        r0 = r3._outputEnd;
        if (r1 < r0) goto L_0x0046;
    L_0x0043:
        r3._flushBuffer();
    L_0x0046:
        r1 = r3._outputBuffer;
        r0 = r3._outputTail;
        r1[r0] = r2;
        r0 = r0 + 1;
        r3._outputTail = r0;
        return;
    L_0x0051:
        r3._verifyPrettyValueWrite(r4, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._verifyValueWrite(java.lang.String):void");
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
                char[] cArr = this._outputBuffer;
                int i8 = this._outputTail;
                this._outputTail = i8 + 1;
                cArr[i8] = '\\';
                i8 = this._outputTail;
                this._outputTail = i8 + 1;
                cArr[i8] = 'n';
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
                char[] cArr = this._outputBuffer;
                i8 = this._outputTail;
                this._outputTail = i8 + 1;
                cArr[i8] = '\\';
                i8 = this._outputTail;
                this._outputTail = i8 + 1;
                cArr[i8] = 'n';
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
                char[] cArr = this._outputBuffer;
                int i7 = this._outputTail;
                this._outputTail = i7 + 1;
                cArr[i7] = '\\';
                i7 = this._outputTail;
                this._outputTail = i7 + 1;
                cArr[i7] = 'n';
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

    public final void _writeFieldName(SerializableString serializableString, boolean z) {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(serializableString, z);
            return;
        }
        if (this._outputTail + 1 >= this._outputEnd) {
            _flushBuffer();
        }
        if (z) {
            char[] cArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            cArr[i] = ',';
        }
        char[] asQuotedChars = serializableString.asQuotedChars();
        if (isEnabled(Feature.QUOTE_FIELD_NAMES)) {
            Object obj = this._outputBuffer;
            i = this._outputTail;
            this._outputTail = i + 1;
            obj[i] = 34;
            int length = asQuotedChars.length;
            int i2 = this._outputTail;
            if ((i2 + length) + 1 >= this._outputEnd) {
                writeRaw(asQuotedChars, 0, length);
                if (this._outputTail >= this._outputEnd) {
                    _flushBuffer();
                }
                cArr = this._outputBuffer;
                i = this._outputTail;
                this._outputTail = i + 1;
                cArr[i] = '\"';
            } else {
                System.arraycopy(asQuotedChars, 0, obj, i2, length);
                this._outputTail += length;
                cArr = this._outputBuffer;
                i = this._outputTail;
                this._outputTail = i + 1;
                cArr[i] = '\"';
            }
            return;
        }
        writeRaw(asQuotedChars, 0, asQuotedChars.length);
    }

    public final void _writeFieldName(String str, boolean z) {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(str, z);
            return;
        }
        if (this._outputTail + 1 >= this._outputEnd) {
            _flushBuffer();
        }
        if (z) {
            char[] cArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            cArr[i] = ',';
        }
        if (isEnabled(Feature.QUOTE_FIELD_NAMES)) {
            cArr = this._outputBuffer;
            i = this._outputTail;
            this._outputTail = i + 1;
            cArr[i] = '\"';
            _writeString(str);
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            cArr = this._outputBuffer;
            i = this._outputTail;
            this._outputTail = i + 1;
            cArr[i] = '\"';
            return;
        }
        _writeString(str);
    }

    private void _writeLongString(String str) {
        _flushBuffer();
        int length = str.length();
        int i = 0;
        while (true) {
            int i2 = this._outputEnd;
            if (i + i2 > length) {
                i2 = length - i;
            }
            int i3 = i + i2;
            str.getChars(i, i3, this._outputBuffer, 0);
            if (this._characterEscapes != null) {
                _writeSegmentCustom(i2);
            } else if (this._maximumNonEscapedChar != 0) {
                _writeSegmentASCII(i2, this._maximumNonEscapedChar);
            } else {
                _writeSegment(i2);
            }
            if (i3 < length) {
                i = i3;
            } else {
                return;
            }
        }
    }

    private void _writeNull() {
        if (this._outputTail + 4 >= this._outputEnd) {
            _flushBuffer();
        }
        int i = this._outputTail;
        char[] cArr = this._outputBuffer;
        cArr[i] = 'n';
        i++;
        cArr[i] = 'u';
        int i2 = i + 1;
        cArr[i2] = 'l';
        i2++;
        cArr[i2] = 'l';
        this._outputTail = i2 + 1;
    }

    public final void _writePPFieldName(SerializableString serializableString, boolean z) {
        if (z) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        char[] asQuotedChars = serializableString.asQuotedChars();
        if (isEnabled(Feature.QUOTE_FIELD_NAMES)) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            cArr[i] = '\"';
            writeRaw(asQuotedChars, 0, asQuotedChars.length);
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            cArr = this._outputBuffer;
            i = this._outputTail;
            this._outputTail = i + 1;
            cArr[i] = '\"';
            return;
        }
        writeRaw(asQuotedChars, 0, asQuotedChars.length);
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
            char[] cArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            cArr[i] = '\"';
            _writeString(str);
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            cArr = this._outputBuffer;
            i = this._outputTail;
            this._outputTail = i + 1;
            cArr[i] = '\"';
            return;
        }
        _writeString(str);
    }

    private void _writeQuotedInt(int i) {
        if (this._outputTail + 13 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = '\"';
        this._outputTail = NumberOutput.outputInt(i, cArr, this._outputTail);
        cArr = this._outputBuffer;
        i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = '\"';
    }

    private void _writeQuotedLong(long j) {
        if (this._outputTail + 23 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = '\"';
        this._outputTail = NumberOutput.outputLong(j, cArr, this._outputTail);
        cArr = this._outputBuffer;
        i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = '\"';
    }

    private void _writeQuotedRaw(Object obj) {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = '\"';
        writeRaw(obj.toString());
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        cArr = this._outputBuffer;
        i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = '\"';
    }

    private void _writeQuotedShort(short s) {
        if (this._outputTail + 8 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = '\"';
        this._outputTail = NumberOutput.outputInt((int) s, cArr, this._outputTail);
        cArr = this._outputBuffer;
        i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = '\"';
    }

    private void _writeSegment(int i) {
        WriterBasedJsonGenerator writerBasedJsonGenerator = this;
        int[] iArr = this._outputEscapes;
        char length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i;
            if (i2 < i) {
                char c;
                do {
                    c = writerBasedJsonGenerator._outputBuffer[i2];
                    if (c < length && iArr[c] != 0) {
                        break;
                    }
                    i2++;
                } while (i2 < i);
                int i5 = i2 - i3;
                if (i5 > 0) {
                    writerBasedJsonGenerator._writer.write(writerBasedJsonGenerator._outputBuffer, i3, i5);
                    if (i2 >= i) {
                        return;
                    }
                }
                i2++;
                i3 = _prependOrWriteCharacterEscape(writerBasedJsonGenerator._outputBuffer, i2, i4, c, iArr[c]);
            } else {
                return;
            }
        }
    }

    private void _writeSegmentASCII(int i, int i2) {
        WriterBasedJsonGenerator writerBasedJsonGenerator = this;
        int[] iArr = this._outputEscapes;
        char min = Math.min(iArr.length, i2 + 1);
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = i;
            if (i3 < i) {
                char c;
                do {
                    c = writerBasedJsonGenerator._outputBuffer[i3];
                    if (c >= min) {
                        if (c > i2) {
                            i5 = -1;
                            break;
                        }
                    }
                    i5 = iArr[c];
                    if (i5 != 0) {
                        break;
                    }
                    i3++;
                } while (i3 < i);
                int i7 = i3 - i4;
                if (i7 > 0) {
                    writerBasedJsonGenerator._writer.write(writerBasedJsonGenerator._outputBuffer, i4, i7);
                    if (i3 >= i) {
                        return;
                    }
                }
                i3++;
                i4 = _prependOrWriteCharacterEscape(writerBasedJsonGenerator._outputBuffer, i3, i6, c, i5);
            } else {
                return;
            }
        }
    }

    private void _writeSegmentCustom(int i) {
        WriterBasedJsonGenerator writerBasedJsonGenerator = this;
        int[] iArr = this._outputEscapes;
        char c = this._maximumNonEscapedChar < 1 ? '￿' : this._maximumNonEscapedChar;
        char min = Math.min(iArr.length, c + 1);
        CharacterEscapes characterEscapes = this._characterEscapes;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i;
            if (i2 < i) {
                char c2;
                do {
                    c2 = writerBasedJsonGenerator._outputBuffer[i2];
                    if (c2 >= min) {
                        if (c2 <= c) {
                            SerializableString escapeSequence = characterEscapes.getEscapeSequence(c2);
                            writerBasedJsonGenerator._currentEscape = escapeSequence;
                            if (escapeSequence != null) {
                                i4 = -2;
                                break;
                            }
                        }
                        i4 = -1;
                        break;
                    }
                    i4 = iArr[c2];
                    if (i4 != 0) {
                        break;
                    }
                    i2++;
                } while (i2 < i);
                int i6 = i2 - i3;
                if (i6 > 0) {
                    writerBasedJsonGenerator._writer.write(writerBasedJsonGenerator._outputBuffer, i3, i6);
                    if (i2 >= i) {
                        return;
                    }
                }
                i2++;
                i3 = _prependOrWriteCharacterEscape(writerBasedJsonGenerator._outputBuffer, i2, i5, c2, i4);
            } else {
                return;
            }
        }
    }

    private void _writeString(String str) {
        int length = str.length();
        int i = this._outputEnd;
        if (length > i) {
            _writeLongString(str);
            return;
        }
        if (this._outputTail + length > i) {
            _flushBuffer();
        }
        str.getChars(0, length, this._outputBuffer, this._outputTail);
        if (this._characterEscapes != null) {
            _writeStringCustom(length);
        } else if (this._maximumNonEscapedChar != 0) {
            _writeStringASCII(length, this._maximumNonEscapedChar);
        } else {
            _writeString2(length);
        }
    }

    private void _writeString(char[] cArr, int i, int i2) {
        if (this._characterEscapes != null) {
            _writeStringCustom(cArr, i, i2);
        } else if (this._maximumNonEscapedChar != 0) {
            _writeStringASCII(cArr, i, i2, this._maximumNonEscapedChar);
        } else {
            i2 += i;
            int[] iArr = this._outputEscapes;
            char length = iArr.length;
            while (i < i2) {
                int i3 = i;
                do {
                    char c = cArr[i3];
                    if (c < length && iArr[c] != 0) {
                        break;
                    }
                    i3++;
                } while (i3 < i2);
                int i4 = i3 - i;
                if (i4 < 32) {
                    if (this._outputTail + i4 > this._outputEnd) {
                        _flushBuffer();
                    }
                    if (i4 > 0) {
                        System.arraycopy(cArr, i, this._outputBuffer, this._outputTail, i4);
                        this._outputTail += i4;
                    }
                } else {
                    _flushBuffer();
                    this._writer.write(cArr, i, i4);
                }
                if (i3 >= i2) {
                    break;
                }
                i = i3 + 1;
                char c2 = cArr[i3];
                _appendCharacterEscape(c2, iArr[c2]);
            }
        }
    }

    private void _writeString2(int i) {
        int i2 = this._outputTail + i;
        int[] iArr = this._outputEscapes;
        char length = iArr.length;
        while (this._outputTail < i2) {
            int i3;
            while (true) {
                char[] cArr = this._outputBuffer;
                i3 = this._outputTail;
                char c = cArr[i3];
                if (c < length && iArr[c] != 0) {
                    break;
                }
                int i4 = this._outputTail + 1;
                this._outputTail = i4;
                if (i4 >= i2) {
                    return;
                }
            }
            int i5 = this._outputHead;
            i3 -= i5;
            if (i3 > 0) {
                this._writer.write(cArr, i5, i3);
            }
            char[] cArr2 = this._outputBuffer;
            i5 = this._outputTail;
            this._outputTail = i5 + 1;
            char c2 = cArr2[i5];
            _prependOrWriteCharacterEscape(c2, iArr[c2]);
        }
    }

    private void _writeStringASCII(int i, int i2) {
        int i3 = this._outputTail + i;
        int[] iArr = this._outputEscapes;
        char min = Math.min(iArr.length, i2 + 1);
        while (this._outputTail < i3) {
            char c;
            int i4;
            int i5;
            int i6;
            while (true) {
                c = this._outputBuffer[this._outputTail];
                if (c < min) {
                    int i7;
                    i4 = iArr[c];
                    if (i4 != 0) {
                        break;
                    }
                    i7 = this._outputTail + 1;
                    this._outputTail = i7;
                    if (i7 >= i3) {
                        return;
                    }
                }
                if (c > i2) {
                    break;
                }
                i7 = this._outputTail + 1;
                this._outputTail = i7;
                if (i7 >= i3) {
                    return;
                }
                i5 = this._outputTail;
                i6 = this._outputHead;
                i5 -= i6;
                if (i5 > 0) {
                    this._writer.write(this._outputBuffer, i6, i5);
                }
                this._outputTail++;
                _prependOrWriteCharacterEscape(c, i4);
            }
            i4 = -1;
            i5 = this._outputTail;
            i6 = this._outputHead;
            i5 -= i6;
            if (i5 > 0) {
                this._writer.write(this._outputBuffer, i6, i5);
            }
            this._outputTail++;
            _prependOrWriteCharacterEscape(c, i4);
        }
    }

    private void _writeStringASCII(char[] cArr, int i, int i2, int i3) {
        i2 += i;
        int[] iArr = this._outputEscapes;
        char min = Math.min(iArr.length, i3 + 1);
        int i4 = 0;
        while (i < i2) {
            int i5 = i;
            do {
                char c = cArr[i5];
                if (c >= min) {
                    if (c > i3) {
                        i4 = -1;
                        break;
                    }
                }
                i4 = iArr[c];
                if (i4 != 0) {
                    break;
                }
                i5++;
            } while (i5 < i2);
            int i6 = i5 - i;
            if (i6 < 32) {
                if (this._outputTail + i6 > this._outputEnd) {
                    _flushBuffer();
                }
                if (i6 > 0) {
                    System.arraycopy(cArr, i, this._outputBuffer, this._outputTail, i6);
                    this._outputTail += i6;
                }
            } else {
                _flushBuffer();
                this._writer.write(cArr, i, i6);
            }
            if (i5 < i2) {
                i = i5 + 1;
                _appendCharacterEscape(c, i4);
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void _writeStringCustom(int r13) {
        /*
        r12 = this;
        r10 = r12._outputTail;
        r10 = r10 + r13;
        r11 = r12._outputEscapes;
        r0 = r12._maximumNonEscapedChar;
        r9 = 1;
        if (r0 >= r9) goto L_0x000e;
    L_0x000a:
        r8 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        goto L_0x0010;
    L_0x000e:
        r8 = r12._maximumNonEscapedChar;
    L_0x0010:
        r1 = r11.length;
        r0 = r8 + 1;
        r7 = java.lang.Math.min(r1, r0);
        r6 = r12._characterEscapes;
    L_0x0019:
        r0 = r12._outputTail;
        if (r0 >= r10) goto L_0x0055;
    L_0x001d:
        r1 = r12._outputBuffer;
        r0 = r12._outputTail;
        r5 = r1[r0];
        if (r5 >= r7) goto L_0x002a;
    L_0x0025:
        r4 = r11[r5];
        if (r4 == 0) goto L_0x004e;
    L_0x0029:
        goto L_0x0037;
    L_0x002a:
        if (r5 <= r8) goto L_0x002e;
    L_0x002c:
        r4 = -1;
        goto L_0x0037;
    L_0x002e:
        r0 = r6.getEscapeSequence(r5);
        r12._currentEscape = r0;
        if (r0 == 0) goto L_0x004e;
    L_0x0036:
        r4 = -2;
    L_0x0037:
        r3 = r12._outputTail;
        r2 = r12._outputHead;
        r3 = r3 - r2;
        if (r3 <= 0) goto L_0x0045;
    L_0x003e:
        r1 = r12._writer;
        r0 = r12._outputBuffer;
        r1.write(r0, r2, r3);
    L_0x0045:
        r0 = r12._outputTail;
        r0 = r0 + r9;
        r12._outputTail = r0;
        r12._prependOrWriteCharacterEscape(r5, r4);
        goto L_0x0019;
    L_0x004e:
        r0 = r12._outputTail;
        r0 = r0 + r9;
        r12._outputTail = r0;
        if (r0 < r10) goto L_0x001d;
    L_0x0055:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeStringCustom(int):void");
    }

    private void _writeStringCustom(char[] cArr, int i, int i2) {
        i2 += i;
        int[] iArr = this._outputEscapes;
        char c = this._maximumNonEscapedChar < 1 ? '￿' : this._maximumNonEscapedChar;
        char min = Math.min(iArr.length, c + 1);
        CharacterEscapes characterEscapes = this._characterEscapes;
        int i3 = 0;
        while (i < i2) {
            int i4 = i;
            do {
                char c2 = cArr[i4];
                if (c2 >= min) {
                    if (c2 <= c) {
                        SerializableString escapeSequence = characterEscapes.getEscapeSequence(c2);
                        this._currentEscape = escapeSequence;
                        if (escapeSequence != null) {
                            i3 = -2;
                            break;
                        }
                    }
                    i3 = -1;
                    break;
                }
                i3 = iArr[c2];
                if (i3 != 0) {
                    break;
                }
                i4++;
            } while (i4 < i2);
            int i5 = i4 - i;
            if (i5 < 32) {
                if (this._outputTail + i5 > this._outputEnd) {
                    _flushBuffer();
                }
                if (i5 > 0) {
                    System.arraycopy(cArr, i, this._outputBuffer, this._outputTail, i5);
                    this._outputTail += i5;
                }
            } else {
                _flushBuffer();
                this._writer.write(cArr, i, i5);
            }
            if (i4 < i2) {
                i = i4 + 1;
                _appendCharacterEscape(c2, i3);
            } else {
                return;
            }
        }
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
        if (this._writer != null) {
            if (!this._ioContext.isResourceManaged()) {
                if (!isEnabled(Feature.AUTO_CLOSE_TARGET)) {
                    if (isEnabled(Feature.FLUSH_PASSED_TO_STREAM)) {
                        this._writer.flush();
                    }
                }
            }
            this._writer.close();
        }
        _releaseBuffers();
    }

    public final void flush() {
        _flushBuffer();
        if (this._writer != null && isEnabled(Feature.FLUSH_PASSED_TO_STREAM)) {
            this._writer.flush();
        }
    }

    public final Object getOutputTarget() {
        return this._writer;
    }

    public final int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i) {
        _verifyValueWrite("write binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = '\"';
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
        cArr = this._outputBuffer;
        i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = '\"';
        return i;
    }

    public final void writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) {
        _verifyValueWrite("write binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr[i3] = '\"';
        _writeBinary(base64Variant, bArr, i, i2 + i);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        cArr = this._outputBuffer;
        i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr[i3] = '\"';
    }

    public final void writeBoolean(boolean z) {
        int i;
        _verifyValueWrite("write boolean value");
        if (this._outputTail + 5 >= this._outputEnd) {
            _flushBuffer();
        }
        int i2 = this._outputTail;
        char[] cArr = this._outputBuffer;
        if (z) {
            cArr[i2] = 't';
            i2++;
            cArr[i2] = 'r';
            i2++;
            cArr[i2] = 'u';
            i = i2 + 1;
            cArr[i] = 'e';
        } else {
            cArr[i2] = 'f';
            i2++;
            cArr[i2] = 'a';
            i2++;
            cArr[i2] = 'l';
            i2++;
            cArr[i2] = 's';
            i = i2 + 1;
            cArr[i] = 'e';
        }
        this._outputTail = i + 1;
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
            char[] cArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            cArr[i] = ']';
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
            char[] cArr = this._outputBuffer;
            int i = this._outputTail;
            this._outputTail = i + 1;
            cArr[i] = '}';
        }
        this._writeContext = this._writeContext.getParent();
    }

    public final void writeFieldName(SerializableString serializableString) {
        int writeFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (writeFieldName == 4) {
            GeneratorBase._reportError("Can not write a field name, expecting a value");
        }
        boolean z = true;
        if (writeFieldName != 1) {
            z = false;
        }
        _writeFieldName(serializableString, z);
    }

    public final void writeFieldName(String str) {
        int writeFieldName = this._writeContext.writeFieldName(str);
        if (writeFieldName == 4) {
            GeneratorBase._reportError("Can not write a field name, expecting a value");
        }
        boolean z = true;
        if (writeFieldName != 1) {
            z = false;
        }
        _writeFieldName(str, z);
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
        if (this._cfgNumbersAsStrings) {
            _writeQuotedInt(i);
            return;
        }
        if (this._outputTail + 11 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputInt(i, this._outputBuffer, this._outputTail);
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
        if (this._cfgNumbersAsStrings) {
            _writeQuotedShort(s);
            return;
        }
        if (this._outputTail + 6 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputInt((int) s, this._outputBuffer, this._outputTail);
    }

    public final void writeRaw(char c) {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = c;
    }

    public final void writeRaw(SerializableString serializableString) {
        writeRaw(serializableString.getValue());
    }

    public final void writeRaw(String str) {
        int length = str.length();
        int i = this._outputEnd - this._outputTail;
        if (i == 0) {
            _flushBuffer();
            i = this._outputEnd - this._outputTail;
        }
        if (i >= length) {
            str.getChars(0, length, this._outputBuffer, this._outputTail);
            this._outputTail += length;
            return;
        }
        writeRawLong(str);
    }

    public final void writeRaw(String str, int i, int i2) {
        int i3 = this._outputEnd - this._outputTail;
        if (i3 < i2) {
            _flushBuffer();
            i3 = this._outputEnd - this._outputTail;
        }
        if (i3 >= i2) {
            str.getChars(i, i + i2, this._outputBuffer, this._outputTail);
            this._outputTail += i2;
            return;
        }
        writeRawLong(str.substring(i, i2 + i));
    }

    public final void writeRaw(char[] cArr, int i, int i2) {
        if (i2 < 32) {
            if (i2 > this._outputEnd - this._outputTail) {
                _flushBuffer();
            }
            System.arraycopy(cArr, i, this._outputBuffer, this._outputTail, i2);
            this._outputTail += i2;
            return;
        }
        _flushBuffer();
        this._writer.write(cArr, i, i2);
    }

    private void writeRawLong(String str) {
        int i = this._outputEnd;
        int i2 = this._outputTail;
        i -= i2;
        str.getChars(0, i, this._outputBuffer, i2);
        this._outputTail += i;
        _flushBuffer();
        int length = str.length() - i;
        while (true) {
            int i3 = this._outputEnd;
            if (length > i3) {
                i2 = i + i3;
                str.getChars(i, i2, this._outputBuffer, 0);
                this._outputHead = 0;
                this._outputTail = i3;
                _flushBuffer();
                length -= i3;
                i = i2;
            } else {
                str.getChars(i, i + length, this._outputBuffer, 0);
                this._outputHead = 0;
                this._outputTail = length;
                return;
            }
        }
    }

    public final void writeRawUTF8String(byte[] bArr, int i, int i2) {
        _reportUnsupportedOperation();
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
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = '[';
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
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = '{';
    }

    public final void writeString(SerializableString serializableString) {
        _verifyValueWrite("write text value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = '\"';
        Object asQuotedChars = serializableString.asQuotedChars();
        int length = asQuotedChars.length;
        if (length < 32) {
            if (length > this._outputEnd - this._outputTail) {
                _flushBuffer();
            }
            System.arraycopy(asQuotedChars, 0, this._outputBuffer, this._outputTail, length);
            this._outputTail += length;
        } else {
            _flushBuffer();
            this._writer.write(asQuotedChars, 0, length);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        cArr = this._outputBuffer;
        i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = '\"';
    }

    public final void writeString(String str) {
        _verifyValueWrite("write text value");
        if (str == null) {
            _writeNull();
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = '\"';
        _writeString(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        cArr = this._outputBuffer;
        i = this._outputTail;
        this._outputTail = i + 1;
        cArr[i] = '\"';
    }

    public final void writeString(char[] cArr, int i, int i2) {
        _verifyValueWrite("write text value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr2[i3] = '\"';
        _writeString(cArr, i, i2);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        cArr2 = this._outputBuffer;
        i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr2[i3] = '\"';
    }

    public final void writeUTF8String(byte[] bArr, int i, int i2) {
        _reportUnsupportedOperation();
    }
}
