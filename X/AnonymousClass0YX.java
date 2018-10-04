package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0YX */
public final class AnonymousClass0YX {
    /* renamed from: B */
    public static boolean m5302B(AnonymousClass0UD anonymousClass0UD, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("share_targets".equals(str)) {
            List arrayList;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    DirectShareTarget parseFromJson = AnonymousClass0YK.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            anonymousClass0UD.f5396C = arrayList;
            return true;
        } else if ("reel_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0UD.f5395B = str2;
            return true;
        } else if (!"story_share".equals(str)) {
            return AnonymousClass0XV.m5237B(anonymousClass0UD, str, jsonParser);
        } else {
            anonymousClass0UD.f5397D = AnonymousClass0YW.parseFromJson(jsonParser);
            return true;
        }
    }

    public static AnonymousClass0UD parseFromJson(JsonParser jsonParser) {
        AnonymousClass0UD anonymousClass0UD = new AnonymousClass0UD();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass0YX.m5302B(anonymousClass0UD, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0UD;
    }
}
