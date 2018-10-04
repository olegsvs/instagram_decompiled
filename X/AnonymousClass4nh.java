package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.4nh */
public final class AnonymousClass4nh {
    /* renamed from: B */
    public static boolean m25098B(AnonymousClass4ng anonymousClass4ng, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("text".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass4ng.f57391D = str2;
            return true;
        } else if ("link_text".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass4ng.f57390C = str2;
            return true;
        } else if (!"link".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass4ng.f57389B = str2;
            return true;
        }
    }

    public static AnonymousClass4ng parseFromJson(JsonParser jsonParser) {
        AnonymousClass4ng anonymousClass4ng = new AnonymousClass4ng();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass4nh.m25098B(anonymousClass4ng, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass4ng;
    }
}
