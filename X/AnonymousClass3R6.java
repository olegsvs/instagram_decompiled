package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3R6 */
public final class AnonymousClass3R6 {
    /* renamed from: B */
    public static boolean m19634B(AnonymousClass1HK anonymousClass1HK, String str, JsonParser jsonParser) {
        if ("fromVersion".equals(str)) {
            Integer.valueOf(jsonParser.getValueAsInt());
            return true;
        } else if ("toVersion".equals(str)) {
            anonymousClass1HK.f16746B = Integer.valueOf(jsonParser.getValueAsInt());
            return true;
        } else if (!"mediaUpdates".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                List arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass1j9 parseFromJson = AnonymousClass3R7.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            return true;
        }
    }

    public static AnonymousClass1HK parseFromJson(JsonParser jsonParser) {
        AnonymousClass1HK anonymousClass1HK = new AnonymousClass1HK();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3R6.m19634B(anonymousClass1HK, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1HK;
    }
}
