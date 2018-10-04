package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.4Ar */
public final class AnonymousClass4Ar {
    /* renamed from: B */
    public static boolean m23480B(AnonymousClass4Ap anonymousClass4Ap, String str, JsonParser jsonParser) {
        if (!"async_ads_event".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass4Ap, str, jsonParser);
        }
        anonymousClass4Ap.f51153B = AnonymousClass4Aq.parseFromJson(jsonParser);
        return true;
    }

    public static AnonymousClass4Ap parseFromJson(JsonParser jsonParser) {
        AnonymousClass4Ap anonymousClass4Ap = new AnonymousClass4Ap();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass4Ar.m23480B(anonymousClass4Ap, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass4Ap;
    }

    public static AnonymousClass4Ap parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return AnonymousClass4Ar.parseFromJson(createParser);
    }
}
