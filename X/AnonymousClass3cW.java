package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3cW */
public final class AnonymousClass3cW {
    /* renamed from: B */
    public static boolean m20199B(AnonymousClass41a anonymousClass41a, String str, JsonParser jsonParser) {
        List list = null;
        if ("mutual_followers".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass0Ci B = AnonymousClass0Ci.B(jsonParser);
                    if (B != null) {
                        list.add(B);
                    }
                }
            }
            anonymousClass41a.f48496B = list;
            return true;
        } else if ("show_see_all_followers_button".equals(str)) {
            anonymousClass41a.f48498D = jsonParser.getValueAsBoolean();
            return true;
        } else if (!"suggested_users".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass41a, str, jsonParser);
        } else {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass0mW parseFromJson = AnonymousClass18i.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        list.add(parseFromJson);
                    }
                }
            }
            anonymousClass41a.f48497C = list;
            return true;
        }
    }

    public static AnonymousClass41a parseFromJson(JsonParser jsonParser) {
        AnonymousClass41a anonymousClass41a = new AnonymousClass41a();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3cW.m20199B(anonymousClass41a, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass41a;
    }
}
