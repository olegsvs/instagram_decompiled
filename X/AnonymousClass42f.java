package X;

import android.content.Context;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.42f */
public final class AnonymousClass42f implements AnonymousClass0OP, AnonymousClass3og {
    /* renamed from: B */
    public final boolean f48813B;
    /* renamed from: C */
    public final AnonymousClass3q3 f48814C = new AnonymousClass3q3();
    /* renamed from: D */
    public final AnonymousClass0OA f48815D;
    /* renamed from: E */
    public final CountDownLatch f48816E = new CountDownLatch(1);
    /* renamed from: F */
    public final AnonymousClass3q5 f48817F;
    /* renamed from: G */
    public final AnonymousClass41B f48818G;
    /* renamed from: H */
    public AnonymousClass3p9 f48819H;
    /* renamed from: I */
    private final AnonymousClass41E f48820I;
    /* renamed from: J */
    private final AnonymousClass0Cm f48821J;

    public AnonymousClass42f(AnonymousClass0Cm anonymousClass0Cm, AnonymousClass0OA anonymousClass0OA, boolean z, AnonymousClass3q5 anonymousClass3q5, AnonymousClass41B anonymousClass41B, AnonymousClass41E anonymousClass41E) {
        this.f48821J = anonymousClass0Cm;
        this.f48815D = anonymousClass0OA;
        this.f48817F = anonymousClass3q5;
        this.f48818G = anonymousClass41B;
        this.f48813B = z;
        this.f48820I = anonymousClass41E;
    }

    /* renamed from: B */
    public static AnonymousClass3p9 m22260B(AnonymousClass42f anonymousClass42f, Context context, AnonymousClass3om anonymousClass3om, boolean z, AnonymousClass3pA anonymousClass3pA) {
        AnonymousClass3pA anonymousClass3pA2 = anonymousClass3pA;
        boolean z2 = z;
        AnonymousClass2NJ B = AnonymousClass2NL.m15318B(anonymousClass42f.f48815D, (long) anonymousClass3pA2.f44910L, (long) anonymousClass3pA2.f44902D, z2);
        Context context2 = context;
        AnonymousClass3ot B2 = AnonymousClass3ox.m20794B(context2, anonymousClass42f.f48821J, anonymousClass42f.f48815D, anonymousClass42f.f48818G, z2, B, anonymousClass42f.f48820I);
        AnonymousClass3om anonymousClass3om2 = anonymousClass3om;
        AnonymousClass3or anonymousClass3or = new AnonymousClass3or(anonymousClass3om2);
        boolean z3 = anonymousClass42f.f48815D.hB;
        if (((Boolean) AnonymousClass0CC.Ol.G()).booleanValue()) {
            return new AnonymousClass1XV(context2, anonymousClass3or, B2, z3, z2, B);
        }
        return new AnonymousClass42i(context, new AnonymousClass42S(context), anonymousClass3or, B2, new AnonymousClass3pC(anonymousClass3om2), z3, z, B);
    }

    public final void Dv(double d) {
        this.f48815D.HA(AnonymousClass2F8.RENDERING, d);
    }

    public final void Lh() {
        this.f48815D.HA(AnonymousClass2F8.RENDERING, 1.0d);
    }

    public final void cancel() {
        AnonymousClass3p9 anonymousClass3p9 = this.f48819H;
        if (anonymousClass3p9 != null) {
            anonymousClass3p9.mo5087A();
        }
    }

    public final boolean tW() {
        AnonymousClass3p9 anonymousClass3p9 = this.f48819H;
        return anonymousClass3p9 == null ? false : anonymousClass3p9.mo5089C();
    }

    public final Exception wL() {
        return this.f48814C.f45122B;
    }

    public final int yK() {
        AnonymousClass3p9 anonymousClass3p9 = this.f48819H;
        return anonymousClass3p9 == null ? 0 : anonymousClass3p9.mo5088B();
    }

    public final void yWA() {
        try {
            this.f48816E.await();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
