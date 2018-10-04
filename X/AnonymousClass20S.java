package X;

/* renamed from: X.20S */
public final class AnonymousClass20S implements Runnable {
    /* renamed from: B */
    private /* synthetic */ String f25200B;
    /* renamed from: C */
    private /* synthetic */ AnonymousClass1ho f25201C;
    /* renamed from: D */
    private /* synthetic */ AnonymousClass20R f25202D;

    public AnonymousClass20S(AnonymousClass20R anonymousClass20R, AnonymousClass1ho anonymousClass1ho, String str) {
        this.f25202D = anonymousClass20R;
        this.f25201C = anonymousClass1ho;
        this.f25200B = str;
    }

    public final void run() {
        if (this.f25202D.f25197B > 0) {
            this.f25201C.D(this.f25202D.f25198C != null ? this.f25202D.f25198C.getBundle(this.f25200B) : null);
        }
        if (this.f25202D.f25197B >= 2) {
            this.f25201C.G();
        }
        if (this.f25202D.f25197B >= 3) {
            this.f25201C.E();
        }
        if (this.f25202D.f25197B >= 4) {
            this.f25201C.H();
        }
        int i = this.f25202D.f25197B;
    }
}
