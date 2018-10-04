package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.1ap */
public final class AnonymousClass1ap {
    /* renamed from: B */
    public static boolean m11948B(AnonymousClass1aq anonymousClass1aq, String str, JsonParser jsonParser) {
        if (!"facebook".equals(str)) {
            return false;
        }
        anonymousClass1aq.f20376B = AnonymousClass1ar.parseFromJson(jsonParser);
        return true;
    }

    public static AnonymousClass1aq parseFromJson(JsonParser jsonParser) {
        AnonymousClass1aq anonymousClass1aq = new AnonymousClass1aq();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1ap.m11948B(anonymousClass1aq, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1aq;
    }
}
