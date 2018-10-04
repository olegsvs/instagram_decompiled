package X;

/* renamed from: X.4Gg */
public final class AnonymousClass4Gg extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5SN f52223B;

    public AnonymousClass4Gg(AnonymousClass5SN anonymousClass5SN) {
        this.f52223B = anonymousClass5SN;
    }

    public final void onFail(AnonymousClass0Q6 anonymousClass0Q6) {
        int I = AnonymousClass0cQ.I(this, -1912812206);
        AnonymousClass3nZ.m20669B(this.f52223B.f63839C, "invite_send_fail").F("error", "api").R();
        AnonymousClass0cQ.H(this, 609629624, I);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1517474638);
        AnonymousClass0Pn anonymousClass0Pn = (AnonymousClass0Pn) obj;
        int I2 = AnonymousClass0cQ.I(this, -123594186);
        AnonymousClass3nZ.m20670C(this.f52223B.f63839C, "invite_send_success");
        AnonymousClass0cQ.H(this, 436395744, I2);
        AnonymousClass0cQ.H(this, -600586801, I);
    }
}
