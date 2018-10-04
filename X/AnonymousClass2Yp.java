package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2Yp */
public final class AnonymousClass2Yp {
    /* renamed from: B */
    public static boolean m16259B(AnonymousClass2YR anonymousClass2YR, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("body".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2YR.f31260B = str2;
            return true;
        } else if ("button_text".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2YR.f31261C = str2;
            return true;
        } else if (DialogModule.KEY_TITLE.equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2YR.f31263E = str2;
            return true;
        } else if (!"phone_link".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2YR.f31262D = str2;
            return true;
        }
    }

    public static AnonymousClass2YR parseFromJson(JsonParser jsonParser) {
        AnonymousClass2YR anonymousClass2YR = new AnonymousClass2YR();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2Yp.m16259B(anonymousClass2YR, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2YR;
    }
}
