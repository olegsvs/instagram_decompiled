package X;

/* renamed from: X.3yh */
public final class AnonymousClass3yh implements AnonymousClass3P2 {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass3CR f47709B;

    public AnonymousClass3yh(AnonymousClass3CR anonymousClass3CR) {
        this.f47709B = anonymousClass3CR;
    }

    public final void nk(Exception exception) {
        this.f47709B.f39037F = true;
    }

    public final synchronized void nw() {
        synchronized (this.f47709B.f39034C) {
            if (this.f47709B.f39033B != null) {
                this.f47709B.f39033B.cleanup();
                this.f47709B.f39033B = null;
            }
        }
    }
}
