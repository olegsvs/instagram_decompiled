package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.3Su */
public final class AnonymousClass3Su {
    /* renamed from: B */
    public static boolean m19688B(AnonymousClass3St anonymousClass3St, String str, JsonParser jsonParser) {
        if (!"ig_business_profile".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass3St, str, jsonParser);
        }
        anonymousClass3St.f41437B = AnonymousClass0Ci.B(jsonParser);
        return true;
    }

    public static AnonymousClass3St parseFromJson(JsonParser jsonParser) {
        AnonymousClass3St anonymousClass3St = new AnonymousClass3St();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3Su.m19688B(anonymousClass3St, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3St;
    }
}
