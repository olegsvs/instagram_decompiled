package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.64V */
public final class AnonymousClass64V {
    /* renamed from: B */
    public static boolean m28873B(AnonymousClass6FP anonymousClass6FP, String str, JsonParser jsonParser) {
        if ("user".equals(str)) {
            anonymousClass6FP.f73419E = AnonymousClass0Ci.B(jsonParser);
            return true;
        } else if ("suggested_users".equals(str)) {
            anonymousClass6FP.f73418D = AnonymousClass11h.parseFromJson(jsonParser);
            return true;
        } else if ("user_story".equals(str)) {
            anonymousClass6FP.f73420F = AnonymousClass3V7.parseFromJson(jsonParser);
            return true;
        } else if (!"has_stories".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass6FP, str, jsonParser);
        } else {
            anonymousClass6FP.f73416B = Boolean.valueOf(jsonParser.getValueAsBoolean());
            return true;
        }
    }

    public static AnonymousClass6FP parseFromJson(JsonParser jsonParser) {
        AnonymousClass6FP anonymousClass6FP = new AnonymousClass6FP();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass64V.m28873B(anonymousClass6FP, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass6FP;
    }
}
