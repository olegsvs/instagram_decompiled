package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.2XY */
public final class AnonymousClass2XY {
    /* renamed from: B */
    public static boolean m16215B(AnonymousClass2XI anonymousClass2XI, String str, JsonParser jsonParser) {
        if ("height".equals(str)) {
            anonymousClass2XI.f31171B = jsonParser.getValueAsInt();
            return true;
        } else if ("type".equals(str)) {
            anonymousClass2XI.f31172C = jsonParser.getValueAsInt();
            return true;
        } else if ("width".equals(str)) {
            anonymousClass2XI.f31174E = jsonParser.getValueAsInt();
            return true;
        } else if (!IgReactNavigatorModule.URL.equals(str)) {
            return false;
        } else {
            anonymousClass2XI.f31173D = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
            return true;
        }
    }

    public static AnonymousClass2XI parseFromJson(JsonParser jsonParser) {
        AnonymousClass2XI anonymousClass2XI = new AnonymousClass2XI();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2XY.m16215B(anonymousClass2XI, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2XI;
    }
}
