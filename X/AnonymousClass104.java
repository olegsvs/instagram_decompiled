package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.104 */
public final class AnonymousClass104 {
    /* renamed from: B */
    public static boolean m8701B(AnonymousClass1YW anonymousClass1YW, String str, JsonParser jsonParser) {
        List list = null;
        if ("translation".equals(str)) {
            String text;
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                text = jsonParser.getText();
            }
            anonymousClass1YW.f20035C = text;
            return true;
        } else if (!"comment_translations".equals(str)) {
            return AnonymousClass0Pv.m3947B(anonymousClass1YW, str, jsonParser);
        } else {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass3Nk parseFromJson = AnonymousClass3Nl.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        list.add(parseFromJson);
                    }
                }
            }
            anonymousClass1YW.f20034B = list;
            return true;
        }
    }

    public static AnonymousClass1YW parseFromJson(JsonParser jsonParser) {
        AnonymousClass1YW anonymousClass1YW = new AnonymousClass1YW();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass104.m8701B(anonymousClass1YW, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1YW;
    }
}
