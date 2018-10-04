package X;

/* renamed from: X.51f */
public final class AnonymousClass51f extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass51g f59343B;

    public AnonymousClass51f(AnonymousClass51g anonymousClass51g) {
        this.f59343B = anonymousClass51g;
    }

    /* renamed from: A */
    public final void m25599A(AnonymousClass2Dr anonymousClass2Dr) {
        int I = AnonymousClass0cQ.I(this, -266068842);
        if (this.f59343B.isResumed()) {
            boolean z = this.f59343B.getArguments().getBoolean("is_phone_confirmed") && this.f59343B.f59346D.equals(this.f59343B.getArguments().getString("phone_number"));
            AnonymousClass0IL C = AnonymousClass0GQ.f2360B.A().m27574C(this.f59343B.getArguments(), z, this.f59343B.f59346D, this.f59343B.getArguments().getBoolean("is_totp_two_factor_enabled"), this.f59343B.f59347E);
            AnonymousClass0IZ anonymousClass0IZ = new AnonymousClass0IZ(this.f59343B.getActivity());
            anonymousClass0IZ.f2754D = C;
            anonymousClass0IZ.B();
            AnonymousClass0cQ.H(this, -598181943, I);
            return;
        }
        AnonymousClass0cQ.H(this, -1957779423, I);
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -20273360);
        if (this.f59343B.isResumed()) {
            AnonymousClass3nj.F(this.f59343B.getContext(), this.f59343B.f59349G.f1759C, anonymousClass0Q6);
            AnonymousClass0cQ.H(this, -1579996056, I);
            return;
        }
        AnonymousClass0cQ.H(this, 1889011500, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, 188354878);
        this.f59343B.f59345C.setEnabled(true);
        this.f59343B.f59345C.setShowProgressBar(false);
        AnonymousClass0cQ.H(this, 1343180799, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, -867957911);
        this.f59343B.f59345C.setEnabled(false);
        this.f59343B.f59345C.setShowProgressBar(true);
        AnonymousClass0cQ.H(this, -635706410, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -2136692393);
        m25599A((AnonymousClass2Dr) obj);
        AnonymousClass0cQ.H(this, 101884669, I);
    }
}
