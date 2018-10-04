package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.5Q5 */
public final class AnonymousClass5Q5 {
    /* renamed from: B */
    public static boolean m26457B(AnonymousClass5Q0 anonymousClass5Q0, String str, JsonParser jsonParser) {
        if ("is_visible".equals(str)) {
            anonymousClass5Q0.f63211C = jsonParser.getValueAsBoolean();
            return true;
        } else if (!"country_name".equals(str)) {
            return false;
        } else {
            anonymousClass5Q0.f63210B = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
            return true;
        }
    }

    public static AnonymousClass5Q0 parseFromJson(JsonParser jsonParser) {
        AnonymousClass5Q0 anonymousClass5Q0 = new AnonymousClass5Q0();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass5Q5.m26457B(anonymousClass5Q0, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass5Q0;
    }
}
