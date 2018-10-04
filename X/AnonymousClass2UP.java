package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2UP */
public final class AnonymousClass2UP {
    /* renamed from: B */
    public static boolean m16020B(AnonymousClass232 anonymousClass232, String str, JsonParser jsonParser) {
        if ("key".equals(str)) {
            anonymousClass232.f25440B = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
            return true;
        } else if (!"time".equals(str)) {
            return false;
        } else {
            anonymousClass232.f25441C = new Float(jsonParser.getValueAsDouble());
            return true;
        }
    }

    public static AnonymousClass232 parseFromJson(JsonParser jsonParser) {
        AnonymousClass232 anonymousClass232 = new AnonymousClass232();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2UP.m16020B(anonymousClass232, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass232;
    }
}
