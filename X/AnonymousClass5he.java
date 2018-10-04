package X;

/* renamed from: X.5he */
public final class AnonymousClass5he implements AnonymousClass0ht {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5hn f68255B;

    public AnonymousClass5he(AnonymousClass5hn anonymousClass5hn) {
        this.f68255B = anonymousClass5hn;
    }

    public final boolean JF(AnonymousClass0P7 anonymousClass0P7) {
        return this.f68255B.f68265B.f20441C.E(anonymousClass0P7);
    }

    public final void jr() {
        boolean G = this.f68255B.f68265B.G();
        this.f68255B.f68265B.cH();
        boolean G2 = this.f68255B.f68265B.G();
        if (G && !G2 && this.f68255B.getFragmentManager().H() > 0) {
            if (this.f68255B.isResumed()) {
                this.f68255B.getFragmentManager().L();
            } else {
                this.f68255B.f68271H = true;
            }
        }
    }
}
