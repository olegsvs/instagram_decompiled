package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2Wm */
public final class AnonymousClass2Wm {
    /* renamed from: B */
    public static boolean m16185B(AnonymousClass2WQ anonymousClass2WQ, String str, JsonParser jsonParser) {
        if ("length".equals(str)) {
            anonymousClass2WQ.f31116C = jsonParser.getValueAsInt();
            return true;
        } else if ("offset".equals(str)) {
            anonymousClass2WQ.f31117D = jsonParser.getValueAsInt();
            return true;
        } else if (!"entity".equals(str)) {
            return false;
        } else {
            anonymousClass2WQ.f31115B = AnonymousClass2Wl.parseFromJson(jsonParser);
            return true;
        }
    }

    public static AnonymousClass2WQ parseFromJson(JsonParser jsonParser) {
        AnonymousClass2WQ anonymousClass2WQ = new AnonymousClass2WQ();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2Wm.m16185B(anonymousClass2WQ, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2WQ;
    }
}
