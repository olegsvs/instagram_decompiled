package X;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: X.0f1 */
public final class AnonymousClass0f1 implements AnonymousClass0eo {
    public final String NMA(Object obj) {
        AnonymousClass1CV anonymousClass1CV = (AnonymousClass1CV) obj;
        Writer stringWriter = new StringWriter();
        JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
        createGenerator.writeStartObject();
        if (anonymousClass1CV.f15525B != null) {
            createGenerator.writeFieldName("pending_comments");
            createGenerator.writeStartArray();
            for (AnonymousClass3gE anonymousClass3gE : anonymousClass1CV.f15525B) {
                if (anonymousClass3gE != null) {
                    createGenerator.writeStartObject();
                    createGenerator.writeNumberField("creation_time", anonymousClass3gE.f43258D);
                    if (anonymousClass3gE.f43256B != null) {
                        createGenerator.writeFieldName("comment");
                        AnonymousClass122.m8844C(createGenerator, anonymousClass3gE.f43256B, true);
                    }
                    if (anonymousClass3gE.f43257C != null) {
                        createGenerator.writeStringField("container_module", anonymousClass3gE.f43257C);
                    }
                    if (anonymousClass3gE.f43259E != null) {
                        createGenerator.writeStringField("radio_type", anonymousClass3gE.f43259E);
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
        return AnonymousClass1CU.parseFromJson(str);
    }
}
