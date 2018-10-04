package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.5H6 */
public final class AnonymousClass5H6 {
    /* renamed from: B */
    public static boolean m26137B(AnonymousClass5H5 anonymousClass5H5, String str, JsonParser jsonParser) {
        if ("disabled".equals(str)) {
            anonymousClass5H5.f61742B = jsonParser.getValueAsBoolean();
            return true;
        } else if (!"thread_presence_disabled".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass5H5, str, jsonParser);
        } else {
            anonymousClass5H5.f61743C = jsonParser.getValueAsBoolean();
            return true;
        }
    }

    public static AnonymousClass5H5 parseFromJson(JsonParser jsonParser) {
        AnonymousClass5H5 anonymousClass5H5 = new AnonymousClass5H5();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass5H6.m26137B(anonymousClass5H5, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass5H5;
    }
}
