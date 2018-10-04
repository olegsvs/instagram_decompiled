package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public final class ReaderBasedJsonParser extends ParserBase {
    public final int _hashSeed;
    public char[] _inputBuffer;
    public ObjectCodec _objectCodec;
    public Reader _reader;
    public final CharsToNameCanonicalizer _symbols;
    public boolean _tokenIncomplete = false;

    public ReaderBasedJsonParser(IOContext iOContext, int i, Reader reader, ObjectCodec objectCodec, CharsToNameCanonicalizer charsToNameCanonicalizer) {
        super(iOContext, i);
        this._reader = reader;
        this._inputBuffer = iOContext.allocTokenBuffer();
        this._objectCodec = objectCodec;
        this._symbols = charsToNameCanonicalizer;
        this._hashSeed = charsToNameCanonicalizer.hashSeed();
    }

    public final void _closeInput() {
        if (this._reader != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(Feature.AUTO_CLOSE_SOURCE)) {
                this._reader.close();
            }
            this._reader = null;
        }
    }

    public final byte[] _decodeBase64(Base64Variant base64Variant) {
        ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                loadMoreGuaranteed();
            }
            char[] cArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char c = cArr[i];
            if (c > ' ') {
                int decodeBase64Char = base64Variant.decodeBase64Char(c);
                if (decodeBase64Char < 0) {
                    if (c == '\"') {
                        return _getByteArrayBuilder.toByteArray();
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, c, 0);
                    if (decodeBase64Char < 0) {
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    loadMoreGuaranteed();
                }
                cArr = this._inputBuffer;
                i = this._inputPtr;
                this._inputPtr = i + 1;
                c = cArr[i];
                int decodeBase64Char2 = base64Variant.decodeBase64Char(c);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, c, 1);
                }
                decodeBase64Char = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    loadMoreGuaranteed();
                }
                cArr = this._inputBuffer;
                i = this._inputPtr;
                this._inputPtr = i + 1;
                char c2 = cArr[i];
                decodeBase64Char2 = base64Variant.decodeBase64Char(c2);
                if (decodeBase64Char2 < 0) {
                    if (decodeBase64Char2 != -2) {
                        if (c2 != '\"' || base64Variant.usesPadding()) {
                            decodeBase64Char2 = _decodeBase64Escape(base64Variant, c2, 2);
                        } else {
                            _getByteArrayBuilder.append(decodeBase64Char >> 4);
                            return _getByteArrayBuilder.toByteArray();
                        }
                    }
                    if (decodeBase64Char2 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            loadMoreGuaranteed();
                        }
                        cArr = this._inputBuffer;
                        i = this._inputPtr;
                        this._inputPtr = i + 1;
                        c2 = cArr[i];
                        if (base64Variant.usesPaddingChar(c2)) {
                            _getByteArrayBuilder.append(decodeBase64Char >> 4);
                        } else {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("expected padding character '");
                            stringBuilder.append(base64Variant.getPaddingChar());
                            stringBuilder.append("'");
                            throw ParserBase.reportInvalidBase64Char(base64Variant, c2, 3, stringBuilder.toString());
                        }
                    }
                }
                decodeBase64Char = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    loadMoreGuaranteed();
                }
                cArr = this._inputBuffer;
                i = this._inputPtr;
                this._inputPtr = i + 1;
                c2 = cArr[i];
                i = base64Variant.decodeBase64Char(c2);
                if (i < 0) {
                    if (i != -2) {
                        if (c2 != '\"' || base64Variant.usesPadding()) {
                            i = _decodeBase64Escape(base64Variant, c2, 3);
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

    public final char _decodeEscaped() {
        if (this._inputPtr >= this._inputEnd && !loadMore()) {
            _reportInvalidEOF(" in character escape sequence");
        }
        char[] cArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        char c = cArr[i];
        if (c == '\"' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return '\r';
        }
        switch (c) {
            case ParserMinimalBase.INT_t /*116*/:
                return '\t';
            case ParserMinimalBase.INT_u /*117*/:
                int i2 = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    if (this._inputPtr >= this._inputEnd && !loadMore()) {
                        _reportInvalidEOF(" in character escape sequence");
                    }
                    char[] cArr2 = this._inputBuffer;
                    int i4 = this._inputPtr;
                    this._inputPtr = i4 + 1;
                    char c2 = cArr2[i4];
                    i4 = CharTypes.charToHex(c2);
                    if (i4 < 0) {
                        _reportUnexpectedChar(c2, "expected a hex-digit for character escape sequence");
                    }
                    i2 = (i2 << 4) | i4;
                }
                return (char) i2;
            default:
                return _handleUnrecognizedCharacterEscape(c);
        }
    }

    public final void _finishString() {
        int i = this._inputPtr;
        int i2 = this._inputEnd;
        if (i < i2) {
            int[] inputCodeLatin1 = CharTypes.getInputCodeLatin1();
            char length = inputCodeLatin1.length;
            do {
                char c = this._inputBuffer[i];
                if (c >= length || inputCodeLatin1[c] == 0) {
                    i++;
                } else if (c == '\"') {
                    this._textBuffer.resetWithShared(this._inputBuffer, this._inputPtr, i - this._inputPtr);
                    this._inputPtr = i + 1;
                    return;
                }
            } while (i < i2);
        }
        this._textBuffer.resetWithCopy(this._inputBuffer, this._inputPtr, i - this._inputPtr);
        this._inputPtr = i;
        _finishString2();
    }

    public final void _finishString2() {
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !loadMore()) {
                _reportInvalidEOF(": was expecting closing quote for a string value");
            }
            char[] cArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char c = cArr[i];
            if (c <= '\\') {
                if (c == '\\') {
                    c = _decodeEscaped();
                } else if (c <= '\"') {
                    if (c == '\"') {
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        return;
                    } else if (c < ' ') {
                        _throwUnquotedSpace(c, "string value");
                    }
                }
            }
            if (currentSegmentSize >= currentSegment.length) {
                currentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            int i2 = currentSegmentSize + 1;
            currentSegment[currentSegmentSize] = c;
            currentSegmentSize = i2;
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
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !loadMore()) {
                _reportInvalidEOF(": was expecting closing quote for a string value");
            }
            char[] cArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char c = cArr[i];
            if (c <= '\\') {
                if (c == '\\') {
                    c = _decodeEscaped();
                } else if (c <= '\'') {
                    if (c == '\'') {
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        return JsonToken.VALUE_STRING;
                    } else if (c < ' ') {
                        _throwUnquotedSpace(c, "string value");
                    }
                }
            }
            if (currentSegmentSize >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            int i2 = currentSegmentSize + 1;
            emptyAndGetCurrentSegment[currentSegmentSize] = c;
            currentSegmentSize = i2;
        }
    }

    public final JsonToken _handleInvalidNumberStart(int i, boolean z) {
        if (i == 73) {
            String str;
            if (this._inputPtr >= this._inputEnd && !loadMore()) {
                _reportInvalidEOFInValue();
            }
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            i = cArr[i2];
            double d = Double.NEGATIVE_INFINITY;
            StringBuilder stringBuilder;
            if (i == 78) {
                str = z ? "-INF" : "+INF";
                _matchToken(str, 3);
                if (isEnabled(Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
                    if (z) {
                        return resetAsNaN(str, d);
                    }
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Non-standard token '");
                stringBuilder.append(str);
                stringBuilder.append("': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
                _reportError(stringBuilder.toString());
            } else if (i == ParserMinimalBase.INT_n) {
                str = z ? "-Infinity" : "+Infinity";
                _matchToken(str, 3);
                if (isEnabled(Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
                    if (z) {
                        return resetAsNaN(str, d);
                    }
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Non-standard token '");
                stringBuilder.append(str);
                stringBuilder.append("': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
                _reportError(stringBuilder.toString());
            }
            d = Double.POSITIVE_INFINITY;
            return resetAsNaN(str, d);
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
                char[] cArr = this._inputBuffer;
                int i2 = this._inputPtr;
                this._inputPtr = i2 + 1;
                return _handleInvalidNumberStart(cArr[i2], false);
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

    public final String _handleUnusualFieldName(int i) {
        if (i == 39 && isEnabled(Feature.ALLOW_SINGLE_QUOTES)) {
            return _parseApostropheFieldName();
        }
        if (!isEnabled(Feature.ALLOW_UNQUOTED_FIELD_NAMES)) {
            _reportUnexpectedChar(i, "was expecting double-quote to start field name");
        }
        int[] inputCodeLatin1JsNames = CharTypes.getInputCodeLatin1JsNames();
        char length = inputCodeLatin1JsNames.length;
        boolean isJavaIdentifierPart = i < length ? inputCodeLatin1JsNames[i] == 0 && (i < 48 || i > 57) : Character.isJavaIdentifierPart((char) i);
        if (!isJavaIdentifierPart) {
            _reportUnexpectedChar(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int i2 = this._inputPtr;
        int i3 = this._hashSeed;
        int i4 = this._inputEnd;
        if (i2 < i4) {
            do {
                char c = this._inputBuffer[i2];
                if (c < length) {
                    if (inputCodeLatin1JsNames[c] != 0) {
                    }
                    i3 = (i3 * 33) + c;
                    i2++;
                } else {
                    if (!Character.isJavaIdentifierPart((char) c)) {
                    }
                    i3 = (i3 * 33) + c;
                    i2++;
                }
                i4 = this._inputPtr - 1;
                this._inputPtr = i2;
                return this._symbols.findSymbol(this._inputBuffer, i4, i2 - i4, i3);
            } while (i2 < i4);
        }
        int i5 = this._inputPtr - 1;
        this._inputPtr = i2;
        return _parseUnusualFieldName2(i5, i3, inputCodeLatin1JsNames);
    }

    public final void _matchToken(String str, int i) {
        int length = str.length();
        do {
            if (this._inputPtr >= this._inputEnd && !loadMore()) {
                _reportInvalidToken(str.substring(0, i));
            }
            if (this._inputBuffer[this._inputPtr] != str.charAt(i)) {
                _reportInvalidToken(str.substring(0, i));
            }
            this._inputPtr = this._inputPtr + 1;
            i++;
        } while (i < length);
        if (this._inputPtr < this._inputEnd || loadMore()) {
            char c = this._inputBuffer[this._inputPtr];
            if (c >= '0' && c != ']') {
                if (c != '}') {
                    if (Character.isJavaIdentifierPart(c)) {
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

    public final String _parseApostropheFieldName() {
        int i = this._inputPtr;
        int i2 = this._hashSeed;
        int i3 = this._inputEnd;
        if (i < i3) {
            int[] inputCodeLatin1 = CharTypes.getInputCodeLatin1();
            char length = inputCodeLatin1.length;
            do {
                char c = this._inputBuffer[i];
                if (c != '\'') {
                    if (c < length && inputCodeLatin1[c] != 0) {
                        break;
                    }
                    i2 = (i2 * 33) + c;
                    i++;
                } else {
                    int i4 = this._inputPtr;
                    this._inputPtr = i + 1;
                    return this._symbols.findSymbol(this._inputBuffer, i4, i - i4, i2);
                }
            } while (i < i3);
        }
        int i5 = this._inputPtr;
        this._inputPtr = i;
        return _parseFieldName2(i5, i2, 39);
    }

    public final String _parseFieldName(int i) {
        if (i != 34) {
            return _handleUnusualFieldName(i);
        }
        int i2 = this._inputPtr;
        int i3 = this._hashSeed;
        int i4 = this._inputEnd;
        if (i2 < i4) {
            int[] inputCodeLatin1 = CharTypes.getInputCodeLatin1();
            char length = inputCodeLatin1.length;
            do {
                char c = this._inputBuffer[i2];
                if (c >= length || inputCodeLatin1[c] == 0) {
                    i3 = (i3 * 33) + c;
                    i2++;
                } else if (c == '\"') {
                    int i5 = this._inputPtr;
                    this._inputPtr = i2 + 1;
                    return this._symbols.findSymbol(this._inputBuffer, i5, i2 - i5, i3);
                }
            } while (i2 < i4);
        }
        int i6 = this._inputPtr;
        this._inputPtr = i2;
        return _parseFieldName2(i6, i3, 34);
    }

    private String _parseFieldName2(int i, int i2, int i3) {
        this._textBuffer.resetWithShared(this._inputBuffer, i, this._inputPtr - i);
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            char _decodeEscaped;
            if (this._inputPtr >= this._inputEnd && !loadMore()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(": was expecting closing '");
                stringBuilder.append((char) i3);
                stringBuilder.append("' for name");
                _reportInvalidEOF(stringBuilder.toString());
            }
            char[] cArr = this._inputBuffer;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            char c = cArr[i4];
            if (c <= '\\') {
                if (c == '\\') {
                    _decodeEscaped = _decodeEscaped();
                    i2 = (i2 * 33) + c;
                    i4 = currentSegmentSize + 1;
                    currentSegment[currentSegmentSize] = _decodeEscaped;
                    if (i4 < currentSegment.length) {
                        currentSegment = this._textBuffer.finishCurrentSegment();
                        currentSegmentSize = 0;
                    } else {
                        currentSegmentSize = i4;
                    }
                } else if (c <= i3) {
                    if (c == i3) {
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        TextBuffer textBuffer = this._textBuffer;
                        return this._symbols.findSymbol(textBuffer.getTextBuffer(), textBuffer.getTextOffset(), textBuffer.size(), i2);
                    } else if (c < ' ') {
                        _throwUnquotedSpace(c, "name");
                    }
                }
            }
            _decodeEscaped = c;
            i2 = (i2 * 33) + c;
            i4 = currentSegmentSize + 1;
            currentSegment[currentSegmentSize] = _decodeEscaped;
            if (i4 < currentSegment.length) {
                currentSegmentSize = i4;
            } else {
                currentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
        }
    }

    private String _parseUnusualFieldName2(int i, int i2, int[] iArr) {
        this._textBuffer.resetWithShared(this._inputBuffer, i, this._inputPtr - i);
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        char length = iArr.length;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !loadMore()) {
                break;
            }
            char c = this._inputBuffer[this._inputPtr];
            if (c > length) {
                if (!Character.isJavaIdentifierPart(c)) {
                    break;
                }
            } else if (iArr[c] != 0) {
                break;
            }
            this._inputPtr = this._inputPtr + 1;
            i2 = (i2 * 33) + c;
            int i3 = currentSegmentSize + 1;
            currentSegment[currentSegmentSize] = c;
            if (i3 >= currentSegment.length) {
                currentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            } else {
                currentSegmentSize = i3;
            }
        }
        this._textBuffer.setCurrentLength(currentSegmentSize);
        TextBuffer textBuffer = this._textBuffer;
        return this._symbols.findSymbol(textBuffer.getTextBuffer(), textBuffer.getTextOffset(), textBuffer.size(), i2);
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
        r1 = r2[r1];
        r0 = 32;
        if (r1 <= r0) goto L_0x0006;
    L_0x001d:
        r3 = r12.decodeBase64Char(r1);
        r8 = 34;
        if (r3 >= 0) goto L_0x0030;
    L_0x0025:
        if (r1 != r8) goto L_0x0029;
    L_0x0027:
        goto L_0x0101;
    L_0x0029:
        r3 = r11._decodeBase64Escape(r12, r1, r4);
        if (r3 >= 0) goto L_0x0030;
    L_0x002f:
        goto L_0x0006;
    L_0x0030:
        if (r7 <= r6) goto L_0x0037;
    L_0x0032:
        r10 = r10 + r7;
        r13.write(r14, r4, r7);
        r7 = 0;
    L_0x0037:
        r1 = r11._inputPtr;
        r0 = r11._inputEnd;
        if (r1 < r0) goto L_0x0040;
    L_0x003d:
        r11.loadMoreGuaranteed();
    L_0x0040:
        r2 = r11._inputBuffer;
        r1 = r11._inputPtr;
        r0 = r1 + 1;
        r11._inputPtr = r0;
        r1 = r2[r1];
        r0 = r12.decodeBase64Char(r1);
        if (r0 >= 0) goto L_0x0055;
    L_0x0050:
        r0 = 1;
        r0 = r11._decodeBase64Escape(r12, r1, r0);
    L_0x0055:
        r9 = r3 << 6;
        r9 = r9 | r0;
        r1 = r11._inputPtr;
        r0 = r11._inputEnd;
        if (r1 < r0) goto L_0x0061;
    L_0x005e:
        r11.loadMoreGuaranteed();
    L_0x0061:
        r2 = r11._inputBuffer;
        r1 = r11._inputPtr;
        r0 = r1 + 1;
        r11._inputPtr = r0;
        r2 = r2[r1];
        r0 = r12.decodeBase64Char(r2);
        r1 = 2;
        r3 = -2;
        if (r0 >= 0) goto L_0x00cd;
    L_0x0073:
        if (r0 == r3) goto L_0x008a;
    L_0x0075:
        if (r2 != r8) goto L_0x0086;
    L_0x0077:
        r0 = r12.usesPadding();
        if (r0 != 0) goto L_0x0086;
    L_0x007d:
        r0 = r9 >> 4;
        r1 = r7 + 1;
        r0 = (byte) r0;
        r14[r7] = r0;
        r7 = r1;
        goto L_0x0101;
    L_0x0086:
        r0 = r11._decodeBase64Escape(r12, r2, r1);
    L_0x008a:
        if (r0 != r3) goto L_0x00cd;
    L_0x008c:
        r1 = r11._inputPtr;
        r0 = r11._inputEnd;
        if (r1 < r0) goto L_0x0095;
    L_0x0092:
        r11.loadMoreGuaranteed();
    L_0x0095:
        r2 = r11._inputBuffer;
        r1 = r11._inputPtr;
        r0 = r1 + 1;
        r11._inputPtr = r0;
        r2 = r2[r1];
        r0 = r12.usesPaddingChar(r2);
        if (r0 == 0) goto L_0x00ae;
    L_0x00a5:
        r0 = r9 >> 4;
        r2 = r7 + 1;
        r0 = (byte) r0;
        r14[r7] = r0;
        goto L_0x0136;
    L_0x00ae:
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
    L_0x00cd:
        r9 = r9 << 6;
        r9 = r9 | r0;
        r1 = r11._inputPtr;
        r0 = r11._inputEnd;
        if (r1 < r0) goto L_0x00d9;
    L_0x00d6:
        r11.loadMoreGuaranteed();
    L_0x00d9:
        r2 = r11._inputBuffer;
        r1 = r11._inputPtr;
        r0 = r1 + 1;
        r11._inputPtr = r0;
        r1 = r2[r1];
        r0 = r12.decodeBase64Char(r1);
        if (r0 >= 0) goto L_0x0120;
    L_0x00e9:
        if (r0 == r3) goto L_0x010e;
    L_0x00eb:
        if (r1 != r8) goto L_0x010a;
    L_0x00ed:
        r0 = r12.usesPadding();
        if (r0 != 0) goto L_0x010a;
    L_0x00f3:
        r2 = r9 >> 2;
        r1 = r7 + 1;
        r0 = r2 >> 8;
        r0 = (byte) r0;
        r14[r7] = r0;
        r7 = r1 + 1;
        r0 = (byte) r2;
        r14[r1] = r0;
    L_0x0101:
        r11._tokenIncomplete = r4;
        if (r7 <= 0) goto L_0x0109;
    L_0x0105:
        r10 = r10 + r7;
        r13.write(r14, r4, r7);
    L_0x0109:
        return r10;
    L_0x010a:
        r0 = r11._decodeBase64Escape(r12, r1, r5);
    L_0x010e:
        if (r0 != r3) goto L_0x0120;
    L_0x0110:
        r2 = r9 >> 2;
        r1 = r7 + 1;
        r0 = r2 >> 8;
        r0 = (byte) r0;
        r14[r7] = r0;
        r7 = r1 + 1;
        r0 = (byte) r2;
        r14[r1] = r0;
        goto L_0x0006;
    L_0x0120:
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
    L_0x0136:
        r7 = r2;
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._readBinary(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream, byte[]):int");
    }

    public final void _releaseBuffers() {
        super._releaseBuffers();
        char[] cArr = this._inputBuffer;
        if (cArr != null) {
            this._inputBuffer = null;
            this._ioContext.releaseTokenBuffer(cArr);
        }
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
            char c = this._inputBuffer[this._inputPtr];
            if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            this._inputPtr = this._inputPtr + 1;
            stringBuilder.append(c);
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Unrecognized token '");
        stringBuilder2.append(stringBuilder.toString());
        stringBuilder2.append("': was expecting ");
        _reportError(stringBuilder2.toString());
    }

    private void _skipCComment() {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !loadMore()) {
                break;
            }
            char[] cArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char c = cArr[i];
            if (c <= '*') {
                if (c == '*') {
                    if (this._inputPtr >= this._inputEnd && !loadMore()) {
                        break;
                    } else if (this._inputBuffer[this._inputPtr] == '/') {
                        this._inputPtr = this._inputPtr + 1;
                        return;
                    }
                } else if (c < ' ') {
                    if (c == '\n') {
                        _skipLF();
                    } else if (c == '\r') {
                        _skipCR();
                    } else if (c != '\t') {
                        _throwInvalidSpace(c);
                    }
                }
            }
        }
        _reportInvalidEOF(" in a comment");
    }

    public final void _skipCR() {
        if ((this._inputPtr < this._inputEnd || loadMore()) && this._inputBuffer[this._inputPtr] == '\n') {
            this._inputPtr = this._inputPtr + 1;
        }
        this._currInputRow = this._currInputRow + 1;
        this._currInputRowStart = this._inputPtr;
    }

    private void _skipComment() {
        if (!isEnabled(Feature.ALLOW_COMMENTS)) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this._inputPtr >= this._inputEnd && !loadMore()) {
            _reportInvalidEOF(" in a comment");
        }
        char[] cArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        char c = cArr[i];
        if (c == '/') {
            _skipCppComment();
        } else if (c == '*') {
            _skipCComment();
        } else {
            _reportUnexpectedChar(c, "was expecting either '*' or '/' for a comment");
        }
    }

    private void _skipCppComment() {
        while (true) {
            if (this._inputPtr < this._inputEnd || loadMore()) {
                char[] cArr = this._inputBuffer;
                int i = this._inputPtr;
                this._inputPtr = i + 1;
                char c = cArr[i];
                if (c < ' ') {
                    if (c == '\n') {
                        _skipLF();
                        return;
                    } else if (c == '\r') {
                        _skipCR();
                        return;
                    } else if (c != '\t') {
                        _throwInvalidSpace(c);
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void _skipLF() {
        this._currInputRow = this._currInputRow + 1;
        this._currInputRowStart = this._inputPtr;
    }

    public final void _skipString() {
        this._tokenIncomplete = false;
        int i = this._inputPtr;
        int i2 = this._inputEnd;
        char[] cArr = this._inputBuffer;
        while (true) {
            if (i >= i2) {
                this._inputPtr = i;
                if (!loadMore()) {
                    _reportInvalidEOF(": was expecting closing quote for a string value");
                }
                i = this._inputPtr;
                i2 = this._inputEnd;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c <= '\\') {
                if (c == '\\') {
                    this._inputPtr = i3;
                    _decodeEscaped();
                    i = this._inputPtr;
                    i2 = this._inputEnd;
                } else if (c <= '\"') {
                    if (c == '\"') {
                        this._inputPtr = i3;
                        return;
                    } else if (c < ' ') {
                        this._inputPtr = i3;
                        _throwUnquotedSpace(c, "string value");
                    }
                }
            }
            i = i3;
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
            char[] cArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char c = cArr[i];
            if (c > ' ') {
                if (c != '/') {
                    return c;
                }
                _skipComment();
            } else if (c != ' ') {
                if (c == '\n') {
                    _skipLF();
                } else if (c == '\r') {
                    _skipCR();
                } else if (c != '\t') {
                    _throwInvalidSpace(c);
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
            char[] cArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char c = cArr[i];
            if (c > ' ') {
                if (c != '/') {
                    return c;
                }
                _skipComment();
            } else if (c != ' ') {
                if (c == '\n') {
                    _skipLF();
                } else if (c == '\r') {
                    _skipCR();
                } else if (c != '\t') {
                    _throwInvalidSpace(c);
                }
            }
        }
    }

    private char _verifyNoLeadingZeroes() {
        if (this._inputPtr < this._inputEnd || loadMore()) {
            char c = this._inputBuffer[this._inputPtr];
            if (c >= '0') {
                if (c <= '9') {
                    if (!isEnabled(Feature.ALLOW_NUMERIC_LEADING_ZEROS)) {
                        reportInvalidNumber("Leading zeroes not allowed");
                    }
                    this._inputPtr = this._inputPtr + 1;
                    if (c == '0') {
                        do {
                            if (this._inputPtr >= this._inputEnd && !loadMore()) {
                                break;
                            }
                            c = this._inputBuffer[this._inputPtr];
                            if (c >= '0') {
                                if (c <= '9') {
                                    this._inputPtr = this._inputPtr + 1;
                                }
                            }
                        } while (c == '0');
                    }
                    return c;
                }
            }
        }
        return '0';
    }

    public final void close() {
        super.close();
        this._symbols.release();
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
        return this._reader;
    }

    public final char getNextChar(String str) {
        if (this._inputPtr >= this._inputEnd && !loadMore()) {
            _reportInvalidEOF(str);
        }
        char[] cArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        return cArr[i];
    }

    public final String getText() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return _getText2(jsonToken);
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
        r1 = com.fasterxml.jackson.core.json.ReaderBasedJsonParser.C00421.$SwitchMap$com$fasterxml$jackson$core$JsonToken;
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
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getTextOffset():int");
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

    public final boolean loadMore() {
        this._currInputProcessed = this._currInputProcessed + ((long) this._inputEnd);
        this._currInputRowStart = this._currInputRowStart - this._inputEnd;
        Reader reader = this._reader;
        if (reader != null) {
            char[] cArr = this._inputBuffer;
            int read = reader.read(cArr, 0, cArr.length);
            if (read > 0) {
                this._inputPtr = 0;
                this._inputEnd = read;
                return true;
            }
            _closeInput();
            if (read == 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Reader returned 0 characters when trying to read ");
                stringBuilder.append(this._inputEnd);
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
            boolean inObject = this._parsingContext.inObject();
            if (inObject) {
                this._parsingContext.setCurrentName(_parseFieldName(_skipWSOrEnd));
                this._currToken = JsonToken.FIELD_NAME;
                _skipWSOrEnd = _skipWS();
                if (_skipWSOrEnd != 58) {
                    _reportUnexpectedChar(_skipWSOrEnd, "was expecting a colon to separate field name and value");
                }
                _skipWSOrEnd = _skipWS();
            }
            if (_skipWSOrEnd != 34) {
                if (_skipWSOrEnd != 45) {
                    if (_skipWSOrEnd != 91) {
                        if (_skipWSOrEnd != 93) {
                            if (_skipWSOrEnd == ParserMinimalBase.INT_f) {
                                _matchToken("false", 1);
                                jsonToken = JsonToken.VALUE_FALSE;
                            } else if (_skipWSOrEnd != ParserMinimalBase.INT_n) {
                                if (_skipWSOrEnd != ParserMinimalBase.INT_t) {
                                    if (_skipWSOrEnd != ParserMinimalBase.INT_LCURLY) {
                                        if (_skipWSOrEnd != ParserMinimalBase.INT_RCURLY) {
                                            switch (_skipWSOrEnd) {
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
                                                    jsonToken = _handleUnexpectedValue(_skipWSOrEnd);
                                                    break;
                                            }
                                        }
                                    }
                                    if (!inObject) {
                                        this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
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
                        _reportUnexpectedChar(_skipWSOrEnd, "expected a value");
                        _matchToken("true", 1);
                        jsonToken = JsonToken.VALUE_TRUE;
                    } else {
                        if (!inObject) {
                            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
                        }
                        jsonToken = JsonToken.START_ARRAY;
                    }
                }
                jsonToken = parseNumberText(_skipWSOrEnd);
            } else {
                this._tokenIncomplete = true;
                jsonToken = JsonToken.VALUE_STRING;
            }
            if (inObject) {
                this._nextToken = jsonToken;
                return this._currToken;
            }
            this._currToken = jsonToken;
            return jsonToken;
        }
    }

    public final JsonToken parseNumberText(int i) {
        int i2 = 0;
        int i3 = 1;
        boolean z = i == 45;
        int i4 = this._inputPtr;
        int i5 = i4 - 1;
        int i6 = this._inputEnd;
        if (z) {
            if (i4 >= this._inputEnd) {
                if (z) {
                    i5++;
                }
                this._inputPtr = i5;
                return parseNumberText2(z);
            }
            int i7 = i4 + 1;
            i = this._inputBuffer[i4];
            if (i <= 57) {
                if (i >= 48) {
                    i4 = i7;
                }
            }
            this._inputPtr = i7;
            return _handleInvalidNumberStart(i, true);
        }
        if (i != 48) {
            while (i4 < this._inputEnd) {
                int i8;
                int i9;
                int i10 = i4 + 1;
                char c = this._inputBuffer[i4];
                if (c >= '0') {
                    if (c <= '9') {
                        i3++;
                        i4 = i10;
                    }
                }
                if (c == '.') {
                    i8 = 0;
                    while (i10 < i6) {
                        i4 = i10 + 1;
                        c = this._inputBuffer[i10];
                        if (c >= '0') {
                            if (c <= '9') {
                                i8++;
                                i10 = i4;
                            }
                        }
                        if (i8 == 0) {
                            reportUnexpectedNumberChar(c, "Decimal point not followed by a digit");
                        }
                        i10 = i4;
                    }
                } else {
                    i8 = 0;
                }
                if (c == 'e' || c == 'E') {
                    if (i10 < i6) {
                        int i11;
                        i4 = i10 + 1;
                        i9 = this._inputBuffer[i10];
                        if (i9 != 45) {
                            if (i9 != 43) {
                                i10 = i4;
                                if (i9 > 57 && i9 >= 48) {
                                    i2++;
                                    if (i10 < i6) {
                                        i11 = i10 + 1;
                                        i9 = this._inputBuffer[i10];
                                        i10 = i11;
                                        if (i9 > 57) {
                                        }
                                        if (i2 == 0) {
                                            reportUnexpectedNumberChar(i9, "Exponent indicator not followed by a digit");
                                        }
                                    }
                                } else if (i2 == 0) {
                                    reportUnexpectedNumberChar(i9, "Exponent indicator not followed by a digit");
                                }
                            }
                        }
                        if (i4 < i6) {
                            i11 = i4 + 1;
                            i9 = this._inputBuffer[i4];
                            i10 = i11;
                            if (i9 > 57) {
                            }
                            if (i2 == 0) {
                                reportUnexpectedNumberChar(i9, "Exponent indicator not followed by a digit");
                            }
                        }
                    }
                }
                i9 = i10 - 1;
                this._inputPtr = i9;
                this._textBuffer.resetWithShared(this._inputBuffer, i5, i9 - i5);
                return reset(z, i3, i8, i2);
            }
        }
        if (z) {
            i5++;
        }
        this._inputPtr = i5;
        return parseNumberText2(z);
    }

    private JsonToken parseNumberText2(boolean z) {
        int i;
        char c;
        int i2;
        Object obj;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i3 = 0;
        if (z) {
            emptyAndGetCurrentSegment[0] = '-';
            i = 1;
        } else {
            i = 0;
        }
        if (this._inputPtr < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            c = cArr[i4];
        } else {
            c = getNextChar("No digit following minus sign");
        }
        if (c == '0') {
            c = _verifyNoLeadingZeroes();
        }
        int i5 = 0;
        while (c >= '0' && c <= '9') {
            i5++;
            if (i >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            i2 = i + 1;
            emptyAndGetCurrentSegment[i] = c;
            if (this._inputPtr >= this._inputEnd && !loadMore()) {
                i = i2;
                c = '\u0000';
                obj = 1;
                break;
            }
            cArr = this._inputBuffer;
            i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            c = cArr[i4];
            i = i2;
        }
        obj = null;
        if (i5 == 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Missing integer part (next char ");
            stringBuilder.append(ParserMinimalBase._getCharDesc(c));
            stringBuilder.append(")");
            reportInvalidNumber(stringBuilder.toString());
        }
        if (c == '.') {
            i4 = i + 1;
            emptyAndGetCurrentSegment[i] = c;
            i2 = 0;
            while (true) {
                if (this._inputPtr >= this._inputEnd && !loadMore()) {
                    break;
                }
                char[] cArr2 = this._inputBuffer;
                int i6 = this._inputPtr;
                this._inputPtr = i6 + 1;
                c = cArr2[i6];
                if (c < '0') {
                    break;
                } else if (c > '9') {
                    break;
                } else {
                    i2++;
                    if (i4 >= emptyAndGetCurrentSegment.length) {
                        emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                        i4 = 0;
                    }
                    int i7 = i4 + 1;
                    emptyAndGetCurrentSegment[i4] = c;
                    i4 = i7;
                }
            }
            obj = 1;
            if (i2 == 0) {
                reportUnexpectedNumberChar(c, "Decimal point not followed by a digit");
            }
            i = i4;
        } else {
            i2 = 0;
        }
        if (c == 'e' || c == 'E') {
            if (i >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            i4 = i + 1;
            emptyAndGetCurrentSegment[i] = c;
            if (this._inputPtr < this._inputEnd) {
                cArr2 = this._inputBuffer;
                i6 = this._inputPtr;
                this._inputPtr = i6 + 1;
                c = cArr2[i6];
            } else {
                c = getNextChar("expected a digit for number exponent");
            }
            if (c != '-') {
                if (c == '+') {
                }
                i3 = 0;
                while (c <= '9' && c >= '0') {
                    i3++;
                    if (i4 >= emptyAndGetCurrentSegment.length) {
                        emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                        i4 = 0;
                    }
                    i = i4 + 1;
                    emptyAndGetCurrentSegment[i4] = c;
                    if (this._inputPtr < this._inputEnd && !loadMore()) {
                        obj = 1;
                        break;
                    }
                    cArr = this._inputBuffer;
                    i4 = this._inputPtr;
                    this._inputPtr = i4 + 1;
                    c = cArr[i4];
                    i4 = i;
                }
                i = i4;
                if (i3 == 0) {
                    reportUnexpectedNumberChar(c, "Exponent indicator not followed by a digit");
                }
            }
            if (i4 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i4 = 0;
            }
            i = i4 + 1;
            emptyAndGetCurrentSegment[i4] = c;
            if (this._inputPtr < this._inputEnd) {
                cArr = this._inputBuffer;
                i4 = this._inputPtr;
                this._inputPtr = i4 + 1;
                c = cArr[i4];
            } else {
                c = getNextChar("expected a digit for number exponent");
            }
            i4 = i;
            i3 = 0;
            while (c <= '9') {
                i3++;
                if (i4 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i4 = 0;
                }
                i = i4 + 1;
                emptyAndGetCurrentSegment[i4] = c;
                if (this._inputPtr < this._inputEnd) {
                }
                cArr = this._inputBuffer;
                i4 = this._inputPtr;
                this._inputPtr = i4 + 1;
                c = cArr[i4];
                i4 = i;
            }
            i = i4;
            if (i3 == 0) {
                reportUnexpectedNumberChar(c, "Exponent indicator not followed by a digit");
            }
        }
        if (obj == null) {
            this._inputPtr = this._inputPtr - 1;
        }
        this._textBuffer.setCurrentLength(i);
        return reset(z, i5, i2, i3);
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

    public final int releaseBuffered(Writer writer) {
        int i = this._inputEnd - this._inputPtr;
        if (i < 1) {
            return 0;
        }
        writer.write(this._inputBuffer, this._inputPtr, i);
        return i;
    }

    public final void setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
    }
}
