package com.instagram.realtimeclient;

import X.AnonymousClass0Lm;
import com.facebook.proxygen.TraceFieldType;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.realtimeclient.DirectRealtimePayload.Action;
import com.instagram.realtimeclient.RealtimeEvent.Type;
import java.util.ArrayList;
import java.util.List;

public final class RealtimeEvent__JsonHelper {
    public static RealtimeEvent parseFromJson(JsonParser jsonParser) {
        RealtimeEvent realtimeEvent = new RealtimeEvent();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            processSingleField(realtimeEvent, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return realtimeEvent;
    }

    public static RealtimeEvent parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return parseFromJson(createParser);
    }

    public static boolean processSingleField(RealtimeEvent realtimeEvent, String str, JsonParser jsonParser) {
        if ("event".equals(str)) {
            realtimeEvent.type = Type.fromServerValue(jsonParser.getText());
            return true;
        }
        String str2 = null;
        if ("topic".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            realtimeEvent.topic = str2;
            return true;
        } else if ("must_refresh".equals(str)) {
            realtimeEvent.mustRefresh = jsonParser.getValueAsBoolean();
            return true;
        } else if ("sequence".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            realtimeEvent.sequence = str2;
            return true;
        } else if ("interval".equals(str)) {
            realtimeEvent.interval = jsonParser.getValueAsDouble();
            return true;
        } else if ("data".equals(str)) {
            List arrayList;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    RealtimeOperation parseFromJson = RealtimeOperation__JsonHelper.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            realtimeEvent.operations = arrayList;
            return true;
        } else if ("id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            realtimeEvent.id = str2;
            return true;
        } else if ("message".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            realtimeEvent.message = str2;
            return true;
        } else if ("code".equals(str)) {
            realtimeEvent.code = Integer.valueOf(jsonParser.getValueAsInt());
            return true;
        } else if ("action".equals(str)) {
            realtimeEvent.action = Action.fromServerValue(jsonParser.getText());
            return true;
        } else if ("status".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            realtimeEvent.status = str2;
            return true;
        } else if (TraceFieldType.StatusCode.equals(str)) {
            realtimeEvent.statusCode = Integer.valueOf(jsonParser.getValueAsInt());
            return true;
        } else if (!"payload".equals(str)) {
            return false;
        } else {
            realtimeEvent.payload = DirectRealtimePayload__JsonHelper.parseFromJson(jsonParser);
            return true;
        }
    }
}
