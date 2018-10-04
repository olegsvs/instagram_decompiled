package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.3cS */
public final class AnonymousClass3cS {
    /* renamed from: B */
    public static boolean m20196B(AnonymousClass3cR anonymousClass3cR, String str, JsonParser jsonParser) {
        if (!"profile_to_share_url".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass3cR, str, jsonParser);
        }
        anonymousClass3cR.f42756B = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
        return true;
    }

    public static AnonymousClass3cR parseFromJson(JsonParser jsonParser) {
        AnonymousClass3cR anonymousClass3cR = new AnonymousClass3cR();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3cS.m20196B(anonymousClass3cR, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3cR;
    }
}
