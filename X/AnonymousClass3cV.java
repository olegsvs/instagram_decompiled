package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.3cV */
public final class AnonymousClass3cV {
    /* renamed from: B */
    public static boolean m20198B(AnonymousClass3cU anonymousClass3cU, String str, JsonParser jsonParser) {
        if (!"media".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass3cU, str, jsonParser);
        }
        anonymousClass3cU.f42757B = AnonymousClass0P7.B(jsonParser, true);
        return true;
    }

    public static AnonymousClass3cU parseFromJson(JsonParser jsonParser) {
        AnonymousClass3cU anonymousClass3cU = new AnonymousClass3cU();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3cV.m20198B(anonymousClass3cU, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3cU;
    }
}
