package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.2Wr */
public final class AnonymousClass2Wr {
    /* renamed from: B */
    public static boolean m16190B(AnonymousClass2ec anonymousClass2ec, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("caption_text".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                jsonParser.getText();
            }
            return true;
        } else if ("id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2ec.f32029D = str2;
            return true;
        } else if ("instagram_media_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2ec.f32030E = str2;
            return true;
        } else if ("organic_instagram_media_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2ec.f32032G = str2;
            return true;
        } else if ("display_url".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2ec.f32028C = str2;
            return true;
        } else if ("boosted_component".equals(str)) {
            anonymousClass2ec.f32027B = AnonymousClass2Wo.parseFromJson(jsonParser);
            return true;
        } else if (!"instagram_owner".equals(str)) {
            return false;
        } else {
            anonymousClass2ec.f32031F = AnonymousClass2Wq.parseFromJson(jsonParser);
            return true;
        }
    }

    public static AnonymousClass2ec parseFromJson(JsonParser jsonParser) {
        AnonymousClass2ec anonymousClass2ec = new AnonymousClass2ec();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2Wr.m16190B(anonymousClass2ec, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2ec;
    }
}
