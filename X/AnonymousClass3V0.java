package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.HashMap;

/* renamed from: X.3V0 */
public final class AnonymousClass3V0 {
    /* renamed from: B */
    public static boolean m19748B(AnonymousClass3Uz anonymousClass3Uz, String str, JsonParser jsonParser) {
        if ("reels".equals(str)) {
            HashMap hashMap;
            if (jsonParser.getCurrentToken() == JsonToken.START_OBJECT) {
                hashMap = new HashMap();
                while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                    String text = jsonParser.getText();
                    jsonParser.nextToken();
                    if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                        hashMap.put(text, null);
                    } else {
                        AnonymousClass0r7 parseFromJson = AnonymousClass14E.parseFromJson(jsonParser);
                        if (parseFromJson != null) {
                            hashMap.put(text, parseFromJson);
                        }
                    }
                }
            } else {
                hashMap = null;
            }
            anonymousClass3Uz.f41705C = hashMap;
            return true;
        } else if (!"next_ad_request_index".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass3Uz, str, jsonParser);
        } else {
            anonymousClass3Uz.f41704B = Integer.valueOf(jsonParser.getValueAsInt());
            return true;
        }
    }

    public static AnonymousClass3Uz parseFromJson(JsonParser jsonParser) {
        AnonymousClass3Uz anonymousClass3Uz = new AnonymousClass3Uz();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3V0.m19748B(anonymousClass3Uz, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3Uz;
    }

    public static AnonymousClass3Uz parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return AnonymousClass3V0.parseFromJson(createParser);
    }
}
