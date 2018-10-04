package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2Wv */
public final class AnonymousClass2Wv {
    /* renamed from: B */
    public static boolean m16194B(AnonymousClass2WX anonymousClass2WX, String str, JsonParser jsonParser) {
        if ("reach".equals(str)) {
            anonymousClass2WX.f31127B = jsonParser.getValueAsInt();
            return true;
        } else if (!"website_clicks".equals(str)) {
            return false;
        } else {
            anonymousClass2WX.f31128C = jsonParser.getValueAsInt();
            return true;
        }
    }

    public static AnonymousClass2WX parseFromJson(JsonParser jsonParser) {
        AnonymousClass2WX anonymousClass2WX = new AnonymousClass2WX();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2Wv.m16194B(anonymousClass2WX, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2WX;
    }
}
