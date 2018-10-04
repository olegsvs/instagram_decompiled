package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3nL */
public final class AnonymousClass3nL {
    /* renamed from: B */
    public static boolean m20655B(AnonymousClass3nK anonymousClass3nK, String str, JsonParser jsonParser) {
        List list = null;
        if ("suggestions".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass26x parseFromJson = AnonymousClass2V7.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        list.add(parseFromJson);
                    }
                }
            }
            anonymousClass3nK.f44548D = list;
            return true;
        } else if ("next_max_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                jsonParser.getText();
            }
            return true;
        } else if ("has_more".equals(str)) {
            anonymousClass3nK.f44546B = jsonParser.getValueAsBoolean();
            return true;
        } else if (!"user_count".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass3nK, str, jsonParser);
        } else {
            anonymousClass3nK.f44547C = jsonParser.getValueAsInt();
            return true;
        }
    }

    public static AnonymousClass3nK parseFromJson(JsonParser jsonParser) {
        AnonymousClass3nK anonymousClass3nK = new AnonymousClass3nK();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3nL.m20655B(anonymousClass3nK, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3nK;
    }
}
