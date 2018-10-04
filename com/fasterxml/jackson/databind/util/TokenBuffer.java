package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser$NumberType;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.webrtc.audio.WebRtcAudioRecord;

public class TokenBuffer extends JsonGenerator {
    public static final int DEFAULT_PARSER_FEATURES = Feature.collectDefaults();
    public int _appendOffset;
    public boolean _closed;
    public Segment _first;
    public int _generatorFeatures = DEFAULT_PARSER_FEATURES;
    public Segment _last;
    public ObjectCodec _objectCodec;
    public JsonWriteContext _writeContext = JsonWriteContext.createRootContext();

    /* renamed from: com.fasterxml.jackson.databind.util.TokenBuffer$1 */
    public /* synthetic */ class C01571 {
        public static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType = new int[JsonParser$NumberType.values().length];
        public static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken = new int[JsonToken.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.fasterxml.jackson.core.JsonParser$NumberType.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType = r0;
            r6 = 1;
            r1 = $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0 = com.fasterxml.jackson.core.JsonParser$NumberType.INT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r0] = r6;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r5 = 2;
            r1 = $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0 = com.fasterxml.jackson.core.JsonParser$NumberType.BIG_INTEGER;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r1[r0] = r5;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r4 = 3;
            r1 = $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0 = com.fasterxml.jackson.core.JsonParser$NumberType.BIG_DECIMAL;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r1[r0] = r4;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = 4;
            r1 = $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0 = com.fasterxml.jackson.core.JsonParser$NumberType.FLOAT;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1[r0] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r2 = 5;
            r1 = $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r0 = com.fasterxml.jackson.core.JsonParser$NumberType.LONG;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1[r0] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r0 = com.fasterxml.jackson.core.JsonToken.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$fasterxml$jackson$core$JsonToken = r0;
            r1 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x0053 }
            r0 = com.fasterxml.jackson.core.JsonToken.START_OBJECT;	 Catch:{ NoSuchFieldError -> 0x0053 }
            r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0053 }
            r1[r0] = r6;	 Catch:{ NoSuchFieldError -> 0x0053 }
        L_0x0053:
            r1 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x005d }
            r0 = com.fasterxml.jackson.core.JsonToken.END_OBJECT;	 Catch:{ NoSuchFieldError -> 0x005d }
            r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x005d }
            r1[r0] = r5;	 Catch:{ NoSuchFieldError -> 0x005d }
        L_0x005d:
            r1 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x0067 }
            r0 = com.fasterxml.jackson.core.JsonToken.START_ARRAY;	 Catch:{ NoSuchFieldError -> 0x0067 }
            r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0067 }
            r1[r0] = r4;	 Catch:{ NoSuchFieldError -> 0x0067 }
        L_0x0067:
            r1 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x0071 }
            r0 = com.fasterxml.jackson.core.JsonToken.END_ARRAY;	 Catch:{ NoSuchFieldError -> 0x0071 }
            r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0071 }
            r1[r0] = r3;	 Catch:{ NoSuchFieldError -> 0x0071 }
        L_0x0071:
            r1 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x007b }
            r0 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;	 Catch:{ NoSuchFieldError -> 0x007b }
            r0 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x007b }
            r1[r0] = r2;	 Catch:{ NoSuchFieldError -> 0x007b }
        L_0x007b:
            r2 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x0086 }
            r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;	 Catch:{ NoSuchFieldError -> 0x0086 }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0086 }
            r0 = 6;	 Catch:{ NoSuchFieldError -> 0x0086 }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0086 }
        L_0x0086:
            r2 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x0091 }
            r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;	 Catch:{ NoSuchFieldError -> 0x0091 }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0091 }
            r0 = 7;	 Catch:{ NoSuchFieldError -> 0x0091 }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0091 }
        L_0x0091:
            r2 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x009d }
            r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;	 Catch:{ NoSuchFieldError -> 0x009d }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x009d }
            r0 = 8;	 Catch:{ NoSuchFieldError -> 0x009d }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x009d }
        L_0x009d:
            r2 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x00a9 }
            r0 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;	 Catch:{ NoSuchFieldError -> 0x00a9 }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x00a9 }
            r0 = 9;	 Catch:{ NoSuchFieldError -> 0x00a9 }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x00a9 }
        L_0x00a9:
            r2 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x00b5 }
            r0 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;	 Catch:{ NoSuchFieldError -> 0x00b5 }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x00b5 }
            r0 = 10;	 Catch:{ NoSuchFieldError -> 0x00b5 }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x00b5 }
        L_0x00b5:
            r2 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x00c1 }
            r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;	 Catch:{ NoSuchFieldError -> 0x00c1 }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x00c1 }
            r0 = 11;	 Catch:{ NoSuchFieldError -> 0x00c1 }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x00c1 }
        L_0x00c1:
            r2 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x00cd }
            r0 = com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT;	 Catch:{ NoSuchFieldError -> 0x00cd }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x00cd }
            r0 = 12;	 Catch:{ NoSuchFieldError -> 0x00cd }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x00cd }
        L_0x00cd:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.util.TokenBuffer.1.<clinit>():void");
        }
    }

    public final class Parser extends ParserMinimalBase {
        public transient ByteArrayBuilder _byteBuilder;
        public boolean _closed;
        public ObjectCodec _codec;
        public JsonLocation _location = null;
        public JsonReadContext _parsingContext;
        public Segment _segment;
        public int _segmentPtr;

        public int getTextOffset() {
            return 0;
        }

        public boolean hasTextCharacters() {
            return false;
        }

        public Parser(Segment segment, ObjectCodec objectCodec) {
            super(0);
            this._segment = segment;
            this._segmentPtr = -1;
            this._codec = objectCodec;
            this._parsingContext = JsonReadContext.createRootContext(-1, -1);
        }

        public final void _checkIsNumber() {
            if (this._currToken == null || !this._currToken.isNumeric()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Current token (");
                stringBuilder.append(this._currToken);
                stringBuilder.append(") not numeric, can not use numeric value accessors");
                throw _constructError(stringBuilder.toString());
            }
        }

        public final Object _currentObject() {
            return this._segment.get(this._segmentPtr);
        }

        public void _handleEOF() {
            _throwInternal();
        }

        public void close() {
            if (!this._closed) {
                this._closed = true;
            }
        }

        public BigInteger getBigIntegerValue() {
            Number numberValue = getNumberValue();
            if (numberValue instanceof BigInteger) {
                return (BigInteger) numberValue;
            }
            if (getNumberType() == JsonParser$NumberType.BIG_DECIMAL) {
                return ((BigDecimal) numberValue).toBigInteger();
            }
            return BigInteger.valueOf(numberValue.longValue());
        }

        public byte[] getBinaryValue(Base64Variant base64Variant) {
            if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object _currentObject = _currentObject();
                if (_currentObject instanceof byte[]) {
                    return (byte[]) _currentObject;
                }
            }
            if (this._currToken == JsonToken.VALUE_STRING) {
                String text = getText();
                if (text == null) {
                    return null;
                }
                ByteArrayBuilder byteArrayBuilder = this._byteBuilder;
                if (byteArrayBuilder == null) {
                    byteArrayBuilder = new ByteArrayBuilder(100);
                    this._byteBuilder = byteArrayBuilder;
                } else {
                    byteArrayBuilder.reset();
                }
                _decodeBase64(text, byteArrayBuilder, base64Variant);
                return byteArrayBuilder.toByteArray();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Current token (");
            stringBuilder.append(this._currToken);
            stringBuilder.append(") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), can not access as binary");
            throw _constructError(stringBuilder.toString());
        }

        public ObjectCodec getCodec() {
            return this._codec;
        }

        public JsonLocation getCurrentLocation() {
            JsonLocation jsonLocation = this._location;
            return jsonLocation == null ? JsonLocation.NA : jsonLocation;
        }

        public String getCurrentName() {
            return this._parsingContext.getCurrentName();
        }

        public BigDecimal getDecimalValue() {
            Number numberValue = getNumberValue();
            if (numberValue instanceof BigDecimal) {
                return (BigDecimal) numberValue;
            }
            int i = C01571.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[getNumberType().ordinal()];
            if (i != 5) {
                switch (i) {
                    case 1:
                        break;
                    case 2:
                        return new BigDecimal((BigInteger) numberValue);
                    default:
                        return BigDecimal.valueOf(numberValue.doubleValue());
                }
            }
            return BigDecimal.valueOf(numberValue.longValue());
        }

        public double getDoubleValue() {
            return getNumberValue().doubleValue();
        }

        public Object getEmbeddedObject() {
            return this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT ? _currentObject() : null;
        }

        public float getFloatValue() {
            return getNumberValue().floatValue();
        }

        public int getIntValue() {
            if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
                return ((Number) _currentObject()).intValue();
            }
            return getNumberValue().intValue();
        }

        public long getLongValue() {
            return getNumberValue().longValue();
        }

        public JsonParser$NumberType getNumberType() {
            Number numberValue = getNumberValue();
            if (!(numberValue instanceof Integer)) {
                if (numberValue instanceof Long) {
                    return JsonParser$NumberType.LONG;
                }
                if (numberValue instanceof Double) {
                    return JsonParser$NumberType.DOUBLE;
                }
                if (numberValue instanceof BigDecimal) {
                    return JsonParser$NumberType.BIG_DECIMAL;
                }
                if (numberValue instanceof BigInteger) {
                    return JsonParser$NumberType.BIG_INTEGER;
                }
                if (numberValue instanceof Float) {
                    return JsonParser$NumberType.FLOAT;
                }
                if (!(numberValue instanceof Short)) {
                    return null;
                }
            }
            return JsonParser$NumberType.INT;
        }

        public final Number getNumberValue() {
            _checkIsNumber();
            Object _currentObject = _currentObject();
            if (_currentObject instanceof Number) {
                return (Number) _currentObject;
            }
            if (_currentObject instanceof String) {
                String str = (String) _currentObject;
                if (str.indexOf(46) >= 0) {
                    return Double.valueOf(Double.parseDouble(str));
                }
                return Long.valueOf(Long.parseLong(str));
            } else if (_currentObject == null) {
                return null;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Internal error: entry should be a Number, but is of type ");
                stringBuilder.append(_currentObject.getClass().getName());
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        public JsonStreamContext getParsingContext() {
            return this._parsingContext;
        }

        public String getText() {
            String str = null;
            if (this._currToken != JsonToken.VALUE_STRING) {
                if (this._currToken != JsonToken.FIELD_NAME) {
                    if (this._currToken != null) {
                        switch (C01571.$SwitchMap$com$fasterxml$jackson$core$JsonToken[this._currToken.ordinal()]) {
                            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                            case 8:
                                Object _currentObject = _currentObject();
                                if (_currentObject != null) {
                                    str = _currentObject.toString();
                                    break;
                                }
                                break;
                            default:
                                return this._currToken.asString();
                        }
                    }
                    return str;
                }
            }
            Object _currentObject2 = _currentObject();
            if (_currentObject2 instanceof String) {
                return (String) _currentObject2;
            }
            if (_currentObject2 != null) {
                str = _currentObject2.toString();
            }
            return str;
        }

        public char[] getTextCharacters() {
            String text = getText();
            if (text == null) {
                return null;
            }
            return text.toCharArray();
        }

        public int getTextLength() {
            String text = getText();
            if (text == null) {
                return 0;
            }
            return text.length();
        }

        public JsonLocation getTokenLocation() {
            return getCurrentLocation();
        }

        public boolean isClosed() {
            return this._closed;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.fasterxml.jackson.core.JsonToken nextToken() {
            /*
            r4 = this;
            r0 = r4._closed;
            r3 = 0;
            if (r0 != 0) goto L_0x001f;
        L_0x0005:
            r2 = r4._segment;
            if (r2 != 0) goto L_0x000a;
        L_0x0009:
            goto L_0x001f;
        L_0x000a:
            r0 = r4._segmentPtr;
            r1 = r0 + 1;
            r4._segmentPtr = r1;
            r0 = 16;
            if (r1 < r0) goto L_0x0020;
        L_0x0014:
            r0 = 0;
            r4._segmentPtr = r0;
            r0 = r2.next();
            r4._segment = r0;
            if (r0 != 0) goto L_0x0020;
        L_0x001f:
            return r3;
        L_0x0020:
            r1 = r4._segment;
            r0 = r4._segmentPtr;
            r0 = r1.type(r0);
            r4._currToken = r0;
            r1 = r4._currToken;
            r0 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
            if (r1 != r0) goto L_0x0045;
        L_0x0030:
            r1 = r4._currentObject();
            r0 = r1 instanceof java.lang.String;
            if (r0 == 0) goto L_0x003b;
        L_0x0038:
            r1 = (java.lang.String) r1;
            goto L_0x003f;
        L_0x003b:
            r1 = r1.toString();
        L_0x003f:
            r0 = r4._parsingContext;
            r0.setCurrentName(r1);
            goto L_0x0080;
        L_0x0045:
            r1 = r4._currToken;
            r0 = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
            r2 = -1;
            if (r1 != r0) goto L_0x0055;
        L_0x004c:
            r0 = r4._parsingContext;
            r0 = r0.createChildObjectContext(r2, r2);
            r4._parsingContext = r0;
            goto L_0x0080;
        L_0x0055:
            r1 = r4._currToken;
            r0 = com.fasterxml.jackson.core.JsonToken.START_ARRAY;
            if (r1 != r0) goto L_0x0064;
        L_0x005b:
            r0 = r4._parsingContext;
            r0 = r0.createChildArrayContext(r2, r2);
            r4._parsingContext = r0;
            goto L_0x0080;
        L_0x0064:
            r1 = r4._currToken;
            r0 = com.fasterxml.jackson.core.JsonToken.END_OBJECT;
            if (r1 == r0) goto L_0x0070;
        L_0x006a:
            r1 = r4._currToken;
            r0 = com.fasterxml.jackson.core.JsonToken.END_ARRAY;
            if (r1 != r0) goto L_0x0080;
        L_0x0070:
            r0 = r4._parsingContext;
            r0 = r0.getParent();
            r4._parsingContext = r0;
            if (r0 != 0) goto L_0x0080;
        L_0x007a:
            r0 = com.fasterxml.jackson.core.json.JsonReadContext.createRootContext(r2, r2);
            r4._parsingContext = r0;
        L_0x0080:
            r0 = r4._currToken;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.util.TokenBuffer.Parser.nextToken():com.fasterxml.jackson.core.JsonToken");
        }

        public void overrideCurrentName(String str) {
            JsonReadContext jsonReadContext = this._parsingContext;
            if (this._currToken == JsonToken.START_OBJECT || this._currToken == JsonToken.START_ARRAY) {
                jsonReadContext = jsonReadContext.getParent();
            }
            jsonReadContext.setCurrentName(str);
        }

        public JsonToken peekNextToken() {
            if (this._closed) {
                return null;
            }
            Segment segment = this._segment;
            int i = this._segmentPtr + 1;
            if (i >= 16) {
                i = 0;
                if (segment == null) {
                    segment = null;
                } else {
                    segment = segment.next();
                }
            }
            if (segment == null) {
                return null;
            }
            return segment.type(i);
        }

        public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) {
            base64Variant = getBinaryValue(base64Variant);
            if (base64Variant == null) {
                return 0;
            }
            outputStream.write(base64Variant, 0, base64Variant.length);
            return base64Variant.length;
        }

        public void setCodec(ObjectCodec objectCodec) {
            this._codec = objectCodec;
        }

        public void setLocation(JsonLocation jsonLocation) {
            this._location = jsonLocation;
        }

        public Version version() {
            return PackageVersion.VERSION;
        }
    }

    public final class Segment {
        public static final int TOKENS_PER_SEGMENT = 16;
        private static final JsonToken[] TOKEN_TYPES_BY_INDEX = new JsonToken[16];
        public Segment _next;
        public long _tokenTypes;
        public final Object[] _tokens = new Object[16];

        static {
            Object values = JsonToken.values();
            System.arraycopy(values, 1, TOKEN_TYPES_BY_INDEX, 1, Math.min(15, values.length - 1));
        }

        public Segment append(int i, JsonToken jsonToken) {
            if (i < 16) {
                set(i, jsonToken);
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment.set(0, jsonToken);
            return this._next;
        }

        public Segment append(int i, JsonToken jsonToken, Object obj) {
            if (i < 16) {
                set(i, jsonToken, obj);
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment.set(0, jsonToken, obj);
            return this._next;
        }

        public Segment appendRaw(int i, int i2, Object obj) {
            if (i < 16) {
                set(i, i2, obj);
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment.set(0, i2, obj);
            return this._next;
        }

        public Object get(int i) {
            return this._tokens[i];
        }

        public Segment next() {
            return this._next;
        }

        public int rawType(int i) {
            long j = this._tokenTypes;
            if (i > 0) {
                j >>= i << 2;
            }
            return ((int) j) & 15;
        }

        private void set(int i, int i2, Object obj) {
            this._tokens[i] = obj;
            long j = (long) i2;
            if (i > 0) {
                j <<= i << 2;
            }
            this._tokenTypes = j | this._tokenTypes;
        }

        public void set(int i, JsonToken jsonToken) {
            long ordinal = (long) jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this._tokenTypes |= ordinal;
        }

        public void set(int i, JsonToken jsonToken, Object obj) {
            this._tokens[i] = obj;
            long ordinal = (long) jsonToken.ordinal();
            if (i > 0) {
                ordinal <<= i << 2;
            }
            this._tokenTypes = ordinal | this._tokenTypes;
        }

        public JsonToken type(int i) {
            long j = this._tokenTypes;
            if (i > 0) {
                j >>= i << 2;
            }
            return TOKEN_TYPES_BY_INDEX[((int) j) & 15];
        }
    }

    public void flush() {
    }

    public JsonGenerator useDefaultPrettyPrinter() {
        return this;
    }

    public TokenBuffer(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
        Segment segment = new Segment();
        this._last = segment;
        this._first = segment;
        this._appendOffset = 0;
    }

    public final void _append(JsonToken jsonToken) {
        Segment append = this._last.append(this._appendOffset, jsonToken);
        if (append == null) {
            this._appendOffset++;
            return;
        }
        this._last = append;
        this._appendOffset = 1;
    }

    public final void _append(JsonToken jsonToken, Object obj) {
        Segment append = this._last.append(this._appendOffset, jsonToken, obj);
        if (append == null) {
            this._appendOffset++;
            return;
        }
        this._last = append;
        this._appendOffset = 1;
    }

    public final void _appendRaw(int i, Object obj) {
        Segment appendRaw = this._last.appendRaw(this._appendOffset, i, obj);
        if (appendRaw == null) {
            this._appendOffset++;
            return;
        }
        this._last = appendRaw;
        this._appendOffset = 1;
    }

    public void _reportUnsupportedOperation() {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    public TokenBuffer append(TokenBuffer tokenBuffer) {
        JsonParser asParser = tokenBuffer.asParser();
        while (asParser.nextToken() != null) {
            copyCurrentEvent(asParser);
        }
        return this;
    }

    public JsonParser asParser() {
        return asParser(this._objectCodec);
    }

    public JsonParser asParser(JsonParser jsonParser) {
        JsonParser parser = new Parser(this._first, jsonParser.getCodec());
        parser.setLocation(jsonParser.getTokenLocation());
        return parser;
    }

    public JsonParser asParser(ObjectCodec objectCodec) {
        return new Parser(this._first, objectCodec);
    }

    public void close() {
        this._closed = true;
    }

    public void copyCurrentEvent(JsonParser jsonParser) {
        switch (C01571.$SwitchMap$com$fasterxml$jackson$core$JsonToken[jsonParser.getCurrentToken().ordinal()]) {
            case 1:
                writeStartObject();
                return;
            case 2:
                writeEndObject();
                return;
            case 3:
                writeStartArray();
                return;
            case 4:
                writeEndArray();
                return;
            case 5:
                writeFieldName(jsonParser.getCurrentName());
                return;
            case 6:
                if (jsonParser.hasTextCharacters()) {
                    writeString(jsonParser.getTextCharacters(), jsonParser.getTextOffset(), jsonParser.getTextLength());
                    return;
                } else {
                    writeString(jsonParser.getText());
                    return;
                }
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                switch (jsonParser.getNumberType().ordinal()) {
                    case 0:
                        writeNumber(jsonParser.getIntValue());
                        return;
                    case 2:
                        writeNumber(jsonParser.getBigIntegerValue());
                        return;
                    default:
                        writeNumber(jsonParser.getLongValue());
                        return;
                }
            case 8:
                switch (jsonParser.getNumberType().ordinal()) {
                    case 3:
                        writeNumber(jsonParser.getFloatValue());
                        return;
                    case 5:
                        writeNumber(jsonParser.getDecimalValue());
                        return;
                    default:
                        writeNumber(jsonParser.getDoubleValue());
                        return;
                }
            case 9:
                writeBoolean(true);
                return;
            case 10:
                writeBoolean(false);
                return;
            case 11:
                writeNull();
                return;
            case 12:
                writeObject(jsonParser.getEmbeddedObject());
                return;
            default:
                throw new RuntimeException("Internal error: should never end up through this code path");
        }
    }

    public void copyCurrentStructure(JsonParser jsonParser) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.FIELD_NAME) {
            writeFieldName(jsonParser.getCurrentName());
            currentToken = jsonParser.nextToken();
        }
        int i = C01571.$SwitchMap$com$fasterxml$jackson$core$JsonToken[currentToken.ordinal()];
        if (i == 1) {
            writeStartObject();
            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                copyCurrentStructure(jsonParser);
            }
            writeEndObject();
        } else if (i != 3) {
            copyCurrentEvent(jsonParser);
        } else {
            writeStartArray();
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                copyCurrentStructure(jsonParser);
            }
            writeEndArray();
        }
    }

    public JsonGenerator disable(JsonGenerator.Feature feature) {
        this._generatorFeatures = (feature.getMask() ^ -1) & this._generatorFeatures;
        return this;
    }

    public JsonGenerator enable(JsonGenerator.Feature feature) {
        this._generatorFeatures = feature.getMask() | this._generatorFeatures;
        return this;
    }

    public JsonToken firstToken() {
        Segment segment = this._first;
        return segment != null ? segment.type(0) : null;
    }

    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    public final JsonWriteContext getOutputContext() {
        return this._writeContext;
    }

    public boolean isClosed() {
        return this._closed;
    }

    public boolean isEnabled(JsonGenerator.Feature feature) {
        return (feature.getMask() & this._generatorFeatures) != 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void serialize(com.fasterxml.jackson.core.JsonGenerator r6) {
        /*
        r5 = this;
        r3 = r5._first;
        r2 = -1;
    L_0x0003:
        r5 = 1;
        r2 = r2 + r5;
        r0 = 16;
        r4 = 0;
        if (r2 < r0) goto L_0x0012;
    L_0x000a:
        r3 = r3.next();
        if (r3 != 0) goto L_0x0011;
    L_0x0010:
        goto L_0x0018;
    L_0x0011:
        r2 = 0;
    L_0x0012:
        r0 = r3.type(r2);
        if (r0 != 0) goto L_0x0019;
    L_0x0018:
        return;
    L_0x0019:
        r1 = com.fasterxml.jackson.databind.util.TokenBuffer.C01571.$SwitchMap$com$fasterxml$jackson$core$JsonToken;
        r0 = r0.ordinal();
        r0 = r1[r0];
        switch(r0) {
            case 1: goto L_0x011d;
            case 2: goto L_0x0118;
            case 3: goto L_0x0113;
            case 4: goto L_0x010e;
            case 5: goto L_0x00f8;
            case 6: goto L_0x00e2;
            case 7: goto L_0x009b;
            case 8: goto L_0x0040;
            case 9: goto L_0x003c;
            case 10: goto L_0x0038;
            case 11: goto L_0x0034;
            case 12: goto L_0x002c;
            default: goto L_0x0024;
        };
    L_0x0024:
        r1 = new java.lang.RuntimeException;
        r0 = "Internal error: should never end up through this code path";
        r1.<init>(r0);
        throw r1;
    L_0x002c:
        r0 = r3.get(r2);
        r6.writeObject(r0);
        goto L_0x0003;
    L_0x0034:
        r6.writeNull();
        goto L_0x0003;
    L_0x0038:
        r6.writeBoolean(r4);
        goto L_0x0003;
    L_0x003c:
        r6.writeBoolean(r5);
        goto L_0x0003;
    L_0x0040:
        r4 = r3.get(r2);
        r0 = r4 instanceof java.lang.Double;
        if (r0 == 0) goto L_0x0052;
    L_0x0048:
        r4 = (java.lang.Double) r4;
        r0 = r4.doubleValue();
        r6.writeNumber(r0);
        goto L_0x0003;
    L_0x0052:
        r0 = r4 instanceof java.math.BigDecimal;
        if (r0 == 0) goto L_0x005c;
    L_0x0056:
        r4 = (java.math.BigDecimal) r4;
        r6.writeNumber(r4);
        goto L_0x0003;
    L_0x005c:
        r0 = r4 instanceof java.lang.Float;
        if (r0 == 0) goto L_0x006a;
    L_0x0060:
        r4 = (java.lang.Float) r4;
        r0 = r4.floatValue();
        r6.writeNumber(r0);
        goto L_0x0003;
    L_0x006a:
        if (r4 != 0) goto L_0x006d;
    L_0x006c:
        goto L_0x0034;
    L_0x006d:
        r0 = r4 instanceof java.lang.String;
        if (r0 == 0) goto L_0x0077;
    L_0x0071:
        r4 = (java.lang.String) r4;
        r6.writeNumber(r4);
        goto L_0x0003;
    L_0x0077:
        r2 = new com.fasterxml.jackson.core.JsonGenerationException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = "Unrecognized value type for VALUE_NUMBER_FLOAT: ";
        r1.append(r0);
        r0 = r4.getClass();
        r0 = r0.getName();
        r1.append(r0);
        r0 = ", can not serialize";
        r1.append(r0);
        r0 = r1.toString();
        r2.<init>(r0);
        throw r2;
    L_0x009b:
        r1 = r3.get(r2);
        r0 = r1 instanceof java.lang.Integer;
        if (r0 == 0) goto L_0x00ae;
    L_0x00a3:
        r1 = (java.lang.Integer) r1;
        r0 = r1.intValue();
        r6.writeNumber(r0);
        goto L_0x0003;
    L_0x00ae:
        r0 = r1 instanceof java.math.BigInteger;
        if (r0 == 0) goto L_0x00b9;
    L_0x00b2:
        r1 = (java.math.BigInteger) r1;
        r6.writeNumber(r1);
        goto L_0x0003;
    L_0x00b9:
        r0 = r1 instanceof java.lang.Long;
        if (r0 == 0) goto L_0x00c8;
    L_0x00bd:
        r1 = (java.lang.Long) r1;
        r0 = r1.longValue();
        r6.writeNumber(r0);
        goto L_0x0003;
    L_0x00c8:
        r0 = r1 instanceof java.lang.Short;
        if (r0 == 0) goto L_0x00d7;
    L_0x00cc:
        r1 = (java.lang.Short) r1;
        r0 = r1.shortValue();
        r6.writeNumber(r0);
        goto L_0x0003;
    L_0x00d7:
        r1 = (java.lang.Number) r1;
        r0 = r1.intValue();
        r6.writeNumber(r0);
        goto L_0x0003;
    L_0x00e2:
        r1 = r3.get(r2);
        r0 = r1 instanceof com.fasterxml.jackson.core.SerializableString;
        if (r0 == 0) goto L_0x00f1;
    L_0x00ea:
        r1 = (com.fasterxml.jackson.core.SerializableString) r1;
        r6.writeString(r1);
        goto L_0x0003;
    L_0x00f1:
        r1 = (java.lang.String) r1;
        r6.writeString(r1);
        goto L_0x0003;
    L_0x00f8:
        r1 = r3.get(r2);
        r0 = r1 instanceof com.fasterxml.jackson.core.SerializableString;
        if (r0 == 0) goto L_0x0107;
    L_0x0100:
        r1 = (com.fasterxml.jackson.core.SerializableString) r1;
        r6.writeFieldName(r1);
        goto L_0x0003;
    L_0x0107:
        r1 = (java.lang.String) r1;
        r6.writeFieldName(r1);
        goto L_0x0003;
    L_0x010e:
        r6.writeEndArray();
        goto L_0x0003;
    L_0x0113:
        r6.writeStartArray();
        goto L_0x0003;
    L_0x0118:
        r6.writeEndObject();
        goto L_0x0003;
    L_0x011d:
        r6.writeStartObject();
        goto L_0x0003;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.util.TokenBuffer.serialize(com.fasterxml.jackson.core.JsonGenerator):void");
    }

    public JsonGenerator setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[TokenBuffer: ");
        JsonParser asParser = asParser();
        int i = 0;
        while (true) {
            JsonToken nextToken = asParser.nextToken();
            if (nextToken == null) {
                break;
            }
            if (i < 100) {
                if (i > 0) {
                    try {
                        stringBuilder.append(", ");
                    } catch (Throwable e) {
                        throw new IllegalStateException(e);
                    }
                }
                stringBuilder.append(nextToken.toString());
                if (nextToken == JsonToken.FIELD_NAME) {
                    stringBuilder.append('(');
                    stringBuilder.append(asParser.getCurrentName());
                    stringBuilder.append(')');
                }
            }
            i++;
        }
        if (i >= 100) {
            stringBuilder.append(" ... (truncated ");
            stringBuilder.append(i - 100);
            stringBuilder.append(" entries)");
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public Version version() {
        return PackageVersion.VERSION;
    }

    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i) {
        throw new UnsupportedOperationException();
    }

    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) {
        Object obj = new byte[i2];
        System.arraycopy(bArr, i, obj, 0, i2);
        writeObject(obj);
    }

    public void writeBoolean(boolean z) {
        _append(z ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE);
    }

    public final void writeEndArray() {
        _append(JsonToken.END_ARRAY);
        JsonWriteContext parent = this._writeContext.getParent();
        if (parent != null) {
            this._writeContext = parent;
        }
    }

    public final void writeEndObject() {
        _append(JsonToken.END_OBJECT);
        JsonWriteContext parent = this._writeContext.getParent();
        if (parent != null) {
            this._writeContext = parent;
        }
    }

    public void writeFieldName(SerializableString serializableString) {
        _append(JsonToken.FIELD_NAME, serializableString);
        this._writeContext.writeFieldName(serializableString.getValue());
    }

    public final void writeFieldName(String str) {
        _append(JsonToken.FIELD_NAME, str);
        this._writeContext.writeFieldName(str);
    }

    public void writeNull() {
        _append(JsonToken.VALUE_NULL);
    }

    public void writeNumber(double d) {
        _append(JsonToken.VALUE_NUMBER_FLOAT, Double.valueOf(d));
    }

    public void writeNumber(float f) {
        _append(JsonToken.VALUE_NUMBER_FLOAT, Float.valueOf(f));
    }

    public void writeNumber(int i) {
        _append(JsonToken.VALUE_NUMBER_INT, Integer.valueOf(i));
    }

    public void writeNumber(long j) {
        _append(JsonToken.VALUE_NUMBER_INT, Long.valueOf(j));
    }

    public void writeNumber(String str) {
        _append(JsonToken.VALUE_NUMBER_FLOAT, str);
    }

    public void writeNumber(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            writeNull();
        } else {
            _append(JsonToken.VALUE_NUMBER_FLOAT, bigDecimal);
        }
    }

    public void writeNumber(BigInteger bigInteger) {
        if (bigInteger == null) {
            writeNull();
        } else {
            _append(JsonToken.VALUE_NUMBER_INT, bigInteger);
        }
    }

    public void writeNumber(short s) {
        _append(JsonToken.VALUE_NUMBER_INT, Short.valueOf(s));
    }

    public void writeObject(Object obj) {
        _append(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
    }

    public void writeRaw(char c) {
        _reportUnsupportedOperation();
    }

    public void writeRaw(SerializableString serializableString) {
        _reportUnsupportedOperation();
    }

    public void writeRaw(String str) {
        _reportUnsupportedOperation();
    }

    public void writeRaw(String str, int i, int i2) {
        _reportUnsupportedOperation();
    }

    public void writeRaw(char[] cArr, int i, int i2) {
        _reportUnsupportedOperation();
    }

    public void writeRawUTF8String(byte[] bArr, int i, int i2) {
        _reportUnsupportedOperation();
    }

    public void writeRawValue(String str) {
        _reportUnsupportedOperation();
    }

    public void writeRawValue(String str, int i, int i2) {
        _reportUnsupportedOperation();
    }

    public void writeRawValue(char[] cArr, int i, int i2) {
        _reportUnsupportedOperation();
    }

    public final void writeStartArray() {
        _append(JsonToken.START_ARRAY);
        this._writeContext = this._writeContext.createChildArrayContext();
    }

    public final void writeStartObject() {
        _append(JsonToken.START_OBJECT);
        this._writeContext = this._writeContext.createChildObjectContext();
    }

    public void writeString(SerializableString serializableString) {
        if (serializableString == null) {
            writeNull();
        } else {
            _append(JsonToken.VALUE_STRING, serializableString);
        }
    }

    public void writeString(String str) {
        if (str == null) {
            writeNull();
        } else {
            _append(JsonToken.VALUE_STRING, str);
        }
    }

    public void writeString(char[] cArr, int i, int i2) {
        writeString(new String(cArr, i, i2));
    }

    public void writeTree(TreeNode treeNode) {
        _append(JsonToken.VALUE_EMBEDDED_OBJECT, treeNode);
    }

    public void writeUTF8String(byte[] bArr, int i, int i2) {
        _reportUnsupportedOperation();
    }
}
