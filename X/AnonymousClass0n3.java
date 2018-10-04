package X;

import java.util.concurrent.Callable;

/* renamed from: X.0n3 */
public final class AnonymousClass0n3 implements AnonymousClass0GA {
    /* renamed from: B */
    public AnonymousClass0nF f9990B;
    /* renamed from: C */
    private final AnonymousClass0Xx f9991C;

    public final String getName() {
        return "ListenableTask";
    }

    public AnonymousClass0n3(Callable callable) {
        this.f9991C = AnonymousClass0Xx.m5273B(callable);
    }

    public final void onFinish() {
        AnonymousClass0nF anonymousClass0nF = this.f9990B;
        if (anonymousClass0nF != null) {
            anonymousClass0nF.onFinish();
            if (this.f9991C.m5274A()) {
                this.f9990B.mo1811A(this.f9991C.f6234C);
            } else {
                this.f9990B.mo1812B(this.f9991C.f6235D);
            }
        }
    }

    public final void onStart() {
        AnonymousClass0nF anonymousClass0nF = this.f9990B;
        if (anonymousClass0nF != null) {
            anonymousClass0nF.onStart();
        }
    }

    public final void run() {
        this.f9991C.run();
    }
}
