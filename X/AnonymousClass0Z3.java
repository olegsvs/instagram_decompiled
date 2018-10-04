package X;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* renamed from: X.0Z3 */
public final class AnonymousClass0Z3 {
    /* renamed from: B */
    public static boolean m5331B(AnonymousClass0WG anonymousClass0WG, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("client_context".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0WG.f5946B = str2;
            return true;
        }
        if (!"thread_id".equals(str)) {
            if (!"story_id".equals(str)) {
                if ("item_id".equals(str)) {
                    if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                        str2 = jsonParser.getText();
                    }
                    anonymousClass0WG.f5948D = str2;
                    return true;
                }
                if (!"date_created_ms".equals(str)) {
                    if (!"task_creation_time_ms".equals(str)) {
                        return false;
                    }
                }
                anonymousClass0WG.f5947C = jsonParser.getValueAsLong();
                return true;
            }
        }
        if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
            str2 = jsonParser.getText();
        }
        anonymousClass0WG.f5949E = str2;
        return true;
    }

    /* renamed from: C */
    public static void m5332C(JsonGenerator jsonGenerator, AnonymousClass0WG anonymousClass0WG, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        if (anonymousClass0WG.f5946B != null) {
            jsonGenerator.writeStringField("client_context", anonymousClass0WG.f5946B);
        }
        if (anonymousClass0WG.f5949E != null) {
            jsonGenerator.writeStringField("thread_id", anonymousClass0WG.f5949E);
        }
        if (anonymousClass0WG.f5948D != null) {
            jsonGenerator.writeStringField("item_id", anonymousClass0WG.f5948D);
        }
        jsonGenerator.writeNumberField("date_created_ms", anonymousClass0WG.f5947C);
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }
}
