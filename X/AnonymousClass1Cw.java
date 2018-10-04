package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.1Cw */
public final class AnonymousClass1Cw {
    /* renamed from: B */
    public static boolean m9945B(AnonymousClass1Cx anonymousClass1Cx, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("pk".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1Cx.f15610D = str2;
            return true;
        } else if ("name".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1Cx.f15611E = str2;
            return true;
        } else if ("profile_pic_url".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1Cx.f15609C = str2;
            return true;
        } else if ("profile_pic_username".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1Cx.f15608B = str2;
            return true;
        } else if (!"type".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1Cx.f15613G = str2;
            return true;
        }
    }

    public static AnonymousClass1Cx parseFromJson(JsonParser jsonParser) {
        AnonymousClass1Cx anonymousClass1Cx = new AnonymousClass1Cx();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1Cw.m9945B(anonymousClass1Cx, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        anonymousClass1Cx.f15612F = AnonymousClass1Cx.m9946B(anonymousClass1Cx.f15613G);
        return anonymousClass1Cx;
    }
}
