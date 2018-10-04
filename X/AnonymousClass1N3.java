package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;

/* renamed from: X.1N3 */
public final class AnonymousClass1N3 {
    /* renamed from: B */
    public static boolean m11029B(AnonymousClass0le anonymousClass0le, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("style".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0le.f9578G = str2;
            return true;
        } else if ("text".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0le.f9580I = str2;
            return true;
        } else if (IgReactNavigatorModule.URL.equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0le.f9579H = str2;
            return true;
        } else if ("action".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0le.f9573B = str2;
            return true;
        } else if ("background_color".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0le.f9575D = str2;
            return true;
        } else if ("border_color".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0le.f9576E = str2;
            return true;
        } else if ("text_color".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0le.f9581J = str2;
            return true;
        } else if (!"action_info".equals(str)) {
            return false;
        } else {
            anonymousClass0le.f9574C = AnonymousClass1N4.parseFromJson(jsonParser);
            return true;
        }
    }

    public static AnonymousClass0le parseFromJson(JsonParser jsonParser) {
        AnonymousClass0le anonymousClass0le = new AnonymousClass0le();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1N3.m11029B(anonymousClass0le, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        if ("cancel".equals(anonymousClass0le.f9578G)) {
            anonymousClass0le.f9577F = AnonymousClass0lf.CANCEL;
        } else if ("confirm".equals(anonymousClass0le.f9578G)) {
            anonymousClass0le.f9577F = AnonymousClass0lf.CONFIRM;
        }
        if (AnonymousClass0CB.m840J() || anonymousClass0le.f9573B != null || anonymousClass0le.f9577F != null) {
            return anonymousClass0le;
        }
        throw new IllegalStateException("data verification fail:not style");
    }
}
