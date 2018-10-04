package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;

/* renamed from: X.3gI */
public final class AnonymousClass3gI {
    /* renamed from: B */
    public static boolean m20402B(AnonymousClass1Cm anonymousClass1Cm, String str, JsonParser jsonParser) {
        if ("creation_time".equals(str)) {
            anonymousClass1Cm.f15577B = jsonParser.getValueAsLong();
            return true;
        }
        String str2 = null;
        if (MemoryDumpUploadJob.EXTRA_USER_ID.equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1Cm.f15580E = str2;
            return true;
        } else if ("request_verb".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1Cm.f15579D = str2;
            return true;
        } else if (!"radio_type".equals(str)) {
            return false;
        } else {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1Cm.f15578C = str2;
            return true;
        }
    }

    public static AnonymousClass1Cm parseFromJson(JsonParser jsonParser) {
        AnonymousClass1Cm anonymousClass1Cm = new AnonymousClass1Cm();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3gI.m20402B(anonymousClass1Cm, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1Cm;
    }
}
