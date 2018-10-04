package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.35A */
public final class AnonymousClass35A {
    /* renamed from: B */
    public static boolean m18452B(AnonymousClass359 anonymousClass359, String str, JsonParser jsonParser) {
        if ("user".equals(str)) {
            anonymousClass359.f37657C = AnonymousClass0Ci.C(jsonParser);
            return true;
        } else if (!"redirect_web".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass359, str, jsonParser);
        } else {
            anonymousClass359.f37656B = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
            return true;
        }
    }

    public static AnonymousClass359 parseFromJson(JsonParser jsonParser) {
        AnonymousClass359 anonymousClass359 = new AnonymousClass359();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass35A.m18452B(anonymousClass359, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass359;
    }
}
