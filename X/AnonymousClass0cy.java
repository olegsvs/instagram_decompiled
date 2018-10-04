package X;

import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: X.0cy */
public final class AnonymousClass0cy {
    /* renamed from: B */
    public static AnonymousClass0cz m5934B(AnonymousClass0Cm anonymousClass0Cm) {
        String string = AnonymousClass0HV.m2008D(anonymousClass0Cm).f2646B.getString("captured_media_recovery_info", JsonProperty.USE_DEFAULT_NAME);
        anonymousClass0Cm = null;
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            anonymousClass0Cm = AnonymousClass1Tp.parseFromJson(string);
            return anonymousClass0Cm;
        } catch (Throwable e) {
            AnonymousClass0Gn.m1884K("CapturedMediaRecoveryUtil", "Failed to retrieve captured media recovery info", e, 1);
            return anonymousClass0Cm;
        }
    }

    /* renamed from: C */
    public static void m5935C(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass3nl anonymousClass3nl, AnonymousClass4UE anonymousClass4UE) {
        if (anonymousClass4UE.f54566H != null && anonymousClass4UE.f54569K == null) {
            if (!anonymousClass3nl.f44607O) {
                AnonymousClass0cz B = AnonymousClass0cy.m5934B(anonymousClass0Cm);
                if (B == null || B.f7297F == null || !B.f7297F.equals(anonymousClass3nl)) {
                    B = new AnonymousClass0cz(anonymousClass3nl);
                    B.m5938A(anonymousClass4UE.f54566H);
                    AnonymousClass0cy.m5937E(anonymousClass0Cm, B);
                }
            }
        }
    }

    /* renamed from: D */
    public static void m5936D(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass3nn anonymousClass3nn, AnonymousClass4UE anonymousClass4UE) {
        if (anonymousClass4UE.f54566H != null && anonymousClass4UE.f54569K == null) {
            if (!anonymousClass3nn.f44631R) {
                AnonymousClass0cz B = AnonymousClass0cy.m5934B(anonymousClass0Cm);
                if (B == null || B.f7299H == null || !B.f7299H.equals(anonymousClass3nn)) {
                    B = new AnonymousClass0cz(anonymousClass3nn);
                    B.m5938A(anonymousClass4UE.f54566H);
                    AnonymousClass0cy.m5937E(anonymousClass0Cm, B);
                }
            }
        }
    }

    /* renamed from: E */
    public static void m5937E(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0cz anonymousClass0cz) {
        try {
            AnonymousClass0HV D = AnonymousClass0HV.m2008D(anonymousClass0Cm);
            Writer stringWriter = new StringWriter();
            JsonGenerator createGenerator = AnonymousClass0Lm.f3274B.createGenerator(stringWriter);
            createGenerator.writeStartObject();
            if (anonymousClass0cz.f7296E != null) {
                createGenerator.writeStringField("media_type", anonymousClass0cz.f7296E.A());
            }
            if (anonymousClass0cz.f7295D != null) {
                createGenerator.writeStringField("media_json", anonymousClass0cz.f7295D);
            }
            if (anonymousClass0cz.f7294C != null) {
                createGenerator.writeStringField("logging_json", anonymousClass0cz.f7294C);
            }
            createGenerator.writeNumberField("recovery_count", anonymousClass0cz.f7298G);
            createGenerator.writeNumberField("date_taken", anonymousClass0cz.f7293B);
            createGenerator.writeEndObject();
            createGenerator.close();
            D.m2056r(stringWriter.toString());
            AnonymousClass0HV.m2008D(anonymousClass0Cm).f2646B.edit().putBoolean("has_ever_captured_media_for_recovery", true).apply();
        } catch (Throwable e) {
            AnonymousClass0Gn.m1884K("CapturedMediaRecoveryUtil", "Failed to save recovery info", e, 1);
        }
    }
}
