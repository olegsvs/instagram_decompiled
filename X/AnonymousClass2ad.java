package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2ad */
public final class AnonymousClass2ad {
    /* renamed from: B */
    public static boolean m16355B(AnonymousClass2E1 anonymousClass2E1, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2E1.f27759G = str2;
            return true;
        } else if ("ordering".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2E1.f27756D = str2;
            return true;
        } else if ("post_type".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2E1.f27757E = str2;
            return true;
        } else if ("timeframe".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2E1.f27758F = str2;
            return true;
        } else if ("first".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2E1.f27755C = str2;
            return true;
        } else if (!"after".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2E1.f27754B = str2;
            return true;
        }
    }

    public static AnonymousClass2E1 parseFromJson(JsonParser jsonParser) {
        AnonymousClass2E1 anonymousClass2E1 = new AnonymousClass2E1();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2ad.m16355B(anonymousClass2E1, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2E1;
    }

    public static AnonymousClass2E1 parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return AnonymousClass2ad.parseFromJson(createParser);
    }
}
