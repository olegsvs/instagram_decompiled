package X;

/* renamed from: X.5vw */
public final class AnonymousClass5vw extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5w7 f70123B;

    public AnonymousClass5vw(AnonymousClass5w7 anonymousClass5w7) {
        this.f70123B = anonymousClass5w7;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -1833417587);
        this.f70123B.f70141B = AnonymousClass5w6.FAIL;
        AnonymousClass5w7.m28647D(this.f70123B);
        AnonymousClass0cQ.H(this, 294045635, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -232099397);
        AnonymousClass3Ut anonymousClass3Ut = (AnonymousClass3Ut) obj;
        int I2 = AnonymousClass0cQ.I(this, 230525827);
        AnonymousClass0HV.D(this.f70123B.f70149J).SA(anonymousClass3Ut.f41686E);
        Boolean bool = anonymousClass3Ut.f41687F;
        if (bool != null) {
            AnonymousClass0HV.D(this.f70123B.f70149J).p(bool.booleanValue());
        }
        this.f70123B.f70146G = anonymousClass3Ut.f41685D.f41645B.size();
        if (AnonymousClass0yJ.D(this.f70123B.f70149J) && anonymousClass3Ut.F() != null) {
            this.f70123B.f70147H = anonymousClass3Ut.F().size();
        }
        this.f70123B.f70141B = AnonymousClass5w6.SUCCESS;
        AnonymousClass0HV.D(this.f70123B.f70149J).m(anonymousClass3Ut.f41683B);
        AnonymousClass5w7.m28647D(this.f70123B);
        AnonymousClass0cQ.H(this, 2099129156, I2);
        AnonymousClass0cQ.H(this, -1059925380, I);
    }
}
