package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.64A */
public final class AnonymousClass64A {
    /* renamed from: B */
    public static boolean m28857B(AnonymousClass649 anonymousClass649, String str, JsonParser jsonParser) {
        if (!"broadcast_status_items".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass649, str, jsonParser);
        }
        List list = null;
        if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
            list = new ArrayList();
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                AnonymousClass647 parseFromJson = AnonymousClass648.parseFromJson(jsonParser);
                if (parseFromJson != null) {
                    list.add(parseFromJson);
                }
            }
        }
        anonymousClass649.f71416B = list;
        return true;
    }

    public static AnonymousClass649 parseFromJson(JsonParser jsonParser) {
        AnonymousClass649 anonymousClass649 = new AnonymousClass649();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass64A.m28857B(anonymousClass649, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass649;
    }
}
