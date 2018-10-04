package com.instagram.realtimeclient;

import X.AnonymousClass0Lm;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.realtimeclient.RealtimeStoreKey.ShimValueWithId;

public final class RealtimeStoreKey_ShimValueWithId__JsonHelper {
    public static ShimValueWithId parseFromJson(JsonParser jsonParser) {
        ShimValueWithId shimValueWithId = new ShimValueWithId();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            processSingleField(shimValueWithId, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return shimValueWithId;
    }

    public static ShimValueWithId parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return parseFromJson(createParser);
    }

    public static boolean processSingleField(ShimValueWithId shimValueWithId, String str, JsonParser jsonParser) {
        if (!("id".equals(str) || "pk".equals(str))) {
            if (!"item_id".equals(str)) {
                return false;
            }
        }
        shimValueWithId.id = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
        return true;
    }
}
