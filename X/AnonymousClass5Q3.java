package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.5Q3 */
public final class AnonymousClass5Q3 {
    /* renamed from: B */
    public static boolean m26455B(AnonymousClass5Py anonymousClass5Py, String str, JsonParser jsonParser) {
        if ("has_ads".equals(str)) {
            anonymousClass5Py.f63208C = jsonParser.getValueAsBoolean();
            return true;
        } else if (!"ads_url".equals(str)) {
            return false;
        } else {
            anonymousClass5Py.f63207B = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
            return true;
        }
    }

    public static AnonymousClass5Py parseFromJson(JsonParser jsonParser) {
        AnonymousClass5Py anonymousClass5Py = new AnonymousClass5Py();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass5Q3.m26455B(anonymousClass5Py, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass5Py;
    }
}
