package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3b2 */
public final class AnonymousClass3b2 {
    /* renamed from: B */
    public static boolean m20137B(AnonymousClass3b1 anonymousClass3b1, String str, JsonParser jsonParser) {
        if (!"tray".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass3b1, str, jsonParser);
        }
        List list = null;
        if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
            list = new ArrayList();
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                AnonymousClass0r7 parseFromJson = AnonymousClass14E.parseFromJson(jsonParser);
                if (parseFromJson != null) {
                    list.add(parseFromJson);
                }
            }
        }
        anonymousClass3b1.f42578B = list;
        return true;
    }

    public static AnonymousClass3b1 parseFromJson(JsonParser jsonParser) {
        AnonymousClass3b1 anonymousClass3b1 = new AnonymousClass3b1();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3b2.m20137B(anonymousClass3b1, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3b1;
    }
}
