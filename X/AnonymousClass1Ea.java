package X;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.1Ea */
public final class AnonymousClass1Ea {
    /* renamed from: B */
    public static boolean m10211B(AnonymousClass0XJ anonymousClass0XJ, String str, JsonParser jsonParser) {
        if ("timestamp_seconds".equals(str)) {
            anonymousClass0XJ.f6135C = jsonParser.getValueAsInt();
            return true;
        } else if (!"thread_v2_id".equals(str)) {
            return false;
        } else {
            anonymousClass0XJ.f6134B = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : jsonParser.getText();
            return true;
        }
    }

    /* renamed from: C */
    public static void m10212C(JsonGenerator jsonGenerator, AnonymousClass0XJ anonymousClass0XJ, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        jsonGenerator.writeNumberField("timestamp_seconds", anonymousClass0XJ.f6135C);
        if (anonymousClass0XJ.f6134B != null) {
            jsonGenerator.writeStringField("thread_v2_id", anonymousClass0XJ.f6134B);
        }
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }

    public static AnonymousClass0XJ parseFromJson(JsonParser jsonParser) {
        AnonymousClass0XJ anonymousClass0XJ = new AnonymousClass0XJ();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass1Ea.m10211B(anonymousClass0XJ, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass0XJ;
    }
}
