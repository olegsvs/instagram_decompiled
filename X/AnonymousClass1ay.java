package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.1ay */
public final class AnonymousClass1ay {
    /* renamed from: B */
    public static boolean m11958B(AnonymousClass1cA anonymousClass1cA, String str, JsonParser jsonParser) {
        if (!"comment_typing_indicator_event".equals(str)) {
            return false;
        }
        anonymousClass1cA.f20607B = AnonymousClass4Fn.parseFromJson(jsonParser);
        return true;
    }

    public static AnonymousClass1cA parseFromJson(JsonParser jsonParser) {
        AnonymousClass1cA anonymousClass1cA = new AnonymousClass1cA();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1ay.m11958B(anonymousClass1cA, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1cA;
    }

    public static AnonymousClass1cA parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return AnonymousClass1ay.parseFromJson(createParser);
    }
}
