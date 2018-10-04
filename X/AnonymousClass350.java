package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.350 */
public final class AnonymousClass350 {
    /* renamed from: B */
    public static boolean m18447B(AnonymousClass34z anonymousClass34z, String str, JsonParser jsonParser) {
        if (!"normalized_phone_number".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass34z, str, jsonParser);
        }
        anonymousClass34z.f37645B = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
        return true;
    }

    public static AnonymousClass34z parseFromJson(JsonParser jsonParser) {
        AnonymousClass34z anonymousClass34z = new AnonymousClass34z();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass350.m18447B(anonymousClass34z, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass34z;
    }
}
