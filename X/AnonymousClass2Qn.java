package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.HashMap;

/* renamed from: X.2Qn */
public final class AnonymousClass2Qn {
    /* renamed from: B */
    public static boolean m15701B(AnonymousClass1uN anonymousClass1uN, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("h".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1uN.f23965B = str2;
            return true;
        } else if ("media_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1uN.f23966C = str2;
            return true;
        } else if ("upload_id".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1uN.f23968E = str2;
            return true;
        } else if ("status".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1uN.f23967D = str2;
            return true;
        } else if (!"xsharing_nonces".equals(str)) {
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
            anonymousClass1uN.f23969F = hashMap;
            return true;
        }
    }

    public static AnonymousClass1uN parseFromJson(JsonParser jsonParser) {
        AnonymousClass1uN anonymousClass1uN = new AnonymousClass1uN();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass2Qn.m15701B(anonymousClass1uN, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1uN;
    }

    public static AnonymousClass1uN parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return AnonymousClass2Qn.parseFromJson(createParser);
    }
}
