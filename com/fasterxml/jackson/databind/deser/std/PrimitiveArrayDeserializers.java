package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;

public abstract class PrimitiveArrayDeserializers extends StdDeserializer {

    @JacksonStdImpl
    public final class BooleanDeser extends PrimitiveArrayDeserializers {
        private static final long serialVersionUID = 1;

        public BooleanDeser() {
            super(boolean[].class);
        }

        public boolean[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            if (!jsonParser.isExpectedStartArrayToken()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            PrimitiveArrayBuilder booleanBuilder = deserializationContext.getArrayBuilders().getBooleanBuilder();
            Object obj = (boolean[]) booleanBuilder.resetAndStart();
            int i = 0;
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                boolean _parseBooleanPrimitive = _parseBooleanPrimitive(jsonParser, deserializationContext);
                if (i >= obj.length) {
                    obj = (boolean[]) booleanBuilder.appendCompletedChunk(obj, i);
                    i = 0;
                }
                int i2 = i + 1;
                obj[i] = _parseBooleanPrimitive;
                i = i2;
            }
            return (boolean[]) booleanBuilder.completeAndClearBuffer(obj, i);
        }

        private final boolean[] handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.getText().length() == 0) {
                return null;
            }
            if (deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                return new boolean[]{_parseBooleanPrimitive(jsonParser, deserializationContext)};
            }
            throw deserializationContext.mappingException(this._valueClass);
        }
    }

    @JacksonStdImpl
    public final class ByteDeser extends PrimitiveArrayDeserializers {
        private static final long serialVersionUID = 1;

        public ByteDeser() {
            super(byte[].class);
        }

        public byte[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.VALUE_STRING) {
                return jsonParser.getBinaryValue(deserializationContext.getBase64Variant());
            }
            if (currentToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object embeddedObject = jsonParser.getEmbeddedObject();
                if (embeddedObject == null) {
                    return null;
                }
                if (embeddedObject instanceof byte[]) {
                    return (byte[]) embeddedObject;
                }
            }
            if (!jsonParser.isExpectedStartArrayToken()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            PrimitiveArrayBuilder byteBuilder = deserializationContext.getArrayBuilders().getByteBuilder();
            Object obj = (byte[]) byteBuilder.resetAndStart();
            int i = 0;
            while (true) {
                currentToken = jsonParser.nextToken();
                if (currentToken == JsonToken.END_ARRAY) {
                    return (byte[]) byteBuilder.completeAndClearBuffer(obj, i);
                }
                byte b;
                int i2;
                if (currentToken != JsonToken.VALUE_NUMBER_INT) {
                    if (currentToken != JsonToken.VALUE_NUMBER_FLOAT) {
                        if (currentToken == JsonToken.VALUE_NULL) {
                            b = (byte) 0;
                            if (i >= obj.length) {
                                obj = (byte[]) byteBuilder.appendCompletedChunk(obj, i);
                                i = 0;
                            }
                            i2 = i + 1;
                            obj[i] = b;
                            i = i2;
                        } else {
                            throw deserializationContext.mappingException(this._valueClass.getComponentType());
                        }
                    }
                }
                b = jsonParser.getByteValue();
                if (i >= obj.length) {
                    obj = (byte[]) byteBuilder.appendCompletedChunk(obj, i);
                    i = 0;
                }
                i2 = i + 1;
                obj[i] = b;
                i = i2;
            }
        }

        private final byte[] handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.getText().length() == 0) {
                return null;
            }
            if (deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                byte b;
                JsonToken currentToken = jsonParser.getCurrentToken();
                if (currentToken != JsonToken.VALUE_NUMBER_INT) {
                    if (currentToken != JsonToken.VALUE_NUMBER_FLOAT) {
                        if (currentToken == JsonToken.VALUE_NULL) {
                            b = (byte) 0;
                            return new byte[]{b};
                        }
                        throw deserializationContext.mappingException(this._valueClass.getComponentType());
                    }
                }
                b = jsonParser.getByteValue();
                return new byte[]{b};
            }
            throw deserializationContext.mappingException(this._valueClass);
        }
    }

    @JacksonStdImpl
    public final class CharDeser extends PrimitiveArrayDeserializers {
        private static final long serialVersionUID = 1;

        public CharDeser() {
            super(char[].class);
        }

        public char[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            JsonToken currentToken = jsonParser.getCurrentToken();
            if (currentToken == JsonToken.VALUE_STRING) {
                Object textCharacters = jsonParser.getTextCharacters();
                int textOffset = jsonParser.getTextOffset();
                int textLength = jsonParser.getTextLength();
                Object obj = new char[textLength];
                System.arraycopy(textCharacters, textOffset, obj, 0, textLength);
                return obj;
            } else if (jsonParser.isExpectedStartArrayToken()) {
                StringBuilder stringBuilder = new StringBuilder(64);
                while (true) {
                    currentToken = jsonParser.nextToken();
                    if (currentToken == JsonToken.END_ARRAY) {
                        return stringBuilder.toString().toCharArray();
                    }
                    if (currentToken == JsonToken.VALUE_STRING) {
                        String text = jsonParser.getText();
                        if (text.length() == 1) {
                            stringBuilder.append(text.charAt(0));
                        } else {
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Can not convert a JSON String of length ");
                            stringBuilder2.append(text.length());
                            stringBuilder2.append(" into a char element of char array");
                            throw JsonMappingException.from(jsonParser, stringBuilder2.toString());
                        }
                    }
                    throw deserializationContext.mappingException(Character.TYPE);
                }
            } else {
                if (currentToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                    Object embeddedObject = jsonParser.getEmbeddedObject();
                    if (embeddedObject == null) {
                        return null;
                    }
                    if (embeddedObject instanceof char[]) {
                        return (char[]) embeddedObject;
                    }
                    if (embeddedObject instanceof String) {
                        return ((String) embeddedObject).toCharArray();
                    }
                    if (embeddedObject instanceof byte[]) {
                        return Base64Variants.getDefaultVariant().encode((byte[]) embeddedObject, false).toCharArray();
                    }
                }
                throw deserializationContext.mappingException(this._valueClass);
            }
        }
    }

    @JacksonStdImpl
    public final class DoubleDeser extends PrimitiveArrayDeserializers {
        private static final long serialVersionUID = 1;

        public DoubleDeser() {
            super(double[].class);
        }

        public double[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            if (!jsonParser.isExpectedStartArrayToken()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            PrimitiveArrayBuilder doubleBuilder = deserializationContext.getArrayBuilders().getDoubleBuilder();
            Object obj = (double[]) doubleBuilder.resetAndStart();
            int i = 0;
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                double _parseDoublePrimitive = _parseDoublePrimitive(jsonParser, deserializationContext);
                if (i >= obj.length) {
                    obj = (double[]) doubleBuilder.appendCompletedChunk(obj, i);
                    i = 0;
                }
                int i2 = i + 1;
                obj[i] = _parseDoublePrimitive;
                i = i2;
            }
            return (double[]) doubleBuilder.completeAndClearBuffer(obj, i);
        }

        private final double[] handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.getText().length() == 0) {
                return null;
            }
            if (deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                return new double[]{_parseDoublePrimitive(jsonParser, deserializationContext)};
            }
            throw deserializationContext.mappingException(this._valueClass);
        }
    }

    @JacksonStdImpl
    public final class FloatDeser extends PrimitiveArrayDeserializers {
        private static final long serialVersionUID = 1;

        public FloatDeser() {
            super(float[].class);
        }

        public float[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            if (!jsonParser.isExpectedStartArrayToken()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            PrimitiveArrayBuilder floatBuilder = deserializationContext.getArrayBuilders().getFloatBuilder();
            Object obj = (float[]) floatBuilder.resetAndStart();
            int i = 0;
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                float _parseFloatPrimitive = _parseFloatPrimitive(jsonParser, deserializationContext);
                if (i >= obj.length) {
                    obj = (float[]) floatBuilder.appendCompletedChunk(obj, i);
                    i = 0;
                }
                int i2 = i + 1;
                obj[i] = _parseFloatPrimitive;
                i = i2;
            }
            return (float[]) floatBuilder.completeAndClearBuffer(obj, i);
        }

        private final float[] handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.getText().length() == 0) {
                return null;
            }
            if (deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                return new float[]{_parseFloatPrimitive(jsonParser, deserializationContext)};
            }
            throw deserializationContext.mappingException(this._valueClass);
        }
    }

    @JacksonStdImpl
    public final class IntDeser extends PrimitiveArrayDeserializers {
        public static final IntDeser instance = new IntDeser();
        private static final long serialVersionUID = 1;

        public IntDeser() {
            super(int[].class);
        }

        public int[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            if (!jsonParser.isExpectedStartArrayToken()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            PrimitiveArrayBuilder intBuilder = deserializationContext.getArrayBuilders().getIntBuilder();
            Object obj = (int[]) intBuilder.resetAndStart();
            int i = 0;
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                int _parseIntPrimitive = _parseIntPrimitive(jsonParser, deserializationContext);
                if (i >= obj.length) {
                    obj = (int[]) intBuilder.appendCompletedChunk(obj, i);
                    i = 0;
                }
                int i2 = i + 1;
                obj[i] = _parseIntPrimitive;
                i = i2;
            }
            return (int[]) intBuilder.completeAndClearBuffer(obj, i);
        }

        private final int[] handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.getText().length() == 0) {
                return null;
            }
            if (deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                return new int[]{_parseIntPrimitive(jsonParser, deserializationContext)};
            }
            throw deserializationContext.mappingException(this._valueClass);
        }
    }

    @JacksonStdImpl
    public final class LongDeser extends PrimitiveArrayDeserializers {
        public static final LongDeser instance = new LongDeser();
        private static final long serialVersionUID = 1;

        public LongDeser() {
            super(long[].class);
        }

        public long[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            if (!jsonParser.isExpectedStartArrayToken()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            PrimitiveArrayBuilder longBuilder = deserializationContext.getArrayBuilders().getLongBuilder();
            Object obj = (long[]) longBuilder.resetAndStart();
            int i = 0;
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                long _parseLongPrimitive = _parseLongPrimitive(jsonParser, deserializationContext);
                if (i >= obj.length) {
                    obj = (long[]) longBuilder.appendCompletedChunk(obj, i);
                    i = 0;
                }
                int i2 = i + 1;
                obj[i] = _parseLongPrimitive;
                i = i2;
            }
            return (long[]) longBuilder.completeAndClearBuffer(obj, i);
        }

        private final long[] handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.getText().length() == 0) {
                return null;
            }
            if (deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                return new long[]{_parseLongPrimitive(jsonParser, deserializationContext)};
            }
            throw deserializationContext.mappingException(this._valueClass);
        }
    }

    @JacksonStdImpl
    public final class ShortDeser extends PrimitiveArrayDeserializers {
        private static final long serialVersionUID = 1;

        public ShortDeser() {
            super(short[].class);
        }

        public short[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
            if (!jsonParser.isExpectedStartArrayToken()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            PrimitiveArrayBuilder shortBuilder = deserializationContext.getArrayBuilders().getShortBuilder();
            Object obj = (short[]) shortBuilder.resetAndStart();
            int i = 0;
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                short _parseShortPrimitive = _parseShortPrimitive(jsonParser, deserializationContext);
                if (i >= obj.length) {
                    obj = (short[]) shortBuilder.appendCompletedChunk(obj, i);
                    i = 0;
                }
                int i2 = i + 1;
                obj[i] = _parseShortPrimitive;
                i = i2;
            }
            return (short[]) shortBuilder.completeAndClearBuffer(obj, i);
        }

        private final short[] handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.getText().length() == 0) {
                return null;
            }
            if (deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
                return new short[]{_parseShortPrimitive(jsonParser, deserializationContext)};
            }
            throw deserializationContext.mappingException(this._valueClass);
        }
    }

    public PrimitiveArrayDeserializers(Class cls) {
        super(cls);
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    public static JsonDeserializer forType(Class cls) {
        if (cls == Integer.TYPE) {
            return IntDeser.instance;
        }
        if (cls == Long.TYPE) {
            return LongDeser.instance;
        }
        if (cls == Byte.TYPE) {
            return new ByteDeser();
        }
        if (cls == Short.TYPE) {
            return new ShortDeser();
        }
        if (cls == Float.TYPE) {
            return new FloatDeser();
        }
        if (cls == Double.TYPE) {
            return new DoubleDeser();
        }
        if (cls == Boolean.TYPE) {
            return new BooleanDeser();
        }
        if (cls == Character.TYPE) {
            return new CharDeser();
        }
        throw new IllegalStateException();
    }
}
