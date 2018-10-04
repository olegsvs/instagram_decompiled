package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.64q */
public final class AnonymousClass64q {
    /* renamed from: B */
    public static boolean m28918B(AnonymousClass64p anonymousClass64p, String str, JsonParser jsonParser) {
        if (!"questions".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass64p, str, jsonParser);
        }
        List list = null;
        if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
            list = new ArrayList();
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                AnonymousClass64w parseFromJson = AnonymousClass64x.parseFromJson(jsonParser);
                if (parseFromJson != null) {
                    list.add(parseFromJson);
                }
            }
        }
        anonymousClass64p.f71550B = list;
        return true;
    }

    public static AnonymousClass64p parseFromJson(JsonParser jsonParser) {
        AnonymousClass64p anonymousClass64p = new AnonymousClass64p();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass64q.m28918B(anonymousClass64p, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass64p;
    }
}
