package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2cb */
public final class AnonymousClass2cb {
    /* renamed from: B */
    public static boolean m16544B(AnonymousClass1Nd anonymousClass1Nd, String str, JsonParser jsonParser) {
        String str2 = null;
        if (DialogModule.KEY_TITLE.equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1Nd.f17814C = str2;
            return true;
        } else if (!"body".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1Nd.f17813B = str2;
            return true;
        }
    }

    public static AnonymousClass1Nd parseFromJson(JsonParser jsonParser) {
        AnonymousClass1Nd anonymousClass1Nd = new AnonymousClass1Nd();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2cb.m16544B(anonymousClass1Nd, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1Nd;
    }
}
