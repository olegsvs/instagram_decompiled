package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2ZO */
public final class AnonymousClass2ZO {
    /* renamed from: B */
    public static boolean m16283B(AnonymousClass2Z8 anonymousClass2Z8, String str, JsonParser jsonParser) {
        if ("__typename".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                return true;
            }
        } else if ("id".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                return true;
            }
        } else if ("name".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                return true;
            }
        } else if (!"survey_session".equals(str)) {
            return false;
        } else {
            anonymousClass2Z8.f31309B = AnonymousClass2ZM.parseFromJson(jsonParser);
            return true;
        }
        jsonParser.getText();
        return true;
    }

    public static AnonymousClass2Z8 parseFromJson(JsonParser jsonParser) {
        AnonymousClass2Z8 anonymousClass2Z8 = new AnonymousClass2Z8();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2ZO.m16283B(anonymousClass2Z8, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2Z8;
    }
}
