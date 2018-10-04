package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1gO */
public final class AnonymousClass1gO {
    /* renamed from: B */
    public static boolean m12497B(AnonymousClass4qg anonymousClass4qg, String str, JsonParser jsonParser) {
        if (!"badging_data".equals(str)) {
            return AnonymousClass0Pv.m3947B(anonymousClass4qg, str, jsonParser);
        }
        List list = null;
        if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
            list = new ArrayList();
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                AnonymousClass4qe parseFromJson = AnonymousClass4qf.parseFromJson(jsonParser);
                if (parseFromJson != null) {
                    list.add(parseFromJson);
                }
            }
        }
        anonymousClass4qg.f57854B = list;
        return true;
    }

    public static AnonymousClass4qg parseFromJson(JsonParser jsonParser) {
        AnonymousClass4qg anonymousClass4qg = new AnonymousClass4qg();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1gO.m12497B(anonymousClass4qg, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass4qg;
    }
}
