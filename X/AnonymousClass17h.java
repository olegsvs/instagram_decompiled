package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.17h */
public final class AnonymousClass17h {
    /* renamed from: B */
    public static boolean m9492B(AnonymousClass1a2 anonymousClass1a2, String str, JsonParser jsonParser) {
        if ("should_use_time_to_most_active_hour".equals(str)) {
            anonymousClass1a2.f20297B = jsonParser.getValueAsBoolean();
            return true;
        } else if (!"time_to_most_active_hour_ms".equals(str)) {
            return AnonymousClass0Pv.m3947B(anonymousClass1a2, str, jsonParser);
        } else {
            anonymousClass1a2.f20298C = jsonParser.getValueAsLong();
            return true;
        }
    }

    public static AnonymousClass1a2 parseFromJson(JsonParser jsonParser) {
        AnonymousClass1a2 anonymousClass1a2 = new AnonymousClass1a2();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass17h.m9492B(anonymousClass1a2, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1a2;
    }
}
