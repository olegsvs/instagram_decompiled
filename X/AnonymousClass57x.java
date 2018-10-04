package X;

/* renamed from: X.57x */
public final class AnonymousClass57x implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass584 f60389B;
    /* renamed from: C */
    public final /* synthetic */ AnonymousClass22w f60390C;

    public AnonymousClass57x(AnonymousClass584 anonymousClass584, AnonymousClass22w anonymousClass22w) {
        this.f60389B = anonymousClass584;
        this.f60390C = anonymousClass22w;
    }

    public final void run() {
        if (this.f60390C == AnonymousClass22w.CONFIRMATION_CODE && ((Boolean) AnonymousClass0CC.qb.G()).booleanValue()) {
            this.f60389B.f60397B.requestFocus();
        }
    }
}
