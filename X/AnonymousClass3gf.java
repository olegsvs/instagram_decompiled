package X;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: X.3gf */
public final class AnonymousClass3gf {
    /* renamed from: B */
    public String f43304B;
    /* renamed from: C */
    public String f43305C;
    /* renamed from: D */
    public String f43306D = UUID.randomUUID().toString();
    /* renamed from: E */
    public HashMap f43307E = new HashMap();
    /* renamed from: F */
    public HashMap f43308F = new HashMap();
    /* renamed from: G */
    public HashMap f43309G = new HashMap();
    /* renamed from: H */
    public HashMap f43310H = new HashMap();
    /* renamed from: I */
    public HashMap f43311I = new HashMap();
    /* renamed from: J */
    public HashMap f43312J = new HashMap();

    /* renamed from: A */
    public final boolean m20427A() {
        return this.f43308F.isEmpty() && this.f43307E.isEmpty() && this.f43309G.isEmpty();
    }

    /* renamed from: B */
    public static void m20422B(String str, AnonymousClass0P7 anonymousClass0P7, HashMap hashMap) {
        AnonymousClass3gc anonymousClass3gc = new AnonymousClass3gc(str, anonymousClass0P7.getId(), anonymousClass0P7.MA().getId(), anonymousClass0P7.FA().longValue(), System.currentTimeMillis() / 1000);
        if (anonymousClass3gc.f43291C == null) {
            int indexOf = anonymousClass3gc.f43290B.indexOf(95);
            String substring = indexOf != -1 ? anonymousClass3gc.f43290B.substring(0, indexOf) : anonymousClass3gc.f43290B;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(substring);
            stringBuilder.append("_");
            stringBuilder.append(anonymousClass3gc.f43296H);
            stringBuilder.append("_");
            stringBuilder.append(anonymousClass3gc.f43293E);
            anonymousClass3gc.f43291C = stringBuilder.toString();
        }
        String str2 = anonymousClass3gc.f43291C;
        AnonymousClass3gd anonymousClass3gd = (AnonymousClass3gd) hashMap.get(str2);
        if (anonymousClass3gd == null) {
            anonymousClass3gd = new AnonymousClass3gd();
            hashMap.put(str2, anonymousClass3gd);
        }
        anonymousClass3gd.f43297B.add(anonymousClass3gc);
    }

    /* renamed from: C */
    public static void m20423C(AnonymousClass0Pm anonymousClass0Pm, HashMap hashMap) {
        AnonymousClass3ge anonymousClass3ge = new AnonymousClass3ge(anonymousClass0Pm.f4148B, anonymousClass0Pm.f4174b.getId(), anonymousClass0Pm.f4166T, System.currentTimeMillis() / 1000);
        if (anonymousClass3ge.f43298B == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(anonymousClass3ge.f43301E);
            stringBuilder.append("_");
            stringBuilder.append(anonymousClass3ge.f43303G);
            anonymousClass3ge.f43298B = stringBuilder.toString();
        }
        hashMap.put(anonymousClass3ge.f43298B, anonymousClass3ge);
    }

    /* renamed from: D */
    public static String m20424D(HashMap hashMap) {
        try {
            Writer stringWriter = new StringWriter();
            JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
            createGenerator.writeStartObject();
            for (String str : hashMap.keySet()) {
                createGenerator.writeFieldName(str);
                AnonymousClass3gd anonymousClass3gd = (AnonymousClass3gd) hashMap.get(str);
                createGenerator.writeStartArray();
                for (int i = 0; i < anonymousClass3gd.f43297B.size(); i++) {
                    AnonymousClass3gc anonymousClass3gc = (AnonymousClass3gc) anonymousClass3gd.f43297B.get(i);
                    if (anonymousClass3gc.f43292D == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(anonymousClass3gc.f43295G);
                        stringBuilder.append("_");
                        stringBuilder.append(anonymousClass3gc.f43294F);
                        anonymousClass3gc.f43292D = stringBuilder.toString();
                    }
                    createGenerator.writeString(anonymousClass3gc.f43292D);
                }
                createGenerator.writeEndArray();
            }
            createGenerator.writeEndObject();
            createGenerator.close();
            return stringWriter.toString();
        } catch (Throwable e) {
            AnonymousClass0Dc.I("PendingReelSeenState", e, "Failed to serialize seen state to json", new Object[0]);
            return null;
        }
    }

    /* renamed from: E */
    public static String m20425E(HashMap hashMap) {
        try {
            Writer stringWriter = new StringWriter();
            JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
            createGenerator.writeStartObject();
            for (String str : hashMap.keySet()) {
                createGenerator.writeStringField(str, (String) hashMap.get(str));
            }
            createGenerator.writeEndObject();
            createGenerator.close();
            return stringWriter.toString();
        } catch (Throwable e) {
            AnonymousClass0Dc.I("PendingReelSeenState", e, "Failed to serialize nuxes seen state to json", new Object[0]);
            return null;
        }
    }

    /* renamed from: F */
    public static String m20426F(HashMap hashMap) {
        try {
            Writer stringWriter = new StringWriter();
            JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
            createGenerator.writeStartObject();
            for (String str : hashMap.keySet()) {
                createGenerator.writeFieldName(str);
                AnonymousClass3ge anonymousClass3ge = (AnonymousClass3ge) hashMap.get(str);
                if (anonymousClass3ge.f43299C == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(anonymousClass3ge.f43300D);
                    stringBuilder.append("_");
                    stringBuilder.append(anonymousClass3ge.f43302F);
                    anonymousClass3ge.f43299C = stringBuilder.toString();
                }
                createGenerator.writeString(anonymousClass3ge.f43299C);
            }
            createGenerator.writeEndObject();
            createGenerator.close();
            return stringWriter.toString();
        } catch (Throwable e) {
            AnonymousClass0Dc.I("PendingReelSeenState", e, "Failed to serialize replay seen state to json", new Object[0]);
            return null;
        }
    }
}
