package X;

import java.util.concurrent.Callable;

/* renamed from: X.0Xx */
public abstract class AnonymousClass0Xx implements Runnable {
    /* renamed from: B */
    public final AnonymousClass0Y0 f6233B;
    /* renamed from: C */
    public Exception f6234C;
    /* renamed from: D */
    public Object f6235D;

    public AnonymousClass0Xx(AnonymousClass0Y0 anonymousClass0Y0) {
        this.f6233B = anonymousClass0Y0;
    }

    /* renamed from: A */
    public final boolean m5274A() {
        return this.f6234C != null;
    }

    /* renamed from: B */
    public static AnonymousClass0Xx m5273B(Callable callable) {
        return new AnonymousClass0Xy(new AnonymousClass0Y0(), callable);
    }

    /* renamed from: B */
    public final boolean m5275B() {
        if (this.f6235D == null) {
            if (this.f6234C == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: C */
    public final AnonymousClass0Xx m5276C(AnonymousClass0Y3 anonymousClass0Y3) {
        return new AnonymousClass0Y4(this, this.f6233B, anonymousClass0Y3);
    }

    /* renamed from: D */
    public final AnonymousClass0Xx m5277D(AnonymousClass0RB anonymousClass0RB) {
        return new AnonymousClass0Y5(this, this.f6233B, anonymousClass0RB);
    }

    /* renamed from: E */
    public final void m5278E(Exception exception) {
        if (m5275B()) {
            throw new IllegalStateException("Task is already finished");
        }
        this.f6234C = exception;
    }

    /* renamed from: F */
    public final void m5279F(Object obj) {
        if (m5275B()) {
            throw new IllegalStateException("Task is already finished");
        }
        this.f6235D = obj;
    }
}
