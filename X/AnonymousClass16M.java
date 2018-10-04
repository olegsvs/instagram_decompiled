package X;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: X.16M */
public final class AnonymousClass16M implements AnonymousClass16K {
    public final String kP() {
        return "AutoCompletePlaceService";
    }

    public final String MMA(Object obj) {
        AnonymousClass1Ak anonymousClass1Ak = (AnonymousClass1Ak) obj;
        Writer stringWriter = new StringWriter();
        JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
        AnonymousClass1Aj.m9756C(createGenerator, anonymousClass1Ak, true);
        createGenerator.close();
        return stringWriter.toString();
    }

    public final Object QG(String str) {
        return AnonymousClass1Aj.parseFromJson(str);
    }

    public final String UN(Object obj) {
        return ((AnonymousClass1Ak) obj).m9759C();
    }
}
