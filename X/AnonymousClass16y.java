package X;

import com.fasterxml.jackson.core.JsonGenerator;
import com.instagram.strings.StringBridge;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: X.16y */
public final class AnonymousClass16y {
    /* renamed from: B */
    public static String m9452B(AnonymousClass0Qu anonymousClass0Qu, Set set, Map map) {
        Writer stringWriter = new StringWriter();
        JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
        createGenerator.writeStartObject();
        for (AnonymousClass0gL anonymousClass0gL : anonymousClass0Qu.m4075F()) {
            if (!set.contains(anonymousClass0gL.f8144B)) {
                createGenerator.writeStringField(anonymousClass0gL.f8144B, anonymousClass0gL.f8145C);
            }
        }
        for (Entry entry : map.entrySet()) {
            if (!set.contains(entry.getKey())) {
                createGenerator.writeFieldName((String) entry.getKey());
                createGenerator.writeRawValue((String) entry.getValue());
            }
        }
        createGenerator.writeEndObject();
        createGenerator.close();
        return stringWriter.toString();
    }

    /* renamed from: C */
    public static void m9453C(AnonymousClass0Qu anonymousClass0Qu) {
        anonymousClass0Qu.m4077H("ig_sig_key_version", "4");
        anonymousClass0Qu.m4077H("ig_sig", StringBridge.getSignatureString(anonymousClass0Qu.m4073D(true).getBytes()));
    }

    /* renamed from: D */
    public static AnonymousClass0Qu m9454D(String str) {
        AnonymousClass0Qu anonymousClass0Qu = new AnonymousClass0Qu();
        anonymousClass0Qu.m4077H("signed_body", AnonymousClass0IE.m2137E("%s.%s", StringBridge.getSignatureString(str.getBytes()), str));
        anonymousClass0Qu.m4077H("ig_sig_key_version", "4");
        return anonymousClass0Qu;
    }
}
