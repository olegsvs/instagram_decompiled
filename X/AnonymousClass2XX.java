package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2XX */
public final class AnonymousClass2XX {
    /* renamed from: B */
    public static boolean m16214B(AnonymousClass2XH anonymousClass2XH, String str, JsonParser jsonParser) {
        if ("has_audio".equals(str)) {
            anonymousClass2XH.f31167B = jsonParser.getValueAsBoolean();
            return true;
        } else if ("video_duration".equals(str)) {
            jsonParser.getValueAsInt();
            return true;
        } else {
            List list = null;
            if ("id".equals(str)) {
                String text;
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    text = jsonParser.getText();
                }
                anonymousClass2XH.f31168C = text;
                return true;
            } else if ("image_versions2".equals(str)) {
                anonymousClass2XH.f31169D = AnonymousClass2XW.parseFromJson(jsonParser);
                return true;
            } else if (!"video_versions".equals(str)) {
                return false;
            } else {
                if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                    list = new ArrayList();
                    while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                        AnonymousClass2XI parseFromJson = AnonymousClass2XY.parseFromJson(jsonParser);
                        if (parseFromJson != null) {
                            list.add(parseFromJson);
                        }
                    }
                }
                anonymousClass2XH.f31170E = list;
                return true;
            }
        }
    }

    public static AnonymousClass2XH parseFromJson(JsonParser jsonParser) {
        AnonymousClass2XH anonymousClass2XH = new AnonymousClass2XH();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2XX.m16214B(anonymousClass2XH, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2XH;
    }
}
