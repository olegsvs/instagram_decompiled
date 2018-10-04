package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1JC */
public final class AnonymousClass1JC {
    /* renamed from: B */
    public static boolean m10682B(AnonymousClass1JD anonymousClass1JD, String str, JsonParser jsonParser) {
        if (!"user_info_list".equals(str)) {
            return false;
        }
        List list = null;
        if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
            list = new ArrayList();
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                AnonymousClass0dq parseFromJson = AnonymousClass1JE.parseFromJson(jsonParser);
                if (parseFromJson != null) {
                    list.add(parseFromJson);
                }
            }
        }
        anonymousClass1JD.f16975B = list;
        return true;
    }

    public static AnonymousClass1JD parseFromJson(JsonParser jsonParser) {
        AnonymousClass1JD anonymousClass1JD = new AnonymousClass1JD();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1JC.m10682B(anonymousClass1JD, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1JD;
    }

    public static AnonymousClass1JD parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return AnonymousClass1JC.parseFromJson(createParser);
    }
}
