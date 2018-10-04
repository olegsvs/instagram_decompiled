package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import java.util.HashMap;

/* renamed from: X.3c9 */
public final class AnonymousClass3c9 {
    /* renamed from: B */
    public static boolean m20186B(AnonymousClass3c8 anonymousClass3c8, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("step_name".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass3c8.f42721F = str2;
            return true;
        } else if ("step_data".equals(str)) {
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
            anonymousClass3c8.f42720E = hashMap;
            return true;
        } else if ("action".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass3c8.f42717B = str2;
            return true;
        } else if (MemoryDumpUploadJob.EXTRA_USER_ID.equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass3c8.f42722G = str2;
            return true;
        } else if ("nonce_code".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass3c8.f42718C = str2;
            return true;
        } else if (!"flow_render_type".equals(str)) {
            return AnonymousClass2aH.m16332B(anonymousClass3c8, str, jsonParser);
        } else {
            anonymousClass3c8.f42719D = AnonymousClass3c7.m20182B(jsonParser.getValueAsInt());
            return true;
        }
    }

    public static AnonymousClass3c8 parseFromJson(JsonParser jsonParser) {
        AnonymousClass3c8 anonymousClass3c8 = new AnonymousClass3c8();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3c9.m20186B(anonymousClass3c8, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3c8;
    }
}
