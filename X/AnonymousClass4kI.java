package X;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;

/* renamed from: X.4kI */
public final class AnonymousClass4kI implements AnonymousClass0Oc {
    public final void OMA(JsonGenerator jsonGenerator, Object obj) {
        AnonymousClass4kJ anonymousClass4kJ = (AnonymousClass4kJ) obj;
        jsonGenerator.writeStartObject();
        if (anonymousClass4kJ.f56740C != null) {
            jsonGenerator.writeFieldName("thread_key");
            AnonymousClass0Ys.C(jsonGenerator, anonymousClass4kJ.f56740C, true);
        }
        if (anonymousClass4kJ.f56739B != null) {
            jsonGenerator.writeStringField("item_id", anonymousClass4kJ.f56739B);
        }
        AnonymousClass0Yl.C(jsonGenerator, anonymousClass4kJ, false);
        jsonGenerator.writeEndObject();
    }

    public final /* bridge */ /* synthetic */ Object parseFromJson(JsonParser jsonParser) {
        return AnonymousClass4kK.parseFromJson(jsonParser);
    }
}
