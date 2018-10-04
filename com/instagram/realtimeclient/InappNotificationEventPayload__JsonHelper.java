package com.instagram.realtimeclient;

import X.AnonymousClass0Lm;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public final class InappNotificationEventPayload__JsonHelper {
    public static InappNotificationEventPayload parseFromJson(JsonParser jsonParser) {
        InappNotificationEventPayload inappNotificationEventPayload = new InappNotificationEventPayload();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            processSingleField(inappNotificationEventPayload, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return inappNotificationEventPayload;
    }

    public static InappNotificationEventPayload parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return parseFromJson(createParser);
    }

    public static boolean processSingleField(InappNotificationEventPayload inappNotificationEventPayload, String str, JsonParser jsonParser) {
        String str2 = null;
        if (!"message".equals(str)) {
            if (!"message_on_banner".equals(str)) {
                if (!"type".equals(str)) {
                    if (!"notification_type".equals(str)) {
                        if (!"in_app_url".equals(str)) {
                            if (!"in_app_url".equals(str)) {
                                if (!"extra_info".equals(str)) {
                                    if (!"extra_info".equals(str)) {
                                        return false;
                                    }
                                }
                                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                                    str2 = jsonParser.getText();
                                }
                                inappNotificationEventPayload.mExtraInfo = str2;
                                return true;
                            }
                        }
                        if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                            str2 = jsonParser.getText();
                        }
                        inappNotificationEventPayload.mInappUrl = str2;
                        return true;
                    }
                }
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    str2 = jsonParser.getText();
                }
                inappNotificationEventPayload.mNotificationType = str2;
                return true;
            }
        }
        if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
            str2 = jsonParser.getText();
        }
        inappNotificationEventPayload.mMessageOnBanner = str2;
        return true;
    }
}
