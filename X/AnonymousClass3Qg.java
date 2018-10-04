package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.3Qg */
public final class AnonymousClass3Qg {
    /* renamed from: B */
    public static boolean m19618B(AnonymousClass3Qe anonymousClass3Qe, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("device_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                jsonParser.getText();
            }
            return true;
        } else if ("product_name".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass3Qe.f41160B = str2;
            return true;
        } else if (!"zero_provisioned_time".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass3Qe.f41161C = str2;
            return true;
        }
    }

    public static AnonymousClass3Qe parseFromJson(JsonParser jsonParser) {
        AnonymousClass3Qe anonymousClass3Qe = new AnonymousClass3Qe();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3Qg.m19618B(anonymousClass3Qe, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3Qe;
    }
}
