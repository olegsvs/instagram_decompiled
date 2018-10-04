package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.1f0 */
public final class AnonymousClass1f0 {
    /* renamed from: B */
    public static boolean m12356B(AnonymousClass1f1 anonymousClass1f1, String str, JsonParser jsonParser) {
        if (!"pending_count".equals(str)) {
            return false;
        }
        anonymousClass1f1.f21071B = jsonParser.getValueAsInt();
        return true;
    }

    public static AnonymousClass1f1 parseFromJson(JsonParser jsonParser) {
        AnonymousClass1f1 anonymousClass1f1 = new AnonymousClass1f1();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1f0.m12356B(anonymousClass1f1, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1f1;
    }
}
