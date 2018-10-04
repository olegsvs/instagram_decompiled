package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.model.fbfriend.FbFriendTag;
import java.util.ArrayList;

/* renamed from: X.1AU */
public final class AnonymousClass1AU {
    /* renamed from: B */
    public static boolean m9717B(AnonymousClass1AV anonymousClass1AV, String str, JsonParser jsonParser) {
        if (!"in".equals(str)) {
            return false;
        }
        ArrayList arrayList = null;
        if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
            arrayList = new ArrayList();
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                FbFriendTag parseFromJson = AnonymousClass2aj.parseFromJson(jsonParser);
                if (parseFromJson != null) {
                    arrayList.add(parseFromJson);
                }
            }
        }
        anonymousClass1AV.f15285B = arrayList;
        return true;
    }

    public static AnonymousClass1AV parseFromJson(JsonParser jsonParser) {
        AnonymousClass1AV anonymousClass1AV = new AnonymousClass1AV();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1AU.m9717B(anonymousClass1AV, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1AV;
    }
}
