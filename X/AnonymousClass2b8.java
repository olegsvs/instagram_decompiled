package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2b8 */
public final class AnonymousClass2b8 {
    /* renamed from: B */
    public static boolean m16387B(AnonymousClass2Eo anonymousClass2Eo, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("vetted_phone_reg_login_uid".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2Eo.f27932D = str2;
            return true;
        } else if ("vetted_phone_reg_login_nonce".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2Eo.f27930B = str2;
            return true;
        } else if ("vetted_phone_reg_login_username".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2Eo.f27933E = str2;
            return true;
        } else if (!"vetted_phone_reg_login_profile_pic_url".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass2Eo, str, jsonParser);
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2Eo.f27931C = str2;
            return true;
        }
    }
}
