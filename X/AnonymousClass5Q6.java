package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.5Q6 */
public final class AnonymousClass5Q6 {
    /* renamed from: B */
    public static boolean m26458B(AnonymousClass5Q1 anonymousClass5Q1, String str, JsonParser jsonParser) {
        if (!"has_shared_follower_accounts".equals(str)) {
            return false;
        }
        anonymousClass5Q1.f63212B = jsonParser.getValueAsBoolean();
        return true;
    }

    public static AnonymousClass5Q1 parseFromJson(JsonParser jsonParser) {
        AnonymousClass5Q1 anonymousClass5Q1 = new AnonymousClass5Q1();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass5Q6.m26458B(anonymousClass5Q1, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass5Q1;
    }
}
