package X;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;

/* renamed from: X.0ZB */
public final class AnonymousClass0ZB implements AnonymousClass0Oc {
    public final void OMA(JsonGenerator jsonGenerator, Object obj) {
        AnonymousClass0UT anonymousClass0UT = (AnonymousClass0UT) obj;
        jsonGenerator.writeStartObject();
        if (anonymousClass0UT.f5453E != null) {
            jsonGenerator.writeFieldName("thead_key");
            AnonymousClass0Ys.m5324C(jsonGenerator, anonymousClass0UT.f5453E, true);
        }
        if (anonymousClass0UT.f5451C != null) {
            jsonGenerator.writeStringField("message_id", anonymousClass0UT.f5451C);
        }
        jsonGenerator.writeNumberField("selected_option_index", anonymousClass0UT.f5452D);
        if (anonymousClass0UT.f5450B != null) {
            jsonGenerator.writeStringField("client_context", anonymousClass0UT.f5450B);
        }
        AnonymousClass0Yl.m5313C(jsonGenerator, anonymousClass0UT, false);
        jsonGenerator.writeEndObject();
    }

    public final /* bridge */ /* synthetic */ Object parseFromJson(JsonParser jsonParser) {
        return AnonymousClass0ZC.parseFromJson(jsonParser);
    }
}
