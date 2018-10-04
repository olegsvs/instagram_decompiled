package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.1Dc */
public final class AnonymousClass1Dc {
    /* renamed from: B */
    public static boolean m10088B(AnonymousClass19A anonymousClass19A, String str, JsonParser jsonParser) {
        if ("node".equals(str)) {
            anonymousClass19A.f15084C = AnonymousClass1bp.parseFromJson(jsonParser);
            return true;
        } else if ("time_range".equals(str)) {
            anonymousClass19A.f15085D = AnonymousClass1bq.parseFromJson(jsonParser);
            return true;
        } else if ("is_holdout".equals(str)) {
            Boolean.valueOf(jsonParser.getValueAsBoolean());
            return true;
        } else if ("priority".equals(str)) {
            anonymousClass19A.f15086E = Integer.valueOf(jsonParser.getValueAsInt());
            return true;
        } else if (!"client_ttl_seconds".equals(str)) {
            return false;
        } else {
            anonymousClass19A.f15083B = Long.valueOf(jsonParser.getValueAsLong());
            return true;
        }
    }

    public static AnonymousClass19A parseFromJson(JsonParser jsonParser) {
        AnonymousClass19A anonymousClass19A = new AnonymousClass19A();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1Dc.m10088B(anonymousClass19A, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass19A;
    }
}
