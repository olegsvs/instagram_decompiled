package X;

/* renamed from: X.4zj */
public final class AnonymousClass4zj extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4zn f59149B;

    public AnonymousClass4zj(AnonymousClass4zn anonymousClass4zn) {
        this.f59149B = anonymousClass4zn;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -1599528591);
        AnonymousClass4zn.m25548G(this.f59149B);
        AnonymousClass0cQ.H(this, 640144066, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, -1934149567);
        super.onFinish();
        if (this.f59149B.f59160E) {
            AnonymousClass4zn.m25544C(this.f59149B);
        }
        AnonymousClass0cQ.H(this, -538107474, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, -1421003028);
        super.onStart();
        if (this.f59149B.f59160E) {
            this.f59149B.f59162G.show();
        }
        AnonymousClass0cQ.H(this, -2061421166, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        boolean z;
        AnonymousClass2DX F;
        AnonymousClass0NN H;
        int I = AnonymousClass0cQ.I(this, 2078298436);
        AnonymousClass2DY anonymousClass2DY = (AnonymousClass2DY) obj;
        int I2 = AnonymousClass0cQ.I(this, 602496098);
        if (anonymousClass2DY.F() == null) {
            AnonymousClass4zn.m25548G(this.f59149B);
        } else if (((Boolean) AnonymousClass0CC.f1442E.G()).booleanValue() && this.f59149B.f59165J != null && AnonymousClass0Nm.P(this.f59149B.f59165J)) {
            this.f59149B.f59165J.setText(anonymousClass2DY.F().f27602B);
            z = true;
            F = anonymousClass2DY.F();
            H = AnonymousClass0Fr.PrefillLookupIdentifier.C(AnonymousClass2Na.USER_LOOKUP).H("prefilled", z);
            if (z) {
                H.F("prefill_source", F.f27603C);
            }
            H.R();
            AnonymousClass0cQ.H(this, 997705750, I2);
            AnonymousClass0cQ.H(this, -562957419, I);
        }
        z = false;
        F = anonymousClass2DY.F();
        H = AnonymousClass0Fr.PrefillLookupIdentifier.C(AnonymousClass2Na.USER_LOOKUP).H("prefilled", z);
        if (z) {
            H.F("prefill_source", F.f27603C);
        }
        H.R();
        AnonymousClass0cQ.H(this, 997705750, I2);
        AnonymousClass0cQ.H(this, -562957419, I);
    }
}
