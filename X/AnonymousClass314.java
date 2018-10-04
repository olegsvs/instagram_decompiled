package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.314 */
public final class AnonymousClass314 {
    /* renamed from: B */
    public static boolean m18209B(AnonymousClass313 anonymousClass313, String str, JsonParser jsonParser) {
        if (!"user".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass313, str, jsonParser);
        }
        anonymousClass313.f36940B = AnonymousClass0Ci.B(jsonParser);
        return true;
    }

    public static AnonymousClass313 parseFromJson(JsonParser jsonParser) {
        AnonymousClass313 anonymousClass313 = new AnonymousClass313();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass314.m18209B(anonymousClass313, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass313;
    }
}
