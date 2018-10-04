package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.1K3 */
public final class AnonymousClass1K3 {
    /* renamed from: B */
    public static boolean m10738B(AnonymousClass1K4 anonymousClass1K4, String str, JsonParser jsonParser) {
        if ("slot".equals(str)) {
            anonymousClass1K4.f17136C = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
            return true;
        } else if (!"cooldown".equals(str)) {
            return false;
        } else {
            anonymousClass1K4.f17135B = Long.valueOf(jsonParser.getValueAsLong());
            return true;
        }
    }

    public static AnonymousClass1K4 parseFromJson(JsonParser jsonParser) {
        AnonymousClass1K4 anonymousClass1K4 = new AnonymousClass1K4();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1K3.m10738B(anonymousClass1K4, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1K4;
    }
}
