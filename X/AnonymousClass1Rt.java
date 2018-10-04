package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.1Rt */
public final class AnonymousClass1Rt {
    /* renamed from: B */
    public static boolean m11454B(AnonymousClass5mF anonymousClass5mF, String str, JsonParser jsonParser) {
        if (!"requires_review".equals(str)) {
            return AnonymousClass11j.m8822B(anonymousClass5mF, str, jsonParser);
        }
        anonymousClass5mF.f68870B = Boolean.valueOf(jsonParser.getValueAsBoolean());
        return true;
    }

    public static AnonymousClass5mF parseFromJson(JsonParser jsonParser) {
        AnonymousClass5mF anonymousClass5mF = new AnonymousClass5mF();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1Rt.m11454B(anonymousClass5mF, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass5mF.I();
    }
}
