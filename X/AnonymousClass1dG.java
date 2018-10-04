package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.1dG */
public final class AnonymousClass1dG {
    /* renamed from: B */
    public static boolean m12196B(AnonymousClass1dH anonymousClass1dH, String str, JsonParser jsonParser) {
        String str2 = null;
        if (DialogModule.KEY_TITLE.equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1dH.f20726D = str2;
            return true;
        } else if ("message".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1dH.f20725C = str2;
            return true;
        } else if (!"is_linked".equals(str)) {
            return false;
        } else {
            anonymousClass1dH.f20724B = jsonParser.getValueAsBoolean();
            return true;
        }
    }

    public static AnonymousClass1dH parseFromJson(JsonParser jsonParser) {
        AnonymousClass1dH anonymousClass1dH = new AnonymousClass1dH();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1dG.m12196B(anonymousClass1dH, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1dH;
    }
}
