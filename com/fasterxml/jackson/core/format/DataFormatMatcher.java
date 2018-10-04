package com.fasterxml.jackson.core.format;

import com.fasterxml.jackson.core.JsonFactory;
import java.io.InputStream;

public final class DataFormatMatcher {
    public final byte[] _bufferedData;
    public final int _bufferedLength;
    public final int _bufferedStart;
    public final JsonFactory _match;
    public final MatchStrength _matchStrength;
    public final InputStream _originalStream;

    public DataFormatMatcher(InputStream inputStream, byte[] bArr, int i, int i2, JsonFactory jsonFactory, MatchStrength matchStrength) {
        this._originalStream = inputStream;
        this._bufferedData = bArr;
        this._bufferedStart = i;
        this._bufferedLength = i2;
        this._match = jsonFactory;
        this._matchStrength = matchStrength;
    }
}
