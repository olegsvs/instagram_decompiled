package com.fasterxml.jackson.core.base;

import com.facebook.common.dextricks.StartupQEsConfig;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.VersionUtil;
import org.webrtc.audio.WebRtcAudioRecord;

public abstract class ParserMinimalBase extends JsonParser {
    public static final int INT_APOSTROPHE = 39;
    public static final int INT_ASTERISK = 42;
    public static final int INT_BACKSLASH = 92;
    public static final int INT_COLON = 58;
    public static final int INT_COMMA = 44;
    public static final int INT_CR = 13;
    public static final int INT_LBRACKET = 91;
    public static final int INT_LCURLY = 123;
    public static final int INT_LF = 10;
    public static final int INT_QUOTE = 34;
    public static final int INT_RBRACKET = 93;
    public static final int INT_RCURLY = 125;
    public static final int INT_SLASH = 47;
    public static final int INT_SPACE = 32;
    public static final int INT_TAB = 9;
    public static final int INT_b = 98;
    public static final int INT_f = 102;
    public static final int INT_n = 110;
    public static final int INT_r = 114;
    public static final int INT_t = 116;
    public static final int INT_u = 117;
    public JsonToken _currToken;
    public JsonToken _lastClearedToken;

    public abstract void _handleEOF();

    public abstract void close();

    public abstract byte[] getBinaryValue(Base64Variant base64Variant);

    public abstract String getCurrentName();

    public abstract JsonStreamContext getParsingContext();

    public abstract String getText();

    public abstract char[] getTextCharacters();

    public abstract int getTextLength();

    public abstract int getTextOffset();

    public abstract boolean hasTextCharacters();

    public abstract boolean isClosed();

    public abstract JsonToken nextToken();

    public abstract void overrideCurrentName(String str);

    public ParserMinimalBase(int i) {
        super(i);
    }

    public final JsonParseException _constructError(String str, Throwable th) {
        return new JsonParseException(str, getCurrentLocation(), th);
    }

    public void _decodeBase64(String str, ByteArrayBuilder byteArrayBuilder, Base64Variant base64Variant) {
        try {
            base64Variant.decode(str, byteArrayBuilder);
        } catch (IllegalArgumentException e) {
            _reportError(e.getMessage());
        }
    }

