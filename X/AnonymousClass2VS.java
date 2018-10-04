package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2VS */
public final class AnonymousClass2VS {
    /* renamed from: B */
    public static boolean m16135B(AnonymousClass28D anonymousClass28D, String str, JsonParser jsonParser) {
        if ("profile".equals(str)) {
            anonymousClass28D.f26488D = AnonymousClass2VR.parseFromJson(jsonParser);
            return true;
        } else if (!"access_token".equals(str)) {
            return false;
        } else {
            anonymousClass28D.f26486B = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
            return true;
        }
    }

    public static AnonymousClass28D parseFromJson(JsonParser jsonParser) {
        AnonymousClass28D anonymousClass28D = new AnonymousClass28D();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2VS.m16135B(anonymousClass28D, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass28D.m14541A();
    }

    public static AnonymousClass28D parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return AnonymousClass2VS.parseFromJson(createParser);
    }
}
