package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.format.InputAccessor.Std;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.io.MergedStream;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collection;

public class DataFormatReaders {
    public static final int DEFAULT_MAX_INPUT_LOOKAHEAD = 64;
    public final int _maxInputLookahead;
    public final MatchStrength _minimalMatch;
    public final MatchStrength _optimalMatch;
    public final ObjectReader[] _readers;

    public class AccessorForReader extends Std {
        public AccessorForReader(InputStream inputStream, byte[] bArr) {
            super(inputStream, bArr);
        }

        public AccessorForReader(byte[] bArr) {
            super(bArr);
        }

        public AccessorForReader(byte[] bArr, int i, int i2) {
            super(bArr, i, i2);
        }

        public Match createMatcher(ObjectReader objectReader, MatchStrength matchStrength) {
            return new Match(this._in, this._buffer, this._bufferedStart, this._bufferedEnd - this._bufferedStart, objectReader, matchStrength);
        }
    }

    public class Match {
        public final byte[] _bufferedData;
        public final int _bufferedLength;
        public final int _bufferedStart;
        public final ObjectReader _match;
        public final MatchStrength _matchStrength;
        public final InputStream _originalStream;

        public Match(InputStream inputStream, byte[] bArr, int i, int i2, ObjectReader objectReader, MatchStrength matchStrength) {
            this._originalStream = inputStream;
            this._bufferedData = bArr;
            this._bufferedStart = i;
            this._bufferedLength = i2;
            this._match = objectReader;
            this._matchStrength = matchStrength;
        }

        public JsonParser createParserWithMatch() {
            ObjectCodec objectCodec = this._match;
            if (objectCodec == null) {
                return null;
            }
            JsonFactory factory = objectCodec.getFactory();
            if (this._originalStream == null) {
                return factory.createParser(this._bufferedData, this._bufferedStart, this._bufferedLength);
            }
            return factory.createParser(getDataStream());
        }

        public InputStream getDataStream() {
            InputStream inputStream = this._originalStream;
            if (inputStream == null) {
                return new ByteArrayInputStream(this._bufferedData, this._bufferedStart, this._bufferedLength);
            }
            return new MergedStream(null, inputStream, this._bufferedData, this._bufferedStart, this._bufferedLength);
        }

        public MatchStrength getMatchStrength() {
            MatchStrength matchStrength = this._matchStrength;
            return matchStrength == null ? MatchStrength.INCONCLUSIVE : matchStrength;
        }

        public String getMatchedFormatName() {
            return this._match.getFactory().getFormatName();
        }

        public ObjectReader getReader() {
            return this._match;
        }

        public boolean hasMatch() {
            return this._match != null;
        }
    }

    public DataFormatReaders(Collection collection) {
        this((ObjectReader[]) collection.toArray(new ObjectReader[collection.size()]));
    }

    public DataFormatReaders(ObjectReader... objectReaderArr) {
        this(objectReaderArr, MatchStrength.SOLID_MATCH, MatchStrength.WEAK_MATCH, 64);
    }

    private DataFormatReaders(ObjectReader[] objectReaderArr, MatchStrength matchStrength, MatchStrength matchStrength2, int i) {
        this._readers = objectReaderArr;
        this._optimalMatch = matchStrength;
        this._minimalMatch = matchStrength2;
        this._maxInputLookahead = i;
    }

    private Match _findFormat(AccessorForReader accessorForReader) {
        ObjectReader objectReader = null;
        MatchStrength matchStrength = null;
        for (ObjectCodec objectCodec : this._readers) {
            accessorForReader.reset();
            MatchStrength hasFormat = objectCodec.getFactory().hasFormat(accessorForReader);
            if (hasFormat != null) {
                if (hasFormat.ordinal() >= this._minimalMatch.ordinal()) {
                    if (objectReader == null || r7.ordinal() < hasFormat.ordinal()) {
                        if (hasFormat.ordinal() >= this._optimalMatch.ordinal()) {
                            objectReader = objectCodec;
                            matchStrength = hasFormat;
                            break;
                        }
                        objectReader = objectCodec;
                        matchStrength = hasFormat;
                    }
                }
            }
        }
        return accessorForReader.createMatcher(objectReader, matchStrength);
    }

    public Match findFormat(InputStream inputStream) {
        return _findFormat(new AccessorForReader(inputStream, new byte[this._maxInputLookahead]));
    }

    public Match findFormat(byte[] bArr) {
        return _findFormat(new AccessorForReader(bArr));
    }

    public Match findFormat(byte[] bArr, int i, int i2) {
        return _findFormat(new AccessorForReader(bArr, i, i2));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        ObjectReader[] objectReaderArr = this._readers;
        int length = objectReaderArr.length;
        if (length > 0) {
            stringBuilder.append(objectReaderArr[0].getFactory().getFormatName());
            for (int i = 1; i < length; i++) {
                stringBuilder.append(", ");
                stringBuilder.append(this._readers[i].getFactory().getFormatName());
            }
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public DataFormatReaders with(DeserializationConfig deserializationConfig) {
        int length = this._readers.length;
        ObjectReader[] objectReaderArr = new ObjectReader[length];
        for (int i = 0; i < length; i++) {
            objectReaderArr[i] = this._readers[i].with(deserializationConfig);
        }
        return new DataFormatReaders(objectReaderArr, this._optimalMatch, this._minimalMatch, this._maxInputLookahead);
    }

    public DataFormatReaders with(ObjectReader[] objectReaderArr) {
        return new DataFormatReaders(objectReaderArr, this._optimalMatch, this._minimalMatch, this._maxInputLookahead);
    }

    public DataFormatReaders withMaxInputLookahead(int i) {
        if (i == this._maxInputLookahead) {
            return this;
        }
        return new DataFormatReaders(this._readers, this._optimalMatch, this._minimalMatch, i);
    }

    public DataFormatReaders withMinimalMatch(MatchStrength matchStrength) {
        if (matchStrength == this._minimalMatch) {
            return this;
        }
        return new DataFormatReaders(this._readers, this._optimalMatch, matchStrength, this._maxInputLookahead);
    }

    public DataFormatReaders withOptimalMatch(MatchStrength matchStrength) {
        if (matchStrength == this._optimalMatch) {
            return this;
        }
        return new DataFormatReaders(this._readers, matchStrength, this._minimalMatch, this._maxInputLookahead);
    }

    public DataFormatReaders withType(JavaType javaType) {
        int length = this._readers.length;
        ObjectReader[] objectReaderArr = new ObjectReader[length];
        for (int i = 0; i < length; i++) {
            objectReaderArr[i] = this._readers[i].withType(javaType);
        }
        return new DataFormatReaders(objectReaderArr, this._optimalMatch, this._minimalMatch, this._maxInputLookahead);
    }
}
