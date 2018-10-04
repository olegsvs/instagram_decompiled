package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.36o */
public final class AnonymousClass36o {
    /* renamed from: B */
    public static boolean m18563B(AnonymousClass36n anonymousClass36n, String str, JsonParser jsonParser) {
        if ("effect_config".equals(str)) {
            anonymousClass36n.f37925F = AnonymousClass36q.parseFromJson(jsonParser);
            return true;
        } else if ("face_models".equals(str)) {
            anonymousClass36n.f37924E = AnonymousClass36u.parseFromJson(jsonParser);
            return true;
        } else if ("new_face_models".equals(str)) {
            anonymousClass36n.f37932M = AnonymousClass36u.parseFromJson(jsonParser);
            return true;
        } else if ("new_segmentation_model".equals(str)) {
            anonymousClass36n.f37933N = AnonymousClass36u.parseFromJson(jsonParser);
            return true;
        } else if ("effects".equals(str)) {
            List list = null;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass36h parseFromJson = AnonymousClass36m.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        list.add(parseFromJson);
                    }
                }
            }
            anonymousClass36n.f37926G = list;
            return true;
        } else if ("last_face_models_fetch_time_ms".equals(str)) {
            anonymousClass36n.f37930K = jsonParser.getValueAsLong();
            return true;
        } else if ("last_segmentation_models_fetch_time_ms".equals(str)) {
            anonymousClass36n.f37931L = jsonParser.getValueAsLong();
            return true;
        } else if ("last_face_effects_fetch_time_ms".equals(str)) {
            anonymousClass36n.f37929J = jsonParser.getValueAsLong();
            return true;
        } else if ("last_world_tracker_fetch_time_ms".equals(str)) {
            anonymousClass36n.f37936Q = jsonParser.getValueAsLong();
            return true;
        } else if (!"face_effect_version".equals(str)) {
            return false;
        } else {
            anonymousClass36n.f37927H = jsonParser.getValueAsInt();
            return true;
        }
    }

    public static AnonymousClass36n parseFromJson(JsonParser jsonParser) {
        AnonymousClass36n anonymousClass36n = new AnonymousClass36n();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass36o.m18563B(anonymousClass36n, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass36n;
    }

    public static AnonymousClass36n parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return AnonymousClass36o.parseFromJson(createParser);
    }
}
