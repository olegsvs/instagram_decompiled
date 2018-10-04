package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2aW */
public final class AnonymousClass2aW {
    /* renamed from: B */
    public static boolean m16347B(AnonymousClass2Dp anonymousClass2Dp, String str, JsonParser jsonParser) {
        if ("two_factor_required".equals(str)) {
            anonymousClass2Dp.f27693D = jsonParser.getValueAsBoolean();
            return true;
        } else if ("two_factor_info".equals(str)) {
            anonymousClass2Dp.f27692C = AnonymousClass2aX.parseFromJson(jsonParser);
            return true;
        } else if (!"phone_verification_settings".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass2Dp, str, jsonParser);
        } else {
            anonymousClass2Dp.f27691B = AnonymousClass2aN.parseFromJson(jsonParser);
            return true;
        }
    }

    public static AnonymousClass2Dp parseFromJson(JsonParser jsonParser) {
        AnonymousClass2Dp anonymousClass2Dp = new AnonymousClass2Dp();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2aW.m16347B(anonymousClass2Dp, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2Dp;
    }
}
