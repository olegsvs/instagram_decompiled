package X;

/* renamed from: X.4lh */
public final class AnonymousClass4lh implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass4lj f56966B;

    public AnonymousClass4lh(AnonymousClass4lj anonymousClass4lj) {
        this.f56966B = anonymousClass4lj;
    }

    public final void run() {
        boolean hasFocus = this.f56966B.f56975I.hasFocus();
        if (this.f56966B.f56974H != null) {
            this.f56966B.f56974H.fullScroll(this.f56966B.f56970D ? 17 : 66);
            this.f56966B.f56974H.clearFocus();
            if (hasFocus) {
                this.f56966B.f56975I.requestFocus();
            }
        }
    }
}
