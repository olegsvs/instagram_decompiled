package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2VV */
public final class AnonymousClass2VV {
    /* renamed from: B */
    public static boolean m16139B(AnonymousClass28O anonymousClass28O, String str, JsonParser jsonParser) {
        if ("preview_comments".equals(str)) {
            List list = null;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass0SK parseFromJson = AnonymousClass122.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        list.add(parseFromJson);
                    }
                }
            }
            anonymousClass28O.f26507C = list;
            return true;
        } else if (!"comment_count".equals(str)) {
            return false;
        } else {
            anonymousClass28O.f26506B = Integer.valueOf(jsonParser.getValueAsInt());
            return true;
        }
    }

    public static AnonymousClass28O parseFromJson(JsonParser jsonParser) {
        AnonymousClass28O anonymousClass28O = new AnonymousClass28O();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2VV.m16139B(anonymousClass28O, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass28O;
    }
}
