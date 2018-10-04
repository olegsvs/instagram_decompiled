package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0Mg */
public final class AnonymousClass0Mg {
    /* renamed from: B */
    public static boolean m3224B(AnonymousClass0Mh anonymousClass0Mh, String str, JsonParser jsonParser) {
        if ("app_version".equals(str)) {
            anonymousClass0Mh.f3457B = jsonParser.getValueAsInt();
            return true;
        } else if ("last_sync_time".equals(str)) {
            anonymousClass0Mh.f3459D = new AtomicLong(jsonParser.getValueAsLong());
            return true;
        } else if (!"configs".equals(str)) {
            return false;
        } else {
            HashMap hashMap;
            if (jsonParser.getCurrentToken() == JsonToken.START_OBJECT) {
                hashMap = new HashMap();
                while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
                    String text = jsonParser.getText();
                    jsonParser.nextToken();
                    if (jsonParser.getCurrentToken() == JsonToken.VALUE_NULL) {
                        hashMap.put(text, null);
                    } else {
                        AnonymousClass0Mj parseFromJson = AnonymousClass0Mi.parseFromJson(jsonParser);
                        if (parseFromJson != null) {
                            hashMap.put(text, parseFromJson);
                        }
                    }
                }
            } else {
                hashMap = null;
            }
            anonymousClass0Mh.f3458C = hashMap;
            return true;
        }
    }

    public static AnonymousClass0Mh parseFromJson(JsonParser jsonParser) {
        AnonymousClass0Mh anonymousClass0Mh = new AnonymousClass0Mh();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass0Mg.m3224B(anonymousClass0Mh, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0Mh;
    }
}
