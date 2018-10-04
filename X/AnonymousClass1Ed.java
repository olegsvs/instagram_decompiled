package X;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.InvalidObjectException;

/* renamed from: X.1Ed */
public final class AnonymousClass1Ed {
    /* renamed from: B */
    public static boolean m10216B(AnonymousClass1Fc anonymousClass1Fc, String str, JsonParser jsonParser) {
        if ("sender_id".equals(str)) {
            anonymousClass1Fc.f16045C = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
            return true;
        } else if (!"activity_status".equals(str)) {
            return false;
        } else {
            anonymousClass1Fc.f16044B = jsonParser.getValueAsInt();
            return true;
        }
    }

    public static AnonymousClass1Fc parseFromJson(JsonParser jsonParser) {
        AnonymousClass1Fc anonymousClass1Fc = new AnonymousClass1Fc();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1Ed.m10216B(anonymousClass1Fc, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        if (anonymousClass1Fc.f16045C != null) {
            return anonymousClass1Fc;
        }
        throw new InvalidObjectException("sender id should never be null");
    }

    public static AnonymousClass1Fc parseFromJson(String str) {
        JsonParser createParser = AnonymousClass0Lm.f3274B.createParser(str);
        createParser.nextToken();
        return AnonymousClass1Ed.parseFromJson(createParser);
    }
}
