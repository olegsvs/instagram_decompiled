package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2W6 */
public final class AnonymousClass2W6 {
    /* renamed from: B */
    public static boolean m16163B(AnonymousClass2Vu anonymousClass2Vu, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("postal_code".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2Vu.f31077B = str2;
            return true;
        } else if ("single_line_full_address".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2Vu.f31078C = str2;
            return true;
        } else if (!"street".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2Vu.f31079D = str2;
            return true;
        }
    }

    public static AnonymousClass2Vu parseFromJson(JsonParser jsonParser) {
        AnonymousClass2Vu anonymousClass2Vu = new AnonymousClass2Vu();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2W6.m16163B(anonymousClass2Vu, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2Vu;
    }
}
