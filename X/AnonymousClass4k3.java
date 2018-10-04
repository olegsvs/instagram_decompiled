package X;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;

/* renamed from: X.4k3 */
public final class AnonymousClass4k3 implements AnonymousClass0Oc {
    public final void OMA(JsonGenerator jsonGenerator, Object obj) {
        AnonymousClass4k4 anonymousClass4k4 = (AnonymousClass4k4) obj;
        jsonGenerator.writeStartObject();
        if (anonymousClass4k4.f56717B != null) {
            jsonGenerator.writeFieldName("animated_media");
            AnonymousClass4dk.m24625C(jsonGenerator, anonymousClass4k4.f56717B, true);
        }
        AnonymousClass0XV.C(jsonGenerator, anonymousClass4k4, false);
        jsonGenerator.writeEndObject();
    }

    public final /* bridge */ /* synthetic */ Object parseFromJson(JsonParser jsonParser) {
        return AnonymousClass4k5.parseFromJson(jsonParser);
    }
}
