package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.3g0 */
public final class AnonymousClass3g0 {
    /* renamed from: B */
    public static boolean m20395B(AnonymousClass3fx anonymousClass3fx, String str, JsonParser jsonParser) {
        if (!"label".equals(str)) {
            return false;
        }
        anonymousClass3fx.f43220B = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
        return true;
    }

    public static AnonymousClass3fx parseFromJson(JsonParser jsonParser) {
        AnonymousClass3fx anonymousClass3fx = new AnonymousClass3fx();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3g0.m20395B(anonymousClass3fx, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3fx;
    }
}
