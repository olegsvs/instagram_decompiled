package X;

/* renamed from: X.38E */
public final class AnonymousClass38E implements AnonymousClass1rT {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3y7 f38199B;

    public final void Nf() {
    }

    public AnonymousClass38E(AnonymousClass3y7 anonymousClass3y7) {
        this.f38199B = anonymousClass3y7;
    }

    public final void Hf(AnonymousClass1rY anonymousClass1rY) {
        String str = "MP: Failed in recording video";
        if (anonymousClass1rY instanceof AnonymousClass2Pg) {
            AnonymousClass0Gn.G(str, anonymousClass1rY);
        } else {
            AnonymousClass0Gn.L(str, anonymousClass1rY);
        }
        this.f38199B.f47503F = anonymousClass1rY;
        this.f38199B.f47506I = null;
        if (this.f38199B.f47504G != null) {
            this.f38199B.f47504G.countDown();
        }
    }

    public final void If() {
        this.f38199B.f47506I = null;
        if (this.f38199B.f47504G != null) {
            this.f38199B.f47504G.countDown();
        }
    }
}
