package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;

/* renamed from: X.1gH */
public final class AnonymousClass1gH {
    /* renamed from: B */
    public static boolean m12486B(AnonymousClass3m6 anonymousClass3m6, String str, JsonParser jsonParser) {
        ArrayList arrayList;
        Object text;
        if ("new_suggestion_ids".equals(str)) {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    text = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
                    if (text != null) {
                        arrayList.add(text);
                    }
                }
            } else {
                arrayList = null;
            }
            anonymousClass3m6.f44268C = arrayList;
            return true;
        } else if (!"new_suggestion_algorithms".equals(str)) {
            return AnonymousClass0Pv.m3947B(anonymousClass3m6, str, jsonParser);
        } else {
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    text = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
                    if (text != null) {
                        arrayList.add(text);
                    }
                }
            } else {
                arrayList = null;
            }
            anonymousClass3m6.f44267B = arrayList;
            return true;
        }
    }

    public static AnonymousClass3m6 parseFromJson(JsonParser jsonParser) {
        AnonymousClass3m6 anonymousClass3m6 = new AnonymousClass3m6();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1gH.m12486B(anonymousClass3m6, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3m6;
    }
}
