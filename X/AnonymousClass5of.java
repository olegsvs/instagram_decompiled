package X;

/* renamed from: X.5of */
public final class AnonymousClass5of extends AnonymousClass0Iw {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass1gJ f69141B;

    public AnonymousClass5of(AnonymousClass1gJ anonymousClass1gJ) {
        this.f69141B = anonymousClass1gJ;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int I = AnonymousClass0cQ.I(this, -1728111099);
        AnonymousClass5oi anonymousClass5oi = (AnonymousClass5oi) obj;
        int I2 = AnonymousClass0cQ.I(this, 1761844107);
        int intValue = anonymousClass5oi.f69146C.intValue();
        int intValue2 = anonymousClass5oi.f69145B.intValue();
        this.f69141B.f21343H = anonymousClass5oi.f69147D;
        if (!AnonymousClass1gJ.C(this.f69141B, intValue, intValue2)) {
            this.f69141B.f21337B = intValue;
            this.f69141B.f21346K.D(AnonymousClass5oh.class, new AnonymousClass5oh(Integer.valueOf(intValue), Integer.valueOf(intValue2)));
            AnonymousClass1gJ.D(this.f69141B);
        }
        AnonymousClass0EE anonymousClass0EE = this.f69141B.f21339D;
        AnonymousClass0NN.B("ig_profile_fb_entrypoint_impression", anonymousClass0EE).B("badge_count", this.f69141B.B()).R();
        AnonymousClass0cQ.H(this, -1761763457, I2);
        AnonymousClass0cQ.H(this, 1485871000, I);
    }
}
