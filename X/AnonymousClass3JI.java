package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.3JI */
public final class AnonymousClass3JI {
    /* renamed from: B */
    public static boolean m19335B(AnonymousClass3JH anonymousClass3JH, String str, JsonParser jsonParser) {
        if (!"post_live_broadcast".equals(str)) {
            return false;
        }
        anonymousClass3JH.f40019B = AnonymousClass0QA.parseFromJson(jsonParser);
        return true;
    }

    public static AnonymousClass3JH parseFromJson(JsonParser jsonParser) {
        AnonymousClass3JH anonymousClass3JH = new AnonymousClass3JH();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3JI.m19335B(anonymousClass3JH, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3JH;
    }
}
