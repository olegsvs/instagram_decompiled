package X;

/* renamed from: X.2HE */
public final class AnonymousClass2HE extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2HF f28450B;

    public AnonymousClass2HE(AnonymousClass2HF anonymousClass2HF) {
        this.f28450B = anonymousClass2HF;
    }

    public final void onFailInBackground(AnonymousClass0fq anonymousClass0fq) {
        int I = AnonymousClass0cQ.I(this, -2044687589);
        this.f28450B.f28453C.m14910A();
        AnonymousClass0cQ.H(this, 226798587, I);
    }

    public final void onFinish() {
        int I = AnonymousClass0cQ.I(this, 756892078);
        this.f28450B.f28454D = false;
        AnonymousClass0cQ.H(this, 866058731, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int I = AnonymousClass0cQ.I(this, 1146847448);
        AnonymousClass0m7 anonymousClass0m7 = (AnonymousClass0m7) obj;
        int I2 = AnonymousClass0cQ.I(this, -968852897);
        if (!(anonymousClass0m7 == null || anonymousClass0m7.f9718B == null)) {
            AnonymousClass2H8 anonymousClass2H8 = this.f28450B.f28453C;
            anonymousClass2H8.f28436B = anonymousClass0m7.f9718B;
            anonymousClass2H8.m14910A();
            AnonymousClass0F4.f2058E.B(new AnonymousClass2HG(true));
        }
        AnonymousClass0cQ.H(this, -867667309, I2);
        AnonymousClass0cQ.H(this, 1966457969, I);
    }
}
