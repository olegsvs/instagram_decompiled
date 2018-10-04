package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Y8 */
public final class AnonymousClass2Y8 {
    /* renamed from: B */
    public static boolean m16235B(AnonymousClass2Y6 anonymousClass2Y6, String str, JsonParser jsonParser) {
        if (!"all_autofill_values".equals(str)) {
            return false;
        }
        List list = null;
        if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
            list = new ArrayList();
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                AnonymousClass2Y5 parseFromJson = AnonymousClass2Y7.parseFromJson(jsonParser);
                if (parseFromJson != null) {
                    list.add(parseFromJson);
                }
            }
        }
        anonymousClass2Y6.f31214B = list;
        return true;
    }

    public static AnonymousClass2Y6 parseFromJson(JsonParser jsonParser) {
        AnonymousClass2Y6 anonymousClass2Y6 = new AnonymousClass2Y6();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2Y8.m16235B(anonymousClass2Y6, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2Y6;
    }
}
