package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2Xs */
public final class AnonymousClass2Xs {
    /* renamed from: B */
    public static boolean m16227B(AnonymousClass2Xp anonymousClass2Xp, String str, JsonParser jsonParser) {
        if (!"page".equals(str)) {
            return false;
        }
        anonymousClass2Xp.f31201B = AnonymousClass2Xr.parseFromJson(jsonParser);
        return true;
    }

    public static AnonymousClass2Xp parseFromJson(JsonParser jsonParser) {
        AnonymousClass2Xp anonymousClass2Xp = new AnonymousClass2Xp();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2Xs.m16227B(anonymousClass2Xp, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2Xp;
    }
}
