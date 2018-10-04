package X;

import com.instagram.realtimeclient.RealtimeEventHandlerProvider;

/* renamed from: X.0Tj */
public final class AnonymousClass0Tj implements AnonymousClass0G2 {
    /* renamed from: C */
    public static final RealtimeEventHandlerProvider f5227C = new AnonymousClass0Vc();
    /* renamed from: B */
    public final AnonymousClass0Ue f5228B;

    private AnonymousClass0Tj(AnonymousClass0Cm anonymousClass0Cm) {
        this.f5228B = new AnonymousClass0Ue(anonymousClass0Cm);
    }

    /* renamed from: A */
    public final AnonymousClass1Hi m4537A(String str) {
        AnonymousClass0Ue anonymousClass0Ue = this.f5228B;
        AnonymousClass0Sy.m4434C();
        return (AnonymousClass1Hi) anonymousClass0Ue.f5509E.get(str);
    }

    /* renamed from: B */
    public static synchronized AnonymousClass0Tj m4536B(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0Tj anonymousClass0Tj;
        Class cls = AnonymousClass0Tj.class;
        synchronized (cls) {
            anonymousClass0Tj = (AnonymousClass0Tj) anonymousClass0Cm.m1036A(cls);
            if (anonymousClass0Tj == null) {
                anonymousClass0Tj = new AnonymousClass0Tj(anonymousClass0Cm);
                anonymousClass0Cm.m1039D(cls, anonymousClass0Tj);
            }
        }
        return anonymousClass0Tj;
    }

    public final void onUserSessionWillEnd(boolean z) {
        AnonymousClass0Sy.m4437F(new AnonymousClass0Vd(this));
    }
}
