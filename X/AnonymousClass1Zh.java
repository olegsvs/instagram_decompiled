package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.1Zh */
public final class AnonymousClass1Zh {
    /* renamed from: B */
    public static boolean m11891B(AnonymousClass3jX anonymousClass3jX, String str, JsonParser jsonParser) {
        if ("request_count".equals(str)) {
            anonymousClass3jX.f43759C = jsonParser.getValueAsInt();
            return true;
        }
        String str2 = null;
        if ("profile_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                jsonParser.getText();
            }
            return true;
        } else if (!"profile_image".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass3jX.f43758B = str2;
            return true;
        }
    }

    public static AnonymousClass3jX parseFromJson(JsonParser jsonParser) {
        AnonymousClass3jX anonymousClass3jX = new AnonymousClass3jX();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1Zh.m11891B(anonymousClass3jX, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3jX;
    }
}
