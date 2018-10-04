package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.3RD */
public final class AnonymousClass3RD {
    /* renamed from: B */
    public static boolean m19638B(AnonymousClass3RC anonymousClass3RC, String str, JsonParser jsonParser) {
        if ("type".equals(str)) {
            AnonymousClass1Yz.B(jsonParser.getValueAsString());
            return true;
        } else if ("user".equals(str)) {
            AnonymousClass0Ci.B(jsonParser);
            return true;
        } else if (!"channel".equals(str)) {
            return false;
        } else {
            anonymousClass3RC.f41198B = AnonymousClass157.parseFromJson(jsonParser);
            return true;
        }
    }

    public static AnonymousClass3RC parseFromJson(JsonParser jsonParser) {
        AnonymousClass3RC anonymousClass3RC = new AnonymousClass3RC();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3RD.m19638B(anonymousClass3RC, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3RC;
    }
}
