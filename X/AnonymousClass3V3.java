package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3V3 */
public final class AnonymousClass3V3 {
    /* renamed from: B */
    public static boolean m19749B(AnonymousClass3V2 anonymousClass3V2, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("reels".equals(str)) {
            List arrayList;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass0r7 parseFromJson = AnonymousClass14E.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            anonymousClass3V2.f41707C = arrayList;
            return true;
        } else if (!"max_id".equals(str)) {
            return AnonymousClass0Pv.B(anonymousClass3V2, str, jsonParser);
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass3V2.f41706B = str2;
            return true;
        }
    }

    public static AnonymousClass3V2 parseFromJson(JsonParser jsonParser) {
        AnonymousClass3V2 anonymousClass3V2 = new AnonymousClass3V2();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3V3.m19749B(anonymousClass3V2, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3V2;
    }
}
