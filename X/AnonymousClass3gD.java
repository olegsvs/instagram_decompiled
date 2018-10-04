package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.3gD */
public final class AnonymousClass3gD {
    /* renamed from: B */
    public static boolean m20400B(AnonymousClass3gC anonymousClass3gC, String str, JsonParser jsonParser) {
        if (!"view_progress_s".equals(str)) {
            return false;
        }
        anonymousClass3gC.f43255B = jsonParser.getValueAsInt();
        return true;
    }

    public static AnonymousClass3gC parseFromJson(JsonParser jsonParser) {
        AnonymousClass3gC anonymousClass3gC = new AnonymousClass3gC();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3gD.m20400B(anonymousClass3gC, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3gC;
    }
}
