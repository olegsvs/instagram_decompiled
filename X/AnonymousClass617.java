package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.617 */
public final class AnonymousClass617 {
    /* renamed from: B */
    public static boolean m28786B(AnonymousClass6FC anonymousClass6FC, String str, JsonParser jsonParser) {
        if (!"list".equals(str)) {
            return AnonymousClass61J.m28787B(anonymousClass6FC, str, jsonParser);
        }
        List list = null;
        if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
            list = new ArrayList();
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                AnonymousClass1K9 parseFromJson = AnonymousClass1KL.parseFromJson(jsonParser);
                if (parseFromJson != null) {
                    list.add(parseFromJson);
                }
            }
        }
        anonymousClass6FC.f73310B = list;
        return true;
    }

    public static AnonymousClass6FC parseFromJson(JsonParser jsonParser) {
        AnonymousClass6FC anonymousClass6FC = new AnonymousClass6FC();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass617.m28786B(anonymousClass6FC, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass6FC;
    }
}
