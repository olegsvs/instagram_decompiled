package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Fd */
public final class AnonymousClass3Fd {
    /* renamed from: B */
    public static boolean m19139B(AnonymousClass3Fc anonymousClass3Fc, String str, JsonParser jsonParser) {
        if ("filter_id".equals(str)) {
            anonymousClass3Fc.f39567D = jsonParser.getValueAsInt();
            return true;
        } else if ("filter_index".equals(str)) {
            anonymousClass3Fc.f39568E = jsonParser.getValueAsInt();
            return true;
        } else {
            List list = null;
            Integer valueOf;
            if ("color_filter_ids".equals(str)) {
                if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                    list = new ArrayList();
                    while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                        valueOf = Integer.valueOf(jsonParser.getValueAsInt());
                        if (valueOf != null) {
                            list.add(valueOf);
                        }
                    }
                }
                anonymousClass3Fc.f39565B = list;
                return true;
            } else if (!"color_filter_impressions".equals(str)) {
                return false;
            } else {
                if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                    list = new ArrayList();
                    while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                        valueOf = Integer.valueOf(jsonParser.getValueAsInt());
                        if (valueOf != null) {
                            list.add(valueOf);
                        }
                    }
                }
                anonymousClass3Fc.f39566C = list;
                return true;
            }
        }
    }

    public static AnonymousClass3Fc parseFromJson(JsonParser jsonParser) {
        AnonymousClass3Fc anonymousClass3Fc = new AnonymousClass3Fc();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3Fd.m19139B(anonymousClass3Fc, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3Fc;
    }
}
