package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2aK */
public final class AnonymousClass2aK {
    /* renamed from: B */
    public static boolean m16335B(AnonymousClass2ep anonymousClass2ep, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("access_pw_reset_token".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2ep.f32094B = str2;
            return true;
        } else if (!"source".equals(str)) {
            return AnonymousClass2aH.m16332B(anonymousClass2ep, str, jsonParser);
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2ep.f32095C = str2;
            return true;
        }
    }

    public static AnonymousClass2ep parseFromJson(JsonParser jsonParser) {
        AnonymousClass2ep anonymousClass2ep = new AnonymousClass2ep();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2aK.m16335B(anonymousClass2ep, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2ep;
    }
}
