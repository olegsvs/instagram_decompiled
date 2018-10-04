package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.4ge */
public final class AnonymousClass4ge {
    /* renamed from: B */
    public static boolean m24767B(AnonymousClass1dR anonymousClass1dR, String str, JsonParser jsonParser) {
        if (!"sender_id".equals(str)) {
            return false;
        }
        anonymousClass1dR.f20740B = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
        return true;
    }

    public static AnonymousClass1dR parseFromJson(JsonParser jsonParser) {
        AnonymousClass1dR anonymousClass1dR = new AnonymousClass1dR();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass4ge.m24767B(anonymousClass1dR, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1dR;
    }
}
