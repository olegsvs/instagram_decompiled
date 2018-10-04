package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1KT */
public final class AnonymousClass1KT {
    /* renamed from: B */
    public static boolean m10769B(AnonymousClass1KU anonymousClass1KU, String str, JsonParser jsonParser) {
        if (!"hashtags".equals(str)) {
            return false;
        }
        List list = null;
        if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
            list = new ArrayList();
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                AnonymousClass1KH parseFromJson = AnonymousClass1La.parseFromJson(jsonParser);
                if (parseFromJson != null) {
                    list.add(parseFromJson);
                }
            }
        }
        anonymousClass1KU.f17182B = list;
        return true;
    }

    public static AnonymousClass1KU parseFromJson(JsonParser jsonParser) {
        AnonymousClass1KU anonymousClass1KU = new AnonymousClass1KU();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1KT.m10769B(anonymousClass1KU, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1KU;
    }

    public static AnonymousClass1KU parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return AnonymousClass1KT.parseFromJson(createParser);
    }
}
