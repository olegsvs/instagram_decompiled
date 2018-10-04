package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.0ZV */
public final class AnonymousClass0ZV {
    /* renamed from: B */
    public static boolean m5373B(AnonymousClass0ZU anonymousClass0ZU, String str, JsonParser jsonParser) {
        if ("sub_share_id".equals(str)) {
            anonymousClass0ZU.f6353C = jsonParser.getValueAsInt();
            return true;
        } else if (!"is_configured_in_server".equals(str)) {
            return false;
        } else {
            anonymousClass0ZU.f6352B = jsonParser.getValueAsBoolean();
            return true;
        }
    }

    public static AnonymousClass0ZU parseFromJson(JsonParser jsonParser) {
        AnonymousClass0ZU anonymousClass0ZU = new AnonymousClass0ZU();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass0ZV.m5373B(anonymousClass0ZU, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0ZU;
    }
}
