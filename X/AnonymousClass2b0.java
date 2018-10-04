package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2b0 */
public final class AnonymousClass2b0 {
    /* renamed from: B */
    public static boolean m16379B(AnonymousClass2az anonymousClass2az, String str, JsonParser jsonParser) {
        if ("verified".equals(str)) {
            anonymousClass2az.f31384C = jsonParser.getValueAsBoolean();
            return true;
        }
        if (!"nonce_valid".equals(str)) {
            if (!"phone_number_valid".equals(str)) {
                if ("phone_number".equals(str)) {
                    if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                        jsonParser.getText();
                    }
                    return true;
                } else if (!"errors".equals(str)) {
                    return AnonymousClass2b8.m16387B(anonymousClass2az, str, jsonParser);
                } else {
                    String str2 = null;
                    if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
                        if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                            jsonParser.skipChildren();
                        }
                        anonymousClass2az.f31383B = str2;
                        return true;
                    }
                    while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                        jsonParser.nextToken();
                        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                            if (str2 == null) {
                                str2 = jsonParser.getText();
                            }
                        }
                    }
                    anonymousClass2az.f31383B = str2;
                    return true;
                }
            }
        }
        jsonParser.getValueAsBoolean();
        return true;
    }

    public static AnonymousClass2az parseFromJson(JsonParser jsonParser) {
        AnonymousClass2az anonymousClass2az = new AnonymousClass2az();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2b0.m16379B(anonymousClass2az, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2az;
    }
}
