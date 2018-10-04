package X;

/* renamed from: X.65b */
public final class AnonymousClass65b implements AnonymousClass0F8 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass65c f71624B;

    public AnonymousClass65b(AnonymousClass65c anonymousClass65c) {
        this.f71624B = anonymousClass65c;
    }

    /* renamed from: A */
    public final void m28958A(AnonymousClass6FV anonymousClass6FV) {
        int I = AnonymousClass0cQ.I(this, 32103302);
        if (anonymousClass6FV.f73438B.equals(this.f71624B.f71626C)) {
            if (this.f71624B.f71628E != null) {
                long j = anonymousClass6FV.f73440D;
                String str = anonymousClass6FV.f73439C;
                String str2 = anonymousClass6FV.f73441E;
                AnonymousClass65e anonymousClass65e = this.f71624B.f71635L;
                AnonymousClass64y anonymousClass6Fj = new AnonymousClass6Fj(this, j, str);
                AnonymousClass0Ci B = anonymousClass65e.f71637B.B(str2);
                if (B != null) {
                    anonymousClass6Fj.ls(B);
                    anonymousClass6Fj.onComplete();
                } else {
                    anonymousClass65e.f71638C.A(str2, new AnonymousClass65d(anonymousClass65e, anonymousClass6Fj), anonymousClass65e.f71639D);
                }
            }
            AnonymousClass0cQ.H(this, -1407015403, I);
            return;
        }
        AnonymousClass0cQ.H(this, 938730842, I);
    }

    public final /* bridge */ /* synthetic */ void onEvent(AnonymousClass0F6 anonymousClass0F6) {
        int I = AnonymousClass0cQ.I(this, -907483151);
        m28958A((AnonymousClass6FV) anonymousClass0F6);
        AnonymousClass0cQ.H(this, 174622793, I);
    }
}
