package X;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: X.64o */
public final class AnonymousClass64o {
    /* renamed from: B */
    public static String m28917B(AnonymousClass64m anonymousClass64m) {
        Writer stringWriter = new StringWriter();
        JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
        createGenerator.writeStartObject();
        if (anonymousClass64m.f71542C != null) {
            createGenerator.writeStringField("type", anonymousClass64m.f71542C);
        }
        if (anonymousClass64m.f71541B != null) {
            createGenerator.writeStringField("payload", anonymousClass64m.f71541B);
        }
        createGenerator.writeEndObject();
        createGenerator.close();
        return stringWriter.toString();
    }
}
