package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2YU */
public final class AnonymousClass2YU {
    /* renamed from: B */
    public static boolean m16238B(AnonymousClass2YB anonymousClass2YB, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("context_cta".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2YB.f31220E = str2;
            return true;
        } else if ("context_title".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass2YB.f31221F = str2;
            return true;
        } else if ("context_content_style".equals(str)) {
            anonymousClass2YB.f31219D = AnonymousClass2Bu.m14628B(jsonParser.getValueAsString());
            return true;
        } else if ("context_card_photo".equals(str)) {
            anonymousClass2YB.f31217B = AnonymousClass2YT.parseFromJson(jsonParser);
            return true;
        } else if (!"context_content".equals(str)) {
            return false;
        } else {
            List arrayList;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    Object text = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
                    if (text != null) {
                        arrayList.add(text);
                    }
                }
            } else {
                arrayList = null;
            }
            anonymousClass2YB.f31218C = arrayList;
            return true;
        }
    }

    public static AnonymousClass2YB parseFromJson(JsonParser jsonParser) {
        AnonymousClass2YB anonymousClass2YB = new AnonymousClass2YB();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2YU.m16238B(anonymousClass2YB, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass2YB;
    }
}
