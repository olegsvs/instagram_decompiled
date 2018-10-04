package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.1Hu */
public final class AnonymousClass1Hu {
    /* renamed from: B */
    public static boolean m10635B(AnonymousClass1Hv anonymousClass1Hv, String str, JsonParser jsonParser) {
        if ("thread".equals(str)) {
            anonymousClass1Hv.f16807C = AnonymousClass1HB.parseFromJson(jsonParser);
            return true;
        } else if (!"user".equals(str)) {
            return false;
        } else {
            anonymousClass1Hv.f16808D = AnonymousClass0Ci.m980B(jsonParser);
            return true;
        }
    }

    public static AnonymousClass1Hv parseFromJson(JsonParser jsonParser) {
        AnonymousClass1Hv anonymousClass1Hv = new AnonymousClass1Hv();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1Hu.m10635B(anonymousClass1Hv, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        if (anonymousClass1Hv.f16807C != null) {
            anonymousClass1Hv.f16806B = AnonymousClass1Hw.thread;
        } else if (anonymousClass1Hv.f16808D != null) {
            anonymousClass1Hv.f16806B = AnonymousClass1Hw.user;
        } else {
            AnonymousClass0Gn.m1876C("Invalid DirectShareSheetRecipientType", "DirectShareSheetRecipientType is neither thread nor user");
        }
        return anonymousClass1Hv;
    }
}
