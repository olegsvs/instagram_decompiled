package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1IE */
public final class AnonymousClass1IE {
    /* renamed from: B */
    public int f16855B = 0;
    /* renamed from: C */
    public final AtomicBoolean f16856C = new AtomicBoolean(false);

    /* renamed from: A */
    public final void m10641A(String str, AnonymousClass0Cm anonymousClass0Cm, String str2) {
        if (this.f16856C.compareAndSet(false, true)) {
            AnonymousClass0Pt anonymousClass0Pt;
            if (anonymousClass0Cm != null) {
                anonymousClass0Pt = new AnonymousClass0Pt((AnonymousClass0Cn) anonymousClass0Cm);
            } else {
                anonymousClass0Pt = new AnonymousClass0Pt(AnonymousClass0G7.m1740G());
            }
            anonymousClass0Pt.f4226J = AnonymousClass0Pu.GET;
            anonymousClass0Pt.f4229M = "zr/token/result/";
            AnonymousClass0GA H = anonymousClass0Pt.m3935D("token_hash", str).m3935D("device_id", AnonymousClass0Dt.m1305B(AnonymousClass0EV.f1977B)).m3935D("custom_device_id", AnonymousClass0Dt.f1941C.m1312A(AnonymousClass0EV.f1977B)).m3935D("fetch_reason", str2).m3944M(AnonymousClass1T6.class).m3939H();
            H.f2849B = new AnonymousClass2Nb(this, str, anonymousClass0Cm, str2);
            AnonymousClass0Ix.m2384D(H);
        }
    }
}
