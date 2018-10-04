package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2ai */
public final class AnonymousClass2ai {
    /* renamed from: B */
    public static boolean m16360B(AnonymousClass0X6 anonymousClass0X6, String str, JsonParser jsonParser) {
        if ("item_id".equals(str)) {
            anonymousClass0X6.f6104C = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
            return true;
        } else if ("replay_expiring_at_us".equals(str)) {
            Long.valueOf(jsonParser.getValueAsLong());
            return true;
        } else if (!"expiring_media_seen_count".equals(str)) {
            return false;
        } else {
            anonymousClass0X6.f6103B = jsonParser.getValueAsInt();
            return true;
        }
    }

    public static AnonymousClass0X6 parseFromJson(JsonParser jsonParser) {
        AnonymousClass0X6 anonymousClass0X6 = new AnonymousClass0X6();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2ai.m16360B(anonymousClass0X6, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0X6;
    }
}
