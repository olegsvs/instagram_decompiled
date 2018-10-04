package X;

/* renamed from: X.67s */
public final class AnonymousClass67s implements AnonymousClass14J {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass67t f72027B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass14H f72028C;

    public AnonymousClass67s(AnonymousClass67t anonymousClass67t, AnonymousClass14H anonymousClass14H) {
        this.f72027B = anonymousClass67t;
        this.f72028C = anonymousClass14H;
    }

    public final void onFinish() {
        AnonymousClass6GI.m29760C(this.f72027B.f72029B).setVisibility(8);
        this.f72027B.f72029B.f73676I.f71917F.m26304S();
        AnonymousClass0EE anonymousClass0EE = this.f72027B.f72029B.f73677J;
        String str = this.f72027B.f72029B.f73670C;
        String str2 = this.f72027B.f72029B.f73669B;
        AnonymousClass0NN.B("ig_live_wave_impression", anonymousClass0EE).F("b_pk", str2).F("m_pk", str).F("a_pk", this.f72027B.f72029B.f73671D.getId()).R();
        this.f72027B.f72029B.f73691X.remove(this.f72028C);
    }
}
