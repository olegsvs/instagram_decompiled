package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2Y2 */
public final class AnonymousClass2Y2 {
    /* renamed from: B */
    public static boolean m16231B(AnonymousClass2Xz anonymousClass2Xz, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("content".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2Xz.f31207B = str2;
            return true;
        } else if (!"text_key".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2Xz.f31208C = str2;
            return true;
        }
    }

    public static AnonymousClass2Xz parseFromJson(JsonParser jsonParser) {
        AnonymousClass2Xz anonymousClass2Xz = new AnonymousClass2Xz();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2Y2.m16231B(anonymousClass2Xz, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2Xz;
    }
}
