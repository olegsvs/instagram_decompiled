package X;

/* renamed from: X.0JT */
public final class AnonymousClass0JT extends AnonymousClass0JU {
    /* renamed from: A */
    public final void mo593A() {
        AnonymousClass3dh anonymousClass3dh = AnonymousClass3dg.f42916B;
        synchronized (anonymousClass3dh) {
            anonymousClass3dh.f42917B = null;
        }
        AnonymousClass3dj anonymousClass3dj = AnonymousClass3di.f42918B;
        synchronized (anonymousClass3dj) {
            anonymousClass3dj.f42919B = null;
        }
    }

    /* renamed from: B */
    public final void mo594B() {
        AnonymousClass3dh anonymousClass3dh = AnonymousClass3dg.f42916B;
        synchronized (anonymousClass3dh) {
            if (anonymousClass3dh.f42917B != null) {
                anonymousClass3dh.f42917B.clear();
            }
            AnonymousClass0HV.m2007C().m2007C();
        }
        AnonymousClass3dj anonymousClass3dj = AnonymousClass3di.f42918B;
        synchronized (anonymousClass3dj) {
            if (anonymousClass3dj.f42919B != null) {
                anonymousClass3dj.f42919B.clear();
            }
            AnonymousClass0HV.m2007C().m2016D();
        }
    }

    /* renamed from: C */
    public final void mo595C(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0Iw anonymousClass5Eg = new AnonymousClass5Eg();
        AnonymousClass0Pt anonymousClass0Pt = new AnonymousClass0Pt((AnonymousClass0Cn) anonymousClass0Cm);
        anonymousClass0Pt.f4226J = AnonymousClass0Pu.f4247G;
        anonymousClass0Pt.f4229M = "fbsearch/clear_search_history/";
        AnonymousClass0GA H = anonymousClass0Pt.m3944M(AnonymousClass0Pv.class).m3939H();
        H.f2849B = anonymousClass5Eg;
        AnonymousClass0Ix.m2384D(H);
    }

    /* renamed from: D */
    public final void mo596D(AnonymousClass0Cm anonymousClass0Cm) {
        anonymousClass0Cm = AnonymousClass0Rh.m4224B(anonymousClass0Cm);
        anonymousClass0Cm.f4749D.m4229A();
        anonymousClass0Cm.f4750E.m4229A();
        anonymousClass0Cm.f4748C.m4229A();
    }

    /* renamed from: E */
    public final AnonymousClass0Rj mo597E() {
        return new AnonymousClass0Rj();
    }

    /* renamed from: F */
    public final void mo598F(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0Rh B = AnonymousClass0Rh.m4224B(anonymousClass0Cm);
        B.f4749D.m4232D();
        B.f4750E.m4232D();
        if (B.f4747B) {
            B.f4748C.m4232D();
        }
        AnonymousClass0Rk.m4235B(anonymousClass0Cm);
        if (AnonymousClass0Rk.f4758C) {
            long j = AnonymousClass0HV.m2008D(anonymousClass0Cm).f2646B.getLong("recent_items_last_sycned_timestamp_ms", 0);
            long currentTimeMillis = System.currentTimeMillis();
            if (j != 0 && currentTimeMillis - j > 86400000) {
                AnonymousClass0HV.m2008D(anonymousClass0Cm).m2007C();
                AnonymousClass0HV.m2008D(anonymousClass0Cm).m2016D();
                AnonymousClass0HV.m2008D(anonymousClass0Cm).m2018F();
            }
        }
    }
}
