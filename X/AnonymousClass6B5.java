package X;

/* renamed from: X.6B5 */
public final class AnonymousClass6B5 extends AnonymousClass425 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass6B7 f72673B;

    public AnonymousClass6B5(AnonymousClass6B7 anonymousClass6B7) {
        this.f72673B = anonymousClass6B7;
    }

    /* renamed from: B */
    public final void m29313B() {
        this.f72673B.f72678C = AnonymousClass6B6.NONE;
        if (this.f72673B.f72680E != null) {
            this.f72673B.f72680E.f73832B.m29315A(1.0f, 0);
        }
    }

    /* renamed from: D */
    public final void m29314D(int i, int i2) {
        if (this.f72673B.f72680E != null) {
            int i3 = (int) (((float) this.f72673B.f72679D) - (((float) this.f72673B.f72679D) * 0.8f));
            AnonymousClass6Gp anonymousClass6Gp = this.f72673B.f72680E;
            i += i3;
            float height = (float) this.f72673B.f72681F.getHeight();
            if (height > 0.0f) {
                anonymousClass6Gp.f73832B.m29315A(((float) i) / height, 0);
            }
        }
    }
}
