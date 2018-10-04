package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.5mJ */
public final class AnonymousClass5mJ {
    /* renamed from: B */
    public static boolean m28421B(AnonymousClass5mI anonymousClass5mI, String str, JsonParser jsonParser) {
        if (!"media".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass5mI, str, jsonParser);
        }
        AnonymousClass0P7.B(jsonParser, true);
        return true;
    }

    public static AnonymousClass5mI parseFromJson(JsonParser jsonParser) {
        AnonymousClass5mI anonymousClass5mI = new AnonymousClass5mI();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass5mJ.m28421B(anonymousClass5mI, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass5mI;
    }
}
