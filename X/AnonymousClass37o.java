package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.37o */
public final class AnonymousClass37o {
    /* renamed from: B */
    public static boolean m18643B(AnonymousClass37n anonymousClass37n, String str, JsonParser jsonParser) {
        if ("sdk_version".equals(str)) {
            anonymousClass37n.f38116D = jsonParser.getValueAsInt();
            return true;
        } else if ("effect_config".equals(str)) {
            anonymousClass37n.f38114B = AnonymousClass36q.parseFromJson(jsonParser);
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
            anonymousClass37n.f38115C = list;
            return true;
        } else if ("loading_effect".equals(str)) {
            anonymousClass37n.f38117E = AnonymousClass36m.parseFromJson(jsonParser);
            return true;
        } else if (!"face_filter_nux_version".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass37n, str, jsonParser);
        } else {
            jsonParser.getValueAsInt();
            return true;
        }
    }

    public static AnonymousClass37n parseFromJson(JsonParser jsonParser) {
        AnonymousClass37n anonymousClass37n = new AnonymousClass37n();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass37o.m18643B(anonymousClass37n, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass37n;
    }
}
