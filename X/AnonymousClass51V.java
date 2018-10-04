package X;

/* renamed from: X.51V */
public final class AnonymousClass51V extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass51g f59333B;

    public AnonymousClass51V(AnonymousClass51g anonymousClass51g) {
        this.f59333B = anonymousClass51g;
    }

    /* renamed from: A */
    public final void m25598A(AnonymousClass50p anonymousClass50p) {
        int I = AnonymousClass0cQ.I(this, -2005996766);
        if (this.f59333B.isResumed()) {
            boolean z;
            AnonymousClass0IL C;
            AnonymousClass0IZ anonymousClass0IZ;
            if (this.f59333B.getArguments().getBoolean("is_phone_confirmed")) {
                if (this.f59333B.f59346D.equals(this.f59333B.getArguments().getString("phone_number"))) {
                    z = false;
                    C = AnonymousClass0GQ.f2360B.A().m27574C(this.f59333B.getArguments(), z, this.f59333B.f59346D, this.f59333B.getArguments().getBoolean("is_two_factor_enabled"), this.f59333B.f59347E);
                    anonymousClass0IZ = new AnonymousClass0IZ(this.f59333B.getActivity());
                    anonymousClass0IZ.f2754D = C;
                    anonymousClass0IZ.B();
                    AnonymousClass0cQ.H(this, 1164244420, I);
                    return;
                }
            }
            z = true;
            C = AnonymousClass0GQ.f2360B.A().m27574C(this.f59333B.getArguments(), z, this.f59333B.f59346D, this.f59333B.getArguments().getBoolean("is_two_factor_enabled"), this.f59333B.f59347E);
            anonymousClass0IZ = new AnonymousClass0IZ(this.f59333B.getActivity());
            anonymousClass0IZ.f2754D = C;
            anonymousClass0IZ.B();
            AnonymousClass0cQ.H(this, 1164244420, I);
            return;
        }
        AnonymousClass0cQ.H(this, -687819776, I);
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, 176110936);
        if (this.f59333B.isResumed()) {
            AnonymousClass3nj.F(this.f59333B.getContext(), this.f59333B.f59349G.f1759C, anonymousClass0Q6);
            AnonymousClass0cQ.H(this, 1703083880, I);
            return;
        }
        AnonymousClass0cQ.H(this, 1410705495, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, -1582616300);
        this.f59333B.f59345C.setEnabled(true);
        this.f59333B.f59345C.setShowProgressBar(false);
        AnonymousClass0cQ.H(this, 965414439, I);
    }

    public final void onStart() {
        int I = AnonymousClass0cQ.I(this, 376514341);
        this.f59333B.f59345C.setEnabled(false);
        this.f59333B.f59345C.setShowProgressBar(true);
        AnonymousClass0cQ.H(this, -629509746, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, 1898888526);
        m25598A((AnonymousClass50p) obj);
        AnonymousClass0cQ.H(this, -2003015921, I);
    }
}
