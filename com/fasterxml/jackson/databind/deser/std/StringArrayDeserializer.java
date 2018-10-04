package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ObjectBuffer;

@JacksonStdImpl
public final class StringArrayDeserializer extends StdDeserializer implements ContextualDeserializer {
    public static final StringArrayDeserializer instance = new StringArrayDeserializer();
    private static final long serialVersionUID = -7589512013334920693L;
    public JsonDeserializer _elementDeserializer;

    public StringArrayDeserializer() {
        super(String[].class);
        this._elementDeserializer = null;
    }

    public StringArrayDeserializer(JsonDeserializer jsonDeserializer) {
        super(String[].class);
        this._elementDeserializer = jsonDeserializer;
    }

    public final String[] _deserializeCustom(JsonParser jsonParser, DeserializationContext deserializationContext) {
        ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] resetAndStart = leaseObjectBuffer.resetAndStart();
        JsonDeserializer jsonDeserializer = this._elementDeserializer;
        int i = 0;
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken != JsonToken.END_ARRAY) {
                String str = nextToken == JsonToken.VALUE_NULL ? null : (String) jsonDeserializer.deserialize(jsonParser, deserializationContext);
                if (i >= resetAndStart.length) {
                    resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                    i = 0;
                }
                int i2 = i + 1;
                resetAndStart[i] = str;
                i = i2;
            } else {
                String[] strArr = (String[]) leaseObjectBuffer.completeAndClearBuffer(resetAndStart, i, String.class);
                deserializationContext.returnObjectBuffer(leaseObjectBuffer);
                return strArr;
            }
        }
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        JsonDeserializer findConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, this._elementDeserializer);
        if (findConvertingContentDeserializer == null) {
            findConvertingContentDeserializer = deserializationContext.findContextualValueDeserializer(deserializationContext.constructType(String.class), beanProperty);
        } else if (findConvertingContentDeserializer instanceof ContextualDeserializer) {
            findConvertingContentDeserializer = ((ContextualDeserializer) findConvertingContentDeserializer).createContextual(deserializationContext, beanProperty);
        }
        if (findConvertingContentDeserializer != null && isDefaultDeserializer(findConvertingContentDeserializer)) {
            findConvertingContentDeserializer = null;
        }
        return this._elementDeserializer != findConvertingContentDeserializer ? new StringArrayDeserializer(findConvertingContentDeserializer) : this;
    }

    public String[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext);
        }
        if (this._elementDeserializer != null) {
            return _deserializeCustom(jsonParser, deserializationContext);
        }
        ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] resetAndStart = leaseObjectBuffer.resetAndStart();
        int i = 0;
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken != JsonToken.END_ARRAY) {
                String text;
                if (nextToken == JsonToken.VALUE_STRING) {
                    text = jsonParser.getText();
                } else if (nextToken == JsonToken.VALUE_NULL) {
                    text = null;
                } else {
                    text = _parseString(jsonParser, deserializationContext);
                }
                if (i >= resetAndStart.length) {
                    resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                    i = 0;
                }
                int i2 = i + 1;
                resetAndStart[i] = text;
                i = i2;
            } else {
                String[] strArr = (String[]) leaseObjectBuffer.completeAndClearBuffer(resetAndStart, i, String.class);
                deserializationContext.returnObjectBuffer(leaseObjectBuffer);
                return strArr;
            }
        }
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    private final String[] handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        String[] strArr = null;
        if (deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
            String[] strArr2 = new String[1];
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                strArr = _parseString(jsonParser, deserializationContext);
            }
            strArr2[0] = strArr;
            return strArr2;
        } else if (jsonParser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.getText().length() == 0) {
            return null;
        } else {
            throw deserializationContext.mappingException(this._valueClass);
        }
    }
}
