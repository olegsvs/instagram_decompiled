package com.fasterxml.jackson.core.json;

import com.facebook.common.dextricks.DexStore;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer;
import com.fasterxml.jackson.core.sym.Name;
import com.fasterxml.jackson.core.sym.Name1;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class UTF8StreamJsonParser extends ParserBase {
    private static final int[] sInputCodesLatin1 = CharTypes.getInputCodeLatin1();
    private static final int[] sInputCodesUtf8 = CharTypes.getInputCodeUtf8();
    public boolean _bufferRecyclable;
    public byte[] _inputBuffer;
    public InputStream _inputStream;
    public ObjectCodec _objectCodec;
    private int _quad1;
    public int[] _quadBuffer = new int[16];
    public final BytesToNameCanonicalizer _symbols;
    public boolean _tokenIncomplete = false;

    public UTF8StreamJsonParser(IOContext iOContext, int i, InputStream inputStream, ObjectCodec objectCodec, BytesToNameCanonicalizer bytesToNameCanonicalizer, byte[] bArr, int i2, int i3, boolean z) {
        super(iOContext, i);
        this._inputStream = inputStream;
        this._objectCodec = objectCodec;
        this._symbols = bytesToNameCanonicalizer;
        this._inputBuffer = bArr;
        this._inputPtr = i2;
        this._inputEnd = i3;
        this._bufferRecyclable = z;
    }

    public final void _closeInput() {
        if (this._inputStream != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(Feature.AUTO_CLOSE_SOURCE)) {
                this._inputStream.close();
            }
            this._inputStream = null;
        }
    }

    public final byte[] _decodeBase64(Base64Variant base64Variant) {
        ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                loadMoreGuaranteed();
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            i = bArr[i] & 255;
            if (i > 32) {
                int decodeBase64Char = base64Variant.decodeBase64Char(i);
                if (decodeBase64Char < 0) {
                    if (i == 34) {
                        return _getByteArrayBuilder.toByteArray();
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, i, 0);
                    if (decodeBase64Char < 0) {
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    loadMoreGuaranteed();
                }
                bArr = this._inputBuffer;
                i = this._inputPtr;
                this._inputPtr = i + 1;
                i = bArr[i] & 255;
                int decodeBase64Char2 = base64Variant.decodeBase64Char(i);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, i, 1);
                }
                decodeBase64Char = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    loadMoreGuaranteed();
                }
                bArr = this._inputBuffer;
                i = this._inputPtr;
                this._inputPtr = i + 1;
                int i2 = bArr[i] & 255;
                decodeBase64Char2 = base64Variant.decodeBase64Char(i2);
                if (decodeBase64Char2 < 0) {
                    if (decodeBase64Char2 != -2) {
                        if (i2 != 34 || base64Variant.usesPadding()) {
                            decodeBase64Char2 = _decodeBase64Escape(base64Variant, i2, 2);
                        } else {
                            _getByteArrayBuilder.append(decodeBase64Char >> 4);
                            return _getByteArrayBuilder.toByteArray();
                        }
                    }
                    if (decodeBase64Char2 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            loadMoreGuaranteed();
                        }
                        bArr = this._inputBuffer;
                        i = this._inputPtr;
                        this._inputPtr = i + 1;
                        i2 = bArr[i] & 255;
                        if (base64Variant.usesPaddingChar(i2)) {
                            _getByteArrayBuilder.append(decodeBase64Char >> 4);
                        } else {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("expected padding character '");
                            stringBuilder.append(base64Variant.getPaddingChar());
                            stringBuilder.append("'");
                            throw ParserBase.reportInvalidBase64Char(base64Variant, i2, 3, stringBuilder.toString());
                        }
                    }
                }
                decodeBase64Char = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    loadMoreGuaranteed();
                }
                bArr = this._inputBuffer;
                i = this._inputPtr;
                this._inputPtr = i + 1;
                i2 = bArr[i] & 255;
                i = base64Variant.decodeBase64Char(i2);
                if (i < 0) {
                    if (i != -2) {
                        if (i2 != 34 || base64Variant.usesPadding()) {
                            i = _decodeBase64Escape(base64Variant, i2, 3);
                        } else {
                            _getByteArrayBuilder.appendTwoBytes(decodeBase64Char >> 2);
                            return _getByteArrayBuilder.toByteArray();
                        }
                    }
                    if (i == -2) {
                        _getByteArrayBuilder.appendTwoBytes(decodeBase64Char >> 2);
                    }
                }
                _getByteArrayBuilder.appendThreeBytes((decodeBase64Char << 6) | i);
            }
        }
    }

    public final int _decodeCharForError(int i) {
        if (i >= 0) {
            return i;
        }
        int i2;
        int nextByte;
        if ((i & 224) == 192) {
            i &= 31;
        } else {
            if ((i & 240) == 224) {
                i &= 15;
                i2 = 2;
            } else if ((i & 248) == 240) {
                i &= 7;
                i2 = 3;
            } else {
                _reportInvalidInitial(i & 255);
            }
            nextByte = nextByte();
            if ((nextByte & 192) != 128) {
                _reportInvalidOther(nextByte & 255);
            }
            i = (i << 6) | (nextByte & 63);
            if (i2 > 1) {
                return i;
            }
            nextByte = nextByte();
            if ((nextByte & 192) != 128) {
                _reportInvalidOther(nextByte & 255);
            }
            i = (i << 6) | (nextByte & 63);
            if (i2 > 2) {
                return i;
            }
            nextByte = nextByte();
            if ((nextByte & 192) != 128) {
                _reportInvalidOther(nextByte & 255);
            }
            return (i << 6) | (nextByte & 63);
        }
        i2 = 1;
        nextByte = nextByte();
        if ((nextByte & 192) != 128) {
            _reportInvalidOther(nextByte & 255);
        }
        i = (i << 6) | (nextByte & 63);
        if (i2 > 1) {
            return i;
        }
        nextByte = nextByte();
        if ((nextByte & 192) != 128) {
            _reportInvalidOther(nextByte & 255);
        }
        i = (i << 6) | (nextByte & 63);
        if (i2 > 2) {
            return i;
        }
        nextByte = nextByte();
        if ((nextByte & 192) != 128) {
            _reportInvalidOther(nextByte & 255);
        }
        return (i << 6) | (nextByte & 63);
    }

    public final char _decodeEscaped() {
        if (this._inputPtr >= this._inputEnd && !loadMore()) {
            _reportInvalidEOF(" in character escape sequence");
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        byte b = bArr[i];
        if (b == (byte) 34 || b == (byte) 47 || b == (byte) 92) {
            return (char) b;
        }
        if (b == (byte) 98) {
            return '\b';
        }
        if (b == (byte) 102) {
            return '\f';
        }
        if (b == (byte) 110) {
            return '\n';
        }
        if (b == (byte) 114) {
            return '\r';
        }
        switch (b) {
            case ParserMinimalBase.INT_t /*116*/:
                return '\t';
            case ParserMinimalBase.INT_u /*117*/:
                int i2 = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    if (this._inputPtr >= this._inputEnd && !loadMore()) {
                        _reportInvalidEOF(" in character escape sequence");
                    }
                    byte[] bArr2 = this._inputBuffer;
                    int i4 = this._inputPtr;
                    this._inputPtr = i4 + 1;
                    byte b2 = bArr2[i4];
                    i4 = CharTypes.charToHex(b2);
                    if (i4 < 0) {
                        _reportUnexpectedChar(b2, "expected a hex-digit for character escape sequence");
                    }
                    i2 = (i2 << 4) | i4;
                }
                return (char) i2;
            default:
                return _handleUnrecognizedCharacterEscape((char) _decodeCharForError(b));
        }
    }

    private int _decodeUtf8_2(int i) {
        if (this._inputPtr >= this._inputEnd) {
            loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
        }
        return ((i & 31) << 6) | (b & 63);
    }

    private int _decodeUtf8_3(int i) {
        if (this._inputPtr >= this._inputEnd) {
            loadMoreGuaranteed();
        }
        int i2 = i & 15;
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
        }
        i2 = (i2 << 6) | (b & 63);
        if (this._inputPtr >= this._inputEnd) {
            loadMoreGuaranteed();
        }
        bArr = this._inputBuffer;
        i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        b = bArr[i3];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
        }
        return (i2 << 6) | (b & 63);
    }

    private int _decodeUtf8_3fast(int i) {
        int i2 = i & 15;
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
        }
        i2 = (i2 << 6) | (b & 63);
        bArr = this._inputBuffer;
        i3 = this._inputPtr;
        this._inputPtr = i3 + 1;
        b = bArr[i3];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
        }
        return (i2 << 6) | (b & 63);
    }

    private int _decodeUtf8_4(int i) {
        if (this._inputPtr >= this._inputEnd) {
            loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
        }
        int i3 = ((i & 7) << 6) | (b & 63);
        if (this._inputPtr >= this._inputEnd) {
            loadMoreGuaranteed();
        }
        bArr = this._inputBuffer;
        i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        b = bArr[i2];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
        }
        i3 = (i3 << 6) | (b & 63);
        if (this._inputPtr >= this._inputEnd) {
            loadMoreGuaranteed();
        }
        bArr = this._inputBuffer;
        i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        b = bArr[i2];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
        }
        return ((i3 << 6) | (b & 63)) - 65536;
    }

    public final void _finishString() {
        int i = this._inputPtr;
        if (i >= this._inputEnd) {
            loadMoreGuaranteed();
            i = this._inputPtr;
        }
        int i2 = 0;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = sInputCodesUtf8;
        int min = Math.min(this._inputEnd, emptyAndGetCurrentSegment.length + i);
        byte[] bArr = this._inputBuffer;
        while (i < min) {
            int i3 = bArr[i] & 255;
            if (iArr[i3] != 0) {
                if (i3 == 34) {
                    this._inputPtr = i + 1;
                    this._textBuffer.setCurrentLength(i2);
                    return;
                }
                this._inputPtr = i;
                _finishString2(emptyAndGetCurrentSegment, i2);
            }
            i++;
            int i4 = i2 + 1;
            emptyAndGetCurrentSegment[i2] = (char) i3;
            i2 = i4;
        }
        this._inputPtr = i;
        _finishString2(emptyAndGetCurrentSegment, i2);
    }

    private void _finishString2(char[] cArr, int i) {
        int[] iArr = sInputCodesUtf8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i2 = this._inputPtr;
            if (i2 >= this._inputEnd) {
                loadMoreGuaranteed();
                i2 = this._inputPtr;
            }
            if (i >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            int min = Math.min(this._inputEnd, (cArr.length - i) + i2);
            while (i2 < min) {
                int i3 = i2 + 1;
                i2 = bArr[i2] & 255;
                int i4;
                if (iArr[i2] != 0) {
                    this._inputPtr = i3;
                    if (i2 == 34) {
                        this._textBuffer.setCurrentLength(i);
                        return;
                    }
                    switch (iArr[i2]) {
                        case 1:
                            i2 = _decodeEscaped();
                            break;
                        case 2:
                            i2 = _decodeUtf8_2(i2);
                            break;
                        case 3:
                            if (this._inputEnd - this._inputPtr < 2) {
                                i2 = _decodeUtf8_3(i2);
                                break;
                            } else {
                                i2 = _decodeUtf8_3fast(i2);
                                break;
                            }
                        case 4:
                            i2 = _decodeUtf8_4(i2);
                            i3 = i + 1;
                            cArr[i] = (char) (55296 | (i2 >> 10));
                            if (i3 >= cArr.length) {
                                cArr = this._textBuffer.finishCurrentSegment();
                                i3 = 0;
                            }
                            i2 = (i2 & 1023) | 56320;
                            i = i3;
                            break;
                        default:
                            if (i2 >= 32) {
                                _reportInvalidChar(i2);
                                break;
                            } else {
                                _throwUnquotedSpace(i2, "string value");
                                break;
                            }
                    }
                    if (i >= cArr.length) {
                        cArr = this._textBuffer.finishCurrentSegment();
                        i = 0;
                    }
                    i4 = i + 1;
                    cArr[i] = (char) i2;
                    i = i4;
                } else {
                    i4 = i + 1;
                    cArr[i] = (char) i2;
                    i2 = i3;
                    i = i4;
                }
            }
            this._inputPtr = i2;
        }
    }

    public final String _getText2(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        switch (jsonToken) {
            case FIELD_NAME:
                return this._parsingContext.getCurrentName();
            case VALUE_STRING:
            case VALUE_NUMBER_INT:
            case VALUE_NUMBER_FLOAT:
                return this._textBuffer.contentsAsString();
            default:
                return jsonToken.asString();
        }
    }

    public final JsonToken _handleApostropheValue() {
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = sInputCodesUtf8;
        byte[] bArr = this._inputBuffer;
        int i = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                loadMoreGuaranteed();
            }
            if (i >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            int i2 = this._inputEnd;
            int length = this._inputPtr + (emptyAndGetCurrentSegment.length - i);
            if (length < i2) {
                i2 = length;
            }
            while (this._inputPtr < i2) {
                length = this._inputPtr;
                this._inputPtr = length + 1;
                int i3 = bArr[length] & 255;
                if (i3 != 39) {
                    if (iArr[i3] == 0) {
                        length = i + 1;
                        emptyAndGetCurrentSegment[i] = (char) i3;
                        i = length;
                    }
                }
                if (i3 == 39) {
                    this._textBuffer.setCurrentLength(i);
                    return JsonToken.VALUE_STRING;
                }
                switch (iArr[i3]) {
                    case 1:
                        if (i3 != 34) {
                            i3 = _decodeEscaped();
                            break;
                        }
                        break;
                    case 2:
                        i3 = _decodeUtf8_2(i3);
                        break;
                    case 3:
                        if (this._inputEnd - this._inputPtr < 2) {
                            i3 = _decodeUtf8_3(i3);
                            break;
                        }
                        i3 = _decodeUtf8_3fast(i3);
                        break;
                    case 4:
                        int _decodeUtf8_4 = _decodeUtf8_4(i3);
                        i2 = i + 1;
                        emptyAndGetCurrentSegment[i] = (char) (55296 | (_decodeUtf8_4 >> 10));
                        if (i2 >= emptyAndGetCurrentSegment.length) {
                            emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                            i2 = 0;
                        }
                        i3 = 56320 | (_decodeUtf8_4 & 1023);
                        i = i2;
                        break;
                    default:
                        if (i3 < 32) {
                            _throwUnquotedSpace(i3, "string value");
                        }
                        _reportInvalidChar(i3);
                        break;
                }
                if (i >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i = 0;
                }
                length = i + 1;
                emptyAndGetCurrentSegment[i] = (char) i3;
                i = length;
            }
        }
    }

    public final JsonToken _handleInvalidNumberStart(int i, boolean z) {
        while (i == 73) {
            String str;
            if (this._inputPtr >= this._inputEnd && !loadMore()) {
                _reportInvalidEOFInValue();
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            i = bArr[i2];
            if (i != 78) {
                if (i != ParserMinimalBase.INT_n) {
                    break;
                }
                str = z ? "-Infinity" : "+Infinity";
            } else {
                str = z ? "-INF" : "+INF";
            }
            _matchToken(str, 3);
            if (isEnabled(Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
                return resetAsNaN(str, z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Non-standard token '");
            stringBuilder.append(str);
            stringBuilder.append("': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            _reportError(stringBuilder.toString());
        }
        reportUnexpectedNumberChar(i, "expected digit (0-9) to follow minus sign, for valid numeric value");
        return null;
    }

    public final JsonToken _handleUnexpectedValue(int i) {
        if (i != 39) {
            if (i == 43) {
                if (this._inputPtr >= this._inputEnd && !loadMore()) {
                    _reportInvalidEOFInValue();
                }
                byte[] bArr = this._inputBuffer;
                int i2 = this._inputPtr;
                this._inputPtr = i2 + 1;
                return _handleInvalidNumberStart(bArr[i2] & 255, false);
            } else if (i == 73) {
                _matchToken("Infinity", 1);
                if (isEnabled(Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
                    return resetAsNaN("Infinity", Double.POSITIVE_INFINITY);
                }
                _reportError("Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            } else if (i == 78) {
                _matchToken("NaN", 1);
                if (isEnabled(Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
                    return resetAsNaN("NaN", Double.NaN);
                }
                _reportError("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
            }
        } else if (isEnabled(Feature.ALLOW_SINGLE_QUOTES)) {
            return _handleApostropheValue();
        }
        _reportUnexpectedChar(i, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
        return null;
    }

    public final Name _handleUnusualFieldName(int i) {
        if (i == 39 && isEnabled(Feature.ALLOW_SINGLE_QUOTES)) {
            return _parseApostropheFieldName();
        }
        if (!isEnabled(Feature.ALLOW_UNQUOTED_FIELD_NAMES)) {
            _reportUnexpectedChar(i, "was expecting double-quote to start field name");
        }
        int[] inputCodeUtf8JsNames = CharTypes.getInputCodeUtf8JsNames();
        if (inputCodeUtf8JsNames[i] != 0) {
            _reportUnexpectedChar(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArr = this._quadBuffer;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 < 4) {
                i2++;
                i4 = (i4 << 8) | i;
            } else {
                if (i3 >= iArr.length) {
                    iArr = growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                int i5 = i3 + 1;
                iArr[i3] = i4;
                i3 = i5;
                i4 = i;
                i2 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !loadMore()) {
                _reportInvalidEOF(" in field name");
            }
            i = this._inputBuffer[this._inputPtr] & 255;
            if (inputCodeUtf8JsNames[i] != 0) {
                break;
            }
            this._inputPtr = this._inputPtr + 1;
        }
        if (i2 > 0) {
            if (i3 >= iArr.length) {
                iArr = growArrayBy(iArr, iArr.length);
                this._quadBuffer = iArr;
            }
            i5 = i3 + 1;
            iArr[i3] = i4;
            i3 = i5;
        }
        Name findName = this._symbols.findName(iArr, i3);
        if (findName == null) {
            findName = addName(iArr, i3, i2);
        }
        return findName;
    }

    private boolean _isNextTokenNameMaybe(int i, SerializableString serializableString) {
        String name = _parseFieldName(i).getName();
        this._parsingContext.setCurrentName(name);
        boolean equals = name.equals(serializableString.getValue());
        this._currToken = JsonToken.FIELD_NAME;
        int _skipWS = _skipWS();
        if (_skipWS != 58) {
            _reportUnexpectedChar(_skipWS, "was expecting a colon to separate field name and value");
        }
        int _skipWS2 = _skipWS();
        if (_skipWS2 == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return equals;
        }
        JsonToken jsonToken;
        if (_skipWS2 != 45) {
            if (_skipWS2 != 91) {
                if (_skipWS2 != 93) {
                    if (_skipWS2 == ParserMinimalBase.INT_f) {
                        _matchToken("false", 1);
                        jsonToken = JsonToken.VALUE_FALSE;
                    } else if (_skipWS2 != ParserMinimalBase.INT_n) {
                        if (_skipWS2 != ParserMinimalBase.INT_t) {
                            if (_skipWS2 != ParserMinimalBase.INT_LCURLY) {
                                if (_skipWS2 != ParserMinimalBase.INT_RCURLY) {
                                    switch (_skipWS2) {
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                            break;
                                        default:
                                            jsonToken = _handleUnexpectedValue(_skipWS2);
                                            break;
                                    }
                                }
                            }
                            jsonToken = JsonToken.START_OBJECT;
                        }
                        _matchToken("true", 1);
                        jsonToken = JsonToken.VALUE_TRUE;
                    } else {
                        _matchToken("null", 1);
                        jsonToken = JsonToken.VALUE_NULL;
                    }
                }
                _reportUnexpectedChar(_skipWS2, "expected a value");
                _matchToken("true", 1);
                jsonToken = JsonToken.VALUE_TRUE;
            } else {
                jsonToken = JsonToken.START_ARRAY;
            }
            this._nextToken = jsonToken;
            return equals;
        }
        jsonToken = parseNumberText(_skipWS2);
        this._nextToken = jsonToken;
        return equals;
    }

    private void _isNextTokenNameYes() {
        int _skipColon;
        if (this._inputPtr >= this._inputEnd - 1 || this._inputBuffer[this._inputPtr] != (byte) 58) {
            _skipColon = _skipColon();
            if (_skipColon != 34) {
                if (_skipColon != 45) {
                    if (_skipColon != 91) {
                        if (_skipColon != 93) {
                            if (_skipColon != ParserMinimalBase.INT_f) {
                                _matchToken("false", 1);
                                this._nextToken = JsonToken.VALUE_FALSE;
                                return;
                            } else if (_skipColon == ParserMinimalBase.INT_n) {
                                if (_skipColon != ParserMinimalBase.INT_t) {
                                    if (_skipColon != ParserMinimalBase.INT_LCURLY) {
                                        if (_skipColon != ParserMinimalBase.INT_RCURLY) {
                                            switch (_skipColon) {
                                                case 48:
                                                case 49:
                                                case 50:
                                                case 51:
                                                case 52:
                                                case 53:
                                                case 54:
                                                case 55:
                                                case 56:
                                                case 57:
                                                    break;
                                                default:
                                                    this._nextToken = _handleUnexpectedValue(_skipColon);
                                                    return;
                                            }
                                        }
                                    }
                                    this._nextToken = JsonToken.START_OBJECT;
                                    return;
                                }
                                _matchToken("true", 1);
                                this._nextToken = JsonToken.VALUE_TRUE;
                                return;
                            } else {
                                _matchToken("null", 1);
                                this._nextToken = JsonToken.VALUE_NULL;
                                return;
                            }
                        }
                        _reportUnexpectedChar(_skipColon, "expected a value");
                        _matchToken("true", 1);
                        this._nextToken = JsonToken.VALUE_TRUE;
                        return;
                    }
                    this._nextToken = JsonToken.START_ARRAY;
                    return;
                }
                this._nextToken = parseNumberText(_skipColon);
                return;
            }
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr + 1;
        this._inputPtr = i;
        byte b = bArr[i];
        this._inputPtr = this._inputPtr + 1;
        if (b != (byte) 34) {
            if (b != (byte) 123) {
                if (b != (byte) 91) {
                    _skipColon = b & 255;
                    if (_skipColon <= 32 || _skipColon == 47) {
                        this._inputPtr = this._inputPtr - 1;
                        _skipColon = _skipWS();
                    }
                    if (_skipColon != 34) {
                        if (_skipColon != 45) {
                            if (_skipColon != 91) {
                                if (_skipColon != 93) {
                                    if (_skipColon != ParserMinimalBase.INT_f) {
                                        _matchToken("false", 1);
                                        this._nextToken = JsonToken.VALUE_FALSE;
                                        return;
                                    } else if (_skipColon == ParserMinimalBase.INT_n) {
                                        _matchToken("null", 1);
                                        this._nextToken = JsonToken.VALUE_NULL;
                                        return;
                                    } else {
                                        if (_skipColon != ParserMinimalBase.INT_t) {
                                            if (_skipColon != ParserMinimalBase.INT_LCURLY) {
                                                if (_skipColon != ParserMinimalBase.INT_RCURLY) {
                                                    switch (_skipColon) {
                                                        case 48:
                                                        case 49:
                                                        case 50:
                                                        case 51:
                                                        case 52:
                                                        case 53:
                                                        case 54:
                                                        case 55:
                                                        case 56:
                                                        case 57:
                                                            break;
                                                        default:
                                                            this._nextToken = _handleUnexpectedValue(_skipColon);
                                                            return;
                                                    }
                                                }
                                            }
                                        }
                                        _matchToken("true", 1);
                                        this._nextToken = JsonToken.VALUE_TRUE;
                                        return;
                                    }
                                }
                                _reportUnexpectedChar(_skipColon, "expected a value");
                                _matchToken("true", 1);
                                this._nextToken = JsonToken.VALUE_TRUE;
                                return;
                            }
                        }
                        this._nextToken = parseNumberText(_skipColon);
                        return;
                    }
                }
                this._nextToken = JsonToken.START_ARRAY;
                return;
            }
            this._nextToken = JsonToken.START_OBJECT;
            return;
        }
        this._tokenIncomplete = true;
        this._nextToken = JsonToken.VALUE_STRING;
    }

    public final void _matchToken(String str, int i) {
        int length = str.length();
        do {
            if ((this._inputPtr >= this._inputEnd && !loadMore()) || this._inputBuffer[this._inputPtr] != str.charAt(i)) {
                _reportInvalidToken(str.substring(0, i));
            }
            this._inputPtr = this._inputPtr + 1;
            i++;
        } while (i < length);
        if (this._inputPtr < this._inputEnd || loadMore()) {
            int i2 = this._inputBuffer[this._inputPtr] & 255;
            if (i2 >= 48 && i2 != 93) {
                if (i2 != ParserMinimalBase.INT_RCURLY) {
                    if (Character.isJavaIdentifierPart((char) _decodeCharForError(i2))) {
                        _reportInvalidToken(str.substring(0, i));
                    }
                }
            }
        }
    }

    private JsonToken _nextAfterName() {
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        this._currToken = jsonToken;
        return jsonToken;
    }

    private JsonToken _nextTokenNotInObject(int i) {
        if (i == 34) {
            this._tokenIncomplete = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this._currToken = jsonToken;
            return jsonToken;
        }
        if (i != 45) {
            if (i != 91) {
                if (i != 93) {
                    if (i == ParserMinimalBase.INT_f) {
                        _matchToken("false", 1);
                        jsonToken = JsonToken.VALUE_FALSE;
                        this._currToken = jsonToken;
                        return jsonToken;
                    } else if (i != ParserMinimalBase.INT_n) {
                        if (i != ParserMinimalBase.INT_t) {
                            if (i == ParserMinimalBase.INT_LCURLY) {
                                this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
                                jsonToken = JsonToken.START_OBJECT;
                                this._currToken = jsonToken;
                                return jsonToken;
                            } else if (i != ParserMinimalBase.INT_RCURLY) {
                                switch (i) {
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                    case 56:
                                    case 57:
                                        break;
                                    default:
                                        jsonToken = _handleUnexpectedValue(i);
                                        this._currToken = jsonToken;
                                        return jsonToken;
                                }
                            }
                        }
                        _matchToken("true", 1);
                        jsonToken = JsonToken.VALUE_TRUE;
                        this._currToken = jsonToken;
                        return jsonToken;
                    } else {
                        _matchToken("null", 1);
                        jsonToken = JsonToken.VALUE_NULL;
                        this._currToken = jsonToken;
                        return jsonToken;
                    }
                }
                _reportUnexpectedChar(i, "expected a value");
                _matchToken("true", 1);
                jsonToken = JsonToken.VALUE_TRUE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            jsonToken = JsonToken.START_ARRAY;
            this._currToken = jsonToken;
            return jsonToken;
        }
        jsonToken = parseNumberText(i);
        this._currToken = jsonToken;
        return jsonToken;
    }

    public final Name _parseApostropheFieldName() {
        if (this._inputPtr >= this._inputEnd && !loadMore()) {
            _reportInvalidEOF(": was expecting closing ''' for name");
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        i = bArr[i] & 255;
        if (i == 39) {
            return Name1.getEmptyName();
        }
        int[] iArr = this._quadBuffer;
        int[] iArr2 = sInputCodesLatin1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i != 39) {
            int i5;
            if (!(i == 34 || iArr2[i] == 0)) {
                if (i != 92) {
                    _throwUnquotedSpace(i, "name");
                } else {
                    i = _decodeEscaped();
                }
                if (i > 127) {
                    if (i2 >= 4) {
                        if (i3 >= iArr.length) {
                            iArr = growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        i5 = i3 + 1;
                        iArr[i3] = i4;
                        i3 = i5;
                        i2 = 0;
                        i4 = 0;
                    }
                    if (i < DexStore.LOAD_RESULT_OATMEAL_QUICKEN_ATTEMPTED) {
                        i4 = (i4 << 8) | ((i >> 6) | 192);
                        i2++;
                    } else {
                        i4 = (i4 << 8) | ((i >> 12) | 224);
                        i2++;
                        if (i2 >= 4) {
                            if (i3 >= iArr.length) {
                                iArr = growArrayBy(iArr, iArr.length);
                                this._quadBuffer = iArr;
                            }
                            i5 = i3 + 1;
                            iArr[i3] = i4;
                            i3 = i5;
                            i2 = 0;
                            i4 = 0;
                        }
                        i4 = (i4 << 8) | (((i >> 6) & 63) | 128);
                        i2++;
                    }
                    i = (i & 63) | 128;
                }
            }
            if (i2 < 4) {
                i2++;
                i4 = i | (i4 << 8);
            } else {
                if (i3 >= iArr.length) {
                    iArr = growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                i5 = i3 + 1;
                iArr[i3] = i4;
                i4 = i;
                i3 = i5;
                i2 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !loadMore()) {
                _reportInvalidEOF(" in field name");
            }
            bArr = this._inputBuffer;
            i = this._inputPtr;
            this._inputPtr = i + 1;
            i = bArr[i] & 255;
        }
        if (i2 > 0) {
            if (i3 >= iArr.length) {
                iArr = growArrayBy(iArr, iArr.length);
                this._quadBuffer = iArr;
            }
            i = i3 + 1;
            iArr[i3] = i4;
        } else {
            i = i3;
        }
        Name findName = this._symbols.findName(iArr, i);
        if (findName == null) {
            findName = addName(iArr, i, i2);
        }
        return findName;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.core.sym.Name _parseFieldName(int r7) {
        /*
        r6 = this;
        r3 = 34;
        if (r7 == r3) goto L_0x0009;
    L_0x0004:
        r0 = r6._handleUnusualFieldName(r7);
        return r0;
    L_0x0009:
        r0 = r6._inputPtr;
        r1 = r0 + 9;
        r0 = r6._inputEnd;
        if (r1 <= r0) goto L_0x0016;
    L_0x0011:
        r0 = r6.slowParseFieldName();
        return r0;
    L_0x0016:
        r5 = r6._inputBuffer;
        r4 = sInputCodesLatin1;
        r1 = r6._inputPtr;
        r0 = r1 + 1;
        r6._inputPtr = r0;
        r0 = r5[r1];
        r2 = r0 & 255;
        r0 = r4[r2];
        if (r0 != 0) goto L_0x0089;
    L_0x0028:
        r1 = r6._inputPtr;
        r0 = r1 + 1;
        r6._inputPtr = r0;
        r0 = r5[r1];
        r1 = r0 & 255;
        r0 = r4[r1];
        if (r0 != 0) goto L_0x0085;
    L_0x0036:
        r2 = r2 << 8;
        r2 = r2 | r1;
        r1 = r6._inputPtr;
        r0 = r1 + 1;
        r6._inputPtr = r0;
        r0 = r5[r1];
        r1 = r0 & 255;
        r0 = r4[r1];
        if (r0 != 0) goto L_0x0081;
    L_0x0047:
        r2 = r2 << 8;
        r2 = r2 | r1;
        r1 = r6._inputPtr;
        r0 = r1 + 1;
        r6._inputPtr = r0;
        r0 = r5[r1];
        r1 = r0 & 255;
        r0 = r4[r1];
        if (r0 != 0) goto L_0x007d;
    L_0x0058:
        r2 = r2 << 8;
        r2 = r2 | r1;
        r1 = r6._inputPtr;
        r0 = r1 + 1;
        r6._inputPtr = r0;
        r0 = r5[r1];
        r1 = r0 & 255;
        r0 = r4[r1];
        if (r0 != 0) goto L_0x0070;
    L_0x0069:
        r6._quad1 = r2;
        r0 = r6.parseMediumFieldName(r1, r4);
        return r0;
    L_0x0070:
        r0 = 4;
        if (r1 != r3) goto L_0x0078;
    L_0x0073:
        r0 = r6.findName(r2, r0);
        return r0;
    L_0x0078:
        r0 = r6.parseFieldName(r2, r1, r0);
        return r0;
    L_0x007d:
        r0 = 3;
        if (r1 != r3) goto L_0x0078;
    L_0x0080:
        goto L_0x0073;
    L_0x0081:
        r0 = 2;
        if (r1 != r3) goto L_0x0078;
    L_0x0084:
        goto L_0x0073;
    L_0x0085:
        r0 = 1;
        if (r1 != r3) goto L_0x0078;
    L_0x0088:
        goto L_0x0073;
    L_0x0089:
        if (r2 != r3) goto L_0x0090;
    L_0x008b:
        r0 = com.fasterxml.jackson.core.sym.Name1.getEmptyName();
        return r0;
    L_0x0090:
        r0 = 0;
        r0 = r6.parseFieldName(r0, r2, r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._parseFieldName(int):com.fasterxml.jackson.core.sym.Name");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.fasterxml.jackson.core.JsonToken _parseFloatText(char[] r11, int r12, int r13, boolean r14, int r15) {
        /*
        r10 = this;
        r6 = 57;
        r5 = 48;
        r3 = 0;
        r9 = 1;
        r0 = 46;
        if (r13 != r0) goto L_0x004e;
    L_0x000a:
        r1 = r12 + 1;
        r0 = (char) r13;
        r11[r12] = r0;
        r12 = r1;
        r13 = 46;
        r4 = 0;
    L_0x0013:
        r1 = r10._inputPtr;
        r0 = r10._inputEnd;
        if (r1 < r0) goto L_0x0021;
    L_0x0019:
        r0 = r10.loadMore();
        if (r0 != 0) goto L_0x0021;
    L_0x001f:
        r8 = 1;
        goto L_0x0046;
    L_0x0021:
        r2 = r10._inputBuffer;
        r1 = r10._inputPtr;
        r0 = r1 + 1;
        r10._inputPtr = r0;
        r0 = r2[r1];
        r13 = r0 & 255;
        if (r13 < r5) goto L_0x0045;
    L_0x002f:
        if (r13 <= r6) goto L_0x0032;
    L_0x0031:
        goto L_0x0045;
    L_0x0032:
        r4 = r4 + 1;
        r0 = r11.length;
        if (r12 < r0) goto L_0x003e;
    L_0x0037:
        r0 = r10._textBuffer;
        r11 = r0.finishCurrentSegment();
        r12 = 0;
    L_0x003e:
        r1 = r12 + 1;
        r0 = (char) r13;
        r11[r12] = r0;
        r12 = r1;
        goto L_0x0013;
    L_0x0045:
        r8 = 0;
    L_0x0046:
        if (r4 != 0) goto L_0x0050;
    L_0x0048:
        r0 = "Decimal point not followed by a digit";
        r10.reportUnexpectedNumberChar(r13, r0);
        goto L_0x0050;
    L_0x004e:
        r4 = 0;
        r8 = 0;
    L_0x0050:
        r0 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        if (r13 == r0) goto L_0x0058;
    L_0x0054:
        r0 = 69;
        if (r13 != r0) goto L_0x00e6;
    L_0x0058:
        r0 = r11.length;
        if (r12 < r0) goto L_0x0062;
    L_0x005b:
        r0 = r10._textBuffer;
        r11 = r0.finishCurrentSegment();
        r12 = 0;
    L_0x0062:
        r1 = r12 + 1;
        r0 = (char) r13;
        r11[r12] = r0;
        r2 = r10._inputPtr;
        r0 = r10._inputEnd;
        if (r2 < r0) goto L_0x0070;
    L_0x006d:
        r10.loadMoreGuaranteed();
    L_0x0070:
        r3 = r10._inputBuffer;
        r2 = r10._inputPtr;
        r0 = r2 + 1;
        r10._inputPtr = r0;
        r0 = r3[r2];
        r2 = r0 & 255;
        r0 = 45;
        if (r2 == r0) goto L_0x0088;
    L_0x0080:
        r0 = 43;
        if (r2 != r0) goto L_0x0085;
    L_0x0084:
        goto L_0x0088;
    L_0x0085:
        r12 = r1;
    L_0x0086:
        r3 = 0;
        goto L_0x00ad;
    L_0x0088:
        r0 = r11.length;
        if (r1 < r0) goto L_0x0092;
    L_0x008b:
        r0 = r10._textBuffer;
        r11 = r0.finishCurrentSegment();
        r1 = 0;
    L_0x0092:
        r12 = r1 + 1;
        r0 = (char) r2;
        r11[r1] = r0;
        r1 = r10._inputPtr;
        r0 = r10._inputEnd;
        if (r1 < r0) goto L_0x00a0;
    L_0x009d:
        r10.loadMoreGuaranteed();
    L_0x00a0:
        r2 = r10._inputBuffer;
        r1 = r10._inputPtr;
        r0 = r1 + 1;
        r10._inputPtr = r0;
        r0 = r2[r1];
        r2 = r0 & 255;
        goto L_0x0086;
    L_0x00ad:
        if (r2 > r6) goto L_0x00df;
    L_0x00af:
        if (r2 < r5) goto L_0x00df;
    L_0x00b1:
        r3 = r3 + 1;
        r0 = r11.length;
        if (r12 < r0) goto L_0x00bd;
    L_0x00b6:
        r0 = r10._textBuffer;
        r11 = r0.finishCurrentSegment();
        r12 = 0;
    L_0x00bd:
        r7 = r12 + 1;
        r0 = (char) r2;
        r11[r12] = r0;
        r1 = r10._inputPtr;
        r0 = r10._inputEnd;
        if (r1 < r0) goto L_0x00d1;
    L_0x00c8:
        r0 = r10.loadMore();
        if (r0 != 0) goto L_0x00d1;
    L_0x00ce:
        r12 = r7;
        r8 = 1;
        goto L_0x00df;
    L_0x00d1:
        r2 = r10._inputBuffer;
        r1 = r10._inputPtr;
        r0 = r1 + 1;
        r10._inputPtr = r0;
        r0 = r2[r1];
        r2 = r0 & 255;
        r12 = r7;
        goto L_0x00ad;
    L_0x00df:
        if (r3 != 0) goto L_0x00e6;
    L_0x00e1:
        r0 = "Exponent indicator not followed by a digit";
        r10.reportUnexpectedNumberChar(r2, r0);
    L_0x00e6:
        if (r8 != 0) goto L_0x00ed;
    L_0x00e8:
        r0 = r10._inputPtr;
        r0 = r0 - r9;
        r10._inputPtr = r0;
    L_0x00ed:
        r0 = r10._textBuffer;
        r0.setCurrentLength(r12);
        r0 = r10.resetFloat(r14, r15, r4, r3);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._parseFloatText(char[], int, int, boolean, int):com.fasterxml.jackson.core.JsonToken");
    }

    private JsonToken _parserNumber2(char[] cArr, int i, boolean z, int i2) {
        UTF8StreamJsonParser uTF8StreamJsonParser;
        boolean z2;
        int i3;
        int i4 = i2;
        int i5 = i;
        char[] cArr2 = cArr;
        while (true) {
            uTF8StreamJsonParser = this;
            z2 = z;
            if (this._inputPtr < this._inputEnd || loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i6 = this._inputPtr;
                this._inputPtr = i6 + 1;
                i3 = bArr[i6] & 255;
                if (i3 > 57) {
                    break;
                } else if (i3 < 48) {
                    break;
                } else {
                    if (i5 >= cArr2.length) {
                        cArr2 = this._textBuffer.finishCurrentSegment();
                        i5 = 0;
                    }
                    i6 = i5 + 1;
                    cArr2[i5] = (char) i3;
                    i4++;
                    i5 = i6;
                }
            } else {
                this._textBuffer.setCurrentLength(i5);
                return resetInt(z, i4);
            }
        }
        if (!(i3 == 46 || i3 == 101)) {
            if (i3 != 69) {
                this._inputPtr = this._inputPtr - 1;
                this._textBuffer.setCurrentLength(i5);
                return resetInt(z, i4);
            }
        }
        return _parseFloatText(cArr2, i5, i3, z2, i4);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int _readBinary(com.fasterxml.jackson.core.Base64Variant r12, java.io.OutputStream r13, byte[] r14) {
        /*
        r11 = this;
        r6 = r14.length;
        r5 = 3;
        r6 = r6 - r5;
        r4 = 0;
        r10 = 0;
        r7 = 0;
    L_0x0006:
        r1 = r11._inputPtr;
        r0 = r11._inputEnd;
        if (r1 < r0) goto L_0x000f;
    L_0x000c:
        r11.loadMoreGuaranteed();
    L_0x000f:
        r2 = r11._inputBuffer;
        r1 = r11._inputPtr;
        r0 = r1 + 1;
        r11._inputPtr = r0;
        r0 = r2[r1];
        r1 = r0 & 255;
        r0 = 32;
        if (r1 <= r0) goto L_0x0006;
    L_0x001f:
        r3 = r12.decodeBase64Char(r1);
        r8 = 34;
        if (r3 >= 0) goto L_0x0032;
    L_0x0027:
        if (r1 != r8) goto L_0x002b;
    L_0x0029:
        goto L_0x010c;
    L_0x002b:
        r3 = r11._decodeBase64Escape(r12, r1, r4);
        if (r3 >= 0) goto L_0x0032;
    L_0x0031:
        goto L_0x0006;
    L_0x0032:
        if (r7 <= r6) goto L_0x0039;
    L_0x0034:
        r10 = r10 + r7;
        r13.write(r14, r4, r7);
        r7 = 0;
    L_0x0039:
        r1 = r11._inputPtr;
        r0 = r11._inputEnd;
        if (r1 < r0) goto L_0x0042;
    L_0x003f:
        r11.loadMoreGuaranteed();
    L_0x0042:
        r2 = r11._inputBuffer;
        r1 = r11._inputPtr;
        r0 = r1 + 1;
        r11._inputPtr = r0;
        r0 = r2[r1];
        r1 = r0 & 255;
        r0 = r12.decodeBase64Char(r1);
        if (r0 >= 0) goto L_0x0059;
    L_0x0054:
        r0 = 1;
        r0 = r11._decodeBase64Escape(r12, r1, r0);
    L_0x0059:
        r9 = r3 << 6;
        r9 = r9 | r0;
        r1 = r11._inputPtr;
        r0 = r11._inputEnd;
        if (r1 < r0) goto L_0x0065;
    L_0x0062:
        r11.loadMoreGuaranteed();
    L_0x0065:
        r2 = r11._inputBuffer;
        r1 = r11._inputPtr;
        r0 = r1 + 1;
        r11._inputPtr = r0;
        r0 = r2[r1];
        r2 = r0 & 255;
        r0 = r12.decodeBase64Char(r2);
        r1 = 2;
        r3 = -2;
        if (r0 >= 0) goto L_0x00d6;
    L_0x0079:
        if (r0 == r3) goto L_0x0091;
    L_0x007b:
        if (r2 != r8) goto L_0x008d;
    L_0x007d:
        r0 = r12.usesPadding();
        if (r0 != 0) goto L_0x008d;
    L_0x0083:
        r0 = r9 >> 4;
        r1 = r7 + 1;
        r0 = (byte) r0;
        r14[r7] = r0;
        r7 = r1;
        goto L_0x010c;
    L_0x008d:
        r0 = r11._decodeBase64Escape(r12, r2, r1);
    L_0x0091:
        if (r0 != r3) goto L_0x00d6;
    L_0x0093:
        r1 = r11._inputPtr;
        r0 = r11._inputEnd;
        if (r1 < r0) goto L_0x009c;
    L_0x0099:
        r11.loadMoreGuaranteed();
    L_0x009c:
        r2 = r11._inputBuffer;
        r1 = r11._inputPtr;
        r0 = r1 + 1;
        r11._inputPtr = r0;
        r0 = r2[r1];
        r2 = r0 & 255;
        r0 = r12.usesPaddingChar(r2);
        if (r0 == 0) goto L_0x00b7;
    L_0x00ae:
        r0 = r9 >> 4;
        r2 = r7 + 1;
        r0 = (byte) r0;
        r14[r7] = r0;
        goto L_0x0141;
    L_0x00b7:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "expected padding character '";
        r1.append(r0);
        r0 = r12.getPaddingChar();
        r1.append(r0);
        r0 = "'";
        r1.append(r0);
        r0 = r1.toString();
        r0 = com.fasterxml.jackson.core.base.ParserBase.reportInvalidBase64Char(r12, r2, r5, r0);
        throw r0;
    L_0x00d6:
        r9 = r9 << 6;
        r9 = r9 | r0;
        r1 = r11._inputPtr;
        r0 = r11._inputEnd;
        if (r1 < r0) goto L_0x00e2;
    L_0x00df:
        r11.loadMoreGuaranteed();
    L_0x00e2:
        r2 = r11._inputBuffer;
        r1 = r11._inputPtr;
        r0 = r1 + 1;
        r11._inputPtr = r0;
        r0 = r2[r1];
        r1 = r0 & 255;
        r0 = r12.decodeBase64Char(r1);
        if (r0 >= 0) goto L_0x012b;
    L_0x00f4:
        if (r0 == r3) goto L_0x0119;
    L_0x00f6:
        if (r1 != r8) goto L_0x0115;
    L_0x00f8:
        r0 = r12.usesPadding();
        if (r0 != 0) goto L_0x0115;
    L_0x00fe:
        r2 = r9 >> 2;
        r1 = r7 + 1;
        r0 = r2 >> 8;
        r0 = (byte) r0;
        r14[r7] = r0;
        r7 = r1 + 1;
        r0 = (byte) r2;
        r14[r1] = r0;
    L_0x010c:
        r11._tokenIncomplete = r4;
        if (r7 <= 0) goto L_0x0114;
    L_0x0110:
        r10 = r10 + r7;
        r13.write(r14, r4, r7);
    L_0x0114:
        return r10;
    L_0x0115:
        r0 = r11._decodeBase64Escape(r12, r1, r5);
    L_0x0119:
        if (r0 != r3) goto L_0x012b;
    L_0x011b:
        r2 = r9 >> 2;
        r1 = r7 + 1;
        r0 = r2 >> 8;
        r0 = (byte) r0;
        r14[r7] = r0;
        r7 = r1 + 1;
        r0 = (byte) r2;
        r14[r1] = r0;
        goto L_0x0006;
    L_0x012b:
        r3 = r9 << 6;
        r3 = r3 | r0;
        r2 = r7 + 1;
        r0 = r3 >> 16;
        r0 = (byte) r0;
        r14[r7] = r0;
        r1 = r2 + 1;
        r0 = r3 >> 8;
        r0 = (byte) r0;
        r14[r2] = r0;
        r2 = r1 + 1;
        r0 = (byte) r3;
        r14[r1] = r0;
    L_0x0141:
        r7 = r2;
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._readBinary(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream, byte[]):int");
    }

    public final void _releaseBuffers() {
        super._releaseBuffers();
        if (this._bufferRecyclable) {
            byte[] bArr = this._inputBuffer;
            if (bArr != null) {
                this._inputBuffer = null;
                this._ioContext.releaseReadIOBuffer(bArr);
            }
        }
    }

    public final void _reportInvalidChar(int i) {
        if (i < 32) {
            _throwInvalidSpace(i);
        }
        _reportInvalidInitial(i);
    }

    public final void _reportInvalidInitial(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid UTF-8 start byte 0x");
        stringBuilder.append(Integer.toHexString(i));
        _reportError(stringBuilder.toString());
    }

    public final void _reportInvalidOther(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid UTF-8 middle byte 0x");
        stringBuilder.append(Integer.toHexString(i));
        _reportError(stringBuilder.toString());
    }

    public final void _reportInvalidOther(int i, int i2) {
        this._inputPtr = i2;
        _reportInvalidOther(i);
    }

    public final void _reportInvalidToken(String str) {
        _reportInvalidToken(str, "'null', 'true', 'false' or NaN");
    }

    public final void _reportInvalidToken(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder(str);
        while (true) {
            if (this._inputPtr >= this._inputEnd && !loadMore()) {
                break;
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char _decodeCharForError = (char) _decodeCharForError(bArr[i]);
            if (!Character.isJavaIdentifierPart(_decodeCharForError)) {
                break;
            }
            stringBuilder.append(_decodeCharForError);
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Unrecognized token '");
        stringBuilder2.append(stringBuilder.toString());
        stringBuilder2.append("': was expecting ");
        stringBuilder2.append(str2);
        _reportError(stringBuilder2.toString());
    }

    private void _skipCComment() {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            if (this._inputPtr < this._inputEnd || loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i = this._inputPtr;
                this._inputPtr = i + 1;
                int i2 = bArr[i] & 255;
                i = inputCodeComment[i2];
                if (i != 0) {
                    if (i == 10) {
                        _skipLF();
                    } else if (i == 13) {
                        _skipCR();
                    } else if (i != 42) {
                        switch (i) {
                            case 2:
                                _skipUtf8_2(i2);
                                break;
                            case 3:
                                _skipUtf8_3(i2);
                                break;
                            case 4:
                                _skipUtf8_4(i2);
                                break;
                            default:
                                _reportInvalidChar(i2);
                                break;
                        }
                    } else if (this._inputPtr < this._inputEnd || loadMore()) {
                        if (this._inputBuffer[this._inputPtr] == (byte) 47) {
                            this._inputPtr = this._inputPtr + 1;
                            return;
                        }
                    }
                }
            }
            _reportInvalidEOF(" in a comment");
            return;
        }
    }

    public final void _skipCR() {
        if ((this._inputPtr < this._inputEnd || loadMore()) && this._inputBuffer[this._inputPtr] == (byte) 10) {
            this._inputPtr = this._inputPtr + 1;
        }
        this._currInputRow = this._currInputRow + 1;
        this._currInputRowStart = this._inputPtr;
    }

    private int _skipColon() {
        if (this._inputPtr >= this._inputEnd) {
            loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        byte b = bArr[i];
        if (b != (byte) 58) {
            i = b & 255;
            while (true) {
                if (i == 13) {
                    _skipCR();
                } else if (i != 32) {
                    if (i != 47) {
                        switch (i) {
                            case 9:
                                break;
                            case 10:
                                _skipLF();
                                break;
                            default:
                                if (i < 32) {
                                    _throwInvalidSpace(i);
                                }
                                if (i != 58) {
                                    _reportUnexpectedChar(i, "was expecting a colon to separate field name and value");
                                    break;
                                }
                                break;
                        }
                    }
                    _skipComment();
                }
                if (this._inputPtr >= this._inputEnd) {
                    loadMoreGuaranteed();
                }
                bArr = this._inputBuffer;
                i = this._inputPtr;
                this._inputPtr = i + 1;
                i = bArr[i] & 255;
            }
        } else if (this._inputPtr < this._inputEnd) {
            i = this._inputBuffer[this._inputPtr] & 255;
            if (i > 32 && i != 47) {
                this._inputPtr = this._inputPtr + 1;
                return i;
            }
        }
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                if (!loadMore()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unexpected end-of-input within/between ");
                    stringBuilder.append(this._parsingContext.getTypeDesc());
                    stringBuilder.append(" entries");
                    throw _constructError(stringBuilder.toString());
                }
            }
            bArr = this._inputBuffer;
            i = this._inputPtr;
            this._inputPtr = i + 1;
            i = bArr[i] & 255;
            if (i > 32) {
                if (i != 47) {
                    return i;
                }
                _skipComment();
            } else if (i != 32) {
                if (i == 10) {
                    _skipLF();
                } else if (i == 13) {
                    _skipCR();
                } else if (i != 9) {
                    _throwInvalidSpace(i);
                }
            }
        }
    }

    private void _skipComment() {
        if (!isEnabled(Feature.ALLOW_COMMENTS)) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this._inputPtr >= this._inputEnd && !loadMore()) {
            _reportInvalidEOF(" in a comment");
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        i = bArr[i] & 255;
        if (i == 47) {
            _skipCppComment();
        } else if (i == 42) {
            _skipCComment();
        } else {
            _reportUnexpectedChar(i, "was expecting either '*' or '/' for a comment");
        }
    }

    private void _skipCppComment() {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                if (!loadMore()) {
                    return;
                }
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            int i2 = bArr[i] & 255;
            i = inputCodeComment[i2];
            if (i != 0) {
                if (i == 10) {
                    _skipLF();
                    return;
                } else if (i == 13) {
                    _skipCR();
                    return;
                } else if (i != 42) {
                    switch (i) {
                        case 2:
                            _skipUtf8_2(i2);
                            break;
                        case 3:
                            _skipUtf8_3(i2);
                            break;
                        case 4:
                            _skipUtf8_4(i2);
                            break;
                        default:
                            _reportInvalidChar(i2);
                            break;
                    }
                }
            }
        }
    }

    public final void _skipLF() {
        this._currInputRow = this._currInputRow + 1;
        this._currInputRowStart = this._inputPtr;
    }

    public final void _skipString() {
        this._tokenIncomplete = false;
        int[] iArr = sInputCodesUtf8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i = this._inputPtr;
            int i2 = this._inputEnd;
            if (i >= i2) {
                loadMoreGuaranteed();
                i = this._inputPtr;
                i2 = this._inputEnd;
            }
            while (i < i2) {
                int i3 = i + 1;
                int i4 = bArr[i] & 255;
                if (iArr[i4] != 0) {
                    this._inputPtr = i3;
                    if (i4 != 34) {
                        switch (iArr[i4]) {
                            case 1:
                                _decodeEscaped();
                                break;
                            case 2:
                                _skipUtf8_2(i4);
                                break;
                            case 3:
                                _skipUtf8_3(i4);
                                break;
                            case 4:
                                _skipUtf8_4(i4);
                                break;
                            default:
                                if (i4 >= 32) {
                                    _reportInvalidChar(i4);
                                    break;
                                } else {
                                    _throwUnquotedSpace(i4, "string value");
                                    break;
                                }
                        }
                    }
                    return;
                }
                i = i3;
            }
            this._inputPtr = i;
        }
    }

    private void _skipUtf8_2(int i) {
        if (this._inputPtr >= this._inputEnd) {
            loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
        }
    }

    private void _skipUtf8_3(int i) {
        if (this._inputPtr >= this._inputEnd) {
            loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
        }
        if (this._inputPtr >= this._inputEnd) {
            loadMoreGuaranteed();
        }
        bArr = this._inputBuffer;
        i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        b = bArr[i2];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
        }
    }

    private void _skipUtf8_4(int i) {
        if (this._inputPtr >= this._inputEnd) {
            loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
        }
        if (this._inputPtr >= this._inputEnd) {
            loadMoreGuaranteed();
        }
        bArr = this._inputBuffer;
        i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        b = bArr[i2];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
        }
        if (this._inputPtr >= this._inputEnd) {
            loadMoreGuaranteed();
        }
        bArr = this._inputBuffer;
        i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        b = bArr[i2];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, this._inputPtr);
        }
    }

    private int _skipWS() {
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                if (!loadMore()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unexpected end-of-input within/between ");
                    stringBuilder.append(this._parsingContext.getTypeDesc());
                    stringBuilder.append(" entries");
                    throw _constructError(stringBuilder.toString());
                }
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            i = bArr[i] & 255;
            if (i > 32) {
                if (i != 47) {
                    return i;
                }
                _skipComment();
            } else if (i != 32) {
                if (i == 10) {
                    _skipLF();
                } else if (i == 13) {
                    _skipCR();
                } else if (i != 9) {
                    _throwInvalidSpace(i);
                }
            }
        }
    }

    private int _skipWSOrEnd() {
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                if (!loadMore()) {
                    _handleEOF();
                    return -1;
                }
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            i = bArr[i] & 255;
            if (i > 32) {
                if (i != 47) {
                    return i;
                }
                _skipComment();
            } else if (i != 32) {
                if (i == 10) {
                    _skipLF();
                } else if (i == 13) {
                    _skipCR();
                } else if (i != 9) {
                    _throwInvalidSpace(i);
                }
            }
        }
    }

    private int _verifyNoLeadingZeroes() {
        if (this._inputPtr < this._inputEnd || loadMore()) {
            int i = this._inputBuffer[this._inputPtr] & 255;
            if (i >= 48) {
                if (i <= 57) {
                    if (!isEnabled(Feature.ALLOW_NUMERIC_LEADING_ZEROS)) {
                        reportInvalidNumber("Leading zeroes not allowed");
                    }
                    this._inputPtr = this._inputPtr + 1;
                    if (i == 48) {
                        do {
                            if (this._inputPtr >= this._inputEnd && !loadMore()) {
                                break;
                            }
                            i = this._inputBuffer[this._inputPtr] & 255;
                            if (i >= 48) {
                                if (i <= 57) {
                                    this._inputPtr = this._inputPtr + 1;
                                }
                            }
                        } while (i == 48);
                    }
                    return i;
                }
            }
        }
        return 48;
    }

    private Name addName(int[] iArr, int i, int i2) {
        int i3;
        int i4 = ((i << 2) - 4) + i2;
        if (i2 < 4) {
            int i5 = i - 1;
            i3 = iArr[i5];
            iArr[i5] = i3 << ((4 - i2) << 3);
        } else {
            i3 = 0;
        }
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            int i8 = (iArr[i6 >> 2] >> ((3 - (i6 & 3)) << 3)) & 255;
            i6++;
            if (i8 > 127) {
                int i9;
                int i10;
                if ((i8 & 224) == 192) {
                    i8 &= 31;
                    i9 = 1;
                } else if ((i8 & 240) == 224) {
                    i8 &= 15;
                    i9 = 2;
                } else if ((i8 & 248) == 240) {
                    i8 &= 7;
                    i9 = 3;
                } else {
                    _reportInvalidInitial(i8);
                    i9 = 1;
                    i8 = 1;
                }
                if (i6 + i9 > i4) {
                    _reportInvalidEOF(" in field name");
                }
                int i11 = iArr[i6 >> 2] >> ((3 - (i6 & 3)) << 3);
                i6++;
                if ((i11 & 192) != 128) {
                    _reportInvalidOther(i11);
                }
                i8 = (i8 << 6) | (i11 & 63);
                if (i9 > 1) {
                    i5 = iArr[i6 >> 2] >> ((3 - (i6 & 3)) << 3);
                    i6++;
                    if ((i5 & 192) != 128) {
                        _reportInvalidOther(i5);
                    }
                    i8 = (i5 & 63) | (i8 << 6);
                    i10 = 2;
                    if (i9 > 2) {
                        i5 = iArr[i6 >> 2] >> ((3 - (i6 & 3)) << 3);
                        i6++;
                        if ((i5 & 192) != 128) {
                            _reportInvalidOther(i5 & 255);
                        }
                        i8 = (i8 << 6) | (i5 & 63);
                    }
                    if (i9 > i10) {
                        i8 -= 65536;
                        if (i7 >= emptyAndGetCurrentSegment.length) {
                            emptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
                        }
                        i9 = i7 + 1;
                        emptyAndGetCurrentSegment[i7] = (char) ((i8 >> 10) + 55296);
                        i8 = (i8 & 1023) | 56320;
                        i7 = i9;
                    }
                }
                i10 = 2;
                if (i9 > i10) {
                    i8 -= 65536;
                    if (i7 >= emptyAndGetCurrentSegment.length) {
                        emptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
                    }
                    i9 = i7 + 1;
                    emptyAndGetCurrentSegment[i7] = (char) ((i8 >> 10) + 55296);
                    i8 = (i8 & 1023) | 56320;
                    i7 = i9;
                }
            }
            if (i7 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
            }
            i5 = i7 + 1;
            emptyAndGetCurrentSegment[i7] = (char) i8;
            i7 = i5;
        }
        String str = new String(emptyAndGetCurrentSegment, 0, i7);
        if (i2 < 4) {
            iArr[i - 1] = i3;
        }
        return this._symbols.addName(str, iArr, i);
    }

    public final void close() {
        super.close();
        this._symbols.release();
    }

    private Name findName(int i, int i2) {
        Name findName = this._symbols.findName(i);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        return addName(iArr, 1, i2);
    }

    private Name findName(int i, int i2, int i3) {
        Name findName = this._symbols.findName(i, i2);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = i2;
        return addName(iArr, 2, i3);
    }

    private Name findName(int[] iArr, int i, int i2, int i3) {
        if (i >= iArr.length) {
            iArr = growArrayBy(iArr, iArr.length);
            this._quadBuffer = iArr;
        }
        int i4 = i + 1;
        iArr[i] = i2;
        Name findName = this._symbols.findName(iArr, i4);
        return findName == null ? addName(iArr, i4, i3) : findName;
    }

    public final byte[] getBinaryValue(Base64Variant base64Variant) {
        if (this._currToken != JsonToken.VALUE_STRING && (this._currToken != JsonToken.VALUE_EMBEDDED_OBJECT || this._binaryValue == null)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Current token (");
            stringBuilder.append(this._currToken);
            stringBuilder.append(") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
            _reportError(stringBuilder.toString());
        }
        if (this._tokenIncomplete) {
            try {
                this._binaryValue = _decodeBase64(base64Variant);
                this._tokenIncomplete = false;
            } catch (IllegalArgumentException e) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to decode VALUE_STRING as base64 (");
                stringBuilder.append(base64Variant);
                stringBuilder.append("): ");
                stringBuilder.append(e.getMessage());
                throw _constructError(stringBuilder.toString());
            }
        } else if (this._binaryValue == null) {
            ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
            _decodeBase64(getText(), _getByteArrayBuilder, base64Variant);
            this._binaryValue = _getByteArrayBuilder.toByteArray();
        }
        return this._binaryValue;
    }

    public final ObjectCodec getCodec() {
        return this._objectCodec;
    }

    public final Object getInputSource() {
        return this._inputStream;
    }

    public final String getText() {
        if (this._currToken != JsonToken.VALUE_STRING) {
            return _getText2(this._currToken);
        }
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.contentsAsString();
    }

    public final char[] getTextCharacters() {
        if (this._currToken == null) {
            return null;
        }
        switch (this._currToken) {
            case FIELD_NAME:
                if (!this._nameCopied) {
                    String currentName = this._parsingContext.getCurrentName();
                    int length = currentName.length();
                    if (this._nameCopyBuffer == null) {
                        this._nameCopyBuffer = this._ioContext.allocNameCopyBuffer(length);
                    } else if (this._nameCopyBuffer.length < length) {
                        this._nameCopyBuffer = new char[length];
                    }
                    currentName.getChars(0, length, this._nameCopyBuffer, 0);
                    this._nameCopied = true;
                }
                return this._nameCopyBuffer;
            case VALUE_STRING:
                if (this._tokenIncomplete) {
                    this._tokenIncomplete = false;
                    _finishString();
                    break;
                }
                break;
            case VALUE_NUMBER_INT:
            case VALUE_NUMBER_FLOAT:
                break;
            default:
                return this._currToken.asCharArray();
        }
        return this._textBuffer.getTextBuffer();
    }

    public final int getTextLength() {
        if (this._currToken == null) {
            return 0;
        }
        switch (this._currToken) {
            case FIELD_NAME:
                return this._parsingContext.getCurrentName().length();
            case VALUE_STRING:
                if (this._tokenIncomplete) {
                    this._tokenIncomplete = false;
                    _finishString();
                    break;
                }
                break;
            case VALUE_NUMBER_INT:
            case VALUE_NUMBER_FLOAT:
                break;
            default:
                return this._currToken.asCharArray().length;
        }
        return this._textBuffer.size();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getTextOffset() {
        /*
        r3 = this;
        r0 = r3._currToken;
        r2 = 0;
        if (r0 == 0) goto L_0x0023;
    L_0x0005:
        r1 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.C00401.$SwitchMap$com$fasterxml$jackson$core$JsonToken;
        r0 = r3._currToken;
        r0 = r0.ordinal();
        r0 = r1[r0];
        switch(r0) {
            case 1: goto L_0x0023;
            case 2: goto L_0x0013;
            case 3: goto L_0x001c;
            case 4: goto L_0x001c;
            default: goto L_0x0012;
        };
    L_0x0012:
        goto L_0x0023;
    L_0x0013:
        r0 = r3._tokenIncomplete;
        if (r0 == 0) goto L_0x001c;
    L_0x0017:
        r3._tokenIncomplete = r2;
        r3._finishString();
    L_0x001c:
        r0 = r3._textBuffer;
        r0 = r0.getTextOffset();
        return r0;
    L_0x0023:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getTextOffset():int");
    }

    public final String getValueAsString() {
        if (this._currToken != JsonToken.VALUE_STRING) {
            return super.getValueAsString(null);
        }
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.contentsAsString();
    }

    public final String getValueAsString(String str) {
        if (this._currToken != JsonToken.VALUE_STRING) {
            return super.getValueAsString(str);
        }
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.contentsAsString();
    }

    public static int[] growArrayBy(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        Object obj = new int[(i + length)];
        System.arraycopy(iArr, 0, obj, 0, length);
        return obj;
    }

    public final boolean loadMore() {
        this._currInputProcessed = this._currInputProcessed + ((long) this._inputEnd);
        this._currInputRowStart = this._currInputRowStart - this._inputEnd;
        InputStream inputStream = this._inputStream;
        if (inputStream != null) {
            byte[] bArr = this._inputBuffer;
            int read = inputStream.read(bArr, 0, bArr.length);
            if (read > 0) {
                this._inputPtr = 0;
                this._inputEnd = read;
                return true;
            }
            _closeInput();
            if (read == 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("InputStream.read() returned 0 characters when trying to read ");
                stringBuilder.append(this._inputBuffer.length);
                stringBuilder.append(" bytes");
                throw new IOException(stringBuilder.toString());
            }
        }
        return false;
    }

    public final Boolean nextBooleanValue() {
        if (this._currToken != JsonToken.FIELD_NAME) {
            switch (nextToken()) {
                case VALUE_TRUE:
                    break;
                case VALUE_FALSE:
                    break;
                default:
                    break;
            }
        }
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        this._currToken = jsonToken;
        if (jsonToken != JsonToken.VALUE_TRUE) {
            if (jsonToken != JsonToken.VALUE_FALSE) {
                if (jsonToken == JsonToken.START_ARRAY) {
                    this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
                } else if (jsonToken == JsonToken.START_OBJECT) {
                    this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
                }
                return null;
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    private int nextByte() {
        if (this._inputPtr >= this._inputEnd) {
            loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        return bArr[i] & 255;
    }

    public final boolean nextFieldName(SerializableString serializableString) {
        int i = 0;
        this._numTypesValid = 0;
        if (this._currToken == JsonToken.FIELD_NAME) {
            _nextAfterName();
            return false;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return false;
        }
        this._tokenInputTotal = (this._currInputProcessed + ((long) this._inputPtr)) - 1;
        this._tokenInputRow = this._currInputRow;
        this._tokenInputCol = (this._inputPtr - this._currInputRowStart) - 1;
        this._binaryValue = null;
        if (_skipWSOrEnd == 93) {
            if (!this._parsingContext.inArray()) {
                _reportMismatchedEndMarker(_skipWSOrEnd, '}');
            }
            this._parsingContext = this._parsingContext.getParent();
            this._currToken = JsonToken.END_ARRAY;
            return false;
        } else if (_skipWSOrEnd == ParserMinimalBase.INT_RCURLY) {
            if (!this._parsingContext.inObject()) {
                _reportMismatchedEndMarker(_skipWSOrEnd, ']');
            }
            this._parsingContext = this._parsingContext.getParent();
            this._currToken = JsonToken.END_OBJECT;
            return false;
        } else {
            if (this._parsingContext.expectComma()) {
                if (_skipWSOrEnd != 44) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("was expecting comma to separate ");
                    stringBuilder.append(this._parsingContext.getTypeDesc());
                    stringBuilder.append(" entries");
                    _reportUnexpectedChar(_skipWSOrEnd, stringBuilder.toString());
                }
                _skipWSOrEnd = _skipWS();
            }
            if (this._parsingContext.inObject()) {
                if (_skipWSOrEnd == 34) {
                    byte[] asQuotedUTF8 = serializableString.asQuotedUTF8();
                    int length = asQuotedUTF8.length;
                    if (this._inputPtr + length < this._inputEnd) {
                        int i2 = this._inputPtr + length;
                        if (this._inputBuffer[i2] == (byte) 34) {
                            int i3 = this._inputPtr;
                            while (i != length) {
                                if (asQuotedUTF8[i] == this._inputBuffer[i3 + i]) {
                                    i++;
                                }
                            }
                            this._inputPtr = i2 + 1;
                            this._parsingContext.setCurrentName(serializableString.getValue());
                            this._currToken = JsonToken.FIELD_NAME;
                            _isNextTokenNameYes();
                            return true;
                        }
                    }
                }
                return _isNextTokenNameMaybe(_skipWSOrEnd, serializableString);
            }
            _nextTokenNotInObject(_skipWSOrEnd);
            return false;
        }
    }

    public final int nextIntValue(int i) {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
                return getIntValue();
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            } else if (jsonToken == JsonToken.START_OBJECT) {
                this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            }
        } else if (nextToken() == JsonToken.VALUE_NUMBER_INT) {
            i = getIntValue();
        }
        return i;
    }

    public final long nextLongValue(long j) {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
                return getLongValue();
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            } else if (jsonToken == JsonToken.START_OBJECT) {
                this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            }
        } else if (nextToken() == JsonToken.VALUE_NUMBER_INT) {
            j = getLongValue();
        }
        return j;
    }

    public final String nextTextValue() {
        String str = null;
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken == JsonToken.VALUE_STRING) {
                if (this._tokenIncomplete) {
                    this._tokenIncomplete = false;
                    _finishString();
                }
                return this._textBuffer.contentsAsString();
            } else if (jsonToken == JsonToken.START_ARRAY) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            } else if (jsonToken == JsonToken.START_OBJECT) {
                this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            }
        } else if (nextToken() == JsonToken.VALUE_STRING) {
            str = getText();
        }
        return str;
    }

    public final JsonToken nextToken() {
        this._numTypesValid = 0;
        if (this._currToken == JsonToken.FIELD_NAME) {
            return _nextAfterName();
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._tokenInputTotal = (this._currInputProcessed + ((long) this._inputPtr)) - 1;
        this._tokenInputRow = this._currInputRow;
        this._tokenInputCol = (this._inputPtr - this._currInputRowStart) - 1;
        this._binaryValue = null;
        JsonToken jsonToken;
        if (_skipWSOrEnd == 93) {
            if (!this._parsingContext.inArray()) {
                _reportMismatchedEndMarker(_skipWSOrEnd, '}');
            }
            this._parsingContext = this._parsingContext.getParent();
            jsonToken = JsonToken.END_ARRAY;
            this._currToken = jsonToken;
            return jsonToken;
        } else if (_skipWSOrEnd == ParserMinimalBase.INT_RCURLY) {
            if (!this._parsingContext.inObject()) {
                _reportMismatchedEndMarker(_skipWSOrEnd, ']');
            }
            this._parsingContext = this._parsingContext.getParent();
            jsonToken = JsonToken.END_OBJECT;
            this._currToken = jsonToken;
            return jsonToken;
        } else {
            if (this._parsingContext.expectComma()) {
                if (_skipWSOrEnd != 44) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("was expecting comma to separate ");
                    stringBuilder.append(this._parsingContext.getTypeDesc());
                    stringBuilder.append(" entries");
                    _reportUnexpectedChar(_skipWSOrEnd, stringBuilder.toString());
                }
                _skipWSOrEnd = _skipWS();
            }
            if (!this._parsingContext.inObject()) {
                return _nextTokenNotInObject(_skipWSOrEnd);
            }
            this._parsingContext.setCurrentName(_parseFieldName(_skipWSOrEnd).getName());
            this._currToken = JsonToken.FIELD_NAME;
            int _skipWS = _skipWS();
            if (_skipWS != 58) {
                _reportUnexpectedChar(_skipWS, "was expecting a colon to separate field name and value");
            }
            _skipWS = _skipWS();
            if (_skipWS == 34) {
                this._tokenIncomplete = true;
                this._nextToken = JsonToken.VALUE_STRING;
                return this._currToken;
            }
            if (_skipWS != 45) {
                if (_skipWS != 91) {
                    if (_skipWS != 93) {
                        if (_skipWS == ParserMinimalBase.INT_f) {
                            _matchToken("false", 1);
                            jsonToken = JsonToken.VALUE_FALSE;
                        } else if (_skipWS != ParserMinimalBase.INT_n) {
                            if (_skipWS != ParserMinimalBase.INT_t) {
                                if (_skipWS != ParserMinimalBase.INT_LCURLY) {
                                    if (_skipWS != ParserMinimalBase.INT_RCURLY) {
                                        switch (_skipWS) {
                                            case 48:
                                            case 49:
                                            case 50:
                                            case 51:
                                            case 52:
                                            case 53:
                                            case 54:
                                            case 55:
                                            case 56:
                                            case 57:
                                                break;
                                            default:
                                                jsonToken = _handleUnexpectedValue(_skipWS);
                                                break;
                                        }
                                    }
                                }
                                jsonToken = JsonToken.START_OBJECT;
                            }
                            _matchToken("true", 1);
                            jsonToken = JsonToken.VALUE_TRUE;
                        } else {
                            _matchToken("null", 1);
                            jsonToken = JsonToken.VALUE_NULL;
                        }
                    }
                    _reportUnexpectedChar(_skipWS, "expected a value");
                    _matchToken("true", 1);
                    jsonToken = JsonToken.VALUE_TRUE;
                } else {
                    jsonToken = JsonToken.START_ARRAY;
                }
                this._nextToken = jsonToken;
                return this._currToken;
            }
            jsonToken = parseNumberText(_skipWS);
            this._nextToken = jsonToken;
            return this._currToken;
        }
    }

    public final Name parseEscapedFieldName(int[] iArr, int i, int i2, int i3, int i4) {
        int i5;
        int[] iArr2 = sInputCodesLatin1;
        while (true) {
            if (iArr2[i3] != 0) {
                if (i3 == 34) {
                    break;
                }
                if (i3 != 92) {
                    _throwUnquotedSpace(i3, "name");
                } else {
                    i3 = _decodeEscaped();
                }
                if (i3 > 127) {
                    if (i4 >= 4) {
                        if (i >= iArr.length) {
                            iArr = growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        i5 = i + 1;
                        iArr[i] = i2;
                        i = i5;
                        i2 = 0;
                        i4 = 0;
                    }
                    if (i3 < DexStore.LOAD_RESULT_OATMEAL_QUICKEN_ATTEMPTED) {
                        i2 = (i2 << 8) | ((i3 >> 6) | 192);
                        i4++;
                    } else {
                        int i6 = (i2 << 8) | ((i3 >> 12) | 224);
                        i4++;
                        if (i4 >= 4) {
                            if (i >= iArr.length) {
                                iArr = growArrayBy(iArr, iArr.length);
                                this._quadBuffer = iArr;
                            }
                            i5 = i + 1;
                            iArr[i] = i6;
                            i = i5;
                            i6 = 0;
                            i4 = 0;
                        }
                        i2 = (i6 << 8) | (((i3 >> 6) & 63) | 128);
                        i4++;
                    }
                    i3 = (i3 & 63) | 128;
                }
            }
            if (i4 < 4) {
                i4++;
                i2 = (i2 << 8) | i3;
            } else {
                if (i >= iArr.length) {
                    iArr = growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                i5 = i + 1;
                iArr[i] = i2;
                i2 = i3;
                i = i5;
                i4 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !loadMore()) {
                _reportInvalidEOF(" in field name");
            }
            byte[] bArr = this._inputBuffer;
            int i7 = this._inputPtr;
            this._inputPtr = i7 + 1;
            i3 = bArr[i7] & 255;
        }
        if (i4 > 0) {
            if (i >= iArr.length) {
                iArr = growArrayBy(iArr, iArr.length);
                this._quadBuffer = iArr;
            }
            i5 = i + 1;
            iArr[i] = i2;
            i = i5;
        }
        Name findName = this._symbols.findName(iArr, i);
        return findName == null ? addName(iArr, i, i4) : findName;
    }

    private Name parseFieldName(int i, int i2, int i3) {
        return parseEscapedFieldName(this._quadBuffer, 0, i, i2, i3);
    }

    private Name parseFieldName(int i, int i2, int i3, int i4) {
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        return parseEscapedFieldName(iArr, 1, i2, i3, i4);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.core.sym.Name parseLongFieldName(int r13) {
        /*
        r12 = this;
        r11 = r13;
        r6 = sInputCodesLatin1;
        r2 = 2;
        r9 = 2;
    L_0x0005:
        r7 = r12;
        r1 = r12._inputEnd;
        r0 = r12._inputPtr;
        r1 = r1 - r0;
        r4 = 4;
        if (r1 >= r4) goto L_0x0017;
    L_0x000e:
        r8 = r12._quadBuffer;
        r10 = 0;
        r12 = 0;
        r0 = r7.parseEscapedFieldName(r8, r9, r10, r11, r12);
        return r0;
    L_0x0017:
        r3 = r12._inputBuffer;
        r1 = r12._inputPtr;
        r0 = r1 + 1;
        r12._inputPtr = r0;
        r0 = r3[r1];
        r1 = r0 & 255;
        r0 = r6[r1];
        r5 = 34;
        if (r0 == 0) goto L_0x003f;
    L_0x0029:
        if (r1 != r5) goto L_0x0033;
    L_0x002b:
        r1 = r12._quadBuffer;
        r0 = 1;
        r0 = r12.findName(r1, r9, r11, r0);
        return r0;
    L_0x0033:
        r4 = r12._quadBuffer;
        r8 = 1;
        r3 = r12;
        r5 = r9;
        r6 = r11;
        r7 = r1;
        r0 = r3.parseEscapedFieldName(r4, r5, r6, r7, r8);
        return r0;
    L_0x003f:
        r10 = r11 << 8;
        r10 = r10 | r1;
        r3 = r12._inputBuffer;
        r1 = r12._inputPtr;
        r0 = r1 + 1;
        r12._inputPtr = r0;
        r0 = r3[r1];
        r11 = r0 & 255;
        r0 = r6[r11];
        if (r0 == 0) goto L_0x0063;
    L_0x0052:
        if (r11 != r5) goto L_0x005b;
    L_0x0054:
        r0 = r12._quadBuffer;
        r0 = r12.findName(r0, r9, r10, r2);
        return r0;
    L_0x005b:
        r8 = r12._quadBuffer;
        r12 = 2;
        r0 = r7.parseEscapedFieldName(r8, r9, r10, r11, r12);
        return r0;
    L_0x0063:
        r10 = r10 << 8;
        r10 = r10 | r11;
        r3 = r12._inputBuffer;
        r1 = r12._inputPtr;
        r0 = r1 + 1;
        r12._inputPtr = r0;
        r0 = r3[r1];
        r11 = r0 & 255;
        r0 = r6[r11];
        if (r0 == 0) goto L_0x0088;
    L_0x0076:
        if (r11 != r5) goto L_0x0080;
    L_0x0078:
        r1 = r12._quadBuffer;
        r0 = 3;
        r0 = r12.findName(r1, r9, r10, r0);
        return r0;
    L_0x0080:
        r8 = r12._quadBuffer;
        r12 = 3;
        r0 = r7.parseEscapedFieldName(r8, r9, r10, r11, r12);
        return r0;
    L_0x0088:
        r10 = r10 << 8;
        r10 = r10 | r11;
        r3 = r12._inputBuffer;
        r1 = r12._inputPtr;
        r0 = r1 + 1;
        r12._inputPtr = r0;
        r0 = r3[r1];
        r11 = r0 & 255;
        r0 = r6[r11];
        if (r0 == 0) goto L_0x00ac;
    L_0x009b:
        if (r11 != r5) goto L_0x00a4;
    L_0x009d:
        r0 = r12._quadBuffer;
        r0 = r12.findName(r0, r9, r10, r4);
        return r0;
    L_0x00a4:
        r8 = r12._quadBuffer;
        r12 = 4;
        r0 = r7.parseEscapedFieldName(r8, r9, r10, r11, r12);
        return r0;
    L_0x00ac:
        r1 = r12._quadBuffer;
        r0 = r1.length;
        if (r9 < r0) goto L_0x00b7;
    L_0x00b1:
        r0 = growArrayBy(r1, r9);
        r12._quadBuffer = r0;
    L_0x00b7:
        r1 = r12._quadBuffer;
        r0 = r9 + 1;
        r1[r9] = r10;
        r9 = r0;
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.parseLongFieldName(int):com.fasterxml.jackson.core.sym.Name");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.core.sym.Name parseMediumFieldName(int r8, int[] r9) {
        /*
        r7 = this;
        r2 = r7._inputBuffer;
        r1 = r7._inputPtr;
        r0 = r1 + 1;
        r7._inputPtr = r0;
        r0 = r2[r1];
        r1 = r0 & 255;
        r0 = r9[r1];
        r5 = 34;
        r3 = 1;
        if (r0 == 0) goto L_0x0023;
    L_0x0013:
        if (r1 != r5) goto L_0x001c;
    L_0x0015:
        r0 = r7._quad1;
        r0 = r7.findName(r0, r8, r3);
        return r0;
    L_0x001c:
        r0 = r7._quad1;
        r0 = r7.parseFieldName(r0, r8, r1, r3);
        return r0;
    L_0x0023:
        r4 = r8 << 8;
        r4 = r4 | r1;
        r2 = r7._inputBuffer;
        r1 = r7._inputPtr;
        r0 = r1 + 1;
        r7._inputPtr = r0;
        r0 = r2[r1];
        r6 = r0 & 255;
        r0 = r9[r6];
        if (r0 == 0) goto L_0x0047;
    L_0x0036:
        r1 = 2;
        if (r6 != r5) goto L_0x0040;
    L_0x0039:
        r0 = r7._quad1;
        r0 = r7.findName(r0, r4, r1);
        return r0;
    L_0x0040:
        r0 = r7._quad1;
        r0 = r7.parseFieldName(r0, r4, r6, r1);
        return r0;
    L_0x0047:
        r4 = r4 << 8;
        r4 = r4 | r6;
        r2 = r7._inputBuffer;
        r1 = r7._inputPtr;
        r0 = r1 + 1;
        r7._inputPtr = r0;
        r0 = r2[r1];
        r6 = r0 & 255;
        r0 = r9[r6];
        if (r0 == 0) goto L_0x005e;
    L_0x005a:
        r1 = 3;
        if (r6 != r5) goto L_0x0040;
    L_0x005d:
        goto L_0x0039;
    L_0x005e:
        r4 = r4 << 8;
        r4 = r4 | r6;
        r2 = r7._inputBuffer;
        r1 = r7._inputPtr;
        r0 = r1 + 1;
        r7._inputPtr = r0;
        r0 = r2[r1];
        r6 = r0 & 255;
        r0 = r9[r6];
        if (r0 == 0) goto L_0x0075;
    L_0x0071:
        r1 = 4;
        if (r6 != r5) goto L_0x0040;
    L_0x0074:
        goto L_0x0039;
    L_0x0075:
        r2 = r7._quadBuffer;
        r1 = 0;
        r0 = r7._quad1;
        r2[r1] = r0;
        r2[r3] = r4;
        r0 = r7.parseLongFieldName(r6);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.parseMediumFieldName(int, int[]):com.fasterxml.jackson.core.sym.Name");
    }

    public final JsonToken parseNumberText(int i) {
        int i2;
        ParserBase parserBase = this;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        boolean z = i == 45;
        if (z) {
            emptyAndGetCurrentSegment[0] = '-';
            if (parserBase._inputPtr >= parserBase._inputEnd) {
                loadMoreGuaranteed();
            }
            byte[] bArr = parserBase._inputBuffer;
            i2 = parserBase._inputPtr;
            parserBase._inputPtr = i2 + 1;
            i = bArr[i2] & 255;
            if (i >= 48) {
                if (i <= 57) {
                    i2 = 1;
                }
            }
            return _handleInvalidNumberStart(i, true);
        }
        i2 = 0;
        if (i == 48) {
            i = _verifyNoLeadingZeroes();
        }
        int i3 = i2 + 1;
        emptyAndGetCurrentSegment[i2] = (char) i;
        int length = parserBase._inputPtr + emptyAndGetCurrentSegment.length;
        if (length > parserBase._inputEnd) {
            length = parserBase._inputEnd;
        }
        i = 1;
        while (parserBase._inputPtr < length) {
            byte[] bArr2 = parserBase._inputBuffer;
            i2 = parserBase._inputPtr;
            parserBase._inputPtr = i2 + 1;
            int i4 = bArr2[i2] & 255;
            if (i4 >= 48) {
                if (i4 <= 57) {
                    i++;
                    if (i3 >= emptyAndGetCurrentSegment.length) {
                        emptyAndGetCurrentSegment = parserBase._textBuffer.finishCurrentSegment();
                        i3 = 0;
                    }
                    i2 = i3 + 1;
                    emptyAndGetCurrentSegment[i3] = (char) i4;
                    i3 = i2;
                }
            }
            if (!(i4 == 46 || i4 == 101)) {
                if (i4 != 69) {
                    parserBase._inputPtr = parserBase._inputPtr - 1;
                    parserBase._textBuffer.setCurrentLength(i3);
                    return resetInt(z, i);
                }
            }
            return _parseFloatText(emptyAndGetCurrentSegment, i3, i4, z, i);
        }
        return _parserNumber2(emptyAndGetCurrentSegment, i3, z, i);
    }

    public final int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) {
        if (this._tokenIncomplete) {
            if (this._currToken == JsonToken.VALUE_STRING) {
                byte[] allocBase64Buffer = this._ioContext.allocBase64Buffer();
                try {
                    int _readBinary = _readBinary(base64Variant, outputStream, allocBase64Buffer);
                    return _readBinary;
                } finally {
                    this._ioContext.releaseBase64Buffer(allocBase64Buffer);
                }
            }
        }
        byte[] binaryValue = getBinaryValue(base64Variant);
        outputStream.write(binaryValue);
        return binaryValue.length;
    }

    public final int releaseBuffered(OutputStream outputStream) {
        int i = this._inputEnd - this._inputPtr;
        if (i < 1) {
            return 0;
        }
        outputStream.write(this._inputBuffer, this._inputPtr, i);
        return i;
    }

    public final void setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
    }

    public final Name slowParseFieldName() {
        UTF8StreamJsonParser uTF8StreamJsonParser = this;
        if (this._inputPtr >= this._inputEnd && !loadMore()) {
            _reportInvalidEOF(": was expecting closing '\"' for name");
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        int i2 = bArr[i] & 255;
        if (i2 == 34) {
            return Name1.getEmptyName();
        }
        return parseEscapedFieldName(this._quadBuffer, 0, 0, i2, 0);
    }
}
