package com.fasterxml.jackson.core.format;

import com.fasterxml.jackson.core.JsonFactory;
import java.io.EOFException;
import java.io.InputStream;

public interface InputAccessor {

    public class Std implements InputAccessor {
        public final byte[] _buffer;
        public int _bufferedEnd;
        public final int _bufferedStart;
        public final InputStream _in;
        public int _ptr;

        public Std(InputStream inputStream, byte[] bArr) {
            this._in = inputStream;
            this._buffer = bArr;
            this._bufferedStart = 0;
            this._ptr = 0;
            this._bufferedEnd = 0;
        }

        public Std(byte[] bArr) {
            this._in = null;
            this._buffer = bArr;
            this._bufferedStart = 0;
            this._bufferedEnd = bArr.length;
        }

        public Std(byte[] bArr, int i, int i2) {
            this._in = null;
            this._buffer = bArr;
            this._ptr = i;
            this._bufferedStart = i;
            this._bufferedEnd = i + i2;
        }

        public DataFormatMatcher createMatcher(JsonFactory jsonFactory, MatchStrength matchStrength) {
            InputStream inputStream = this._in;
            byte[] bArr = this._buffer;
            int i = this._bufferedStart;
            return new DataFormatMatcher(inputStream, bArr, i, this._bufferedEnd - i, jsonFactory, matchStrength);
        }

        public boolean hasMoreBytes() {
            int i = this._ptr;
            if (i < this._bufferedEnd) {
                return true;
            }
            InputStream inputStream = this._in;
            if (inputStream != null) {
                byte[] bArr = this._buffer;
                int length = bArr.length - i;
                if (length >= 1) {
                    int read = inputStream.read(bArr, i, length);
                    if (read > 0) {
                        this._bufferedEnd += read;
                        return true;
                    }
                }
            }
            return false;
        }

        public byte nextByte() {
            if (this._ptr >= this._bufferedEnd) {
                if (!hasMoreBytes()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed auto-detect: could not read more than ");
                    stringBuilder.append(this._ptr);
                    stringBuilder.append(" bytes (max buffer size: ");
                    stringBuilder.append(this._buffer.length);
                    stringBuilder.append(")");
                    throw new EOFException(stringBuilder.toString());
                }
            }
            byte[] bArr = this._buffer;
            int i = this._ptr;
            this._ptr = i + 1;
            return bArr[i];
        }

        public void reset() {
            this._ptr = this._bufferedStart;
        }
    }

    boolean hasMoreBytes();

    byte nextByte();
}
