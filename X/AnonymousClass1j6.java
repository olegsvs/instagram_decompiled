package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.1j6 */
public final class AnonymousClass1j6 {
    /* renamed from: B */
    public static boolean m12727B(AnonymousClass1HL anonymousClass1HL, String str, JsonParser jsonParser) {
        if ("sequenceNumber".equals(str)) {
            Long.valueOf(jsonParser.getValueAsLong());
            return true;
        }
        String str2 = null;
        if ("serverInfoData".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass1HL.f16747B = str2;
            return true;
        }
        if (!"retryCount".equals(str)) {
            if ("transactionId".equals(str)) {
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    str2 = jsonParser.getText();
                }
                anonymousClass1HL.f16748C = str2;
                return true;
            } else if ("conferenceName".equals(str)) {
                if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                    jsonParser.getText();
                }
                return true;
            } else if (!"type".equals(str)) {
                return false;
            }
        }
        Integer.valueOf(jsonParser.getValueAsInt());
        return true;
    }

    public static AnonymousClass1HL parseFromJson(JsonParser jsonParser) {
        AnonymousClass1HL anonymousClass1HL = new AnonymousClass1HL();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1j6.m12727B(anonymousClass1HL, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass1HL;
    }
}