    public static final String _getCharDesc(int i) {
        char c = (char) i;
        StringBuilder stringBuilder;
        if (Character.isISOControl(c)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("(CTRL-CHAR, code ");
            stringBuilder.append(i);
            stringBuilder.append(")");
            return stringBuilder.toString();
        } else if (i > 255) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("'");
            stringBuilder.append(c);
            stringBuilder.append("' (code ");
            stringBuilder.append(i);
            stringBuilder.append(" / 0x");
            stringBuilder.append(Integer.toHexString(i));
            stringBuilder.append(")");
            return stringBuilder.toString();
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("'");
            stringBuilder.append(c);
            stringBuilder.append("' (code ");
            stringBuilder.append(i);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    public char _handleUnrecognizedCharacterEscape(char c) {
        if (!isEnabled(Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER)) {
            if (c != '\'' || !isEnabled(Feature.ALLOW_SINGLE_QUOTES)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unrecognized character escape ");
                stringBuilder.append(_getCharDesc(c));
                _reportError(stringBuilder.toString());
                return c;
            }
        }
        return c;
    }

    public void _reportBase64EOF() {
        throw _constructError("Unexpected end-of-String in base64 content");
    }

    public final void _reportError(String str) {
        throw _constructError(str);
    }

    public void _reportInvalidBase64(Base64Variant base64Variant, char c, int i, String str) {
        StringBuilder stringBuilder;
        String stringBuilder2;
        if (c <= ' ') {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal white space character (code 0x");
            stringBuilder.append(Integer.toHexString(c));
            stringBuilder.append(") as character #");
            stringBuilder.append(i + 1);
            stringBuilder.append(" of 4-char base64 unit: can only used between units");
            stringBuilder2 = stringBuilder.toString();
        } else if (base64Variant.usesPaddingChar(c)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected padding character ('");
            stringBuilder.append(base64Variant.getPaddingChar());
            stringBuilder.append("') as character #");
            stringBuilder.append(i + 1);
            stringBuilder.append(" of 4-char base64 unit: padding only legal as 3rd or 4th character");
            stringBuilder2 = stringBuilder.toString();
        } else {
            if (Character.isDefined(c)) {
                if (!Character.isISOControl(c)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Illegal character '");
                    stringBuilder.append(c);
                    stringBuilder.append("' (code 0x");
                    stringBuilder.append(Integer.toHexString(c));
                    stringBuilder.append(") in base64 content");
                    stringBuilder2 = stringBuilder.toString();
                }
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal character (code 0x");
            stringBuilder.append(Integer.toHexString(c));
            stringBuilder.append(") in base64 content");
            stringBuilder2 = stringBuilder.toString();
        }
        if (str != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(stringBuilder2);
            stringBuilder.append(": ");
            stringBuilder.append(str);
            stringBuilder2 = stringBuilder.toString();
        }
        throw _constructError(stringBuilder2);
    }

    public void _reportInvalidEOF() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" in ");
        stringBuilder.append(this._currToken);
        _reportInvalidEOF(stringBuilder.toString());
    }

    public void _reportInvalidEOF(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected end-of-input");
        stringBuilder.append(str);
        _reportError(stringBuilder.toString());
    }

    public void _reportInvalidEOFInValue() {
        _reportInvalidEOF(" in a value");
    }

    public void _reportUnexpectedChar(int i, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected character (");
        stringBuilder.append(_getCharDesc(i));
        stringBuilder.append(")");
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

    public final void _throwInternal() {
        VersionUtil.throwInternal();
    }

    public void _throwInvalidSpace(int i) {
        char c = (char) i;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Illegal character (");
        stringBuilder.append(_getCharDesc(c));
        stringBuilder.append("): only regular white space (\\r, \\n, \\t) is allowed between tokens");
        _reportError(stringBuilder.toString());
    }

    public void _throwUnquotedSpace(int i, String str) {
        if (!isEnabled(Feature.ALLOW_UNQUOTED_CONTROL_CHARS) || i >= 32) {
            char c = (char) i;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal unquoted character (");
            stringBuilder.append(_getCharDesc(c));
            stringBuilder.append("): has to be escaped using backslash to be included in ");
            stringBuilder.append(str);
            _reportError(stringBuilder.toString());
        }
    }

    public final void _wrapError(String str, Throwable th) {
        throw _constructError(str, th);
    }

    public void clearCurrentToken() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != null) {
            this._lastClearedToken = jsonToken;
            this._currToken = null;
        }
    }

    public JsonToken getCurrentToken() {
        return this._currToken;
    }

    public JsonToken getLastClearedToken() {
        return this._lastClearedToken;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean getValueAsBoolean(boolean r4) {
        /*
        r3 = this;
        r0 = r3._currToken;
        if (r0 == 0) goto L_0x003d;
    L_0x0004:
        r1 = com.fasterxml.jackson.core.base.ParserMinimalBase.C00391.$SwitchMap$com$fasterxml$jackson$core$JsonToken;
        r0 = r3._currToken;
        r0 = r0.ordinal();
        r0 = r1[r0];
        r1 = 0;
        r2 = 1;
        switch(r0) {
            case 5: goto L_0x0035;
            case 6: goto L_0x0033;
            case 7: goto L_0x0034;
            case 8: goto L_0x0034;
            case 9: goto L_0x0014;
            case 10: goto L_0x0023;
            default: goto L_0x0013;
        };
    L_0x0013:
        goto L_0x003d;
    L_0x0014:
        r1 = r3.getEmbeddedObject();
        r0 = r1 instanceof java.lang.Boolean;
        if (r0 == 0) goto L_0x0023;
    L_0x001c:
        r1 = (java.lang.Boolean) r1;
        r0 = r1.booleanValue();
        return r0;
    L_0x0023:
        r0 = r3.getText();
        r1 = r0.trim();
        r0 = "true";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x003d;
    L_0x0033:
        return r2;
    L_0x0034:
        return r1;
    L_0x0035:
        r0 = r3.getIntValue();
        if (r0 == 0) goto L_0x0034;
    L_0x003b:
        r1 = 1;
        goto L_0x0034;
    L_0x003d:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.base.ParserMinimalBase.getValueAsBoolean(boolean):boolean");
    }

    public double getValueAsDouble(double d) {
        if (this._currToken != null) {
            switch (C00391.$SwitchMap$com$fasterxml$jackson$core$JsonToken[this._currToken.ordinal()]) {
                case 5:
                case 11:
                    return getDoubleValue();
                case 6:
                    return 1.0d;
                case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                case 8:
                    return StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED;
                case 9:
                    Object embeddedObject = getEmbeddedObject();
                    if (embeddedObject instanceof Number) {
                        return ((Number) embeddedObject).doubleValue();
                    }
                    break;
                case 10:
                    return NumberInput.parseAsDouble(getText(), d);
                default:
                    break;
            }
        }
        return d;
    }

    public int getValueAsInt(int i) {
        if (this._currToken != null) {
            switch (C00391.$SwitchMap$com$fasterxml$jackson$core$JsonToken[this._currToken.ordinal()]) {
                case 5:
                case 11:
                    return getIntValue();
                case 6:
                    return 1;
                case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                case 8:
                    return 0;
                case 9:
                    Object embeddedObject = getEmbeddedObject();
                    if (embeddedObject instanceof Number) {
                        return ((Number) embeddedObject).intValue();
                    }
                    break;
                case 10:
                    return NumberInput.parseAsInt(getText(), i);
                default:
                    break;
            }
        }
        return i;
    }

    public long getValueAsLong(long j) {
        if (this._currToken != null) {
            switch (C00391.$SwitchMap$com$fasterxml$jackson$core$JsonToken[this._currToken.ordinal()]) {
                case 5:
                case 11:
                    return getLongValue();
                case 6:
                    return 1;
                case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                case 8:
                    return 0;
                case 9:
                    Object embeddedObject = getEmbeddedObject();
                    if (embeddedObject instanceof Number) {
                        return ((Number) embeddedObject).longValue();
                    }
                    break;
                case 10:
                    return NumberInput.parseAsLong(getText(), j);
                default:
                    break;
            }
        }
        return j;
    }

    public String getValueAsString(String str) {
        if (this._currToken != JsonToken.VALUE_STRING) {
            JsonToken jsonToken = this._currToken;
            if (jsonToken == null || jsonToken == JsonToken.VALUE_NULL || !this._currToken.isScalarValue()) {
                return str;
            }
        }
        return getText();
    }

    public boolean hasCurrentToken() {
        return this._currToken != null;
    }

    public JsonToken nextValue() {
        JsonToken nextToken = nextToken();
        return nextToken == JsonToken.FIELD_NAME ? nextToken() : nextToken;
    }

    public JsonParser skipChildren() {
        if (this._currToken == JsonToken.START_OBJECT || this._currToken == JsonToken.START_ARRAY) {
            int i = 1;
            while (true) {
                JsonToken nextToken = nextToken();
                if (nextToken == null) {
                    _handleEOF();
                    return this;
                }
                switch (nextToken) {
                    case START_OBJECT:
                    case START_ARRAY:
                        i++;
                        continue;
                    case END_OBJECT:
                    case END_ARRAY:
                        i--;
                        if (i == 0) {
                            break;
                        }
                        continue;
                    default:
                        continue;
                }
            }
        }
        return this;
    }

    public Version version() {
        return VersionUtil.versionFor(getClass());
    }
}
