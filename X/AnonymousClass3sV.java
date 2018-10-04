package X;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: X.3sV */
public final class AnonymousClass3sV implements AnonymousClass2t8 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2lS f45809B;
    /* renamed from: C */
    private final AnonymousClass3sO f45810C;
    /* renamed from: D */
    private final AnonymousClass3ue f45811D;
    /* renamed from: E */
    private final AnonymousClass43D f45812E;
    /* renamed from: F */
    private final AnonymousClass1e7 f45813F;
    /* renamed from: G */
    private final AnonymousClass3ti f45814G;

    public AnonymousClass3sV(AnonymousClass2lS anonymousClass2lS, AnonymousClass3ue anonymousClass3ue, AnonymousClass3sO anonymousClass3sO, AnonymousClass1e7 anonymousClass1e7, AnonymousClass3ti anonymousClass3ti, AnonymousClass43D anonymousClass43D) {
        this.f45809B = anonymousClass2lS;
        this.f45811D = anonymousClass3ue;
        this.f45810C = anonymousClass3sO;
        this.f45813F = anonymousClass1e7;
        this.f45814G = anonymousClass3ti;
        this.f45812E = anonymousClass43D;
    }

    public final AnonymousClass2t7 dF() {
        AnonymousClass3uC anonymousClass3uC;
        boolean z = this.f45811D instanceof AnonymousClass45E;
        AnonymousClass3sU anonymousClass3sU = this.f45809B.f33591F;
        synchronized (anonymousClass3sU) {
            anonymousClass3uC = anonymousClass3sU.f45784E;
        }
        String str = r0.f45809B.f33604S;
        long j = r0.f45809B.f33602Q;
        AnonymousClass3tL anonymousClass3tL = r0.f45809B.f33606U;
        String str2 = JsonProperty.USE_DEFAULT_NAME;
        boolean z2 = r0.f45809B.f33598M;
        String str3 = r0.f45809B.f33591F.f45783D.f49009Q;
        String C = AnonymousClass2kt.f33313B.mo3951C();
        AnonymousClass3ue anonymousClass3ue = r0.f45811D;
        String str4 = JsonProperty.USE_DEFAULT_NAME;
        AnonymousClass1e7 anonymousClass1e7 = r0.f45813F;
        boolean z3 = anonymousClass3uC != null && anonymousClass3uC.f46372I;
        AnonymousClass3sO anonymousClass43F = new AnonymousClass43F(str, j, anonymousClass3tL, false, str2, z2, str3, C, anonymousClass3ue, str4, anonymousClass1e7, false, false, z3, r0.f45814G);
        anonymousClass43F.f49014V = r0.f45809B.f33597L.CC;
        if (r0.f45810C != null || z || (r0.f45812E instanceof AnonymousClass43D)) {
            AnonymousClass43E anonymousClass43E = new AnonymousClass43E();
            anonymousClass43E.m22328A(anonymousClass43F);
            AnonymousClass3sO anonymousClass3sO = r0.f45810C;
            if (anonymousClass3sO != null) {
                anonymousClass43E.m22328A(anonymousClass3sO);
            }
            if (z) {
                anonymousClass43E.m22328A(((AnonymousClass45E) r0.f45811D).f49739C);
            }
            AnonymousClass43D anonymousClass43D = r0.f45812E;
            if (anonymousClass43D instanceof AnonymousClass43D) {
                anonymousClass43E.m22328A(anonymousClass43D);
            }
            anonymousClass43F = anonymousClass43E;
        }
        String str5 = r0.f45809B.f33604S;
        String str6 = r0.f45809B.f33597L.aC;
        AnonymousClass2kb anonymousClass2kb = r0.f45809B.f33590E;
        AnonymousClass2kt anonymousClass2kt = AnonymousClass2kt.f33313B;
        AnonymousClass1e7 anonymousClass1e72 = r0.f45813F;
        if (anonymousClass1e72 == null) {
            anonymousClass1e72 = AnonymousClass1e7.f20937L;
        }
        return new AnonymousClass3sF(str5, str6, anonymousClass2kb, anonymousClass43F, anonymousClass2kt, anonymousClass1e72.f20939C);
    }
}
