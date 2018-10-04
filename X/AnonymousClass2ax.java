package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2ax */
public final class AnonymousClass2ax {
    /* renamed from: B */
    public static boolean m16377B(AnonymousClass2Ef anonymousClass2Ef, String str, JsonParser jsonParser) {
        if ("valid".equals(str)) {
            anonymousClass2Ef.f27912G = jsonParser.getValueAsBoolean();
            return true;
        } else if ("available".equals(str)) {
            anonymousClass2Ef.f27907B = jsonParser.getValueAsBoolean();
            return true;
        } else {
            String str2 = null;
            if ("server_corrected_email".equals(str)) {
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    str2 = jsonParser.getText();
                }
                anonymousClass2Ef.f27910E = str2;
                return true;
            } else if ("valid_nonce".equals(str)) {
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    str2 = jsonParser.getText();
                }
                anonymousClass2Ef.f27913H = str2;
                return true;
            } else if ("gdpr_required".equals(str)) {
                anonymousClass2Ef.f27909D = jsonParser.getValueAsBoolean();
                return true;
            } else if ("gdpr_s".equals(str)) {
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    str2 = jsonParser.getText();
                }
                anonymousClass2Ef.f27908C = str2;
                return true;
            } else if (!"tos_version".equals(str)) {
                return AnonymousClass0Pv.B(anonymousClass2Ef, str, jsonParser);
            } else {
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    str2 = jsonParser.getText();
                }
                anonymousClass2Ef.f27911F = str2;
                return true;
            }
        }
    }

    public static AnonymousClass2Ef parseFromJson(JsonParser jsonParser) {
        AnonymousClass2Ef anonymousClass2Ef = new AnonymousClass2Ef();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2ax.m16377B(anonymousClass2Ef, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2Ef;
    }
}
