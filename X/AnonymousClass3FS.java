package X;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.3FS */
public final class AnonymousClass3FS {
    /* renamed from: B */
    public static boolean m19124B(AnonymousClass3FP anonymousClass3FP, String str, JsonParser jsonParser) {
        if ("count".equals(str)) {
            anonymousClass3FP.f39470B = jsonParser.getValueAsInt();
            return true;
        } else if (!"duration_ms".equals(str)) {
            return false;
        } else {
            anonymousClass3FP.f39471C = jsonParser.getValueAsLong();
            return true;
        }
    }

    /* renamed from: C */
    public static void m19125C(JsonGenerator jsonGenerator, AnonymousClass3FP anonymousClass3FP, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        jsonGenerator.writeNumberField("count", anonymousClass3FP.f39470B);
        jsonGenerator.writeNumberField("duration_ms", anonymousClass3FP.f39471C);
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }

    public static AnonymousClass3FP parseFromJson(JsonParser jsonParser) {
        AnonymousClass3FP anonymousClass3FP = new AnonymousClass3FP();
        if (jsonParser.getCurrentToken() != JsonToken.START_OBJECT) {
            jsonParser.skipChildren();
            return null;
        }
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            AnonymousClass3FS.m19124B(anonymousClass3FP, currentName, jsonParser);
            jsonParser.skipChildren();
        }
        return anonymousClass3FP;
    }
}
