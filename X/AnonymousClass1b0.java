package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.1b0 */
public final class AnonymousClass1b0 {
    /* renamed from: B */
    public static boolean m11960B(AnonymousClass0rY anonymousClass0rY, String str, JsonParser jsonParser) {
        if (!"text".equals(str)) {
            return false;
        }
        anonymousClass0rY.f11230B = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
        return true;
    }
}
