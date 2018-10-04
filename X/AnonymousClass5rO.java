package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5rO */
public final class AnonymousClass5rO {
    /* renamed from: B */
    public static boolean m28575B(AnonymousClass0T2 anonymousClass0T2, String str, JsonParser jsonParser) {
        List list = null;
        if ("name".equals(str)) {
            String text;
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                text = jsonParser.getText();
            }
            anonymousClass0T2.f5068B = text;
            return true;
        } else if (!"parameters".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass1bR parseFromJson = AnonymousClass1Wr.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        list.add(parseFromJson);
                    }
                }
            }
            anonymousClass0T2.f5069C = list;
            return true;
        }
    }

    public static AnonymousClass0T2 parseFromJson(JsonParser jsonParser) {
        AnonymousClass0T2 anonymousClass0T2 = new AnonymousClass0T2();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass5rO.m28575B(anonymousClass0T2, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0T2;
    }
}
