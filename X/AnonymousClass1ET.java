package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1ET */
public final class AnonymousClass1ET {
    /* renamed from: B */
    public static boolean m10197B(AnonymousClass0W8 anonymousClass0W8, String str, JsonParser jsonParser) {
        if ("action".equals(str)) {
            anonymousClass0W8.f5923B = AnonymousClass0W9.m5038B(jsonParser.getText());
            return true;
        }
        List list = null;
        String text;
        if ("vc_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                text = jsonParser.getText();
            }
            anonymousClass0W8.f5926E = text;
            return true;
        } else if ("description".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                text = jsonParser.getText();
            }
            anonymousClass0W8.f5924C = text;
            return true;
        } else if (!"text_attributes".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass1bE parseFromJson = AnonymousClass1EY.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        list.add(parseFromJson);
                    }
                }
            }
            anonymousClass0W8.f5925D = list;
            return true;
        }
    }

    public static AnonymousClass0W8 parseFromJson(JsonParser jsonParser) {
        AnonymousClass0W8 anonymousClass0W8 = new AnonymousClass0W8();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1ET.m10197B(anonymousClass0W8, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0W8;
    }
}
