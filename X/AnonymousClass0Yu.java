package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.0Yu */
public final class AnonymousClass0Yu {
    /* renamed from: B */
    public static boolean m5327B(AnonymousClass0UL anonymousClass0UL, String str, JsonParser jsonParser) {
        if ("thread_key".equals(str)) {
            anonymousClass0UL.f5427E = AnonymousClass0Ys.parseFromJson(jsonParser);
            return true;
        }
        String str2 = null;
        if ("client_context".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0UL.f5424B = str2;
            return true;
        } else if ("message_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0UL.f5426D = str2;
            return true;
        } else if (!"reaction_mutation".equals(str)) {
            return AnonymousClass0Yl.m5312B(anonymousClass0UL, str, jsonParser);
        } else {
            anonymousClass0UL.f5425C = AnonymousClass0Yt.parseFromJson(jsonParser);
            return true;
        }
    }

    public static AnonymousClass0UL parseFromJson(JsonParser jsonParser) {
        AnonymousClass0UL anonymousClass0UL = new AnonymousClass0UL();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass0Yu.m5327B(anonymousClass0UL, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        if (anonymousClass0UL.f5424B == null) {
            anonymousClass0UL.f5424B = AnonymousClass0W7.m4993D();
        }
        return anonymousClass0UL;
    }
}
