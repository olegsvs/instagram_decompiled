package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.SerializableString;
import java.io.Serializable;

public final class SerializedString implements SerializableString, Serializable {
    public char[] _quotedChars;
    public byte[] _quotedUTF8Ref;
    public byte[] _unquotedUTF8Ref;
    public final String _value;

    public SerializedString(String str) {
        if (str != null) {
            this._value = str;
            return;
        }
        throw new IllegalStateException("Null String illegal for SerializedString");
    }

    public final int appendQuotedUTF8(byte[] bArr, int i) {
        Object obj = this._quotedUTF8Ref;
        if (obj == null) {
            obj = JsonStringEncoder.getInstance().quoteAsUTF8(this._value);
            this._quotedUTF8Ref = obj;
        }
        int length = obj.length;
        if (i + length > bArr.length) {
            return -1;
        }
        System.arraycopy(obj, 0, bArr, i, length);
        return length;
    }

    public final char[] asQuotedChars() {
        char[] cArr = this._quotedChars;
        if (cArr != null) {
            return cArr;
        }
        cArr = JsonStringEncoder.getInstance().quoteAsString(this._value);
        this._quotedChars = cArr;
        return cArr;
    }

    public final byte[] asQuotedUTF8() {
        byte[] bArr = this._quotedUTF8Ref;
        if (bArr != null) {
            return bArr;
        }
        bArr = JsonStringEncoder.getInstance().quoteAsUTF8(this._value);
        this._quotedUTF8Ref = bArr;
        return bArr;
    }

    public final byte[] asUnquotedUTF8() {
        byte[] bArr = this._unquotedUTF8Ref;
        if (bArr != null) {
            return bArr;
        }
        bArr = JsonStringEncoder.getInstance().encodeAsUTF8(this._value);
        this._unquotedUTF8Ref = bArr;
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null) {
            if (obj.getClass() == getClass()) {
                return this._value.equals(((SerializedString) obj)._value);
            }
        }
        return false;
    }

    public final String getValue() {
        return this._value;
    }

    public final int hashCode() {
        return this._value.hashCode();
    }

    public final String toString() {
        return this._value;
    }
}
