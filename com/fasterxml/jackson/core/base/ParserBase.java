package com.fasterxml.jackson.core.base;

import com.facebook.forker.Process;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser$NumberType;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.json.PackageVersion;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class ParserBase extends ParserMinimalBase {
    public static final BigDecimal BD_MAX_INT = new BigDecimal(BI_MAX_INT);
    public static final BigDecimal BD_MAX_LONG = new BigDecimal(BI_MAX_LONG);
    public static final BigDecimal BD_MIN_INT = new BigDecimal(BI_MIN_INT);
    public static final BigDecimal BD_MIN_LONG = new BigDecimal(BI_MIN_LONG);
    public static final BigInteger BI_MAX_INT = BigInteger.valueOf(2147483647L);
    public static final BigInteger BI_MAX_LONG = BigInteger.valueOf(Long.MAX_VALUE);
    public static final BigInteger BI_MIN_INT = BigInteger.valueOf(-2147483648L);
    public static final BigInteger BI_MIN_LONG = BigInteger.valueOf(Long.MIN_VALUE);
    public byte[] _binaryValue;
    public ByteArrayBuilder _byteArrayBuilder = null;
    public boolean _closed;
    public long _currInputProcessed = 0;
    public int _currInputRow = 1;
    public int _currInputRowStart = 0;
    public int _expLength;
    public int _fractLength;
    public int _inputEnd = 0;
    public int _inputPtr = 0;
    public int _intLength;
    public final IOContext _ioContext;
    public boolean _nameCopied = false;
    public char[] _nameCopyBuffer = null;
    public JsonToken _nextToken;
    public int _numTypesValid = 0;
    public BigDecimal _numberBigDecimal;
    public BigInteger _numberBigInt;
    public double _numberDouble;
    public int _numberInt;
    public long _numberLong;
    public boolean _numberNegative;
    public JsonReadContext _parsingContext;
    public final TextBuffer _textBuffer;
    public int _tokenInputCol = 0;
    public int _tokenInputRow = 1;
    public long _tokenInputTotal = 0;

    public abstract void _closeInput();

    public final Object getEmbeddedObject() {
        return null;
    }

    public abstract boolean loadMore();

    public ParserBase(IOContext iOContext, int i) {
        this._features = i;
        this._ioContext = iOContext;
        this._textBuffer = iOContext.constructTextBuffer();
        this._parsingContext = JsonReadContext.createRootContext();
    }

    public final int _decodeBase64Escape(Base64Variant base64Variant, char c, int i) {
        if (c == '\\') {
            c = _decodeEscaped();
            if (c <= ' ' && i == 0) {
                return -1;
            }
            int decodeBase64Char = base64Variant.decodeBase64Char(c);
            if (decodeBase64Char >= 0) {
                return decodeBase64Char;
            }
        }
        throw reportInvalidBase64Char(base64Variant, c, i);
    }

    public final int _decodeBase64Escape(Base64Variant base64Variant, int i, int i2) {
        if (i == 92) {
            i = _decodeEscaped();
            if (i <= 32 && i2 == 0) {
                return -1;
            }
            int decodeBase64Char = base64Variant.decodeBase64Char(i);
            if (decodeBase64Char >= 0) {
                return decodeBase64Char;
            }
        }
        throw reportInvalidBase64Char(base64Variant, i, i2);
    }

    public char _decodeEscaped() {
        throw new UnsupportedOperationException();
    }

    public final ByteArrayBuilder _getByteArrayBuilder() {
        ByteArrayBuilder byteArrayBuilder = this._byteArrayBuilder;
        if (byteArrayBuilder == null) {
            this._byteArrayBuilder = new ByteArrayBuilder();
        } else {
            byteArrayBuilder.reset();
        }
        return this._byteArrayBuilder;
    }

    public final void _handleEOF() {
        if (!this._parsingContext.inRoot()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(": expected close marker for ");
            stringBuilder.append(this._parsingContext.getTypeDesc());
            stringBuilder.append(" (from ");
            stringBuilder.append(this._parsingContext.getStartLocation(this._ioContext.getSourceReference()));
            stringBuilder.append(")");
            _reportInvalidEOF(stringBuilder.toString());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void _parseNumericValue(int r6) {
        /*
        r5 = this;
        r1 = r5._currToken;
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
        if (r1 != r0) goto L_0x0061;
    L_0x0006:
        r0 = r5._textBuffer;
        r3 = r0.getTextBuffer();
        r0 = r5._textBuffer;
        r2 = r0.getTextOffset();
        r1 = r5._intLength;
        r0 = r5._numberNegative;
        if (r0 == 0) goto L_0x001a;
    L_0x0018:
        r2 = r2 + 1;
    L_0x001a:
        r0 = 9;
        r4 = 1;
        if (r1 > r0) goto L_0x002d;
    L_0x001f:
        r1 = com.fasterxml.jackson.core.io.NumberInput.parseInt(r3, r2, r1);
        r0 = r5._numberNegative;
        if (r0 == 0) goto L_0x0028;
    L_0x0027:
        r1 = -r1;
    L_0x0028:
        r5._numberInt = r1;
        r5._numTypesValid = r4;
        return;
    L_0x002d:
        r0 = 18;
        if (r1 > r0) goto L_0x005d;
    L_0x0031:
        r2 = com.fasterxml.jackson.core.io.NumberInput.parseLong(r3, r2, r1);
        r0 = r5._numberNegative;
        if (r0 == 0) goto L_0x003a;
    L_0x0039:
        r2 = -r2;
    L_0x003a:
        r0 = 10;
        if (r1 != r0) goto L_0x0057;
    L_0x003e:
        r0 = r5._numberNegative;
        if (r0 == 0) goto L_0x004f;
    L_0x0042:
        r0 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x0057;
    L_0x0049:
        r0 = (int) r2;
        r5._numberInt = r0;
        r5._numTypesValid = r4;
        return;
    L_0x004f:
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r0 > 0) goto L_0x0057;
    L_0x0056:
        goto L_0x0049;
    L_0x0057:
        r5._numberLong = r2;
        r0 = 2;
        r5._numTypesValid = r0;
        return;
    L_0x005d:
        r5._parseSlowIntValue(r6, r3, r2, r1);
        return;
    L_0x0061:
        r1 = r5._currToken;
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;
        if (r1 != r0) goto L_0x006b;
    L_0x0067:
        r5._parseSlowFloatValue(r6);
        return;
    L_0x006b:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Current token (";
        r1.append(r0);
        r0 = r5._currToken;
        r1.append(r0);
        r0 = ") not numeric, can not use numeric value accessors";
        r1.append(r0);
        r0 = r1.toString();
        r5._reportError(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.base.ParserBase._parseNumericValue(int):void");
    }

    private void _parseSlowFloatValue(int i) {
        if (i == 16) {
            try {
                this._numberBigDecimal = this._textBuffer.contentsAsDecimal();
                this._numTypesValid = 16;
                return;
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Malformed numeric value '");
                stringBuilder.append(this._textBuffer.contentsAsString());
                stringBuilder.append("'");
                _wrapError(stringBuilder.toString(), e);
                return;
            }
        }
        this._numberDouble = this._textBuffer.contentsAsDouble();
        this._numTypesValid = 8;
    }

    private void _parseSlowIntValue(int i, char[] cArr, int i2, int i3) {
        String contentsAsString = this._textBuffer.contentsAsString();
        try {
            if (NumberInput.inLongRange(cArr, i2, i3, this._numberNegative)) {
                this._numberLong = Long.parseLong(contentsAsString);
                this._numTypesValid = 2;
                return;
            }
            this._numberBigInt = new BigInteger(contentsAsString);
            this._numTypesValid = 4;
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Malformed numeric value '");
            stringBuilder.append(contentsAsString);
            stringBuilder.append("'");
            _wrapError(stringBuilder.toString(), e);
        }
    }

    public void _releaseBuffers() {
        this._textBuffer.releaseBuffers();
        char[] cArr = this._nameCopyBuffer;
        if (cArr != null) {
            this._nameCopyBuffer = null;
            this._ioContext.releaseNameCopyBuffer(cArr);
        }
    }

    public final void _reportMismatchedEndMarker(int i, char c) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this._parsingContext.getStartLocation(this._ioContext.getSourceReference()));
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("Unexpected close marker '");
        stringBuilder3.append((char) i);
        stringBuilder3.append("': expected '");
        stringBuilder3.append(c);
        stringBuilder3.append("' (for ");
        stringBuilder3.append(this._parsingContext.getTypeDesc());
        stringBuilder3.append(" starting at ");
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append(")");
        _reportError(stringBuilder3.toString());
    }

    public void close() {
        if (!this._closed) {
            this._closed = true;
            try {
                _closeInput();
            } finally {
                _releaseBuffers();
            }
        }
    }

    public final void convertNumberToBigDecimal() {
        int i = this._numTypesValid;
        if ((i & 8) != 0) {
            this._numberBigDecimal = new BigDecimal(getText());
        } else if ((i & 4) != 0) {
            this._numberBigDecimal = new BigDecimal(this._numberBigInt);
        } else if ((i & 2) != 0) {
            this._numberBigDecimal = BigDecimal.valueOf(this._numberLong);
        } else if ((i & 1) != 0) {
            this._numberBigDecimal = BigDecimal.valueOf((long) this._numberInt);
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 16;
    }

    public final void convertNumberToBigInteger() {
        int i = this._numTypesValid;
        if ((i & 16) != 0) {
            this._numberBigInt = this._numberBigDecimal.toBigInteger();
        } else if ((i & 2) != 0) {
            this._numberBigInt = BigInteger.valueOf(this._numberLong);
        } else if ((i & 1) != 0) {
            this._numberBigInt = BigInteger.valueOf((long) this._numberInt);
        } else if ((i & 8) != 0) {
            this._numberBigInt = BigDecimal.valueOf(this._numberDouble).toBigInteger();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 4;
    }

    public final void convertNumberToDouble() {
        int i = this._numTypesValid;
        if ((i & 16) != 0) {
            this._numberDouble = this._numberBigDecimal.doubleValue();
        } else if ((i & 4) != 0) {
            this._numberDouble = this._numberBigInt.doubleValue();
        } else if ((i & 2) != 0) {
            this._numberDouble = (double) this._numberLong;
        } else if ((i & 1) != 0) {
            this._numberDouble = (double) this._numberInt;
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 8;
    }

    public final void convertNumberToInt() {
        int i = this._numTypesValid;
        if ((i & 2) != 0) {
            long j = this._numberLong;
            int i2 = (int) j;
            if (((long) i2) != j) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Numeric value (");
                stringBuilder.append(getText());
                stringBuilder.append(") out of range of int");
                _reportError(stringBuilder.toString());
            }
            this._numberInt = i2;
        } else if ((i & 4) != 0) {
            if (BI_MIN_INT.compareTo(this._numberBigInt) > 0 || BI_MAX_INT.compareTo(this._numberBigInt) < 0) {
                reportOverflowInt();
            }
            this._numberInt = this._numberBigInt.intValue();
        } else if ((i & 8) != 0) {
            double d = this._numberDouble;
            if (d < -2.147483648E9d || d > 2.147483647E9d) {
                reportOverflowInt();
            }
            this._numberInt = (int) this._numberDouble;
        } else if ((i & 16) != 0) {
            if (BD_MIN_INT.compareTo(this._numberBigDecimal) > 0 || BD_MAX_INT.compareTo(this._numberBigDecimal) < 0) {
                reportOverflowInt();
            }
            this._numberInt = this._numberBigDecimal.intValue();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 1;
    }

    public final void convertNumberToLong() {
        int i = this._numTypesValid;
        if ((i & 1) != 0) {
            this._numberLong = (long) this._numberInt;
        } else if ((i & 4) != 0) {
            if (BI_MIN_LONG.compareTo(this._numberBigInt) > 0 || BI_MAX_LONG.compareTo(this._numberBigInt) < 0) {
                reportOverflowLong();
            }
            this._numberLong = this._numberBigInt.longValue();
        } else if ((i & 8) != 0) {
            double d = this._numberDouble;
            if (d < -9.223372036854776E18d || d > 9.223372036854776E18d) {
                reportOverflowLong();
            }
            this._numberLong = (long) this._numberDouble;
        } else if ((i & 16) != 0) {
            if (BD_MIN_LONG.compareTo(this._numberBigDecimal) > 0 || BD_MAX_LONG.compareTo(this._numberBigDecimal) < 0) {
                reportOverflowLong();
            }
            this._numberLong = this._numberBigDecimal.longValue();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 2;
    }

    public final BigInteger getBigIntegerValue() {
        int i = this._numTypesValid;
        if ((i & 4) == 0) {
            if (i == 0) {
                _parseNumericValue(4);
            }
            if ((this._numTypesValid & 4) == 0) {
                convertNumberToBigInteger();
            }
        }
        return this._numberBigInt;
    }

    public final JsonLocation getCurrentLocation() {
        return new JsonLocation(this._ioContext.getSourceReference(), (this._currInputProcessed + ((long) this._inputPtr)) - 1, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    public final String getCurrentName() {
        if (this._currToken != JsonToken.START_OBJECT) {
            if (this._currToken != JsonToken.START_ARRAY) {
                return this._parsingContext.getCurrentName();
            }
        }
        return this._parsingContext.getParent().getCurrentName();
    }

    public final BigDecimal getDecimalValue() {
        int i = this._numTypesValid;
        if ((i & 16) == 0) {
            if (i == 0) {
                _parseNumericValue(16);
            }
            if ((this._numTypesValid & 16) == 0) {
                convertNumberToBigDecimal();
            }
        }
        return this._numberBigDecimal;
    }

    public final double getDoubleValue() {
        int i = this._numTypesValid;
        if ((i & 8) == 0) {
            if (i == 0) {
                _parseNumericValue(8);
            }
            if ((this._numTypesValid & 8) == 0) {
                convertNumberToDouble();
            }
        }
        return this._numberDouble;
    }

    public final float getFloatValue() {
        return (float) getDoubleValue();
    }

    public final int getIntValue() {
        int i = this._numTypesValid;
        if ((i & 1) == 0) {
            if (i == 0) {
                _parseNumericValue(1);
            }
            if ((this._numTypesValid & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    public final long getLongValue() {
        int i = this._numTypesValid;
        if ((i & 2) == 0) {
            if (i == 0) {
                _parseNumericValue(2);
            }
            if ((this._numTypesValid & 2) == 0) {
                convertNumberToLong();
            }
        }
        return this._numberLong;
    }

    public final JsonParser$NumberType getNumberType() {
        if (this._numTypesValid == 0) {
            _parseNumericValue(0);
        }
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            int i = this._numTypesValid;
            if ((i & 1) != 0) {
                return JsonParser$NumberType.INT;
            }
            if ((i & 2) != 0) {
                return JsonParser$NumberType.LONG;
            }
            return JsonParser$NumberType.BIG_INTEGER;
        } else if ((this._numTypesValid & 16) != 0) {
            return JsonParser$NumberType.BIG_DECIMAL;
        } else {
            return JsonParser$NumberType.DOUBLE;
        }
    }

    public final Number getNumberValue() {
        if (this._numTypesValid == 0) {
            _parseNumericValue(0);
        }
        int i;
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            i = this._numTypesValid;
            if ((i & 1) != 0) {
                return Integer.valueOf(this._numberInt);
            }
            if ((i & 2) != 0) {
                return Long.valueOf(this._numberLong);
            }
            if ((i & 4) != 0) {
                return this._numberBigInt;
            }
        }
        i = this._numTypesValid;
        if ((i & 16) == 0) {
            if ((i & 8) == 0) {
                _throwInternal();
            }
            return Double.valueOf(this._numberDouble);
        }
        return this._numberBigDecimal;
    }

    public final JsonReadContext getParsingContext() {
        return this._parsingContext;
    }

    public final long getTokenCharacterOffset() {
        return this._tokenInputTotal;
    }

    public final int getTokenColumnNr() {
        int i = this._tokenInputCol;
        return i < 0 ? i : i + 1;
    }

    public final int getTokenLineNr() {
        return this._tokenInputRow;
    }

    public final JsonLocation getTokenLocation() {
        return new JsonLocation(this._ioContext.getSourceReference(), getTokenCharacterOffset(), getTokenLineNr(), getTokenColumnNr());
    }

    public final boolean hasTextCharacters() {
        if (this._currToken == JsonToken.VALUE_STRING) {
            return true;
        }
        return this._currToken == JsonToken.FIELD_NAME ? this._nameCopied : false;
    }

    public final boolean isClosed() {
        return this._closed;
    }

    public final void loadMoreGuaranteed() {
        if (!loadMore()) {
            _reportInvalidEOF();
        }
    }

    public final void overrideCurrentName(String str) {
        JsonReadContext jsonReadContext = this._parsingContext;
        if (this._currToken == JsonToken.START_OBJECT || this._currToken == JsonToken.START_ARRAY) {
            jsonReadContext = jsonReadContext.getParent();
        }
        jsonReadContext.setCurrentName(str);
    }

    public final IllegalArgumentException reportInvalidBase64Char(Base64Variant base64Variant, int i, int i2) {
        return reportInvalidBase64Char(base64Variant, i, i2, null);
    }

    public static final IllegalArgumentException reportInvalidBase64Char(Base64Variant base64Variant, int i, int i2, String str) {
        StringBuilder stringBuilder;
        if (i <= 32) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal white space character (code 0x");
            stringBuilder.append(Integer.toHexString(i));
            stringBuilder.append(") as character #");
            stringBuilder.append(i2 + 1);
            stringBuilder.append(" of 4-char base64 unit: can only used between units");
            base64Variant = stringBuilder.toString();
        } else if (base64Variant.usesPaddingChar(i)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected padding character ('");
            stringBuilder.append(base64Variant.getPaddingChar());
            stringBuilder.append("') as character #");
            stringBuilder.append(i2 + 1);
            stringBuilder.append(" of 4-char base64 unit: padding only legal as 3rd or 4th character");
            base64Variant = stringBuilder.toString();
        } else {
            if (Character.isDefined(i)) {
                if (!Character.isISOControl(i)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Illegal character '");
                    stringBuilder.append((char) i);
                    stringBuilder.append("' (code 0x");
                    stringBuilder.append(Integer.toHexString(i));
                    stringBuilder.append(") in base64 content");
                    base64Variant = stringBuilder.toString();
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal character (code 0x");
            stringBuilder.append(Integer.toHexString(i));
            stringBuilder.append(") in base64 content");
            base64Variant = stringBuilder.toString();
        }
        if (str != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(base64Variant);
            stringBuilder.append(": ");
            stringBuilder.append(str);
            base64Variant = stringBuilder.toString();
        }
        return new IllegalArgumentException(base64Variant);
    }

    public final void reportInvalidNumber(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid numeric value: ");
        stringBuilder.append(str);
        _reportError(stringBuilder.toString());
    }

    public final void reportOverflowInt() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Numeric value (");
        stringBuilder.append(getText());
        stringBuilder.append(") out of range of int (");
        stringBuilder.append(Process.WAIT_RESULT_TIMEOUT);
        stringBuilder.append(" - ");
        stringBuilder.append(Integer.MAX_VALUE);
        stringBuilder.append(")");
        _reportError(stringBuilder.toString());
    }

    public final void reportOverflowLong() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Numeric value (");
        stringBuilder.append(getText());
        stringBuilder.append(") out of range of long (");
        stringBuilder.append(Long.MIN_VALUE);
        stringBuilder.append(" - ");
        stringBuilder.append(Long.MAX_VALUE);
        stringBuilder.append(")");
        _reportError(stringBuilder.toString());
    }

    public final void reportUnexpectedNumberChar(int i, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected character (");
        stringBuilder.append(ParserMinimalBase._getCharDesc(i));
        stringBuilder.append(") in numeric value");
        String stringBuilder2 = stringBuilder.toString();
        if (str != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(stringBuilder2);
            stringBuilder.append(": ");
            stringBuilder.append(str);
            stringBuilder2 = stringBuilder.toString();
        }
        _reportError(stringBuilder2);
    }

    public final JsonToken reset(boolean z, int i, int i2, int i3) {
        if (i2 >= 1 || i3 >= 1) {
            return resetFloat(z, i, i2, i3);
        }
        return resetInt(z, i);
    }

    public final JsonToken resetAsNaN(String str, double d) {
        this._textBuffer.resetWithString(str);
        this._numberDouble = d;
        this._numTypesValid = 8;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public final JsonToken resetFloat(boolean z, int i, int i2, int i3) {
        this._numberNegative = z;
        this._intLength = i;
        this._fractLength = i2;
        this._expLength = i3;
        this._numTypesValid = 0;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public final JsonToken resetInt(boolean z, int i) {
        this._numberNegative = z;
        this._intLength = i;
        this._fractLength = 0;
        this._expLength = 0;
        this._numTypesValid = 0;
        return JsonToken.VALUE_NUMBER_INT;
    }

    public final Version version() {
        return PackageVersion.VERSION;
    }
}
