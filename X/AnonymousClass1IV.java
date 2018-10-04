package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.1IV */
public final class AnonymousClass1IV {
    /* renamed from: B */
    public static boolean m10657B(AnonymousClass1IW anonymousClass1IW, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1IW.f16886C = str2;
            return true;
        } else if ("response".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1IW.f16888E = str2;
            return true;
        } else if ("user".equals(str)) {
            anonymousClass1IW.f16887D = AnonymousClass0Ci.m980B(jsonParser);
            return true;
        } else if ("ts".equals(str)) {
            anonymousClass1IW.f16889F = jsonParser.getValueAsLong();
            return true;
        } else if (!"has_shared_response".equals(str)) {
            return false;
        } else {
            anonymousClass1IW.f16885B = jsonParser.getValueAsBoolean();
            return true;
        }
    }

    public static AnonymousClass1IW parseFromJson(JsonParser jsonParser) {
        AnonymousClass1IW anonymousClass1IW = new AnonymousClass1IW();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1IV.m10657B(anonymousClass1IW, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1IW;
    }
}
