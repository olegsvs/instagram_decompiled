package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3R7 */
public final class AnonymousClass3R7 {
    /* renamed from: B */
    public static boolean m19635B(AnonymousClass1j9 anonymousClass1j9, String str, JsonParser jsonParser) {
        List arrayList;
        if ("ssrcGroups".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass3R8 parseFromJson = AnonymousClass3R9.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
        } else if ("media".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass3R4 parseFromJson2 = AnonymousClass1j7.parseFromJson(jsonParser);
                    if (parseFromJson2 != null) {
                        arrayList.add(parseFromJson2);
                    }
                }
            }
        } else if (!"sourceKey".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                jsonParser.getText();
            }
        }
        return true;
    }

    public static AnonymousClass1j9 parseFromJson(JsonParser jsonParser) {
        AnonymousClass1j9 anonymousClass1j9 = new AnonymousClass1j9();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3R7.m19635B(anonymousClass1j9, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1j9;
    }
}
