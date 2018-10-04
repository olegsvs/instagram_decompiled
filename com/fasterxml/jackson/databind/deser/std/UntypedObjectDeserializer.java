package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.webrtc.audio.WebRtcAudioRecord;

@JacksonStdImpl
public class UntypedObjectDeserializer extends StdDeserializer {
    private static final Object[] NO_OBJECTS = new Object[0];
    public static final UntypedObjectDeserializer instance = new UntypedObjectDeserializer();
    private static final long serialVersionUID = 1;

    public UntypedObjectDeserializer() {
        super(Object.class);
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        switch (UntypedObjectDeserializer$1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[jsonParser.getCurrentToken().ordinal()]) {
            case 1:
            case 3:
                return mapObject(jsonParser, deserializationContext);
            case 2:
                return mapArray(jsonParser, deserializationContext);
            case 4:
                return jsonParser.getEmbeddedObject();
            case 5:
                return jsonParser.getText();
            case 6:
                if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
                    return jsonParser.getBigIntegerValue();
                }
                return jsonParser.getNumberValue();
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                    return jsonParser.getDecimalValue();
                }
                return Double.valueOf(jsonParser.getDoubleValue());
            case 8:
                return Boolean.TRUE;
            case 9:
                return Boolean.FALSE;
            case 10:
                return null;
            default:
                throw deserializationContext.mappingException(Object.class);
        }
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        switch (UntypedObjectDeserializer$1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[jsonParser.getCurrentToken().ordinal()]) {
            case 1:
            case 2:
            case 3:
                return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
            case 4:
                return jsonParser.getEmbeddedObject();
            case 5:
                return jsonParser.getText();
            case 6:
                if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
                    return jsonParser.getBigIntegerValue();
                }
                return jsonParser.getNumberValue();
            case WebRtcAudioRecord.DEFAULT_AUDIO_SOURCE /*7*/:
                if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                    return jsonParser.getDecimalValue();
                }
                return Double.valueOf(jsonParser.getDoubleValue());
            case 8:
                return Boolean.TRUE;
            case 9:
                return Boolean.FALSE;
            case 10:
                return null;
            default:
                throw deserializationContext.mappingException(Object.class);
        }
    }

    public Object mapArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
            return mapArrayToArray(jsonParser, deserializationContext);
        }
        if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
            return new ArrayList(4);
        }
        ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] resetAndStart = leaseObjectBuffer.resetAndStart();
        int i = 0;
        int i2 = 0;
        while (true) {
            Object deserialize = deserialize(jsonParser, deserializationContext);
            i++;
            if (i2 >= resetAndStart.length) {
                resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                i2 = 0;
            }
            int i3 = i2 + 1;
            resetAndStart[i2] = deserialize;
            if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
                List arrayList = new ArrayList((i + (i >> 3)) + 1);
                leaseObjectBuffer.completeAndClearBuffer(resetAndStart, i3, arrayList);
                return arrayList;
            }
            i2 = i3;
        }
    }

    public Object[] mapArrayToArray(JsonParser jsonParser, DeserializationContext deserializationContext) {
        if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
            return NO_OBJECTS;
        }
        ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] resetAndStart = leaseObjectBuffer.resetAndStart();
        int i = 0;
        while (true) {
            Object deserialize = deserialize(jsonParser, deserializationContext);
            if (i >= resetAndStart.length) {
                resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                i = 0;
            }
            int i2 = i + 1;
            resetAndStart[i] = deserialize;
            if (jsonParser.nextToken() == JsonToken.END_ARRAY) {
                return leaseObjectBuffer.completeAndClearBuffer(resetAndStart, i2);
            }
            i = i2;
        }
    }

    public Object mapObject(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.START_OBJECT) {
            currentToken = jsonParser.nextToken();
        }
        JsonToken jsonToken = JsonToken.FIELD_NAME;
        if (currentToken != jsonToken) {
            return new LinkedHashMap(4);
        }
        String text = jsonParser.getText();
        jsonParser.nextToken();
        Object deserialize = deserialize(jsonParser, deserializationContext);
        if (jsonParser.nextToken() != jsonToken) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(4);
            linkedHashMap.put(text, deserialize);
            return linkedHashMap;
        }
        String text2 = jsonParser.getText();
        jsonParser.nextToken();
        Object deserialize2 = deserialize(jsonParser, deserializationContext);
        if (jsonParser.nextToken() != jsonToken) {
            linkedHashMap = new LinkedHashMap(4);
            linkedHashMap.put(text, deserialize);
            linkedHashMap.put(text2, deserialize2);
            return linkedHashMap;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(text, deserialize);
        linkedHashMap2.put(text2, deserialize2);
        do {
            String text3 = jsonParser.getText();
            jsonParser.nextToken();
            linkedHashMap2.put(text3, deserialize(jsonParser, deserializationContext));
        } while (jsonParser.nextToken() != JsonToken.END_OBJECT);
        return linkedHashMap2;
    }
}
