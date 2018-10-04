package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;

/* renamed from: X.5zU */
public final class AnonymousClass5zU {
    /* renamed from: B */
    public static boolean m28726B(AnonymousClass5zS anonymousClass5zS, String str, JsonParser jsonParser) {
        String str2 = null;
        if (MemoryDumpUploadJob.EXTRA_USER_ID.equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass5zS.f70694C = str2;
            return true;
        } else if (!"state".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass5zS.f70693B = str2;
            return true;
        }
    }

    public static AnonymousClass5zS parseFromJson(JsonParser jsonParser) {
        AnonymousClass5zS anonymousClass5zS = new AnonymousClass5zS();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass5zU.m28726B(anonymousClass5zS, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass5zS;
    }
}
