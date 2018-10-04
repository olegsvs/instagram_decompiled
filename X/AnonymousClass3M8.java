package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.3M8 */
public final class AnonymousClass3M8 {
    /* renamed from: B */
    public static boolean m19460B(AnonymousClass0qz anonymousClass0qz, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0qz.f11064B = str2;
            return true;
        } else if ("tracking_token".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0qz.f11068F = str2;
            return true;
        } else if (DialogModule.KEY_TITLE.equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0qz.f11067E = str2;
            return true;
        } else if ("subtitle".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0qz.f11066D = str2;
            return true;
        } else if (!"show_image".equals(str)) {
            return false;
        } else {
            anonymousClass0qz.f11065C = jsonParser.getValueAsBoolean();
            return true;
        }
    }

    public static AnonymousClass0qz parseFromJson(JsonParser jsonParser) {
        AnonymousClass0qz anonymousClass0qz = new AnonymousClass0qz();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3M8.m19460B(anonymousClass0qz, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0qz;
    }
}
