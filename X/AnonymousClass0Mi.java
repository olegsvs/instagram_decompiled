package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.HashMap;

/* renamed from: X.0Mi */
public final class AnonymousClass0Mi {
    /* renamed from: B */
    public static boolean m3225B(AnonymousClass0Mj anonymousClass0Mj, String str, JsonParser jsonParser) {
        if (!"params".equals(str)) {
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
                    AnonymousClass0Ml parseFromJson = AnonymousClass0Mk.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        hashMap.put(text, parseFromJson);
                    }
                }
            }
        } else {
            hashMap = null;
        }
        anonymousClass0Mj.f3460B = hashMap;
        return true;
    }

    public static AnonymousClass0Mj parseFromJson(JsonParser jsonParser) {
        AnonymousClass0Mj anonymousClass0Mj = new AnonymousClass0Mj();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass0Mi.m3225B(anonymousClass0Mj, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0Mj;
    }
}
