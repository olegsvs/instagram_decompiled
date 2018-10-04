package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.model.venue.Venue;

/* renamed from: X.3T2 */
public final class AnonymousClass3T2 {
    /* renamed from: B */
    public static boolean m19691B(AnonymousClass3T1 anonymousClass3T1, String str, JsonParser jsonParser) {
        if (!"location".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass3T1, str, jsonParser);
        }
        anonymousClass3T1.f41450B = Venue.parseFromJson(jsonParser, true);
        return true;
    }

    public static AnonymousClass3T1 parseFromJson(JsonParser jsonParser) {
        AnonymousClass3T1 anonymousClass3T1 = new AnonymousClass3T1();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3T2.m19691B(anonymousClass3T1, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3T1;
    }
}
