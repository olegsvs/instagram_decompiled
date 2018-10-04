package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2ZK */
public final class AnonymousClass2ZK {
    /* renamed from: B */
    public static boolean m16279B(AnonymousClass2Z4 anonymousClass2Z4, String str, JsonParser jsonParser) {
        if ("param_name".equals(str)) {
            anonymousClass2Z4.f31299B = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
            return true;
        } else if (!"survey_param_type".equals(str)) {
            return false;
        } else {
            anonymousClass2Z4.f31300C = AnonymousClass2C2.m14636B(jsonParser.getValueAsString());
            return true;
        }
    }

    public static AnonymousClass2Z4 parseFromJson(JsonParser jsonParser) {
        AnonymousClass2Z4 anonymousClass2Z4 = new AnonymousClass2Z4();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2ZK.m16279B(anonymousClass2Z4, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2Z4;
    }
}
