package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.30K */
public final class AnonymousClass30K {
    /* renamed from: B */
    public static boolean m18159B(AnonymousClass30J anonymousClass30J, String str, JsonParser jsonParser) {
        if ("id".equals(str)) {
            anonymousClass30J.f36798C = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
            return true;
        } else if ("timestamp".equals(str)) {
            anonymousClass30J.f36800E = jsonParser.getValueAsLong();
            return true;
        } else if ("media_count".equals(str)) {
            anonymousClass30J.f36799D = jsonParser.getValueAsInt();
            return true;
        } else if (!"cover_image_version".equals(str)) {
            return false;
        } else {
            anonymousClass30J.f36797B = AnonymousClass30P.parseFromJson(jsonParser);
            return true;
        }
    }

    public static AnonymousClass30J parseFromJson(JsonParser jsonParser) {
        AnonymousClass30J anonymousClass30J = new AnonymousClass30J();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass30K.m18159B(anonymousClass30J, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass30J;
    }
}
