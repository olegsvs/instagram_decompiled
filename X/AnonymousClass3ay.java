package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3ay */
public final class AnonymousClass3ay {
    /* renamed from: B */
    public static boolean m20135B(AnonymousClass3ax anonymousClass3ax, String str, JsonParser jsonParser) {
        if (!"eligible_viewers".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass3ax, str, jsonParser);
        }
        List list = null;
        if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
            list = new ArrayList();
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                AnonymousClass0Ci B = AnonymousClass0Ci.B(jsonParser);
                if (B != null) {
                    list.add(B);
                }
            }
        }
        anonymousClass3ax.f42570B = list;
        return true;
    }

    public static AnonymousClass3ax parseFromJson(JsonParser jsonParser) {
        AnonymousClass3ax anonymousClass3ax = new AnonymousClass3ax();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3ay.m20135B(anonymousClass3ax, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3ax;
    }
}
