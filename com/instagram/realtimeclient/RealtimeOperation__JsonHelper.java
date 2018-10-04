package com.instagram.realtimeclient;

import X.AnonymousClass0Lm;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.realtimeclient.RealtimeOperation.Type;

public final class RealtimeOperation__JsonHelper {
    public static RealtimeOperation parseFromJson(JsonParser jsonParser) {
        RealtimeOperation realtimeOperation = new RealtimeOperation();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            processSingleField(realtimeOperation, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return realtimeOperation;
    }

    public static RealtimeOperation parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return parseFromJson(createParser);
    }

    public static boolean processSingleField(RealtimeOperation realtimeOperation, String str, JsonParser jsonParser) {
        if ("op".equals(str)) {
            realtimeOperation.op = Type.valueOf(jsonParser.getText());
            return true;
        }
        String str2 = null;
        if ("path".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            realtimeOperation.path = str2;
            return true;
        } else if ("value".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            realtimeOperation.value = str2;
            return true;
        } else if (!"ts".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            realtimeOperation.timestamp = str2;
            return true;
        }
    }
}
