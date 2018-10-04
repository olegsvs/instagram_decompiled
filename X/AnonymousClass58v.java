package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.58v */
public final class AnonymousClass58v {
    /* renamed from: B */
    public static boolean m25837B(AnonymousClass58u anonymousClass58u, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("title_text".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                return true;
            }
        } else if ("content_text".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                return true;
            }
        } else if ("step".equals(str)) {
            anonymousClass58u.f60536B = AnonymousClass58t.m25835B(jsonParser.getValueAsString());
            return true;
        } else if (!"qualifying_value".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass58u.f60537C = str2;
            return true;
        }
        jsonParser.getText();
        return true;
    }

    public static AnonymousClass58u parseFromJson(JsonParser jsonParser) {
        AnonymousClass58u anonymousClass58u = new AnonymousClass58u();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass58v.m25837B(anonymousClass58u, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass58u;
    }
}
