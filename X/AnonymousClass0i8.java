package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.0i8 */
public final class AnonymousClass0i8 {
    /* renamed from: B */
    public static boolean m6837B(AnonymousClass1Vs anonymousClass1Vs, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("fbid".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1Vs.f19395C = str2;
            return true;
        } else if (!"access_token".equals(str)) {
            return AnonymousClass0Pv.m3947B(anonymousClass1Vs, str, jsonParser);
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1Vs.f19394B = str2;
            return true;
        }
    }

    public static AnonymousClass1Vs parseFromJson(JsonParser jsonParser) {
        AnonymousClass1Vs anonymousClass1Vs = new AnonymousClass1Vs();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass0i8.m6837B(anonymousClass1Vs, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1Vs;
    }
}
