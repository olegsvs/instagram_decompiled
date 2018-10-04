package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Ze */
public final class AnonymousClass2Ze {
    /* renamed from: B */
    public static boolean m16291B(AnonymousClass2ZX anonymousClass2ZX, String str, JsonParser jsonParser) {
        if ("page_info".equals(str)) {
            anonymousClass2ZX.f31325C = AnonymousClass2Zd.parseFromJson(jsonParser);
            return true;
        } else if (!"edges".equals(str)) {
            return false;
        } else {
            List list = null;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass2ZV parseFromJson = AnonymousClass2Zc.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        list.add(parseFromJson);
                    }
                }
            }
            anonymousClass2ZX.f31324B = list;
            return true;
        }
    }

    public static AnonymousClass2ZX parseFromJson(JsonParser jsonParser) {
        AnonymousClass2ZX anonymousClass2ZX = new AnonymousClass2ZX();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2Ze.m16291B(anonymousClass2ZX, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2ZX;
    }
}
