package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharacterEscapes;
import java.io.Closeable;
import java.io.Flushable;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class JsonGenerator implements Closeable, Versioned, Flushable {
    public PrettyPrinter _cfgPrettyPrinter;

    public enum Feature {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        WRITE_NUMBERS_AS_STRINGS(false),
        FLUSH_PASSED_TO_STREAM(true),
        ESCAPE_NON_ASCII(false);
        
        private final boolean _defaultState;
        private final int _mask;

        private Feature(boolean z) {
            this._mask = 1 << ordinal();
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
            return this._mask;
        }
    }

    public boolean canUseSchema(FormatSchema formatSchema) {
        return false;
    }

    public abstract void close();

    public abstract void copyCurrentEvent(JsonParser jsonParser);

    public abstract void copyCurrentStructure(JsonParser jsonParser);

    public abstract JsonGenerator disable(Feature feature);

    public abstract JsonGenerator enable(Feature feature);

    public abstract void flush();

    public CharacterEscapes getCharacterEscapes() {
        return null;
    }

    public abstract ObjectCodec getCodec();

    public int getHighestEscapedChar() {
        return 0;
    }

    public abstract JsonStreamContext getOutputContext();

    public Object getOutputTarget() {
        return null;
    }

    public FormatSchema getSchema() {
        return null;
    }

    public abstract boolean isClosed();

    public abstract boolean isEnabled(Feature feature);

    public JsonGenerator setCharacterEscapes(CharacterEscapes characterEscapes) {
        return this;
    }

    public abstract JsonGenerator setCodec(ObjectCodec objectCodec);

    public JsonGenerator setHighestNonEscapedChar(int i) {
        return this;
    }

    public abstract JsonGenerator useDefaultPrettyPrinter();

    public abstract Version version();

    public abstract int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i);

    public abstract void writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2);

    public abstract void writeBoolean(boolean z);

    public abstract void writeEndArray();

    public abstract void writeEndObject();

    public abstract void writeFieldName(SerializableString serializableString);

    public abstract void writeFieldName(String str);

    public abstract void writeNull();

    public abstract void writeNumber(double d);

    public abstract void writeNumber(float f);

    public abstract void writeNumber(int i);

    public abstract void writeNumber(long j);

    public abstract void writeNumber(String str);

    public abstract void writeNumber(BigDecimal bigDecimal);

    public abstract void writeNumber(BigInteger bigInteger);

    public abstract void writeObject(Object obj);

    public abstract void writeRaw(char c);

    public abstract void writeRaw(String str);

    public abstract void writeRaw(String str, int i, int i2);

    public abstract void writeRaw(char[] cArr, int i, int i2);

    public abstract void writeRawUTF8String(byte[] bArr, int i, int i2);

    public abstract void writeRawValue(String str);

    public abstract void writeRawValue(String str, int i, int i2);

    public abstract void writeRawValue(char[] cArr, int i, int i2);

    public abstract void writeStartArray();

    public abstract void writeStartObject();

    public abstract void writeString(SerializableString serializableString);

    public abstract void writeString(String str);

    public abstract void writeString(char[] cArr, int i, int i2);

    public abstract void writeTree(TreeNode treeNode);

    public abstract void writeUTF8String(byte[] bArr, int i, int i2);

    public final JsonGenerator configure(Feature feature, boolean z) {
        if (z) {
            enable(feature);
        } else {
            disable(feature);
        }
        return this;
    }

    public PrettyPrinter getPrettyPrinter() {
        return this._cfgPrettyPrinter;
    }

    public JsonGenerator setPrettyPrinter(PrettyPrinter prettyPrinter) {
        this._cfgPrettyPrinter = prettyPrinter;
        return this;
    }

    public JsonGenerator setRootValueSeparator(SerializableString serializableString) {
        throw new UnsupportedOperationException();
    }

    public void setSchema(FormatSchema formatSchema) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Generator of type ");
        stringBuilder.append(getClass().getName());
        stringBuilder.append(" does not support schema of type '");
        stringBuilder.append(formatSchema.getSchemaType());
        stringBuilder.append("'");
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public final void writeArrayFieldStart(String str) {
        writeFieldName(str);
        writeStartArray();
    }

    public int writeBinary(InputStream inputStream, int i) {
        return writeBinary(Base64Variants.getDefaultVariant(), inputStream, i);
    }

    public void writeBinary(byte[] bArr) {
        writeBinary(Base64Variants.getDefaultVariant(), bArr, 0, bArr.length);
    }

    public void writeBinary(byte[] bArr, int i, int i2) {
        writeBinary(Base64Variants.getDefaultVariant(), bArr, i, i2);
    }

    public final void writeBinaryField(String str, byte[] bArr) {
        writeFieldName(str);
        writeBinary(bArr);
    }

    public final void writeBooleanField(String str, boolean z) {
        writeFieldName(str);
        writeBoolean(z);
    }

    public final void writeNullField(String str) {
        writeFieldName(str);
        writeNull();
    }

    public void writeNumber(short s) {
        writeNumber((int) s);
    }

    public final void writeNumberField(String str, double d) {
        writeFieldName(str);
        writeNumber(d);
    }

    public final void writeNumberField(String str, float f) {
        writeFieldName(str);
        writeNumber(f);
    }

    public final void writeNumberField(String str, int i) {
        writeFieldName(str);
        writeNumber(i);
    }

    public final void writeNumberField(String str, long j) {
        writeFieldName(str);
        writeNumber(j);
    }

    public final void writeNumberField(String str, BigDecimal bigDecimal) {
        writeFieldName(str);
        writeNumber(bigDecimal);
    }

    public final void writeObjectField(String str, Object obj) {
        writeFieldName(str);
        writeObject(obj);
    }

    public final void writeObjectFieldStart(String str) {
        writeFieldName(str);
        writeStartObject();
    }

    public void writeRaw(SerializableString serializableString) {
        writeRaw(serializableString.getValue());
    }

    public void writeStringField(String str, String str2) {
        writeFieldName(str);
        writeString(str2);
    }
}
