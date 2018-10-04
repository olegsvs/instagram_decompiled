package X;

/* renamed from: X.1jY */
public final class AnonymousClass1jY extends AnonymousClass1bg {
    /* renamed from: B */
    public final boolean f21980B;
    /* renamed from: C */
    public final boolean f21981C;
    /* renamed from: D */
    public final /* synthetic */ AnonymousClass0Ug f21982D;
    /* renamed from: E */
    private AnonymousClass1jW f21983E;

    public AnonymousClass1jY(AnonymousClass0Ug anonymousClass0Ug, boolean z, boolean z2, AnonymousClass18P anonymousClass18P) {
        boolean z3;
        this.f21982D = anonymousClass0Ug;
        super(anonymousClass0Ug, anonymousClass18P);
        this.f21981C = z2;
        if (!z) {
            if (!z2) {
                z3 = false;
                this.f21980B = z3;
            }
        }
        z3 = true;
        this.f21980B = z3;
    }

    /* renamed from: B */
    public final void mo2707B() {
        if (this.f21981C) {
            AnonymousClass0Ug anonymousClass0Ug = this.f21982D;
            AnonymousClass0Ug.m4753E(anonymousClass0Ug, false);
            anonymousClass0Ug.f5518F = -1;
            this.f21983E = this.f21982D.f5530R.m12757B(-1, null, null);
        } else {
            AnonymousClass1jW A = this.f21982D.f5530R.m12756A();
            this.f21983E = A;
            if (A == null && !this.f21980B && this.f21982D.f5532T.m4635g()) {
                String str;
                AnonymousClass0WS B;
                AnonymousClass1jU anonymousClass1jU = this.f21982D.f5530R;
                long j = this.f21982D.f5518F;
                AnonymousClass0Tw anonymousClass0Tw = this.f21982D.f5532T;
                synchronized (anonymousClass0Tw) {
                    str = anonymousClass0Tw.f5283C.f5976D;
                }
                anonymousClass0Tw = this.f21982D.f5532T;
                synchronized (anonymousClass0Tw) {
                    B = anonymousClass0Tw.f5283C.m5138B();
                }
                this.f21983E = anonymousClass1jU.m12757B(j, str, (AnonymousClass0XJ) B.f5985C);
            }
        }
        AnonymousClass1jX anonymousClass1jX = this.f21983E;
        if (anonymousClass1jX != null) {
            anonymousClass1jX.f21976C.add(this);
        } else {
            AnonymousClass0OR.m3624D(this.f21982D.f5524L, new AnonymousClass4ec(this, this.f21982D.f5518F != -1), -67383941);
        }
    }

    /* renamed from: C */
    public final void mo2708C() {
        AnonymousClass1jX anonymousClass1jX = this.f21983E;
        if (anonymousClass1jX != null) {
            anonymousClass1jX.m12779F(this);
            this.f21983E = null;
        }
    }
}
