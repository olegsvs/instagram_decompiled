package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2aV */
public final class AnonymousClass2aV {
    /* renamed from: B */
    public static boolean m16346B(AnonymousClass2Do anonymousClass2Do, String str, JsonParser jsonParser) {
        String str2 = null;
        if (DialogModule.KEY_TITLE.equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2Do.f27689C = str2;
            return true;
        } else if ("action".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2Do.f27688B = str2;
            return true;
        } else if (!"username".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2Do.f27690D = str2;
            return true;
        }
    }

    public static AnonymousClass2Do parseFromJson(JsonParser jsonParser) {
        AnonymousClass2Do anonymousClass2Do = new AnonymousClass2Do();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2aV.m16346B(anonymousClass2Do, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2Do;
    }
}
