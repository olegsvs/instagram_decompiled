package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.159 */
public final class AnonymousClass159 {
    /* renamed from: B */
    public static boolean m9292B(AnonymousClass11t anonymousClass11t, String str, JsonParser jsonParser) {
        List list = null;
        if ("newness_token".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                jsonParser.getText();
            }
            return true;
        } else if (!DialogModule.KEY_ITEMS.equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass0n7 parseFromJson = AnonymousClass15a.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        list.add(parseFromJson);
                    }
                }
            }
            anonymousClass11t.f13456B = list;
            return true;
        }
    }

    public static AnonymousClass11t parseFromJson(JsonParser jsonParser) {
        AnonymousClass11t anonymousClass11t = new AnonymousClass11t();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass159.m9292B(anonymousClass11t, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass11t;
    }
}
