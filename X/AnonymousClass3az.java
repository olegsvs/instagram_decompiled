package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.3az */
public final class AnonymousClass3az {
    /* renamed from: B */
    public static boolean m20136B(AnonymousClass1R6 anonymousClass1R6, String str, JsonParser jsonParser) {
        if (!"voter_info".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass1R6, str, jsonParser);
        }
        anonymousClass1R6.f18527B = AnonymousClass1Ie.parseFromJson(jsonParser);
        return true;
    }

    public static AnonymousClass1R6 parseFromJson(JsonParser jsonParser) {
        AnonymousClass1R6 anonymousClass1R6 = new AnonymousClass1R6();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3az.m20136B(anonymousClass1R6, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1R6;
    }
}
