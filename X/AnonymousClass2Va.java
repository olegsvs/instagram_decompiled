package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2Va */
public final class AnonymousClass2Va {
    /* renamed from: B */
    public static boolean m16143B(AnonymousClass28R anonymousClass28R, String str, JsonParser jsonParser) {
        if (!"byline_text".equals(str)) {
            return false;
        }
        anonymousClass28R.f26520B = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
        return true;
    }

    public static AnonymousClass28R parseFromJson(JsonParser jsonParser) {
        AnonymousClass28R anonymousClass28R = new AnonymousClass28R();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2Va.m16143B(anonymousClass28R, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass28R;
    }
}
