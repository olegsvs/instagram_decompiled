package X;

/* renamed from: X.3WZ */
public final class AnonymousClass3WZ implements AnonymousClass1oi {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3Wk f41918B;

    public AnonymousClass3WZ(AnonymousClass3Wk anonymousClass3Wk) {
        this.f41918B = anonymousClass3Wk;
    }

    public final void onCancel() {
        AnonymousClass0Fr.CancelFacebookAuth.F(this.f41918B.f41950I).m15363D("token_source", "third_party").m15364E();
    }

    public final void pk(String str) {
        AnonymousClass0Fr.FacebookAuthError.F(this.f41918B.f41950I).m15363D("token_source", "third_party").m15364E();
        AnonymousClass3Wk.m19820I(this.f41918B);
    }

    public final /* bridge */ /* synthetic */ void uBA(Object obj) {
        AnonymousClass1vk anonymousClass1vk = (AnonymousClass1vk) obj;
        this.f41918B.f41947F.f28510B = anonymousClass1vk.f24275B;
        AnonymousClass0FO.b(this.f41918B.f41949H, false, null, AnonymousClass2HK.FB_LOGIN);
        AnonymousClass0Fr.FacebookAuthSucceeded.F(this.f41918B.f41950I).m15363D("token_source", "third_party").m15364E();
        AnonymousClass3Wk anonymousClass3Wk = this.f41918B;
        anonymousClass3Wk.m19822B(AnonymousClass3Wk.m19815D(anonymousClass3Wk), AnonymousClass3Wk.m19814C(this.f41918B), false);
    }
}
