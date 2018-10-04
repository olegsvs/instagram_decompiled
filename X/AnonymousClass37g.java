package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.HashMap;

/* renamed from: X.37g */
public final class AnonymousClass37g {
    /* renamed from: B */
    public static boolean m18640B(AnonymousClass37f anonymousClass37f, String str, JsonParser jsonParser) {
        HashMap hashMap;
        String text;
        AnonymousClass36r parseFromJson;
        if ("aml_face_models".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_OBJECT) {
                hashMap = new HashMap();
                while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                    text = jsonParser.getText();
                    jsonParser.nextToken();
                    if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                        hashMap.put(text, null);
                    } else {
                        parseFromJson = AnonymousClass36s.parseFromJson(jsonParser);
                        if (parseFromJson != null) {
                            hashMap.put(text, parseFromJson);
                        }
                    }
                }
            } else {
                hashMap = null;
            }
            anonymousClass37f.f38095B = hashMap;
            return true;
        } else if (!"segmentation_models".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass37f, str, jsonParser);
        } else {
            if (jsonParser.getCurrentToken() == JsonToken.START_OBJECT) {
                hashMap = new HashMap();
                while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                    text = jsonParser.getText();
                    jsonParser.nextToken();
                    if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                        hashMap.put(text, null);
                    } else {
                        parseFromJson = AnonymousClass36s.parseFromJson(jsonParser);
                        if (parseFromJson != null) {
                            hashMap.put(text, parseFromJson);
                        }
                    }
                }
            } else {
                hashMap = null;
            }
            anonymousClass37f.f38096C = hashMap;
            return true;
        }
    }

    public static AnonymousClass37f parseFromJson(JsonParser jsonParser) {
        AnonymousClass37f anonymousClass37f = new AnonymousClass37f();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass37g.m18640B(anonymousClass37f, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass37f;
    }
}
