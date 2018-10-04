package X;

/* renamed from: X.5og */
public final class AnonymousClass5og extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1gJ f69142B;

    public AnonymousClass5og(AnonymousClass1gJ anonymousClass1gJ) {
        this.f69142B = anonymousClass1gJ;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 1552178819);
        super.onFail(anonymousClass0Q6);
        AnonymousClass3Kb.E(this.f69142B.f21339D.getContext(), this.f69142B.f21346K, this.f69142B.f21339D, "profile_fb_entrypoint", AnonymousClass1gJ.B(AnonymousClass3Kb.f40194B).toString(), false, null, null, null);
        AnonymousClass0cQ.H(this, -1811615808, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int I = AnonymousClass0cQ.I(this, 867356819);
        AnonymousClass5ok anonymousClass5ok = (AnonymousClass5ok) obj;
        int I2 = AnonymousClass0cQ.I(this, 695999555);
        if (anonymousClass5ok != null) {
            str = anonymousClass5ok.f69148B;
        } else {
            str = null;
        }
        AnonymousClass3Kb.E(this.f69142B.f21339D.getContext(), this.f69142B.f21346K, this.f69142B.f21339D, "profile_fb_entrypoint", AnonymousClass1gJ.B(str).toString(), false, null, null, null);
        AnonymousClass0cQ.H(this, -498175237, I2);
        AnonymousClass0cQ.H(this, -760954398, I);
    }
}
