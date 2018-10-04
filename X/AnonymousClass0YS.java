package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.0YS */
public final class AnonymousClass0YS {
    /* renamed from: B */
    public static boolean m5299B(AnonymousClass0UB anonymousClass0UB, String str, JsonParser jsonParser) {
        if ("share_target".equals(str)) {
            anonymousClass0UB.f5389E = AnonymousClass0YK.parseFromJson(jsonParser);
            return true;
        }
        String str2 = null;
        if ("reel_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0UB.f5388D = str2;
            return true;
        } else if ("live_video_share".equals(str)) {
            anonymousClass0UB.f5387C = AnonymousClass0YR.parseFromJson(jsonParser);
            return true;
        } else if (!"entry_point".equals(str)) {
            return AnonymousClass0XV.m5237B(anonymousClass0UB, str, jsonParser);
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0UB.f5386B = str2;
            return true;
        }
    }

    public static AnonymousClass0UB parseFromJson(JsonParser jsonParser) {
        AnonymousClass0UB anonymousClass0UB = new AnonymousClass0UB();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass0YS.m5299B(anonymousClass0UB, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0UB;
    }
}
