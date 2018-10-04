package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.356 */
public final class AnonymousClass356 {
    /* renamed from: B */
    public static boolean m18449B(AnonymousClass354 anonymousClass354, String str, JsonParser jsonParser) {
        if (!"partners".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass354, str, jsonParser);
        }
        List list = null;
        if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
            list = new ArrayList();
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                AnonymousClass353 parseFromJson = AnonymousClass355.parseFromJson(jsonParser);
                if (parseFromJson != null) {
                    list.add(parseFromJson);
                }
            }
        }
        anonymousClass354.f37653B = list;
        return true;
    }

    public static AnonymousClass354 parseFromJson(JsonParser jsonParser) {
        AnonymousClass354 anonymousClass354 = new AnonymousClass354();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass356.m18449B(anonymousClass354, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass354;
    }
}
