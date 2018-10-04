package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.HashMap;

/* renamed from: X.5Mq */
public final class AnonymousClass5Mq {
    /* renamed from: B */
    public static boolean m26346B(AnonymousClass5Mp anonymousClass5Mp, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("resource_type".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass5Mp.f62665C = str2;
            return true;
        } else if (!"resource_data".equals(str)) {
            return false;
        } else {
            HashMap hashMap;
            if (jsonParser.getCurrentToken() == JsonToken.START_OBJECT) {
                hashMap = new HashMap();
                while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                    String text = jsonParser.getText();
                    jsonParser.nextToken();
                    JsonToken currentToken = jsonParser.getCurrentToken();
                    JsonToken jsonToken = JsonToken.VALUE_NULL;
                    if (currentToken == jsonToken) {
                        hashMap.put(text, null);
                    } else {
                        Object text2 = jsonParser.getCurrentToken() == jsonToken ? null : jsonParser.getText();
                        if (text2 != null) {
                            hashMap.put(text, text2);
                        }
                    }
                }
            } else {
                hashMap = null;
            }
            anonymousClass5Mp.f62664B = hashMap;
            return true;
        }
    }

    public static AnonymousClass5Mp parseFromJson(JsonParser jsonParser) {
        AnonymousClass5Mp anonymousClass5Mp = new AnonymousClass5Mp();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass5Mq.m26346B(anonymousClass5Mp, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass5Mp;
    }
}
