package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2Xb */
public final class AnonymousClass2Xb {
    /* renamed from: B */
    public static boolean m16218B(AnonymousClass2XK anonymousClass2XK, String str, JsonParser jsonParser) {
        if ("length".equals(str)) {
            anonymousClass2XK.f31183C = jsonParser.getValueAsInt();
            return true;
        } else if ("offset".equals(str)) {
            anonymousClass2XK.f31184D = jsonParser.getValueAsInt();
            return true;
        } else if (!"inline_style".equals(str)) {
            return false;
        } else {
            anonymousClass2XK.f31182B = AnonymousClass2Bp.m14623B(jsonParser.getValueAsString());
            return true;
        }
    }

    public static AnonymousClass2XK parseFromJson(JsonParser jsonParser) {
        AnonymousClass2XK anonymousClass2XK = new AnonymousClass2XK();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2Xb.m16218B(anonymousClass2XK, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2XK;
    }
}
