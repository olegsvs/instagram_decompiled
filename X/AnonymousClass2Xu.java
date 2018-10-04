package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2Xu */
public final class AnonymousClass2Xu {
    /* renamed from: B */
    public static boolean m16228B(AnonymousClass2Xt anonymousClass2Xt, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("error".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2Xt.f31202B = str2;
            return true;
        } else if ("input_name".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                jsonParser.getText();
            }
            return true;
        } else if (!"suggested_name".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2Xt.f31203C = str2;
            return true;
        }
    }

    public static AnonymousClass2Xt parseFromJson(JsonParser jsonParser) {
        AnonymousClass2Xt anonymousClass2Xt = new AnonymousClass2Xt();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2Xu.m16228B(anonymousClass2Xt, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2Xt;
    }
}
