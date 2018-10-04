package X;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;

/* renamed from: X.0Yq */
public final class AnonymousClass0Yq implements AnonymousClass0Oc {
    public final void OMA(JsonGenerator jsonGenerator, Object obj) {
        AnonymousClass0UL anonymousClass0UL = (AnonymousClass0UL) obj;
        jsonGenerator.writeStartObject();
        if (anonymousClass0UL.f5427E != null) {
            jsonGenerator.writeFieldName("thread_key");
            AnonymousClass0Ys.m5324C(jsonGenerator, anonymousClass0UL.f5427E, true);
        }
        if (anonymousClass0UL.f5424B != null) {
            jsonGenerator.writeStringField("client_context", anonymousClass0UL.f5424B);
        }
        if (anonymousClass0UL.f5426D != null) {
            jsonGenerator.writeStringField("message_id", anonymousClass0UL.f5426D);
        }
        if (anonymousClass0UL.f5425C != null) {
            jsonGenerator.writeFieldName("reaction_mutation");
            AnonymousClass0Yt.m5326C(jsonGenerator, anonymousClass0UL.f5425C, true);
        }
        AnonymousClass0Yl.m5313C(jsonGenerator, anonymousClass0UL, false);
        jsonGenerator.writeEndObject();
    }

    public final /* bridge */ /* synthetic */ Object parseFromJson(JsonParser jsonParser) {
        return AnonymousClass0Yu.parseFromJson(jsonParser);
    }
}
