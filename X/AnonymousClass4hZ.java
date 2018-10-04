package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4hZ */
public final class AnonymousClass4hZ {
    /* renamed from: B */
    public static boolean m24810B(AnonymousClass1SN anonymousClass1SN, String str, JsonParser jsonParser) {
        if ("quick_replies".equals(str)) {
            List list = null;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass4gv parseFromJson = AnonymousClass4gw.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        list.add(parseFromJson);
                    }
                }
            }
            anonymousClass1SN.f18762B = list;
            return true;
        } else if (!"count".equals(str)) {
            return AnonymousClass4hb.m24811B(anonymousClass1SN, str, jsonParser);
        } else {
            anonymousClass1SN.f18763C = jsonParser.getValueAsInt();
            return true;
        }
    }

    public static AnonymousClass1SN parseFromJson(JsonParser jsonParser) {
        AnonymousClass1SN anonymousClass1SN = new AnonymousClass1SN();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass4hZ.m24810B(anonymousClass1SN, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1SN;
    }
}
