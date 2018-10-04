package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.3lU */
public final class AnonymousClass3lU {
    /* renamed from: B */
    public static boolean m20602B(AnonymousClass3lT anonymousClass3lT, String str, JsonParser jsonParser) {
        if ("friendship_status".equals(str)) {
            anonymousClass3lT.f44178C = AnonymousClass3lW.parseFromJson(jsonParser);
            return true;
        } else if (!"age_gated_info".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass3lT, str, jsonParser);
        } else {
            anonymousClass3lT.f44177B = AnonymousClass2zF.parseFromJson(jsonParser);
            return true;
        }
    }

    public static AnonymousClass3lT parseFromJson(JsonParser jsonParser) {
        AnonymousClass3lT anonymousClass3lT = new AnonymousClass3lT();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3lU.m20602B(anonymousClass3lT, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3lT;
    }
}
