package com.fasterxml.jackson.core;

import java.io.Serializable;

public final class JsonLocation implements Serializable {
    public static final JsonLocation NA = new JsonLocation("N/A", -1, -1, -1, -1);
    public final int _columnNr;
    public final int _lineNr;
    public final transient Object _sourceRef;
    public final long _totalBytes;
    public final long _totalChars;

    public JsonLocation(Object obj, long j, int i, int i2) {
        this(obj, -1, j, i, i2);
    }

    public JsonLocation(Object obj, long j, long j2, int i, int i2) {
        this._sourceRef = obj;
        this._totalBytes = j;
        this._totalChars = j2;
        this._lineNr = i;
        this._columnNr = i2;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (obj != null) {
                if (obj instanceof JsonLocation) {
                    JsonLocation jsonLocation = (JsonLocation) obj;
                    Object obj2 = this._sourceRef;
                    if (obj2 == null) {
                        if (jsonLocation._sourceRef != null) {
                        }
                    } else if (!obj2.equals(jsonLocation._sourceRef)) {
                    }
                    if (this._lineNr != jsonLocation._lineNr || this._columnNr != jsonLocation._columnNr || this._totalChars != jsonLocation._totalChars || getByteOffset() != jsonLocation.getByteOffset()) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final long getByteOffset() {
        return this._totalBytes;
    }

    public final int hashCode() {
        Object obj = this._sourceRef;
        return ((((obj == null ? 1 : obj.hashCode()) ^ this._lineNr) + this._columnNr) ^ ((int) this._totalChars)) + ((int) this._totalBytes);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(80);
        stringBuilder.append("[Source: ");
        Object obj = this._sourceRef;
        if (obj == null) {
            stringBuilder.append("UNKNOWN");
        } else {
            stringBuilder.append(obj.toString());
        }
        stringBuilder.append("; line: ");
        stringBuilder.append(this._lineNr);
        stringBuilder.append(", column: ");
        stringBuilder.append(this._columnNr);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
