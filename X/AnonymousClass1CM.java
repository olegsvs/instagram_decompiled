package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1CM */
public final class AnonymousClass1CM {
    /* renamed from: B */
    public static boolean m9898B(AnonymousClass1CN anonymousClass1CN, String str, JsonParser jsonParser) {
        if (!"pending_likes".equals(str)) {
            return false;
        }
        List list = null;
        if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
            list = new ArrayList();
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                AnonymousClass1bb parseFromJson = AnonymousClass3gT.parseFromJson(jsonParser);
                if (parseFromJson != null) {
                    list.add(parseFromJson);
                }
            }
        }
        anonymousClass1CN.f15521B = list;
        return true;
    }

    public static AnonymousClass1CN parseFromJson(JsonParser jsonParser) {
        AnonymousClass1CN anonymousClass1CN = new AnonymousClass1CN();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1CM.m9898B(anonymousClass1CN, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1CN;
    }

    public static AnonymousClass1CN parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return AnonymousClass1CM.parseFromJson(createParser);
    }
}
