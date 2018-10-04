package X;

/* renamed from: X.2fY */
public final class AnonymousClass2fY extends AnonymousClass2fU {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass2fI f32225B;

    public AnonymousClass2fY(AnonymousClass2fI anonymousClass2fI) {
        this.f32225B = anonymousClass2fI;
        super(anonymousClass2fI, 5);
    }

    /* renamed from: B */
    public final void mo3643B() {
        AnonymousClass2c2 pR = this.f32225B.f31604E.pR();
        this.f32214B = Math.min(pR.m16467B(this.f32219G), this.f32220H);
        for (int i = this.f32217E; i < this.f32214B; i++) {
            pR.m16468C(i, this.f32221I);
            this.f32221I[2] = (float) i;
            this.f32221I[3] = this.f32110E;
            this.f32221I[4] = AnonymousClass2fI.m16795B(this.f32109D);
            this.f32215C.put(this.f32221I, 0, 5);
        }
        this.f32217E = this.f32214B;
    }
}
