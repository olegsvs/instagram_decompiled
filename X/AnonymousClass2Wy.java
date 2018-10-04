package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2Wy */
public final class AnonymousClass2Wy {
    /* renamed from: B */
    public static boolean m16197B(AnonymousClass2Wa anonymousClass2Wa, String str, JsonParser jsonParser) {
        if (!"node".equals(str)) {
            return false;
        }
        anonymousClass2Wa.f31138B = AnonymousClass2Wx.parseFromJson(jsonParser);
        return true;
    }

    public static AnonymousClass2Wa parseFromJson(JsonParser jsonParser) {
        AnonymousClass2Wa anonymousClass2Wa = new AnonymousClass2Wa();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2Wy.m16197B(anonymousClass2Wa, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2Wa;
    }
}
