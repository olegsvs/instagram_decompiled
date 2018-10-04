package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2QT */
public final class AnonymousClass2QT {
    /* renamed from: B */
    public static boolean m15670B(AnonymousClass1tm anonymousClass1tm, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("name".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1tm.f23833B = str2;
            return true;
        } else if (!"value".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1tm.f23834C = str2;
            return true;
        }
    }

    public static AnonymousClass1tm parseFromJson(JsonParser jsonParser) {
        AnonymousClass1tm anonymousClass1tm = new AnonymousClass1tm();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2QT.m15670B(anonymousClass1tm, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1tm;
    }
}
