package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2Wp */
public final class AnonymousClass2Wp {
    /* renamed from: B */
    public static boolean m16188B(AnonymousClass2WS anonymousClass2WS, String str, JsonParser jsonParser) {
        if (!"id".equals(str)) {
            return false;
        }
        anonymousClass2WS.f31120B = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
        return true;
    }

    public static AnonymousClass2WS parseFromJson(JsonParser jsonParser) {
        AnonymousClass2WS anonymousClass2WS = new AnonymousClass2WS();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2Wp.m16188B(anonymousClass2WS, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2WS;
    }
}
