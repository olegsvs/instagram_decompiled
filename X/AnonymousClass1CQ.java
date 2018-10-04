package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1CQ */
public final class AnonymousClass1CQ {
    /* renamed from: B */
    public static boolean m9900B(AnonymousClass1CR anonymousClass1CR, String str, JsonParser jsonParser) {
        if (!"pending_saves".equals(str)) {
            return false;
        }
        List list = null;
        if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
            list = new ArrayList();
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                AnonymousClass3gm parseFromJson = AnonymousClass3go.parseFromJson(jsonParser);
                if (parseFromJson != null) {
                    list.add(parseFromJson);
                }
            }
        }
        anonymousClass1CR.f15523B = list;
        return true;
    }

    public static AnonymousClass1CR parseFromJson(JsonParser jsonParser) {
        AnonymousClass1CR anonymousClass1CR = new AnonymousClass1CR();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1CQ.m9900B(anonymousClass1CR, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1CR;
    }

    public static AnonymousClass1CR parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return AnonymousClass1CQ.parseFromJson(createParser);
    }
}
