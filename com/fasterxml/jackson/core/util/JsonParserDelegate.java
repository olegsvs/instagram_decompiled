package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser$NumberType;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class JsonParserDelegate extends JsonParser {
    public JsonParser delegate;

    public JsonParserDelegate(JsonParser jsonParser) {
        this.delegate = jsonParser;
    }

    public final boolean canUseSchema(FormatSchema formatSchema) {
        return this.delegate.canUseSchema(formatSchema);
    }

    public final void clearCurrentToken() {
        this.delegate.clearCurrentToken();
    }

    public void close() {
        this.delegate.close();
    }

    public final JsonParser disable(Feature feature) {
        this.delegate.disable(feature);
        return this;
    }

    public final JsonParser enable(Feature feature) {
        this.delegate.enable(feature);
        return this;
    }

    public final BigInteger getBigIntegerValue() {
        return this.delegate.getBigIntegerValue();
    }

    public final byte[] getBinaryValue(Base64Variant base64Variant) {
        return this.delegate.getBinaryValue(base64Variant);
    }

    public final boolean getBooleanValue() {
        return this.delegate.getBooleanValue();
    }

    public final byte getByteValue() {
        return this.delegate.getByteValue();
    }

    public final ObjectCodec getCodec() {
        return this.delegate.getCodec();
    }

    public final JsonLocation getCurrentLocation() {
        return this.delegate.getCurrentLocation();
    }

    public final String getCurrentName() {
        return this.delegate.getCurrentName();
    }

    public final JsonToken getCurrentToken() {
        return this.delegate.getCurrentToken();
    }

    public final BigDecimal getDecimalValue() {
        return this.delegate.getDecimalValue();
    }

    public final double getDoubleValue() {
        return this.delegate.getDoubleValue();
    }

    public final Object getEmbeddedObject() {
        return this.delegate.getEmbeddedObject();
    }

    public final float getFloatValue() {
        return this.delegate.getFloatValue();
    }

    public final Object getInputSource() {
        return this.delegate.getInputSource();
    }

    public final int getIntValue() {
        return this.delegate.getIntValue();
    }

    public final JsonToken getLastClearedToken() {
        return this.delegate.getLastClearedToken();
    }

    public final long getLongValue() {
        return this.delegate.getLongValue();
    }

    public final JsonParser$NumberType getNumberType() {
        return this.delegate.getNumberType();
    }

    public final Number getNumberValue() {
        return this.delegate.getNumberValue();
    }

    public final JsonStreamContext getParsingContext() {
        return this.delegate.getParsingContext();
    }

    public final FormatSchema getSchema() {
        return this.delegate.getSchema();
    }

    public final short getShortValue() {
        return this.delegate.getShortValue();
    }

    public final String getText() {
        return this.delegate.getText();
    }

    public final char[] getTextCharacters() {
        return this.delegate.getTextCharacters();
    }

    public final int getTextLength() {
        return this.delegate.getTextLength();
    }

    public final int getTextOffset() {
        return this.delegate.getTextOffset();
    }

    public final JsonLocation getTokenLocation() {
        return this.delegate.getTokenLocation();
    }

    public final boolean getValueAsBoolean() {
        return this.delegate.getValueAsBoolean();
    }

    public final boolean getValueAsBoolean(boolean z) {
        return this.delegate.getValueAsBoolean(z);
    }

    public final double getValueAsDouble() {
        return this.delegate.getValueAsDouble();
    }

    public final double getValueAsDouble(double d) {
        return this.delegate.getValueAsDouble(d);
    }

    public final int getValueAsInt() {
        return this.delegate.getValueAsInt();
    }

    public final int getValueAsInt(int i) {
        return this.delegate.getValueAsInt(i);
    }

    public final long getValueAsLong() {
        return this.delegate.getValueAsLong();
    }

    public final long getValueAsLong(long j) {
        return this.delegate.getValueAsLong(j);
    }

    public final String getValueAsString() {
        return this.delegate.getValueAsString();
    }

    public final String getValueAsString(String str) {
        return this.delegate.getValueAsString(str);
    }

    public final boolean hasCurrentToken() {
        return this.delegate.hasCurrentToken();
    }

    public final boolean hasTextCharacters() {
        return this.delegate.hasTextCharacters();
    }

    public final boolean isClosed() {
        return this.delegate.isClosed();
    }

    public final boolean isEnabled(Feature feature) {
        return this.delegate.isEnabled(feature);
    }

    public JsonToken nextToken() {
        return this.delegate.nextToken();
    }

    public final JsonToken nextValue() {
        return this.delegate.nextValue();
    }

    public final void overrideCurrentName(String str) {
        this.delegate.overrideCurrentName(str);
    }

    public final int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) {
        return this.delegate.readBinaryValue(base64Variant, outputStream);
    }

    public final boolean requiresCustomCodec() {
        return this.delegate.requiresCustomCodec();
    }

    public final void setCodec(ObjectCodec objectCodec) {
        this.delegate.setCodec(objectCodec);
    }

    public final void setSchema(FormatSchema formatSchema) {
        this.delegate.setSchema(formatSchema);
    }

    public final JsonParser skipChildren() {
        this.delegate.skipChildren();
        return this;
    }

    public final Version version() {
        return this.delegate.version();
    }
}
