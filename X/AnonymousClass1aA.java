package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.1aA */
public final class AnonymousClass1aA {
    /* renamed from: B */
    public static boolean m11908B(AnonymousClass0ol anonymousClass0ol, String str, JsonParser jsonParser) {
        if (DialogModule.KEY_TITLE.equals(str)) {
            anonymousClass0ol.f10346D = AnonymousClass1S5.parseFromJson(jsonParser);
            return true;
        } else if ("limit".equals(str)) {
            Integer.valueOf(jsonParser.getValueAsInt());
            return true;
        } else if (IgReactNavigatorModule.URL.equals(str)) {
            anonymousClass0ol.f10347E = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
            return true;
        } else if (!"dismiss_promotion".equals(str)) {
            return false;
        } else {
            anonymousClass0ol.f10345C = jsonParser.getValueAsBoolean();
            return true;
        }
    }

    public static AnonymousClass0ol parseFromJson(JsonParser jsonParser) {
        AnonymousClass0ol anonymousClass0ol = new AnonymousClass0ol();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1aA.m11908B(anonymousClass0ol, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0ol;
    }
}
