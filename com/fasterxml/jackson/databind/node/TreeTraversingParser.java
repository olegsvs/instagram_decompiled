package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser$NumberType;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class TreeTraversingParser extends ParserMinimalBase {
    public boolean _closed;
    public JsonToken _nextToken;
    public NodeCursor _nodeCursor;
    public ObjectCodec _objectCodec;
    public boolean _startContainer;

    /* renamed from: com.fasterxml.jackson.databind.node.TreeTraversingParser$1 */
    public /* synthetic */ class C01541 {
        public static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken = new int[JsonToken.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.fasterxml.jackson.core.JsonToken.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$fasterxml$jackson$core$JsonToken = r0;
            r2 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r2 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r0 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r0 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r2 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r2 = $SwitchMap$com$fasterxml$jackson$core$JsonToken;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r0 = com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r0.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r0 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.node.TreeTraversingParser.1.<clinit>():void");
        }
    }

    public int getTextOffset() {
        return 0;
    }

    public boolean hasTextCharacters() {
        return false;
    }

    public TreeTraversingParser(JsonNode jsonNode) {
        this(jsonNode, null);
    }

    public TreeTraversingParser(JsonNode jsonNode, ObjectCodec objectCodec) {
        super(0);
        this._objectCodec = objectCodec;
        if (jsonNode.isArray()) {
            this._nextToken = JsonToken.START_ARRAY;
            this._nodeCursor = new NodeCursor$Array(jsonNode, null);
        } else if (jsonNode.isObject()) {
            this._nextToken = JsonToken.START_OBJECT;
            this._nodeCursor = new NodeCursor$Object(jsonNode, null);
        } else {
            this._nodeCursor = new NodeCursor$RootValue(jsonNode, null);
        }
    }

    public void _handleEOF() {
        _throwInternal();
    }

    public void close() {
        if (!this._closed) {
            this._closed = true;
            this._nodeCursor = null;
            this._currToken = null;
        }
    }

    public JsonNode currentNode() {
        if (!this._closed) {
            NodeCursor nodeCursor = this._nodeCursor;
            if (nodeCursor != null) {
                return nodeCursor.currentNode();
            }
        }
        return null;
    }

    public JsonNode currentNumericNode() {
        Object obj;
        JsonNode currentNode = currentNode();
        if (currentNode != null) {
            if (currentNode.isNumber()) {
                return currentNode;
            }
        }
        if (currentNode == null) {
            obj = null;
        } else {
            obj = currentNode.asToken();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Current token (");
        stringBuilder.append(obj);
        stringBuilder.append(") not numeric, can not use numeric value accessors");
        throw _constructError(stringBuilder.toString());
    }

    public BigInteger getBigIntegerValue() {
        return currentNumericNode().bigIntegerValue();
    }

    public byte[] getBinaryValue(Base64Variant base64Variant) {
        base64Variant = currentNode();
        if (base64Variant != null) {
            byte[] binaryValue = base64Variant.binaryValue();
            if (binaryValue != null) {
                return binaryValue;
            }
            if (base64Variant.isPojo()) {
                base64Variant = ((POJONode) base64Variant).getPojo();
                if (base64Variant instanceof byte[]) {
                    return (byte[]) base64Variant;
                }
            }
        }
        return null;
    }

    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    public JsonLocation getCurrentLocation() {
        return JsonLocation.NA;
    }

    public String getCurrentName() {
        NodeCursor nodeCursor = this._nodeCursor;
        return nodeCursor == null ? null : nodeCursor.getCurrentName();
    }

    public BigDecimal getDecimalValue() {
        return currentNumericNode().decimalValue();
    }

    public double getDoubleValue() {
        return currentNumericNode().doubleValue();
    }

    public Object getEmbeddedObject() {
        if (!this._closed) {
            JsonNode currentNode = currentNode();
            if (currentNode != null) {
                if (currentNode.isPojo()) {
                    return ((POJONode) currentNode).getPojo();
                }
                if (currentNode.isBinary()) {
                    return ((BinaryNode) currentNode).binaryValue();
                }
            }
        }
        return null;
    }

    public float getFloatValue() {
        return (float) currentNumericNode().doubleValue();
    }

    public int getIntValue() {
        return currentNumericNode().intValue();
    }

    public long getLongValue() {
        return currentNumericNode().longValue();
    }

    public JsonParser$NumberType getNumberType() {
        JsonNode currentNumericNode = currentNumericNode();
        if (currentNumericNode == null) {
            return null;
        }
        return currentNumericNode.numberType();
    }

    public Number getNumberValue() {
        return currentNumericNode().numberValue();
    }

    public JsonStreamContext getParsingContext() {
        return this._nodeCursor;
    }

    public String getText() {
        String str = null;
        if (!this._closed) {
            switch (C01541.$SwitchMap$com$fasterxml$jackson$core$JsonToken[this._currToken.ordinal()]) {
                case 1:
                    return this._nodeCursor.getCurrentName();
                case 2:
                    return currentNode().textValue();
                case 3:
                case 4:
                    return String.valueOf(currentNode().numberValue());
                case 5:
                    JsonNode currentNode = currentNode();
                    if (currentNode != null && currentNode.isBinary()) {
                        return currentNode.asText();
                    }
                default:
                    break;
            }
            if (this._currToken != null) {
                str = this._currToken.asString();
            }
        }
        return str;
    }

    public char[] getTextCharacters() {
        return getText().toCharArray();
    }

    public int getTextLength() {
        return getText().length();
    }

    public JsonLocation getTokenLocation() {
        return JsonLocation.NA;
    }

    public boolean isClosed() {
        return this._closed;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.JsonToken nextToken() {
        /*
        r3 = this;
        r0 = r3._nextToken;
        r1 = 0;
        if (r0 == 0) goto L_0x000c;
    L_0x0005:
        r3._currToken = r0;
        r3._nextToken = r1;
        r0 = r3._currToken;
        return r0;
    L_0x000c:
        r0 = r3._startContainer;
        r2 = 1;
        if (r0 == 0) goto L_0x004b;
    L_0x0011:
        r0 = 0;
        r3._startContainer = r0;
        r0 = r3._nodeCursor;
        r0 = r0.currentHasChildren();
        if (r0 != 0) goto L_0x002c;
    L_0x001c:
        r1 = r3._currToken;
        r0 = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
        if (r1 != r0) goto L_0x0025;
    L_0x0022:
        r0 = com.fasterxml.jackson.core.JsonToken.END_OBJECT;
        goto L_0x0027;
    L_0x0025:
        r0 = com.fasterxml.jackson.core.JsonToken.END_ARRAY;
    L_0x0027:
        r3._currToken = r0;
        r0 = r3._currToken;
        return r0;
    L_0x002c:
        r0 = r3._nodeCursor;
        r0 = r0.iterateChildren();
        r3._nodeCursor = r0;
        r0 = r0.nextToken();
        r3._currToken = r0;
        r1 = r3._currToken;
        r0 = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
        if (r1 == r0) goto L_0x0046;
    L_0x0040:
        r1 = r3._currToken;
        r0 = com.fasterxml.jackson.core.JsonToken.START_ARRAY;
        if (r1 != r0) goto L_0x0048;
    L_0x0046:
        r3._startContainer = r2;
    L_0x0048:
        r0 = r3._currToken;
        return r0;
    L_0x004b:
        r0 = r3._nodeCursor;
        if (r0 != 0) goto L_0x0052;
    L_0x004f:
        r3._closed = r2;
        return r1;
    L_0x0052:
        r0 = r0.nextToken();
        r3._currToken = r0;
        r0 = r3._currToken;
        if (r0 == 0) goto L_0x0069;
    L_0x005c:
        r1 = r3._currToken;
        r0 = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
        if (r1 == r0) goto L_0x0046;
    L_0x0062:
        r1 = r3._currToken;
        r0 = com.fasterxml.jackson.core.JsonToken.START_ARRAY;
        if (r1 != r0) goto L_0x0048;
    L_0x0068:
        goto L_0x0046;
    L_0x0069:
        r0 = r3._nodeCursor;
        r0 = r0.endToken();
        r3._currToken = r0;
        r0 = r3._nodeCursor;
        r0 = r0.getParent();
        r3._nodeCursor = r0;
        r0 = r3._currToken;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.node.TreeTraversingParser.nextToken():com.fasterxml.jackson.core.JsonToken");
    }

    public void overrideCurrentName(String str) {
        NodeCursor nodeCursor = this._nodeCursor;
        if (nodeCursor != null) {
            nodeCursor.overrideCurrentName(str);
        }
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
        this._objectCodec = objectCodec;
    }

    public JsonParser skipChildren() {
        if (this._currToken == JsonToken.START_OBJECT) {
            this._startContainer = false;
            this._currToken = JsonToken.END_OBJECT;
        } else if (this._currToken == JsonToken.START_ARRAY) {
            this._startContainer = false;
            this._currToken = JsonToken.END_ARRAY;
        }
        return this;
    }

    public Version version() {
        return PackageVersion.VERSION;
    }
}
