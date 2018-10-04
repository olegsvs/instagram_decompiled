package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;

/* renamed from: X.1bI */
public final class AnonymousClass1bI {
    /* renamed from: B */
    public static boolean m11970B(AnonymousClass4gf anonymousClass4gf, String str, JsonParser jsonParser) {
        if (MemoryDumpUploadJob.EXTRA_USER_ID.equals(str)) {
            anonymousClass4gf.f56279C = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
            return true;
        } else if (!"action_log".equals(str)) {
            return false;
        } else {
            anonymousClass4gf.f56278B = AnonymousClass1dI.parseFromJson(jsonParser);
            return true;
        }
    }

    public static AnonymousClass4gf parseFromJson(JsonParser jsonParser) {
        AnonymousClass4gf anonymousClass4gf = new AnonymousClass4gf();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1bI.m11970B(anonymousClass4gf, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass4gf;
    }
}
