package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.5zZ */
public final class AnonymousClass5zZ {
    /* renamed from: B */
    public static boolean m28729B(AnonymousClass5zX anonymousClass5zX, String str, JsonParser jsonParser) {
        if ("school".equals(str)) {
            anonymousClass5zX.f70700B = AnonymousClass2ca.parseFromJson(jsonParser);
            return true;
        } else if (!"social_context".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass5zX, str, jsonParser);
        } else {
            anonymousClass5zX.f70701C = AnonymousClass5zY.parseFromJson(jsonParser);
            return true;
        }
    }

    public static AnonymousClass5zX parseFromJson(JsonParser jsonParser) {
        AnonymousClass5zX anonymousClass5zX = new AnonymousClass5zX();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass5zZ.m28729B(anonymousClass5zX, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass5zX;
    }
}
