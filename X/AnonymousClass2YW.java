package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2YW */
public final class AnonymousClass2YW {
    /* renamed from: B */
    public static boolean m16240B(AnonymousClass2YD anonymousClass2YD, String str, JsonParser jsonParser) {
        List list = null;
        if ("policy_url".equals(str)) {
            String text;
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                text = jsonParser.getText();
            }
            anonymousClass2YD.f31227E = text;
            return true;
        } else if ("context_page".equals(str)) {
            anonymousClass2YD.f31224B = AnonymousClass2YU.parseFromJson(jsonParser);
            return true;
        } else if ("legal_content".equals(str)) {
            anonymousClass2YD.f31226D = AnonymousClass2Yl.parseFromJson(jsonParser);
            return true;
        } else if ("thank_you_page".equals(str)) {
            anonymousClass2YD.f31228F = AnonymousClass2Yp.parseFromJson(jsonParser);
            return true;
        } else if (!"info_fields_data".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass2YQ parseFromJson = AnonymousClass2Yo.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        list.add(parseFromJson);
                    }
                }
            }
            anonymousClass2YD.f31225C = list;
            return true;
        }
    }

    public static AnonymousClass2YD parseFromJson(JsonParser jsonParser) {
        AnonymousClass2YD anonymousClass2YD = new AnonymousClass2YD();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2YW.m16240B(anonymousClass2YD, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2YD;
    }
}
