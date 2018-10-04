package X;

/* renamed from: X.0cV */
public final class AnonymousClass0cV implements AnonymousClass0G2 {
    /* renamed from: B */
    public AnonymousClass0HV f7164B;
    /* renamed from: C */
    private boolean f7165C;

    public final void onUserSessionWillEnd(boolean z) {
    }

    private AnonymousClass0cV(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0HV D = AnonymousClass0HV.m2008D(anonymousClass0Cm);
        this.f7164B = D;
        int Y = D.m2037Y();
        if (Y >= 10) {
            AnonymousClass0NN.m3291B("session_record", null).m3294B("total_visit", Y).m3294B("explore_visit", this.f7164B.m2038Z()).m3310R();
            this.f7164B.WA(0);
            this.f7164B.XA(0);
        }
    }

    /* renamed from: A */
    public final boolean m5877A() {
        if (!((Boolean) AnonymousClass0CC.YY.m845G()).booleanValue()) {
            return false;
        }
        float parseFloat = Float.parseFloat((String) AnonymousClass0CC.hK.m845G());
        if (this.f7164B.m2037Y() < 5 || ((float) this.f7164B.m2038Z()) / (((float) this.f7164B.m2037Y()) * 1.0f) < parseFloat) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    public static synchronized AnonymousClass0cV m5876B(AnonymousClass0Cm anonymousClass0Cm) {
        AnonymousClass0cV anonymousClass0cV;
        Class cls = AnonymousClass0cV.class;
        synchronized (cls) {
            anonymousClass0cV = (AnonymousClass0cV) anonymousClass0Cm.m1036A(cls);
            if (anonymousClass0cV == null) {
                anonymousClass0cV = new AnonymousClass0cV(anonymousClass0Cm);
                anonymousClass0Cm.m1039D(cls, anonymousClass0cV);
            }
        }
        return anonymousClass0cV;
    }

    /* renamed from: B */
    public final void m5878B() {
        if (!this.f7165C) {
            this.f7165C = true;
            this.f7164B.WA(this.f7164B.m2038Z() + 1);
        }
    }
}
