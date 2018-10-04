package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.36j */
public final class AnonymousClass36j {
    /* renamed from: B */
    public static boolean m18540B(AnonymousClass36i anonymousClass36i, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("token".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass36i.f37900D = str2;
            return true;
        } else if ("text".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass36i.f37899C = str2;
            return true;
        } else if (!"image".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass36i.f37898B = str2;
            return true;
        }
    }

    public static AnonymousClass36i parseFromJson(JsonParser jsonParser) {
        AnonymousClass36i anonymousClass36i = new AnonymousClass36i();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass36j.m18540B(anonymousClass36i, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass36i;
    }
}
