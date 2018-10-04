package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.1KL */
public final class AnonymousClass1KL {
    /* renamed from: B */
    public static boolean m10763B(AnonymousClass1K9 anonymousClass1K9, String str, JsonParser jsonParser) {
        if ("user".equals(str)) {
            anonymousClass1K9.f17152D = AnonymousClass0Ci.m980B(jsonParser);
            return true;
        } else if ("place".equals(str)) {
            anonymousClass1K9.f17151C = AnonymousClass1Aj.parseFromJson(jsonParser);
            return true;
        } else if (!"hashtag".equals(str)) {
            return AnonymousClass1KM.m10764B(anonymousClass1K9, str, jsonParser);
        } else {
            anonymousClass1K9.f17150B = AnonymousClass19n.parseFromJson(jsonParser);
            return true;
        }
    }

    public static AnonymousClass1K9 parseFromJson(JsonParser jsonParser) {
        AnonymousClass1K9 anonymousClass1K9 = new AnonymousClass1K9();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1KL.m10763B(anonymousClass1K9, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1K9.m10749G();
    }
}
