package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2bf */
public final class AnonymousClass2bf {
    /* renamed from: B */
    public static boolean m16433B(AnonymousClass2GU anonymousClass2GU, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("media_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2GU.f28301B = str2;
            return true;
        } else if ("slider_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2GU.f28302C = str2;
            return true;
        } else if (!"vote".equals(str)) {
            return false;
        } else {
            anonymousClass2GU.f28303D = AnonymousClass1LA.parseFromJson(jsonParser);
            return true;
        }
    }

    public static AnonymousClass2GU parseFromJson(JsonParser jsonParser) {
        AnonymousClass2GU anonymousClass2GU = new AnonymousClass2GU();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2bf.m16433B(anonymousClass2GU, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2GU;
    }
}
