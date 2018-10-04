package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.0Yz */
public final class AnonymousClass0Yz {
    /* renamed from: B */
    public static boolean m5329B(AnonymousClass0UN anonymousClass0UN, String str, JsonParser jsonParser) {
        if ("seen_marker".equals(str)) {
            anonymousClass0UN.f5434C = AnonymousClass0Yy.parseFromJson(jsonParser);
            return true;
        } else if (!"message_user_id".equals(str)) {
            return AnonymousClass0Yl.m5312B(anonymousClass0UN, str, jsonParser);
        } else {
            anonymousClass0UN.f5433B = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
            return true;
        }
    }

    public static AnonymousClass0UN parseFromJson(JsonParser jsonParser) {
        AnonymousClass0UN anonymousClass0UN = new AnonymousClass0UN();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass0Yz.m5329B(anonymousClass0UN, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0UN;
    }
}
