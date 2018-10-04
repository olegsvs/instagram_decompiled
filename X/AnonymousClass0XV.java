package X;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0XV */
public final class AnonymousClass0XV {
    /* renamed from: B */
    public static boolean m5237B(AnonymousClass0Tz anonymousClass0Tz, String str, JsonParser jsonParser) {
        String str2 = null;
        if ("thread_keys".equals(str)) {
            List arrayList;
            if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
                arrayList = new ArrayList();
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    DirectThreadKey parseFromJson = AnonymousClass0Ys.parseFromJson(jsonParser);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    }
                }
            }
            anonymousClass0Tz.f5321D = arrayList;
            return true;
        } else if ("client_context".equals(str)) {
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                str2 = jsonParser.getText();
            }
            anonymousClass0Tz.f5319B = str2;
            return true;
        } else if ("pending_timestamp_us".equals(str)) {
            anonymousClass0Tz.f5320C = Long.valueOf(jsonParser.getValueAsLong());
            return true;
        } else if (!"timestamp_us".equals(str)) {
            return AnonymousClass0Yl.m5312B(anonymousClass0Tz, str, jsonParser);
        } else {
            anonymousClass0Tz.f5322E = jsonParser.getValueAsLong();
            return true;
        }
    }

    /* renamed from: C */
    public static void m5238C(JsonGenerator jsonGenerator, AnonymousClass0Tz anonymousClass0Tz, boolean z) {
        if (z) {
            jsonGenerator.writeStartObject();
        }
        if (anonymousClass0Tz.f5321D != null) {
            jsonGenerator.writeFieldName("thread_keys");
            jsonGenerator.writeStartArray();
            for (DirectThreadKey directThreadKey : anonymousClass0Tz.f5321D) {
                if (directThreadKey != null) {
                    AnonymousClass0Ys.m5324C(jsonGenerator, directThreadKey, true);
                }
            }
            jsonGenerator.writeEndArray();
        }
        if (anonymousClass0Tz.f5319B != null) {
            jsonGenerator.writeStringField("client_context", anonymousClass0Tz.f5319B);
        }
        if (anonymousClass0Tz.f5320C != null) {
            jsonGenerator.writeNumberField("pending_timestamp_us", anonymousClass0Tz.f5320C.longValue());
        }
        jsonGenerator.writeNumberField("timestamp_us", anonymousClass0Tz.f5322E);
        AnonymousClass0Yl.m5313C(jsonGenerator, anonymousClass0Tz, false);
        if (z) {
            jsonGenerator.writeEndObject();
        }
    }
}
