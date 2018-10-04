package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1bP */
public final class AnonymousClass1bP {
    /* renamed from: B */
    public static boolean m11987B(AnonymousClass19L anonymousClass19L, String str, JsonParser jsonParser) {
        List list = null;
        if ("clause_type".equals(str)) {
            String text;
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                text = jsonParser.getText();
            }
            anonymousClass19L.f15126B = text;
            return true;
        } else if ("filters".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass5rL parseFromJson = AnonymousClass1bS.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        list.add(parseFromJson);
                    }
                }
            }
            anonymousClass19L.f15128D = list;
            return true;
        } else if (!"clauses".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass19L parseFromJson2 = AnonymousClass1bP.parseFromJson(jsonParser);
                    if (parseFromJson2 != null) {
                        list.add(parseFromJson2);
                    }
                }
            }
            anonymousClass19L.f15127C = list;
            return true;
        }
    }

    public static AnonymousClass19L parseFromJson(JsonParser jsonParser) {
        AnonymousClass19L anonymousClass19L = new AnonymousClass19L();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1bP.m11987B(anonymousClass19L, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass19L;
    }
}
