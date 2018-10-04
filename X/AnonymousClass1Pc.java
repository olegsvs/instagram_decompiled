package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.1Pc */
public final class AnonymousClass1Pc {
    /* renamed from: B */
    public static boolean m11272B(AnonymousClass5Ju anonymousClass5Ju, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("media_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass5Ju.f62202C = str2;
            return true;
        } else if ("reel_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass5Ju.f62204E = str2;
            return true;
        } else if ("author_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass5Ju.f62203D = str2;
            return true;
        } else if (!"can_view".equals(str)) {
            return AnonymousClass0Pv.m3947B(anonymousClass5Ju, str, jsonParser);
        } else {
            anonymousClass5Ju.f62201B = jsonParser.getValueAsBoolean();
            return true;
        }
    }

    public static AnonymousClass5Ju parseFromJson(JsonParser jsonParser) {
        AnonymousClass5Ju anonymousClass5Ju = new AnonymousClass5Ju();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1Pc.m11272B(anonymousClass5Ju, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass5Ju;
    }
}
