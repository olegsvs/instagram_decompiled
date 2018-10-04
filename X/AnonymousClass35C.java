package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.35C */
public final class AnonymousClass35C {
    /* renamed from: B */
    public static boolean m18453B(AnonymousClass35B anonymousClass35B, String str, JsonParser jsonParser) {
        if (!"social_context".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass35B, str, jsonParser);
        }
        anonymousClass35B.f37658B = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
        return true;
    }

    public static AnonymousClass35B parseFromJson(JsonParser jsonParser) {
        AnonymousClass35B anonymousClass35B = new AnonymousClass35B();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass35C.m18453B(anonymousClass35B, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass35B;
    }
}
