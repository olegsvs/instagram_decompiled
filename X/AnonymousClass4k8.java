package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.4k8 */
public final class AnonymousClass4k8 {
    /* renamed from: B */
    public static boolean m24952B(AnonymousClass4k7 anonymousClass4k7, String str, JsonParser jsonParser) {
        if ("cta_link".equals(str)) {
            anonymousClass4k7.f56719B = AnonymousClass4gW.parseFromJson(jsonParser);
            return true;
        } else if (!"invite_source".equals(str)) {
            return AnonymousClass0XV.B(anonymousClass4k7, str, jsonParser);
        } else {
            anonymousClass4k7.f56720C = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
            return true;
        }
    }

    public static AnonymousClass4k7 parseFromJson(JsonParser jsonParser) {
        AnonymousClass4k7 anonymousClass4k7 = new AnonymousClass4k7();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass4k8.m24952B(anonymousClass4k7, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass4k7;
    }
}
