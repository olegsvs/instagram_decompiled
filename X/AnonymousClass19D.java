package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.19D */
public final class AnonymousClass19D {
    /* renamed from: B */
    public static boolean m9659B(AnonymousClass199 anonymousClass199, String str, JsonParser jsonParser) {
        List list = null;
        if ("request_status".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                jsonParser.getText();
            }
        } else if ("qp_data".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass1DS parseFromJson = AnonymousClass1DR.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        list.add(parseFromJson);
                    }
                }
            }
            anonymousClass199.f15081B = list;
            return true;
        } else if ("extra_info".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass1DU parseFromJson2 = AnonymousClass1DT.parseFromJson(jsonParser);
                    if (parseFromJson2 != null) {
                        list.add(parseFromJson2);
                    }
                }
            }
        } else if (!"client_cache_ttl_in_sec".equals(str)) {
            return AnonymousClass0Pv.m3947B(anonymousClass199, str, jsonParser);
        } else {
            anonymousClass199.f15082C = Long.valueOf(jsonParser.getValueAsLong());
            return true;
        }
        return true;
    }

    public static AnonymousClass199 parseFromJson(JsonParser jsonParser) {
        AnonymousClass199 anonymousClass199 = new AnonymousClass199();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass19D.m9659B(anonymousClass199, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass199;
    }
}
