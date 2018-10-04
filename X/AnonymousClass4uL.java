package X;

/* renamed from: X.4uL */
public final class AnonymousClass4uL implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5YI f58358B;

    public AnonymousClass4uL(AnonymousClass5YI anonymousClass5YI) {
        this.f58358B = anonymousClass5YI;
    }

    public final void run() {
        if (this.f58358B.f66041H) {
            AnonymousClass5YI.m27443D(this.f58358B);
        } else if (this.f58358B.f66040G != null) {
            this.f58358B.f66040G.removeCallbacks(this.f58358B.f66039F);
            this.f58358B.f66040G.postDelayed(this.f58358B.f66039F, 5000);
        }
    }
}
