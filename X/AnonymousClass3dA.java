package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.3dA */
public final class AnonymousClass3dA {
    /* renamed from: B */
    public static boolean m20226B(AnonymousClass3d9 anonymousClass3d9, String str, JsonParser jsonParser) {
        if ("more_available".equals(str)) {
            Boolean.valueOf(jsonParser.getValueAsBoolean());
            return true;
        } else if (!"next_max_id".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass3d9, str, jsonParser);
        } else {
            anonymousClass3d9.f42865C = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
            return true;
        }
    }
}
