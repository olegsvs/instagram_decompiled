package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.3oR */
public final class AnonymousClass3oR {
    /* renamed from: B */
    public static boolean m20751B(AnonymousClass3oP anonymousClass3oP, String str, JsonParser jsonParser) {
        if (!"payload".equals(str)) {
            return false;
        }
        anonymousClass3oP.f44776B = AnonymousClass3oQ.parseFromJson(jsonParser);
        return true;
    }

    public static AnonymousClass3oP parseFromJson(JsonParser jsonParser) {
        AnonymousClass3oP anonymousClass3oP = new AnonymousClass3oP();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3oR.m20751B(anonymousClass3oP, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3oP;
    }

    public static AnonymousClass3oP parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return AnonymousClass3oR.parseFromJson(createParser);
    }
}
