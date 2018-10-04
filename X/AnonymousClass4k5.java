package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.4k5 */
public final class AnonymousClass4k5 {
    /* renamed from: B */
    public static boolean m24948B(AnonymousClass4k4 anonymousClass4k4, String str, JsonParser jsonParser) {
        if (!"animated_media".equals(str)) {
            return AnonymousClass0XV.B(anonymousClass4k4, str, jsonParser);
        }
        anonymousClass4k4.f56717B = AnonymousClass4dk.parseFromJson(jsonParser);
        return true;
    }

    public static AnonymousClass4k4 parseFromJson(JsonParser jsonParser) {
        AnonymousClass4k4 anonymousClass4k4 = new AnonymousClass4k4();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass4k5.m24948B(anonymousClass4k4, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass4k4;
    }
}
