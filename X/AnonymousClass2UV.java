package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;

/* renamed from: X.2UV */
public final class AnonymousClass2UV {
    /* renamed from: B */
    public static boolean m16038B(AnonymousClass23V anonymousClass23V, String str, JsonParser jsonParser) {
        if (!"errors".equals(str)) {
            return false;
        }
        if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
            anonymousClass23V = new ArrayList();
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                Object text = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
                if (text != null) {
                    anonymousClass23V.add(text);
                }
            }
        }
        return true;
    }

    public static AnonymousClass23V parseFromJson(JsonParser jsonParser) {
        AnonymousClass23V anonymousClass23V = new AnonymousClass23V();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2UV.m16038B(anonymousClass23V, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass23V;
    }
}
