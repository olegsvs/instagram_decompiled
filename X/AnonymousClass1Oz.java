package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.1Oz */
public final class AnonymousClass1Oz {
    /* renamed from: B */
    public static boolean m11229B(AnonymousClass1P0 anonymousClass1P0, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1P0.f18099B = str2;
            return true;
        } else if (!"image".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1P0.f18100C = str2;
            return true;
        }
    }

    public static AnonymousClass1P0 parseFromJson(JsonParser jsonParser) {
        AnonymousClass1P0 anonymousClass1P0 = new AnonymousClass1P0();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1Oz.m11229B(anonymousClass1P0, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1P0;
    }
}
