package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.4Aq */
public final class AnonymousClass4Aq {
    /* renamed from: B */
    public static boolean m23479B(AnonymousClass4Ao anonymousClass4Ao, String str, JsonParser jsonParser) {
        if (!"client_dict".equals(str)) {
            return false;
        }
        anonymousClass4Ao.f51152B = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
        return true;
    }

    public static AnonymousClass4Ao parseFromJson(JsonParser jsonParser) {
        AnonymousClass4Ao anonymousClass4Ao = new AnonymousClass4Ao();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass4Aq.m23479B(anonymousClass4Ao, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass4Ao;
    }
}
