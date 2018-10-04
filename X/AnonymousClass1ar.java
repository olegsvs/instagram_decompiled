package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.1ar */
public final class AnonymousClass1ar {
    /* renamed from: B */
    public static boolean m11949B(AnonymousClass1as anonymousClass1as, String str, JsonParser jsonParser) {
        if ("is_linked".equals(str)) {
            anonymousClass1as.f20377B = Boolean.valueOf(jsonParser.getValueAsBoolean());
            return true;
        } else if (!"name".equals(str)) {
            return false;
        } else {
            anonymousClass1as.f20378C = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
            return true;
        }
    }

    public static AnonymousClass1as parseFromJson(JsonParser jsonParser) {
        AnonymousClass1as anonymousClass1as = new AnonymousClass1as();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1ar.m11949B(anonymousClass1as, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1as;
    }

    public static AnonymousClass1as parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return AnonymousClass1ar.parseFromJson(createParser);
    }
}
