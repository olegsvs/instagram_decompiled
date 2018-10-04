package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.4uD */
public final class AnonymousClass4uD {
    /* renamed from: B */
    public static boolean m25312B(AnonymousClass4uC anonymousClass4uC, String str, JsonParser jsonParser) {
        if (!"encoded_server_data_info".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass4uC, str, jsonParser);
        }
        anonymousClass4uC.f58338B = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
        return true;
    }
}
