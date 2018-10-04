package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2Xi */
public final class AnonymousClass2Xi {
    /* renamed from: B */
    public static boolean m16222B(AnonymousClass2Xf anonymousClass2Xf, String str, JsonParser jsonParser) {
        if (!"search_results".equals(str)) {
            return false;
        }
        anonymousClass2Xf.f31192B = AnonymousClass2Xh.parseFromJson(jsonParser);
        return true;
    }

    public static AnonymousClass2Xf parseFromJson(JsonParser jsonParser) {
        AnonymousClass2Xf anonymousClass2Xf = new AnonymousClass2Xf();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2Xi.m16222B(anonymousClass2Xf, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2Xf;
    }
}
