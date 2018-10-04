package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5Md */
public final class AnonymousClass5Md {
    /* renamed from: B */
    public static boolean m26339B(AnonymousClass5Mc anonymousClass5Mc, String str, JsonParser jsonParser) {
        if ("fetch_ts".equals(str)) {
            anonymousClass5Mc.f62643B = jsonParser.getValueAsLong();
            return true;
        } else if ("num_total_requests".equals(str)) {
            anonymousClass5Mc.f62644C = jsonParser.getValueAsInt();
            return true;
        } else if ("num_unseen_requests".equals(str)) {
            anonymousClass5Mc.f62645D = jsonParser.getValueAsInt();
            return true;
        } else if (!"users".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass5Mc, str, jsonParser);
        } else {
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
            anonymousClass5Mc.f62646E = list;
            return true;
        }
    }

    public static AnonymousClass5Mc parseFromJson(JsonParser jsonParser) {
        AnonymousClass5Mc anonymousClass5Mc = new AnonymousClass5Mc();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass5Md.m26339B(anonymousClass5Mc, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass5Mc;
    }
}
