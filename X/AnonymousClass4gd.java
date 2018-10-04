package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.4gd */
public final class AnonymousClass4gd {
    /* renamed from: B */
    public static boolean m24766B(AnonymousClass4ga anonymousClass4ga, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("interactive_user_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass4ga.f56270B = str2;
            return true;
        } else if ("interactive_sticker_type".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass4ga.f56272D = str2;
            return true;
        } else if (!"interactive_sticker_info".equals(str)) {
            return false;
        } else {
            anonymousClass4ga.f56271C = AnonymousClass4gc.parseFromJson(jsonParser);
            return true;
        }
    }

    public static AnonymousClass4ga parseFromJson(JsonParser jsonParser) {
        AnonymousClass4ga anonymousClass4ga = new AnonymousClass4ga();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass4gd.m24766B(anonymousClass4ga, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass4ga;
    }
}
