package X;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: X.0f3 */
public final class AnonymousClass0f3 implements AnonymousClass0eo {
    public final String NMA(Object obj) {
        AnonymousClass1CX anonymousClass1CX = (AnonymousClass1CX) obj;
        Writer stringWriter = new StringWriter();
        JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
        createGenerator.writeStartObject();
        if (anonymousClass1CX.f15526B != null) {
            createGenerator.writeFieldName("pending_reel_poll_votes");
            createGenerator.writeStartArray();
            for (AnonymousClass3gU anonymousClass3gU : anonymousClass1CX.f15526B) {
                if (anonymousClass3gU != null) {
                    createGenerator.writeStartObject();
                    createGenerator.writeNumberField("creation_time", anonymousClass3gU.f43276B);
                    if (anonymousClass3gU.f43277C != null) {
                        createGenerator.writeStringField("media_id", anonymousClass3gU.f43277C);
                    }
                    if (anonymousClass3gU.f43278D != null) {
                        createGenerator.writeStringField("poll_id", anonymousClass3gU.f43278D);
                    }
                    createGenerator.writeNumberField("viewer_vote", anonymousClass3gU.f43280F);
                    if (anonymousClass3gU.f43279E != null) {
                        createGenerator.writeStringField("radio_type", anonymousClass3gU.f43279E);
                    }
                    createGenerator.writeEndObject();
                }
            }
            createGenerator.writeEndArray();
        }
        createGenerator.writeEndObject();
        createGenerator.close();
        return stringWriter.toString();
    }

    public final /* bridge */ /* synthetic */ Object parseFromJson(String str) {
        return AnonymousClass1CW.parseFromJson(str);
    }
}
