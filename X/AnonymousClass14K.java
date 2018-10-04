package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.14K */
public final class AnonymousClass14K {
    /* renamed from: B */
    public static boolean m9178B(AnonymousClass14L anonymousClass14L, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("attribution_username".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass14L.f13869C = str2;
            return true;
        } else if ("attribution_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass14L.f13868B = str2;
            return true;
        } else if ("capture_type".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass14L.f13871E = str2;
            return true;
        } else if ("camera_facing".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass14L.f13870D = str2;
            return true;
        } else if ("face_effect_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass14L.f13873G = str2;
            return true;
        } else if ("effect_icon_url".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass14L.f13872F = str2;
            return true;
        } else if ("should_render_try_it_on".equals(str)) {
            anonymousClass14L.f13875I = jsonParser.getValueAsBoolean();
            return true;
        } else if (!"persisted_effect_metadata_json".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass14L.f13874H = str2;
            return true;
        }
    }

    public static AnonymousClass14L parseFromJson(JsonParser jsonParser) {
        AnonymousClass14L anonymousClass14L = new AnonymousClass14L();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass14K.m9178B(anonymousClass14L, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass14L;
    }
}
