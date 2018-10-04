package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.webrtc.audio.WebRtcAudioRecord;

public abstract class GeneratorBase extends JsonGenerator {
    public boolean _cfgNumbersAsStrings;
    public boolean _closed;
    public int _features;
    public ObjectCodec _objectCodec;
    public JsonWriteContext _writeContext = JsonWriteContext.createRootContext();

    public abstract void _verifyValueWrite(String str);

    public abstract void flush();

    public GeneratorBase(int i, ObjectCodec objectCodec) {
        this._features = i;
        this._objectCodec = objectCodec;
        this._cfgNumbersAsStrings = isEnabled(Feature.WRITE_NUMBERS_AS_STRINGS);
    }

    public static final void _reportError(String str) {
        throw new JsonGenerationException(str);
    }

    public final void _reportUnsupportedOperation() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Operation not supported by generator of type ");
        stringBuilder.append(getClass().getName());
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public final void _writeSimpleObject(Object obj) {
        if (obj == null) {
            writeNull();
        } else if (obj instanceof String) {
            writeString((String) obj);
        } else {
            if (obj instanceof Number) {
                Number number = (Number) obj;
                if (number instanceof Integer) {
                    writeNumber(number.intValue());
                    return;
                } else if (number instanceof Long) {
                    writeNumber(number.longValue());
                    return;
                } else if (number instanceof Double) {
                    writeNumber(number.doubleValue());
                    return;
                } else if (number instanceof Float) {
                    writeNumber(number.floatValue());
                    return;
                } else if (number instanceof Short) {
                    writeNumber(number.shortValue());
                    return;
                } else if (number instanceof Byte) {
                    writeNumber((short) number.byteValue());
                    return;
                } else if (number instanceof BigInteger) {
                    writeNumber((BigInteger) number);
                    return;
                } else if (number instanceof BigDecimal) {
                    writeNumber((BigDecimal) number);
                    return;
                } else if (number instanceof AtomicInteger) {
                    writeNumber(((AtomicInteger) number).get());
                    return;
                } else if (number instanceof AtomicLong) {
                    writeNumber(((AtomicLong) number).get());
                    return;
                }
            } else if (obj instanceof byte[]) {
                writeBinary((byte[]) obj);
                return;
            } else if (obj instanceof Boolean) {
                writeBoolean(((Boolean) obj).booleanValue());
                return;
            } else if (obj instanceof AtomicBoolean) {
                writeBoolean(((AtomicBoolean) obj).get());
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed ");
            stringBuilder.append(obj.getClass().getName());
            stringBuilder.append(")");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public void close() {
        this._closed = true;
    }

    public final void copyCurrentEvent(JsonParser jsonParser) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == null) {
            _reportError("No current event to copy");
        }
        switch (GeneratorBase$1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[currentToken.ordinal()]) {
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
                VersionUtil.throwInternal();
                return;
        }
    }

    public final void copyCurrentStructure(JsonParser jsonParser) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.FIELD_NAME) {
            writeFieldName(jsonParser.getCurrentName());
            currentToken = jsonParser.nextToken();
        }
        int i = GeneratorBase$1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[currentToken.ordinal()];
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

    public final JsonGenerator disable(Feature feature) {
        this._features &= feature.getMask() ^ -1;
        if (feature == Feature.WRITE_NUMBERS_AS_STRINGS) {
            this._cfgNumbersAsStrings = false;
        } else if (feature == Feature.ESCAPE_NON_ASCII) {
            setHighestNonEscapedChar(0);
        }
        return this;
    }

    public final JsonGenerator enable(Feature feature) {
        this._features |= feature.getMask();
        if (feature == Feature.WRITE_NUMBERS_AS_STRINGS) {
            this._cfgNumbersAsStrings = true;
        } else if (feature == Feature.ESCAPE_NON_ASCII) {
            setHighestNonEscapedChar(127);
        }
        return this;
    }

    public final ObjectCodec getCodec() {
        return this._objectCodec;
    }

    public final JsonWriteContext getOutputContext() {
        return this._writeContext;
    }

    public final boolean isClosed() {
        return this._closed;
    }

    public final boolean isEnabled(Feature feature) {
        return (feature.getMask() & this._features) != 0;
    }

    public final JsonGenerator setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
        return this;
    }

    public final JsonGenerator useDefaultPrettyPrinter() {
        if (getPrettyPrinter() != null) {
            return this;
        }
        return setPrettyPrinter(new DefaultPrettyPrinter());
    }

    public Version version() {
        return VersionUtil.versionFor(getClass());
    }

    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i) {
        _reportUnsupportedOperation();
        return 0;
    }

    public void writeFieldName(SerializableString serializableString) {
        writeFieldName(serializableString.getValue());
    }

    public final void writeObject(Object obj) {
        if (obj == null) {
            writeNull();
        } else {
            ObjectCodec objectCodec = this._objectCodec;
            if (objectCodec != null) {
                objectCodec.writeValue(this, obj);
                return;
            }
            _writeSimpleObject(obj);
        }
    }

    public final void writeRawValue(String str) {
        _verifyValueWrite("write raw value");
        writeRaw(str);
    }

    public final void writeRawValue(String str, int i, int i2) {
        _verifyValueWrite("write raw value");
        writeRaw(str, i, i2);
    }

    public final void writeRawValue(char[] cArr, int i, int i2) {
        _verifyValueWrite("write raw value");
        writeRaw(cArr, i, i2);
    }

    public void writeString(SerializableString serializableString) {
        writeString(serializableString.getValue());
    }

    public final void writeTree(TreeNode treeNode) {
        if (treeNode == null) {
            writeNull();
            return;
        }
        ObjectCodec objectCodec = this._objectCodec;
        if (objectCodec != null) {
            objectCodec.writeValue(this, treeNode);
            return;
        }
        throw new IllegalStateException("No ObjectCodec defined");
    }
}
