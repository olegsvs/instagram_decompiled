package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Pq */
public final class AnonymousClass1Pq {
    /* renamed from: B */
    public static boolean m11298B(AnonymousClass1Sw anonymousClass1Sw, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("users".equals(str)) {
            List arrayList;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass0Ci B = AnonymousClass0Ci.m980B(jsonParser);
                    if (B != null) {
                        arrayList.add(B);
                    }
                }
            }
            anonymousClass1Sw.f18857F = arrayList;
            return true;
        } else if ("next_max_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1Sw.f18854C = str2;
            return true;
        } else if ("has_more".equals(str)) {
            anonymousClass1Sw.f18853B = jsonParser.getValueAsBoolean();
            return true;
        } else if (!"rank_token".equals(str)) {
            return AnonymousClass0Pv.m3947B(anonymousClass1Sw, str, jsonParser);
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1Sw.f18855D = str2;
            return true;
        }
    }

    public static AnonymousClass1Sw parseFromJson(JsonParser jsonParser) {
        AnonymousClass1Sw anonymousClass1Sw = new AnonymousClass1Sw();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1Pq.m11298B(anonymousClass1Sw, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        anonymousClass1Sw.f18856E = AnonymousClass3dt.E(anonymousClass1Sw.f18857F);
        return anonymousClass1Sw;
    }
}
