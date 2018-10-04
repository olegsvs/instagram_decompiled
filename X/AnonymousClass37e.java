package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.37e */
public final class AnonymousClass37e {
    /* renamed from: B */
    public static boolean m18639B(AnonymousClass37d anonymousClass37d, String str, JsonParser jsonParser) {
        if (!"models".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass37d, str, jsonParser);
        }
        List list = null;
        if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
            list = new ArrayList();
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                AnonymousClass36v parseFromJson = AnonymousClass36w.parseFromJson(jsonParser);
                if (parseFromJson != null) {
                    list.add(parseFromJson);
                }
            }
        }
        anonymousClass37d.f38094B = list;
        return true;
    }

    public static AnonymousClass37d parseFromJson(JsonParser jsonParser) {
        AnonymousClass37d anonymousClass37d = new AnonymousClass37d();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass37e.m18639B(anonymousClass37d, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass37d;
    }
}
