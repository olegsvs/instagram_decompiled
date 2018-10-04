package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2Y4 */
public final class AnonymousClass2Y4 {
    /* renamed from: B */
    public static boolean m16233B(AnonymousClass2Y1 anonymousClass2Y1, String str, JsonParser jsonParser) {
        if (!"zero_cms_native".equals(str)) {
            return false;
        }
        anonymousClass2Y1.f31211B = AnonymousClass2Y3.parseFromJson(jsonParser);
        return true;
    }

    public static AnonymousClass2Y1 parseFromJson(JsonParser jsonParser) {
        AnonymousClass2Y1 anonymousClass2Y1 = new AnonymousClass2Y1();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2Y4.m16233B(anonymousClass2Y1, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2Y1;
    }
}
