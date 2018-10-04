package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2VK */
public final class AnonymousClass2VK {
    /* renamed from: B */
    public static boolean m16126B(AnonymousClass27o anonymousClass27o, String str, JsonParser jsonParser) {
        List list = null;
        if ("id".equals(str)) {
            String text;
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                text = jsonParser.getText();
            }
            anonymousClass27o.f26391C = text;
            return true;
        }
        if ("name".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                return true;
            }
        } else if ("icon_url".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                return true;
            }
        } else if ("type".equals(str)) {
            anonymousClass27o.f26390B = AnonymousClass27j.m14510B(jsonParser.getValueAsString());
            return true;
        } else if (!"static_stickers".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass27l parseFromJson = AnonymousClass2VJ.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        list.add(parseFromJson);
                    }
                }
            }
            anonymousClass27o.f26392D = list;
            return true;
        }
        jsonParser.getText();
        return true;
    }

    public static AnonymousClass27o parseFromJson(JsonParser jsonParser) {
        AnonymousClass27o anonymousClass27o = new AnonymousClass27o();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2VK.m16126B(anonymousClass27o, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass27o;
    }
}
