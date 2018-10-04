package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2aN */
public final class AnonymousClass2aN {
    /* renamed from: B */
    public static boolean m16338B(AnonymousClass2Di anonymousClass2Di, String str, JsonParser jsonParser) {
        if ("resend_sms_delay_sec".equals(str)) {
            anonymousClass2Di.f27648E = jsonParser.getValueAsInt();
            return true;
        } else if ("max_sms_count".equals(str)) {
            anonymousClass2Di.f27645B = jsonParser.getValueAsInt();
            return true;
        } else if ("robocall_count_down_time_sec".equals(str)) {
            anonymousClass2Di.f27646C = jsonParser.getValueAsInt();
            return true;
        } else if (!"robocall_after_max_sms".equals(str)) {
            return false;
        } else {
            anonymousClass2Di.f27647D = jsonParser.getValueAsBoolean();
            return true;
        }
    }

    public static AnonymousClass2Di parseFromJson(JsonParser jsonParser) {
        AnonymousClass2Di anonymousClass2Di = new AnonymousClass2Di();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2aN.m16338B(anonymousClass2Di, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2Di;
    }
}
