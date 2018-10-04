package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.2Yi */
public final class AnonymousClass2Yi {
    /* renamed from: B */
    public static boolean m16252B(AnonymousClass2YK anonymousClass2YK, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("__typename".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                jsonParser.getText();
            }
            return true;
        } else if (!IgReactNavigatorModule.URL.equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2YK.f31239B = str2;
            return true;
        }
    }

    public static AnonymousClass2YK parseFromJson(JsonParser jsonParser) {
        AnonymousClass2YK anonymousClass2YK = new AnonymousClass2YK();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2Yi.m16252B(anonymousClass2YK, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2YK;
    }
}
