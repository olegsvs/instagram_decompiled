package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.3ep */
public final class AnonymousClass3ep {
    /* renamed from: B */
    public static boolean m20309B(AnonymousClass3en anonymousClass3en, String str, JsonParser jsonParser) {
        if (!"theme".equals(str)) {
            return false;
        }
        anonymousClass3en.f43061B = AnonymousClass3er.parseFromJson(jsonParser);
        return true;
    }

    public static AnonymousClass3en parseFromJson(JsonParser jsonParser) {
        AnonymousClass3en anonymousClass3en = new AnonymousClass3en();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3ep.m20309B(anonymousClass3en, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3en;
    }
}
