package com.fasterxml.jackson.core.io;

import java.io.CharConversionException;
import java.io.InputStream;

public final class UTF32Reader extends BaseReader {
    public final boolean _bigEndian;
    public int _byteCount = 0;
    public int _charCount = 0;
    public final boolean _managedBuffers;
    public char _surrogate = '\u0000';

    public UTF32Reader(IOContext iOContext, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        super(iOContext, inputStream, bArr, i, i2);
        boolean z2 = false;
        this._bigEndian = z;
        if (inputStream != null) {
            z2 = true;
        }
        this._managedBuffers = z2;
    }

    private boolean loadMore(int i) {
        this._byteCount += this._length - i;
        if (i <= 0) {
            this._ptr = 0;
            i = this._in == null ? -1 : this._in.read(this._buffer);
            if (i < 1) {
                this._length = 0;
                if (i < 0) {
                    if (this._managedBuffers) {
                        freeBuffers();
                    }
                    return false;
                }
                BaseReader.reportStrangeStream();
            }
        } else if (this._ptr > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                this._buffer[i2] = this._buffer[this._ptr + i2];
            }
            this._ptr = 0;
        }
        this._length = i;
        while (this._length < 4) {
            int read = this._in == null ? -1 : this._in.read(this._buffer, this._length, this._buffer.length - this._length);
            if (read < 1) {
                if (read < 0) {
                    if (this._managedBuffers) {
                        freeBuffers();
                    }
                    reportUnexpectedEOF(this._length, 4);
                }
                BaseReader.reportStrangeStream();
            }
            this._length = this._length + read;
        }
        return true;
    }

    public final int read(char[] cArr, int i, int i2) {
        if (this._buffer != null) {
            if (i2 < 1) {
                return i2;
            }
            int i3;
            int i4;
            if (i < 0 || i + i2 > cArr.length) {
                BaseReader.reportBounds(cArr, i, i2);
            }
            i2 += i;
            char c = this._surrogate;
            if (c != '\u0000') {
                i3 = i + 1;
                cArr[i] = c;
                this._surrogate = '\u0000';
            } else {
                int i5 = this._length - this._ptr;
                if (i5 >= 4 || loadMore(i5)) {
                    i3 = i;
                }
            }
            while (i3 < i2) {
                int i6 = this._ptr;
                if (this._bigEndian) {
                    i6 = (this._buffer[i6 + 3] & 255) | (((this._buffer[i6] << 24) | ((this._buffer[i6 + 1] & 255) << 16)) | ((this._buffer[i6 + 2] & 255) << 8));
                } else {
                    i6 = (this._buffer[i6 + 3] << 24) | (((this._buffer[i6] & 255) | ((this._buffer[i6 + 1] & 255) << 8)) | ((this._buffer[i6 + 2] & 255) << 16));
                }
                this._ptr = this._ptr + 4;
                if (i6 > 65535) {
                    if (i6 > 1114111) {
                        i4 = i3 - i;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("(above ");
                        stringBuilder.append(Integer.toHexString(1114111));
                        stringBuilder.append(") ");
                        reportInvalid(i6, i4, stringBuilder.toString());
                    }
                    i6 -= 65536;
                    i4 = i3 + 1;
                    cArr[i3] = (char) ((i6 >> 10) + 55296);
                    i6 = (i6 & 1023) | 56320;
                    if (i4 >= i2) {
                        this._surrogate = (char) i6;
                        break;
                    }
                    i3 = i4;
                }
                i4 = i3 + 1;
                cArr[i3] = (char) i6;
                if (this._ptr >= this._length) {
                    break;
                }
                i3 = i4;
            }
            i4 = i3;
            i4 -= i;
            this._charCount += i4;
            return i4;
        }
        return -1;
    }

    private void reportInvalid(int i, int i2, String str) {
        int i3 = (this._byteCount + this._ptr) - 1;
        int i4 = this._charCount + i2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid UTF-32 character 0x");
        stringBuilder.append(Integer.toHexString(i));
        stringBuilder.append(str);
        stringBuilder.append(" at char #");
        stringBuilder.append(i4);
        stringBuilder.append(", byte #");
        stringBuilder.append(i3);
        stringBuilder.append(")");
        throw new CharConversionException(stringBuilder.toString());
    }

    private void reportUnexpectedEOF(int i, int i2) {
        int i3 = this._byteCount + i;
        int i4 = this._charCount;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected EOF in the middle of a 4-byte UTF-32 char: got ");
        stringBuilder.append(i);
        stringBuilder.append(", needed ");
        stringBuilder.append(i2);
        stringBuilder.append(", at char #");
        stringBuilder.append(i4);
        stringBuilder.append(", byte #");
        stringBuilder.append(i3);
        stringBuilder.append(")");
        throw new CharConversionException(stringBuilder.toString());
    }
}
