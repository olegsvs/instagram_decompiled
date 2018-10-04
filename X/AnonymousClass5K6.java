package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5K6 */
public final class AnonymousClass5K6 {
    /* renamed from: B */
    public static boolean m26254B(AnonymousClass5K5 anonymousClass5K5, String str, JsonParser jsonParser) {
        if ("users".equals(str)) {
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
            anonymousClass5K5.f62234D = list;
            return true;
        } else if ("truncate_follow_requests_at_index".equals(str)) {
            anonymousClass5K5.f62233C = jsonParser.getValueAsInt();
            return true;
        } else if (!"suggested_users".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass5K5, str, jsonParser);
        } else {
            anonymousClass5K5.f62232B = AnonymousClass11h.parseFromJson(jsonParser);
            return true;
        }
    }

    public static AnonymousClass5K5 parseFromJson(JsonParser jsonParser) {
        AnonymousClass5K5 anonymousClass5K5 = new AnonymousClass5K5();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass5K6.m26254B(anonymousClass5K5, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        for (AnonymousClass0Ci anonymousClass0Ci : anonymousClass5K5.f62234D) {
            anonymousClass0Ci.OB = Boolean.valueOf(true);
        }
        return anonymousClass5K5;
    }
}
