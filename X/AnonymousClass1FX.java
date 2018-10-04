package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.1FX */
public final class AnonymousClass1FX {
    /* renamed from: B */
    public static boolean m10356B(AnonymousClass1Hh anonymousClass1Hh, String str, JsonParser jsonParser) {
        if (!"presence_event".equals(str)) {
            return false;
        }
        anonymousClass1Hh.f16792B = AnonymousClass1hK.parseFromJson(jsonParser);
        return true;
    }

    public static AnonymousClass1Hh parseFromJson(JsonParser jsonParser) {
        AnonymousClass1Hh anonymousClass1Hh = new AnonymousClass1Hh();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1FX.m10356B(anonymousClass1Hh, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        anonymousClass1Hh.f16793C = anonymousClass1Hh.f16792B.f16797E;
        return anonymousClass1Hh;
    }

    public static AnonymousClass1Hh parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return AnonymousClass1FX.parseFromJson(createParser);
    }
}
