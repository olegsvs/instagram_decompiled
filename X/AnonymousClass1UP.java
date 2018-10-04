package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1UP */
public final class AnonymousClass1UP {
    /* renamed from: B */
    public static boolean m11591B(AnonymousClass3Me anonymousClass3Me, String str, JsonParser jsonParser) {
        if (!"objects".equals(str)) {
            return false;
        }
        List list = null;
        if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
            list = new ArrayList();
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                AnonymousClass0fD parseFromJson = AnonymousClass0fE.parseFromJson(jsonParser);
                if (parseFromJson != null) {
                    list.add(parseFromJson);
                }
            }
        }
        anonymousClass3Me.f40495B = list;
        return true;
    }

    public static AnonymousClass3Me parseFromJson(JsonParser jsonParser) {
        AnonymousClass3Me anonymousClass3Me = new AnonymousClass3Me();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1UP.m11591B(anonymousClass3Me, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3Me;
    }
}
