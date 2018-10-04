package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2Wu */
public final class AnonymousClass2Wu {
    /* renamed from: B */
    public static boolean m16193B(AnonymousClass2WW anonymousClass2WW, String str, JsonParser jsonParser) {
        if (!"cta".equals(str)) {
            return false;
        }
        anonymousClass2WW.f31126B = AnonymousClass2Wt.parseFromJson(jsonParser);
        return true;
    }

    public static AnonymousClass2WW parseFromJson(JsonParser jsonParser) {
        AnonymousClass2WW anonymousClass2WW = new AnonymousClass2WW();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2Wu.m16193B(anonymousClass2WW, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2WW;
    }
}
