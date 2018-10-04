package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.HashMap;

/* renamed from: X.1CS */
public final class AnonymousClass1CS {
    /* renamed from: B */
    public static boolean m9901B(AnonymousClass1CT anonymousClass1CT, String str, JsonParser jsonParser) {
        if (!"pending_reel_seen_states".equals(str)) {
            return false;
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
                    AnonymousClass3gf parseFromJson = AnonymousClass3gj.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        hashMap.put(text, parseFromJson);
                    }
                }
            }
        } else {
            hashMap = null;
        }
        anonymousClass1CT.f15524B = hashMap;
        return true;
    }

    public static AnonymousClass1CT parseFromJson(JsonParser jsonParser) {
        AnonymousClass1CT anonymousClass1CT = new AnonymousClass1CT();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1CS.m9901B(anonymousClass1CT, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1CT;
    }

    public static AnonymousClass1CT parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return AnonymousClass1CS.parseFromJson(createParser);
    }
}
