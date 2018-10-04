package X;

import com.fasterxml.jackson.core.JsonGenerator;
import com.instagram.model.direct.DirectShareTarget;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: X.1Hl */
public final class AnonymousClass1Hl implements AnonymousClass0eo {
    public AnonymousClass1Hl(AnonymousClass1Hk anonymousClass1Hk) {
    }

    public final String NMA(Object obj) {
        AnonymousClass1Hm anonymousClass1Hm = (AnonymousClass1Hm) obj;
        Writer stringWriter = new StringWriter();
        JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
        createGenerator.writeStartObject();
        if (anonymousClass1Hm.f16801B != null) {
            createGenerator.writeFieldName("entries");
            createGenerator.writeStartArray();
            for (DirectShareTarget directShareTarget : anonymousClass1Hm.f16801B) {
                if (directShareTarget != null) {
                    AnonymousClass0YK.m5291C(createGenerator, directShareTarget, true);
                }
            }
            createGenerator.writeEndArray();
        }
        createGenerator.writeEndObject();
        createGenerator.close();
        return stringWriter.toString();
    }

    public final /* bridge */ /* synthetic */ Object parseFromJson(String str) {
        return AnonymousClass1Hn.parseFromJson(str);
    }
}
