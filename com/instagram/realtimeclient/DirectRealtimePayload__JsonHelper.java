package com.instagram.realtimeclient;

import X.AnonymousClass0Lm;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public final class DirectRealtimePayload__JsonHelper {
    public static DirectRealtimePayload parseFromJson(JsonParser jsonParser) {
        DirectRealtimePayload directRealtimePayload = new DirectRealtimePayload();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            processSingleField(directRealtimePayload, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return directRealtimePayload;
    }

    public static DirectRealtimePayload parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return parseFromJson(createParser);
    }

    public static boolean processSingleField(DirectRealtimePayload directRealtimePayload, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("client_request_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            directRealtimePayload.clientRequestId = str2;
            return true;
        } else if ("client_context".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            directRealtimePayload.clientContext = str2;
            return true;
        } else if ("item_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            directRealtimePayload.itemId = str2;
            return true;
        } else if ("thread_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            directRealtimePayload.threadId = str2;
            return true;
        } else if ("timestamp".equals(str)) {
            directRealtimePayload.timestamp = jsonParser.getValueAsLong();
            return true;
        } else if ("count".equals(str)) {
            directRealtimePayload.count = Integer.valueOf(jsonParser.getValueAsInt());
            return true;
        } else if ("message".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            directRealtimePayload.message = str2;
            return true;
        } else if (!"ttl".equals(str)) {
            return false;
        } else {
            directRealtimePayload.ttlMs = Long.valueOf(jsonParser.getValueAsLong());
            return true;
        }
    }
}
