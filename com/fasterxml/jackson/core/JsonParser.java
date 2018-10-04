package com.fasterxml.jackson.core;

import com.facebook.common.dextricks.StartupQEsConfig;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.Closeable;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;

public abstract class JsonParser implements Closeable, Versioned {
    private static final int MAX_BYTE_I = 255;
    private static final int MAX_SHORT_I = 32767;
    private static final int MIN_BYTE_I = -128;
    private static final int MIN_SHORT_I = -32768;
    public int _features;

    public enum Feature {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false);
        
        private final boolean _defaultState;

        private Feature(boolean z) {
            this._defaultState = z;
        }

        public static int collectDefaults() {
            int i = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    i |= feature.getMask();
                }
            }
            return i;
        }

        public final boolean enabledByDefault() {
            return this._defaultState;
        }

        public final int getMask() {
            return 1 << ordinal();
        }
    }

    public boolean canUseSchema(FormatSchema formatSchema) {
        return false;
    }

    public abstract void clearCurrentToken();

    public abstract void close();

    public abstract BigInteger getBigIntegerValue();

    public abstract byte[] getBinaryValue(Base64Variant base64Variant);

    public abstract ObjectCodec getCodec();

    public abstract JsonLocation getCurrentLocation();

    public abstract String getCurrentName();

    public abstract JsonToken getCurrentToken();

    public abstract BigDecimal getDecimalValue();

    public abstract double getDoubleValue();

    public abstract Object getEmbeddedObject();

    public abstract float getFloatValue();

    public Object getInputSource() {
        return null;
    }

    public abstract int getIntValue();

    public abstract JsonToken getLastClearedToken();

    public abstract long getLongValue();

    public abstract JsonParser$NumberType getNumberType();

    public abstract Number getNumberValue();

    public abstract JsonStreamContext getParsingContext();

    public FormatSchema getSchema() {
        return null;
    }

    public abstract String getText();

    public abstract char[] getTextCharacters();

    public abstract int getTextLength();

    public abstract int getTextOffset();

    public abstract JsonLocation getTokenLocation();

    public boolean getValueAsBoolean(boolean z) {
        return z;
    }

    public double getValueAsDouble(double d) {
        return d;
    }

    public int getValueAsInt(int i) {
        return i;
    }

    public long getValueAsLong(long j) {
        return j;
    }

    public abstract String getValueAsString(String str);

    public abstract boolean hasCurrentToken();

    public abstract boolean hasTextCharacters();

    public abstract boolean isClosed();

    public abstract JsonToken nextToken();

    public abstract JsonToken nextValue();

    public abstract void overrideCurrentName(String str);

    public int releaseBuffered(OutputStream outputStream) {
        return -1;
    }

    public int releaseBuffered(Writer writer) {
        return -1;
    }

    public boolean requiresCustomCodec() {
        return false;
    }

    public abstract void setCodec(ObjectCodec objectCodec);

    public abstract JsonParser skipChildren();

    public abstract Version version();

    public JsonParser(int i) {
        this._features = i;
    }

    public JsonParseException _constructError(String str) {
        return new JsonParseException(str, getCurrentLocation());
    }

    public void _reportUnsupportedOperation() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Operation not supported by parser of type ");
        stringBuilder.append(getClass().getName());
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public JsonParser configure(Feature feature, boolean z) {
        if (z) {
            enable(feature);
        } else {
            disable(feature);
        }
        return this;
    }

    public JsonParser disable(Feature feature) {
        this._features = (feature.getMask() ^ -1) & this._features;
        return this;
    }

    public JsonParser enable(Feature feature) {
        this._features = feature.getMask() | this._features;
        return this;
    }

    public byte[] getBinaryValue() {
        return getBinaryValue(Base64Variants.getDefaultVariant());
    }

    public boolean getBooleanValue() {
        JsonToken currentToken = getCurrentToken();
        if (currentToken == JsonToken.VALUE_TRUE) {
            return true;
        }
        if (currentToken == JsonToken.VALUE_FALSE) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Current token (");
        stringBuilder.append(currentToken);
        stringBuilder.append(") not of boolean type");
        throw new JsonParseException(stringBuilder.toString(), getCurrentLocation());
    }

    public byte getByteValue() {
        int intValue = getIntValue();
        if (intValue >= MIN_BYTE_I && intValue <= MAX_BYTE_I) {
            return (byte) intValue;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Numeric value (");
        stringBuilder.append(getText());
        stringBuilder.append(") out of range of Java byte");
        throw _constructError(stringBuilder.toString());
    }

    public short getShortValue() {
        int intValue = getIntValue();
        if (intValue >= MIN_SHORT_I && intValue <= MAX_SHORT_I) {
            return (short) intValue;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Numeric value (");
        stringBuilder.append(getText());
        stringBuilder.append(") out of range of Java short");
        throw _constructError(stringBuilder.toString());
    }

    public boolean getValueAsBoolean() {
        return getValueAsBoolean(false);
    }

    public double getValueAsDouble() {
        return getValueAsDouble(StartupQEsConfig.DEFAULT_FPS_MODIFIY_FEED_SPEED);
    }

    public int getValueAsInt() {
        return getValueAsInt(0);
    }

    public long getValueAsLong() {
        return getValueAsLong(0);
    }

    public String getValueAsString() {
        return getValueAsString(null);
    }

    public boolean isEnabled(Feature feature) {
        return (feature.getMask() & this._features) != 0;
    }

    public boolean isExpectedStartArrayToken() {
        return getCurrentToken() == JsonToken.START_ARRAY;
    }

    public Boolean nextBooleanValue() {
        switch (JsonParser$1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[nextToken().ordinal()]) {
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            default:
                return null;
        }
    }

    public boolean nextFieldName(SerializableString serializableString) {
        return nextToken() == JsonToken.FIELD_NAME && serializableString.getValue().equals(getCurrentName());
    }

    public int nextIntValue(int i) {
        return nextToken() == JsonToken.VALUE_NUMBER_INT ? getIntValue() : i;
    }

    public long nextLongValue(long j) {
        return nextToken() == JsonToken.VALUE_NUMBER_INT ? getLongValue() : j;
    }

    public String nextTextValue() {
        return nextToken() == JsonToken.VALUE_STRING ? getText() : null;
    }

    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) {
        _reportUnsupportedOperation();
        return 0;
    }

    public int readBinaryValue(OutputStream outputStream) {
        return readBinaryValue(Base64Variants.getDefaultVariant(), outputStream);
    }

    public Object readValueAs(TypeReference typeReference) {
        ObjectCodec codec = getCodec();
        if (codec != null) {
            return codec.readValue(this, typeReference);
        }
        throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into Java objects");
    }

    public Object readValueAs(Class cls) {
        ObjectCodec codec = getCodec();
        if (codec != null) {
            return codec.readValue(this, cls);
        }
        throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into Java objects");
    }

    public TreeNode readValueAsTree() {
        ObjectCodec codec = getCodec();
        if (codec != null) {
            return codec.readTree(this);
        }
        throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into JsonNode tree");
    }

    public Iterator readValuesAs(TypeReference typeReference) {
        ObjectCodec codec = getCodec();
        if (codec != null) {
            return codec.readValues(this, typeReference);
        }
        throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into Java objects");
    }

    public Iterator readValuesAs(Class cls) {
        ObjectCodec codec = getCodec();
        if (codec != null) {
            return codec.readValues(this, cls);
        }
        throw new IllegalStateException("No ObjectCodec defined for the parser, can not deserialize JSON into Java objects");
    }

    public void setSchema(FormatSchema formatSchema) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Parser of type ");
        stringBuilder.append(getClass().getName());
        stringBuilder.append(" does not support schema of type '");
        stringBuilder.append(formatSchema.getSchemaType());
        stringBuilder.append("'");
        throw new UnsupportedOperationException(stringBuilder.toString());
    }
}
