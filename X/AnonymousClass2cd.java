package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2cd */
public final class AnonymousClass2cd {
    /* renamed from: B */
    public static boolean m16546B(AnonymousClass2ME anonymousClass2ME, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("national_number".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                return true;
            }
        } else if ("country_code".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                return true;
            }
        } else if ("phone_number".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2ME.f29522C = str2;
            return true;
        } else if ("verification_code".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2ME.f29523D = str2;
            return true;
        } else if (!"email".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass2ME, str, jsonParser);
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2ME.f29521B = str2;
            return true;
        }
        jsonParser.getText();
        return true;
    }

    public static AnonymousClass2ME parseFromJson(JsonParser jsonParser) {
        AnonymousClass2ME anonymousClass2ME = new AnonymousClass2ME();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2cd.m16546B(anonymousClass2ME, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2ME;
    }
}
