package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Yk */
public final class AnonymousClass2Yk {
    /* renamed from: B */
    public static boolean m16254B(AnonymousClass2YM anonymousClass2YM, String str, JsonParser jsonParser) {
        List list = null;
        if ("text".equals(str)) {
            String text;
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                text = jsonParser.getText();
            }
            anonymousClass2YM.f31244C = text;
            return true;
        } else if (!"ranges".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                list = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    AnonymousClass2YL parseFromJson = AnonymousClass2Yj.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        list.add(parseFromJson);
                    }
                }
            }
            anonymousClass2YM.f31243B = list;
            return true;
        }
    }

    public static AnonymousClass2YM parseFromJson(JsonParser jsonParser) {
        AnonymousClass2YM anonymousClass2YM = new AnonymousClass2YM();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2Yk.m16254B(anonymousClass2YM, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2YM;
    }
}
