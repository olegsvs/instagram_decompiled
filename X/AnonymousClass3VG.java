package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.3VG */
public final class AnonymousClass3VG {
    /* renamed from: B */
    public static boolean m19756B(AnonymousClass3VF anonymousClass3VF, String str, JsonParser jsonParser) {
        if (!"pending_count".equals(str)) {
            return false;
        }
        anonymousClass3VF.f41733B = jsonParser.getValueAsInt();
        return true;
    }

    public static AnonymousClass3VF parseFromJson(JsonParser jsonParser) {
        AnonymousClass3VF anonymousClass3VF = new AnonymousClass3VF();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3VG.m19756B(anonymousClass3VF, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3VF;
    }
}
