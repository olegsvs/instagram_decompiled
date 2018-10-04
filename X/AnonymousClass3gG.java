package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.3gG */
public final class AnonymousClass3gG {
    /* renamed from: B */
    public static boolean m20401B(AnonymousClass3gE anonymousClass3gE, String str, JsonParser jsonParser) {
        if ("creation_time".equals(str)) {
            anonymousClass3gE.f43258D = jsonParser.getValueAsLong();
            return true;
        } else if ("comment".equals(str)) {
            anonymousClass3gE.f43256B = AnonymousClass122.parseFromJson(jsonParser);
            return true;
        } else {
            String str2 = null;
            if ("container_module".equals(str)) {
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    str2 = jsonParser.getText();
                }
                anonymousClass3gE.f43257C = str2;
                return true;
            } else if (!"radio_type".equals(str)) {
                return false;
            } else {
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    str2 = jsonParser.getText();
                }
                anonymousClass3gE.f43259E = str2;
                return true;
            }
        }
    }

    public static AnonymousClass3gE parseFromJson(JsonParser jsonParser) {
        AnonymousClass3gE anonymousClass3gE = new AnonymousClass3gE();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3gG.m20401B(anonymousClass3gE, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3gE;
    }
}
