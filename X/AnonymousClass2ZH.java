package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2ZH */
public final class AnonymousClass2ZH {
    /* renamed from: B */
    public static boolean m16275B(AnonymousClass2Z1 anonymousClass2Z1, String str, JsonParser jsonParser) {
        if ("control_node".equals(str)) {
            anonymousClass2Z1.f31289C = AnonymousClass2ZE.parseFromJson(jsonParser);
            return true;
        } else if (!"buckets".equals(str)) {
            return false;
        } else {
            List list = null;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass2Z0 parseFromJson = AnonymousClass2ZG.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        list.add(parseFromJson);
                    }
                }
            }
            anonymousClass2Z1.f31288B = list;
            return true;
        }
    }

    public static AnonymousClass2Z1 parseFromJson(JsonParser jsonParser) {
        AnonymousClass2Z1 anonymousClass2Z1 = new AnonymousClass2Z1();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2ZH.m16275B(anonymousClass2Z1, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2Z1;
    }
}
