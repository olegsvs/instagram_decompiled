package X;

/* renamed from: X.4Xw */
public final class AnonymousClass4Xw implements Runnable {
    /* renamed from: B */
    public final /* synthetic */ AnonymousClass5bM f55033B;

    public AnonymousClass4Xw(AnonymousClass5bM anonymousClass5bM) {
        this.f55033B = anonymousClass5bM;
    }

    public final void run() {
        AnonymousClass4Y6 anonymousClass4Y6 = this.f55033B.f66894B;
        anonymousClass4Y6.f55081B.remove(this.f55033B);
        if (this.f55033B.f66895C.getWindow() != null) {
            this.f55033B.f66895C.dismiss();
        }
    }
}
