package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.HashMap;

/* renamed from: X.3cK */
public final class AnonymousClass3cK {
    /* renamed from: B */
    public static boolean m20192B(AnonymousClass3cJ anonymousClass3cJ, String str, JsonParser jsonParser) {
        if (!"badge_payload".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass3cJ, str, jsonParser);
        }
        HashMap hashMap;
        if (jsonParser.getCurrentToken() == JsonToken.START_OBJECT) {
            hashMap = new HashMap();
            while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                String text = jsonParser.getText();
                jsonParser.nextToken();
                if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                    hashMap.put(text, null);
                } else {
                    AnonymousClass3cX parseFromJson = AnonymousClass3cY.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        hashMap.put(text, parseFromJson);
                    }
                }
            }
        } else {
            hashMap = null;
        }
        anonymousClass3cJ.f42740B = hashMap;
        return true;
    }

    public static AnonymousClass3cJ parseFromJson(JsonParser jsonParser) {
        AnonymousClass3cJ anonymousClass3cJ = new AnonymousClass3cJ();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3cK.m20192B(anonymousClass3cJ, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3cJ;
    }
}
