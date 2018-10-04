package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.4Fo */
public final class AnonymousClass4Fo {
    /* renamed from: B */
    public static boolean m23667B(AnonymousClass1cG anonymousClass1cG, String str, JsonParser jsonParser) {
        if ("client_subscription_id".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                return true;
            }
        } else if ("media_id".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                return true;
            }
        } else if (!"comment".equals(str)) {
            return false;
        } else {
            anonymousClass1cG.f20611B = AnonymousClass122.parseFromJson(jsonParser);
            return true;
        }
        jsonParser.getText();
        return true;
    }

    public static AnonymousClass1cG parseFromJson(JsonParser jsonParser) {
        AnonymousClass1cG anonymousClass1cG = new AnonymousClass1cG();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass4Fo.m23667B(anonymousClass1cG, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1cG;
    }
}
