package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.1Hx */
public final class AnonymousClass1Hx {
    /* renamed from: B */
    public static boolean m10636B(AnonymousClass0XK anonymousClass0XK, String str, JsonParser jsonParser) {
        if ("inbox".equals(str)) {
            anonymousClass0XK.f6136B = AnonymousClass1EW.parseFromJson(jsonParser);
            return true;
        } else if ("pending_requests_total".equals(str)) {
            anonymousClass0XK.f6139E = jsonParser.getValueAsInt();
            return true;
        } else if ("most_recent_inviter".equals(str)) {
            anonymousClass0XK.f6138D = AnonymousClass1FN.parseFromJson(jsonParser);
            return true;
        } else if ("megaphone".equals(str)) {
            anonymousClass0XK.f6137C = AnonymousClass11a.parseFromJson(jsonParser);
            return true;
        } else if ("seq_id".equals(str)) {
            anonymousClass0XK.f6140F = jsonParser.getValueAsLong();
            return true;
        } else if (!"snapshot_at_ms".equals(str)) {
            return AnonymousClass0Pv.m3947B(anonymousClass0XK, str, jsonParser);
        } else {
            anonymousClass0XK.f6141G = jsonParser.getValueAsLong();
            return true;
        }
    }

    public static AnonymousClass0XK parseFromJson(JsonParser jsonParser) {
        AnonymousClass0XK anonymousClass0XK = new AnonymousClass0XK();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1Hx.m10636B(anonymousClass0XK, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0XK;
    }
}
