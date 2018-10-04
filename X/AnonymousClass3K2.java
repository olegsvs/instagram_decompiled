package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.3K2 */
public final class AnonymousClass3K2 {
    /* renamed from: B */
    public static boolean m19392B(AnonymousClass3K1 anonymousClass3K1, String str, JsonParser jsonParser) {
        if ("file_size".equals(str)) {
            anonymousClass3K1.f40136D = jsonParser.getValueAsInt();
            return true;
        }
        String str2 = null;
        if ("release_notes".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass3K1.f40139G = str2;
            return true;
        } else if ("release_number".equals(str)) {
            anonymousClass3K1.f40134B = jsonParser.getValueAsInt();
            return true;
        } else if ("release_package".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass3K1.f40138F = str2;
            return true;
        } else if ("self_update_download_uri".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass3K1.f40135C = str2;
            return true;
        } else if ("self_update_is_hard_nag".equals(str)) {
            anonymousClass3K1.f40137E = jsonParser.getValueAsBoolean();
            return true;
        } else if (!"version_name".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass3K1.f40140H = str2;
            return true;
        }
    }

    public static AnonymousClass3K1 parseFromJson(JsonParser jsonParser) {
        AnonymousClass3K1 anonymousClass3K1 = new AnonymousClass3K1();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3K2.m19392B(anonymousClass3K1, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3K1;
    }
}
