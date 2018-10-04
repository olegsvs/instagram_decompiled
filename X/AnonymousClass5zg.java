package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.5zg */
public final class AnonymousClass5zg {
    /* renamed from: B */
    public static boolean m28735B(AnonymousClass5zf anonymousClass5zf, String str, JsonParser jsonParser) {
        if (!"user".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass5zf, str, jsonParser);
        }
        AnonymousClass0Ci.C(jsonParser);
        return true;
    }

    public static AnonymousClass5zf parseFromJson(JsonParser jsonParser) {
        AnonymousClass5zf anonymousClass5zf = new AnonymousClass5zf();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass5zg.m28735B(anonymousClass5zf, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass5zf;
    }
}
