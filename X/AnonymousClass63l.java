package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.63l */
public final class AnonymousClass63l {
    /* renamed from: B */
    public static boolean m28843B(AnonymousClass63j anonymousClass63j, String str, JsonParser jsonParser) {
        List list = null;
        String text;
        if ("name".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                text = jsonParser.getText();
            }
            anonymousClass63j.f71361D = text;
            return true;
        } else if ("profile_pic_url".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                text = jsonParser.getText();
            }
            anonymousClass63j.f71363F = text;
            return true;
        } else if ("occupation".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                text = jsonParser.getText();
            }
            anonymousClass63j.f71362E = text;
            return true;
        } else if ("location".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                text = jsonParser.getText();
            }
            anonymousClass63j.f71360C = text;
            return true;
        } else if (!"android_links".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass0vq B = AnonymousClass0vq.B(jsonParser, true);
                    if (B != null) {
                        list.add(B);
                    }
                }
            }
            anonymousClass63j.f71359B = list;
            return true;
        }
    }

    public static AnonymousClass63j parseFromJson(JsonParser jsonParser) {
        AnonymousClass63j anonymousClass63j = new AnonymousClass63j();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass63l.m28843B(anonymousClass63j, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass63j;
    }
}
