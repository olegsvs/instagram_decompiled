package X;

/* renamed from: X.21P */
public abstract class AnonymousClass21P implements Runnable {
    /* renamed from: B */
    public final AnonymousClass21y f25295B;

    public AnonymousClass21P() {
        this.f25295B = null;
    }

    public AnonymousClass21P(AnonymousClass21y anonymousClass21y) {
        this.f25295B = anonymousClass21y;
    }

    /* renamed from: A */
    public abstract void mo3140A();

    public final void run() {
        try {
            mo3140A();
        } catch (Exception e) {
            AnonymousClass21y anonymousClass21y = this.f25295B;
            if (anonymousClass21y != null) {
                anonymousClass21y.m14215A(e);
            }
        }
    }
}
