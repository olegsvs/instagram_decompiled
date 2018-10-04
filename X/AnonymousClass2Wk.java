package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2Wk */
public final class AnonymousClass2Wk {
    /* renamed from: B */
    public static boolean m16183B(AnonymousClass2ea anonymousClass2ea, String str, JsonParser jsonParser) {
        if (!"cta".equals(str)) {
            return false;
        }
        anonymousClass2ea.f32012B = AnonymousClass2Wj.parseFromJson(jsonParser);
        return true;
    }

    public static AnonymousClass2ea parseFromJson(JsonParser jsonParser) {
        AnonymousClass2ea anonymousClass2ea = new AnonymousClass2ea();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2Wk.m16183B(anonymousClass2ea, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2ea;
    }
}
