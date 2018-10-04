package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.1N4 */
public final class AnonymousClass1N4 {
    /* renamed from: B */
    public static boolean m11030B(AnonymousClass1N5 anonymousClass1N5, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("phone_number".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1N5.f17764C = str2;
            return true;
        } else if (!"email".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1N5.f17763B = str2;
            return true;
        }
    }

    public static AnonymousClass1N5 parseFromJson(JsonParser jsonParser) {
        AnonymousClass1N5 anonymousClass1N5 = new AnonymousClass1N5();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1N4.m11030B(anonymousClass1N5, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1N5;
    }
}
