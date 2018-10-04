package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.3ll */
public final class AnonymousClass3ll {
    /* renamed from: B */
    public static boolean m20610B(AnonymousClass3lk anonymousClass3lk, String str, JsonParser jsonParser) {
        if (!"user".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass3lk, str, jsonParser);
        }
        anonymousClass3lk.f44222B = AnonymousClass0Ci.B(jsonParser);
        return true;
    }

    public static AnonymousClass3lk parseFromJson(JsonParser jsonParser) {
        AnonymousClass3lk anonymousClass3lk = new AnonymousClass3lk();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3ll.m20610B(anonymousClass3lk, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3lk;
    }
}
